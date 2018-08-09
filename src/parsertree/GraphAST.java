package parsertree;

/**
 *
 * @author Elias e Carlos Bruno
 */
import userinterface.UserInterface;
import javax.swing.JFrame;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import syntax.SyntaxAnalyzerMethodsCaller;

//Draw the Tree
public class GraphAST extends JFrame {

    static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    static private final int CANVAS_HEIGHT = (int) screenSize.getHeight();
    static private final int CANVAS_WIDTH = (int) screenSize.getWidth();
    static private final int NODE_HEIGHT = 30;
    static private final int NODE_WIDTH = 80;
    mxGraph graph = new mxGraph();
    Object parent = graph.getDefaultParent();
    private static int nodeCount = 0;
    private static int posFirstSon = 0;

    /**
     *
     */
    private static final long serialVersionUID = -2707712944901661771L;

    UserInterface rootInterface;    

    public GraphAST(UserInterface aThis) {
        AST ast = SyntaxAnalyzerMethodsCaller.ast;
        nodeCount = 0;
        posFirstSon = 0;
        int parentX = CANVAS_WIDTH / 2 - NODE_WIDTH / 2;
        int parentY = 20;
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setLocationRelativeTo(aThis);
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                aThis.setVisible(true);
            }
        });
        this.setTitle("AST");

        graph.getModel().beginUpdate();
        try {
            drawTree(ast, parentX, parentY);
        } finally {
            graph.getModel().endUpdate();
        }

        mxGraphComponent graphComponent = new mxGraphComponent(graph);
        getContentPane().add(graphComponent);         
    }
        
    ////Desenha a árvore
    private Object drawTree(AST ast, int parentX, int parentY) {
        Object parentNode;
        Object child = null;
        int middleChildY = parentY + 130;
        int middleChildX = parentX + NODE_WIDTH / 2;
                
        if (!ast.getIsTerminal()) {
            ArrayList<Object> children = new ArrayList<Object>();
            double middle = ast.getChildren().length / 2 - 0.5;
            int firstNodeCount = nodeCount;
            int posFirst = nodeCount;
            //Percorre os filhos
            for (int i = 0; i < ast.getChildren().length; i++) {
                //Passa o filho como pai na recursão
                if (i < middle) {//filho está horizontalmente antes do pai
                    child = drawTree(ast.getChildren()[i], parentX - ((int) (middle) - i + 1) * 100, middleChildY);
                } else if (i > middle) {//filho está horizontalmente depois do pai
                    child = drawTree(ast.getChildren()[i], parentX + (i - (int) (middle)) * 100, middleChildY);
                } else {//filho está abaixo do pai
                    child = drawTree(ast.getChildren()[i], parentX, middleChildY);
                }
                children.add(child);//insere o filho i na lista de filhos
                if (i == 0) {
                    //Pega a posicao do primeiro filho
                    firstNodeCount = nodeCount - 1;
                    posFirst = posFirstSon;
                }
            }
            
            //Desenha o pai no meio dos seus filhos
            parentNode = graph.insertVertex(parent, null, ast.getParent(), (20 + posFirst + (nodeCount - 1) * 100) / 2, parentY, NODE_WIDTH,
                    NODE_HEIGHT);
            
            //Atualiza a posicao do primeiro filho
            posFirstSon = (20 + firstNodeCount * 100 + (nodeCount - 1 - firstNodeCount) * 50);
            
            //Desenha os filhos
            for (int i = 0; i < children.size(); i++) {                
                graph.insertEdge(parent, null, "", parentNode, children.get(i));
            }

        } else {
            parentNode = graph.insertVertex(parent, null, ast.getParent(), nodeCount * 100 + 20, parentY, NODE_WIDTH,
                    NODE_HEIGHT);
            nodeCount++;
            posFirstSon = nodeCount * 100 - 80;
        }

        return parentNode;
    }
}
