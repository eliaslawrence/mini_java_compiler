package userinterface;

import lexical.Token;
import java.awt.Component;
import java.io.StringReader;
import java.util.Stack;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Elias e Carlos Bruno
 */

//Interface chamada ao clicar o botão de 'See Tokens'
public class SeeTokens extends javax.swing.JDialog {

    public Stack stackTempToken = new Stack();
    public Stack stackToken = new Stack();
    public Stack stackTempType = new Stack();
    public Stack stackType = new Stack();

    /**
     * Cria uma tabela com os tokens do programa
     */
    public SeeTokens(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("Table of Tokens");
        
        //Centraliza os headers da tabela
        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) tokens.getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(SwingConstants.CENTER);
        
        //Centraliza as celulas da tabela
        tokens.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table,
                    Object value, boolean isSelected, boolean hasFocus, int row, int col) {
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
                setHorizontalAlignment(JLabel.CENTER);
                return this;
            }
        }
        );
    }

    public SeeTokens(java.awt.Frame parent, boolean modal, String newDir, UserInterface gui, String code) {
        super(parent, modal);
        initComponents();
        this.setTitle("Table of Tokens");
        this.setLocationRelativeTo(null);
        
        //Centraliza os headers da tabela
        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) tokens.getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(SwingConstants.CENTER);
        
        //Centraliza as celulas da tabela
        tokens.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table,
                    Object value, boolean isSelected, boolean hasFocus, int row, int col) {
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
                setHorizontalAlignment(JLabel.CENTER);

                return this;
            }
        }
        );
        try {
            gui.Save();
            String expr;
            expr = code;
            //Executa o analisador lexico
            Lexer lexer = new Lexer(new StringReader(expr));

            String resultado = "";           
            
            //Insere todos tokens em uma pilha e seus tipos em outra pilha
            while (true) {
                Token token = lexer.yylex();
                if (token == null) {
                    break;
                }

                switch (token) {

                    case PALAVRA_RESERVADA:
                        stackTempType.push("reserved word");
                        stackTempToken.push(lexer.lexeme);
                        break;
                    case OPERADOR_OU_PONTUACAO:
                        stackTempType.push("operator/pontuation");
                        stackTempToken.push(lexer.lexeme);
                        break;
                    case COMENTARIO:
                        stackTempType.push("comment");
                        stackTempToken.push(lexer.lexeme);
                        break;
                    case ERROR:
                        stackTempType.push("error");
                        stackTempToken.push(lexer.lexeme);
                        break;
                    case ID:
                        stackTempType.push("id");
                        stackTempToken.push(lexer.lexeme);
                        break;
                    case NUMERAL:
                        stackTempType.push("numeral");
                        stackTempToken.push(lexer.lexeme);
                        break;
                    case QUEBRA_LINHA:

                    default:
                }
            }
            String temp = "";
            while (!stackTempToken.isEmpty()) {
                temp = (String) stackTempToken.pop();
                stackToken.push(temp);
            }
            temp = "";
            while (!stackTempType.isEmpty()) {
                temp = (String) stackTempType.pop();
                stackType.push(temp);
            }
            
            //Insere os elementos da pilha na tabela
            Object line[] = new Object[2];
            line[1] = stackToken.pop();
            line[0] = stackType.pop();
            while (line[0] != null) {
                ((DefaultTableModel) tokens.getModel()).addRow(line);
                line[1] = stackToken.pop();
                line[0] = stackType.pop();
            }

        } catch (Exception e1) {
            //JOptionPane.showMessageDialog(this, e1.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tokens = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tokens.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tokens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TYPE", "TOKEN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tokens);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SeeTokens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeeTokens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeeTokens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeeTokens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SeeTokens dialog = new SeeTokens(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tokens;
    // End of variables declaration//GEN-END:variables
}
