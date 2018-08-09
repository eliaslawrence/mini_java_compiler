/* The following code was generated by JFlex 1.6.1 */

package syntax;

import java_cup.runtime.*;
//import static analisadorlexico.Token.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>Lexer.flex</tt>
 */
class Yylex implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\5\1\57\1\3\1\4\22\0\1\3\1\13\4\0"+
    "\1\12\1\0\1\15\1\16\1\7\1\10\1\24\1\11\1\25\1\6"+
    "\12\2\1\0\1\23\1\26\1\14\3\0\1\36\1\31\1\35\1\45"+
    "\1\41\1\50\1\56\1\51\1\34\2\1\1\32\1\53\1\44\1\54"+
    "\1\27\1\1\1\47\1\40\1\43\1\30\1\55\1\46\1\42\1\52"+
    "\1\1\1\21\1\0\1\22\1\0\1\1\1\0\1\36\1\31\1\35"+
    "\1\45\1\41\1\50\1\56\1\51\1\34\2\1\1\32\1\53\1\44"+
    "\1\54\1\27\1\1\1\47\1\40\1\43\1\30\1\55\1\46\1\42"+
    "\1\52\1\1\1\17\1\0\1\20\7\0\1\57\252\0\2\33\115\0"+
    "\1\37\u1ea8\0\1\57\1\57\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\2\4\1\5\1\6\1\7"+
    "\1\10\1\1\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\3\2\1\1"+
    "\2\2\1\1\11\2\2\25\1\0\1\26\1\27\1\30"+
    "\3\2\1\0\1\31\1\2\1\31\1\2\2\0\15\2"+
    "\1\25\2\0\3\2\2\32\1\2\3\0\3\2\1\0"+
    "\3\2\1\0\2\2\1\33\1\0\3\2\1\0\1\2"+
    "\1\0\1\2\1\0\1\25\3\2\1\0\1\2\3\0"+
    "\3\2\2\34\1\2\1\35\2\36\1\37\1\0\2\2"+
    "\1\0\1\2\2\40\2\41\1\0\3\2\2\42\3\0"+
    "\4\2\2\43\1\2\2\44\2\45\1\2\1\46\1\47"+
    "\1\50\1\0\1\47\1\50\2\2\1\51\1\52\1\0"+
    "\2\53\12\0\1\54";

  private static int [] zzUnpackAction() {
    int [] result = new int[173];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\60\0\140\0\220\0\60\0\300\0\360\0\60"+
    "\0\60\0\220\0\u0120\0\u0150\0\u0180\0\60\0\60\0\60"+
    "\0\60\0\60\0\60\0\60\0\60\0\60\0\60\0\u01b0"+
    "\0\u01e0\0\u0210\0\u0240\0\u0270\0\u02a0\0\u02d0\0\u0300\0\u0330"+
    "\0\u0360\0\u0390\0\u03c0\0\u03f0\0\u0420\0\u0450\0\u0480\0\60"+
    "\0\u04b0\0\u04e0\0\60\0\60\0\60\0\u0510\0\u0540\0\u0570"+
    "\0\u05a0\0\60\0\u05d0\0\140\0\u0600\0\u0630\0\u0660\0\u0690"+
    "\0\u06c0\0\u06f0\0\u0720\0\u0750\0\u0780\0\u07b0\0\u07e0\0\u0810"+
    "\0\u0840\0\u0870\0\u08a0\0\u08d0\0\300\0\u0900\0\u0930\0\u0960"+
    "\0\u0990\0\u09c0\0\60\0\140\0\u09f0\0\u0a20\0\u0a50\0\u0a80"+
    "\0\u0ab0\0\u0ae0\0\u0b10\0\u0b40\0\u0b70\0\u0ba0\0\u0bd0\0\u0c00"+
    "\0\u0c30\0\u0c60\0\140\0\u0c90\0\u0cc0\0\u0cf0\0\u0d20\0\u0d50"+
    "\0\u0d80\0\u0db0\0\u0de0\0\u0e10\0\u0900\0\u0e40\0\u0e70\0\u0ea0"+
    "\0\u0ed0\0\u0f00\0\u0f30\0\u0f60\0\u0f90\0\u0fc0\0\u0ff0\0\u1020"+
    "\0\60\0\140\0\u1050\0\140\0\60\0\140\0\140\0\u1080"+
    "\0\u10b0\0\u10e0\0\u1110\0\u1140\0\60\0\140\0\60\0\140"+
    "\0\u1170\0\u11a0\0\u11d0\0\u1200\0\60\0\140\0\u1230\0\u1260"+
    "\0\u1290\0\u12c0\0\u12f0\0\u1320\0\u1350\0\60\0\140\0\u1380"+
    "\0\60\0\140\0\60\0\140\0\u13b0\0\140\0\60\0\60"+
    "\0\u13e0\0\140\0\140\0\u1410\0\u1440\0\140\0\140\0\u1470"+
    "\0\60\0\140\0\u14a0\0\u14d0\0\u1500\0\u1530\0\u1560\0\u1590"+
    "\0\u15c0\0\u15f0\0\u1620\0\u1650\0\60";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[173];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\5\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
    "\1\3\1\31\1\32\1\33\1\34\1\35\1\3\1\36"+
    "\1\37\1\40\1\3\1\41\1\42\1\3\1\43\1\44"+
    "\1\45\2\3\1\46\1\3\1\47\1\3\62\0\2\3"+
    "\24\0\4\3\1\0\3\3\1\0\17\3\3\0\1\4"+
    "\62\0\1\50\60\0\1\51\1\52\62\0\1\53\61\0"+
    "\1\54\57\0\1\55\44\0\2\3\24\0\1\3\1\56"+
    "\2\3\1\0\3\3\1\0\17\3\2\0\2\3\24\0"+
    "\4\3\1\0\3\3\1\0\14\3\1\57\2\3\2\0"+
    "\2\3\24\0\4\3\1\0\3\3\1\0\1\3\1\60"+
    "\15\3\45\0\1\61\3\0\1\62\10\0\2\3\24\0"+
    "\4\3\1\0\3\3\1\0\4\3\1\63\3\3\1\64"+
    "\6\3\2\0\2\3\24\0\3\3\1\65\1\0\3\3"+
    "\1\0\17\3\44\0\1\66\6\0\1\67\6\0\2\3"+
    "\24\0\4\3\1\0\3\3\1\0\3\3\1\70\6\3"+
    "\1\71\4\3\2\0\2\3\24\0\3\3\1\72\1\0"+
    "\3\3\1\0\2\3\1\73\14\3\2\0\2\3\24\0"+
    "\4\3\1\0\3\3\1\0\7\3\1\74\1\3\1\75"+
    "\5\3\2\0\2\3\24\0\1\3\1\76\2\3\1\0"+
    "\3\3\1\0\1\3\1\77\15\3\2\0\2\3\24\0"+
    "\4\3\1\0\3\3\1\0\11\3\1\100\5\3\2\0"+
    "\2\3\24\0\4\3\1\0\3\3\1\0\1\3\1\101"+
    "\15\3\2\0\2\3\24\0\4\3\1\0\2\3\1\102"+
    "\1\0\17\3\2\0\2\3\24\0\4\3\1\0\2\3"+
    "\1\103\1\0\17\3\2\0\2\3\24\0\4\3\1\0"+
    "\3\3\1\0\14\3\1\104\2\3\1\0\4\51\1\105"+
    "\1\50\52\51\7\106\1\107\50\106\1\0\2\3\24\0"+
    "\2\3\1\110\1\3\1\0\3\3\1\0\17\3\2\0"+
    "\2\3\24\0\4\3\1\0\3\3\1\0\14\3\1\111"+
    "\2\3\2\0\2\3\24\0\4\3\1\0\3\3\1\0"+
    "\4\3\1\112\12\3\44\0\1\113\15\0\2\3\24\0"+
    "\4\3\1\0\3\3\1\0\3\3\1\114\13\3\2\0"+
    "\2\3\24\0\4\3\1\0\2\3\1\115\1\0\17\3"+
    "\37\0\1\116\10\0\1\117\47\0\2\120\20\0\2\3"+
    "\24\0\4\3\1\0\2\3\1\121\1\0\7\3\1\122"+
    "\7\3\2\0\2\3\24\0\4\3\1\0\3\3\1\120"+
    "\1\123\16\3\2\0\2\3\24\0\4\3\1\0\3\3"+
    "\1\124\1\125\16\3\2\0\2\3\24\0\4\3\1\0"+
    "\3\3\1\0\3\3\1\126\13\3\2\0\2\3\24\0"+
    "\1\3\1\127\2\3\1\0\3\3\1\0\17\3\2\0"+
    "\2\3\24\0\4\3\1\130\1\131\2\3\1\0\17\3"+
    "\2\0\2\3\24\0\3\3\1\132\1\0\3\3\1\0"+
    "\17\3\2\0\2\3\24\0\4\3\1\0\3\3\1\0"+
    "\6\3\1\133\10\3\2\0\2\3\24\0\4\3\1\134"+
    "\1\135\2\3\1\0\17\3\2\0\2\3\24\0\4\3"+
    "\1\0\3\3\1\0\3\3\1\136\13\3\2\0\2\3"+
    "\24\0\3\3\1\137\1\0\3\3\1\0\17\3\2\0"+
    "\2\3\24\0\4\3\1\140\1\141\2\3\1\0\17\3"+
    "\2\0\2\3\24\0\4\3\1\142\1\143\2\3\1\0"+
    "\17\3\1\0\7\106\1\144\56\106\1\145\1\144\50\106"+
    "\1\0\2\3\24\0\3\3\1\146\1\0\3\3\1\0"+
    "\17\3\2\0\2\3\24\0\3\3\1\147\1\0\3\3"+
    "\1\0\17\3\2\0\2\3\24\0\4\3\1\0\3\3"+
    "\1\0\16\3\1\150\2\0\2\3\24\0\4\3\1\0"+
    "\3\3\1\151\1\152\16\3\44\0\1\153\47\0\2\154"+
    "\66\0\1\155\15\0\2\3\24\0\4\3\1\0\3\3"+
    "\1\0\3\3\1\156\13\3\2\0\2\3\24\0\4\3"+
    "\1\154\1\157\2\3\1\0\17\3\2\0\2\3\24\0"+
    "\4\3\1\0\3\3\1\0\3\3\1\160\13\3\42\0"+
    "\1\161\17\0\2\3\24\0\4\3\1\0\3\3\1\0"+
    "\1\3\1\162\15\3\2\0\2\3\24\0\4\3\1\0"+
    "\3\3\1\0\1\3\1\163\15\3\2\0\2\3\24\0"+
    "\4\3\1\0\3\3\1\0\1\3\1\164\15\3\40\0"+
    "\2\165\20\0\2\3\24\0\4\3\1\0\3\3\1\165"+
    "\1\166\16\3\2\0\2\3\24\0\3\3\1\167\1\0"+
    "\3\3\1\0\17\3\33\0\1\170\26\0\2\3\24\0"+
    "\3\3\1\171\1\0\3\3\1\0\17\3\2\0\2\3"+
    "\24\0\1\3\1\172\2\3\1\0\3\3\1\0\17\3"+
    "\2\0\2\3\24\0\4\3\1\0\3\3\1\173\1\174"+
    "\16\3\45\0\1\175\14\0\2\3\24\0\4\3\1\0"+
    "\3\3\1\0\4\3\1\176\12\3\46\0\1\177\13\0"+
    "\2\3\24\0\4\3\1\0\3\3\1\0\5\3\1\200"+
    "\11\3\1\0\6\106\1\50\1\144\50\106\1\0\2\3"+
    "\24\0\4\3\1\201\1\202\2\3\1\0\17\3\2\0"+
    "\2\3\24\0\4\3\1\0\3\3\1\0\1\3\1\203"+
    "\15\3\2\0\2\3\24\0\4\3\1\0\3\3\1\0"+
    "\3\3\1\204\13\3\40\0\2\205\20\0\2\3\24\0"+
    "\4\3\1\0\3\3\1\205\1\206\16\3\34\0\2\207"+
    "\67\0\1\210\54\0\1\211\17\0\2\3\24\0\4\3"+
    "\1\207\1\212\2\3\1\0\17\3\2\0\2\3\24\0"+
    "\4\3\1\0\3\3\1\0\4\3\1\213\12\3\2\0"+
    "\2\3\24\0\4\3\1\0\3\3\1\0\1\3\1\214"+
    "\15\3\2\0\2\3\24\0\4\3\1\0\3\3\1\0"+
    "\4\3\1\215\12\3\42\0\1\216\17\0\2\3\24\0"+
    "\4\3\1\0\3\3\1\0\1\3\1\217\15\3\2\0"+
    "\2\3\24\0\4\3\1\0\3\3\1\0\7\3\1\220"+
    "\7\3\42\0\1\221\17\0\2\3\24\0\4\3\1\0"+
    "\3\3\1\0\1\3\1\222\15\3\36\0\1\223\23\0"+
    "\2\3\24\0\4\3\1\0\1\3\1\224\1\3\1\0"+
    "\17\3\2\0\2\3\24\0\4\3\1\0\2\3\1\225"+
    "\1\0\17\3\2\0\2\3\24\0\4\3\1\0\3\3"+
    "\1\0\11\3\1\226\5\3\36\0\1\227\100\0\1\230"+
    "\54\0\1\231\5\0\2\3\24\0\4\3\1\0\1\3"+
    "\1\232\1\3\1\0\17\3\2\0\2\3\24\0\4\3"+
    "\1\0\3\3\1\0\16\3\1\233\2\0\2\3\24\0"+
    "\4\3\1\0\3\3\1\0\13\3\1\234\3\3\2\0"+
    "\2\3\24\0\4\3\1\0\3\3\1\0\5\3\1\235"+
    "\11\3\2\0\2\3\24\0\4\3\1\0\3\3\1\0"+
    "\4\3\1\236\12\3\2\0\2\3\24\0\4\3\1\0"+
    "\3\3\1\0\4\3\1\237\12\3\26\0\1\240\33\0"+
    "\2\3\22\0\1\240\1\0\4\3\1\0\3\3\1\0"+
    "\17\3\2\0\2\3\24\0\4\3\1\0\3\3\1\241"+
    "\1\242\16\3\55\0\1\243\33\0\1\244\72\0\1\245"+
    "\41\0\1\246\61\0\1\247\77\0\1\250\43\0\2\251"+
    "\67\0\1\252\56\0\1\253\46\0\1\254\71\0\1\255"+
    "\13\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5760];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\1\11\2\1\2\11\4\1\12\11"+
    "\20\1\1\11\1\1\1\0\3\11\3\1\1\0\1\11"+
    "\3\1\2\0\16\1\2\0\3\1\1\11\2\1\3\0"+
    "\3\1\1\0\3\1\1\0\3\1\1\0\3\1\1\0"+
    "\1\1\1\0\1\1\1\0\4\1\1\0\1\1\3\0"+
    "\3\1\1\11\3\1\1\11\2\1\1\0\2\1\1\0"+
    "\1\1\1\11\1\1\1\11\1\1\1\0\3\1\1\11"+
    "\1\1\3\0\4\1\1\11\2\1\1\11\1\1\1\11"+
    "\3\1\2\11\1\0\6\1\1\0\1\11\1\1\12\0"+
    "\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[173];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
public String lexeme;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Yylex(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 222) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          {     return new Symbol(Sym.EOF, new String("Fim do Arquivo"));
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { //System.err.println("Caractere Ilegal: " +yytext());
            }
          case 45: break;
          case 2: 
            { return new Symbol (Sym.IDENTIFIER, yychar, yyline, yytext());
            }
          case 46: break;
          case 3: 
            { return new Symbol (Sym.INTEGER_LITERAL, yychar, yyline, yytext());
            }
          case 47: break;
          case 4: 
            { /*Ignore*/
            }
          case 48: break;
          case 5: 
            { return new Symbol (Sym.BAR, yychar, yyline, yytext());
            }
          case 49: break;
          case 6: 
            { return new Symbol (Sym.TIMES, yychar, yyline, yytext());
            }
          case 50: break;
          case 7: 
            { return new Symbol (Sym.PLUS, yychar, yyline, yytext());
            }
          case 51: break;
          case 8: 
            { return new Symbol (Sym.MINUS, yychar, yyline, yytext());
            }
          case 52: break;
          case 9: 
            { return new Symbol (Sym.NOT, yychar, yyline, yytext());
            }
          case 53: break;
          case 10: 
            { return new Symbol (Sym.BECOMES, yychar, yyline, yytext());
            }
          case 54: break;
          case 11: 
            { return new Symbol (Sym.LPAREN, yychar, yyline, yytext());
            }
          case 55: break;
          case 12: 
            { return new Symbol (Sym.RPAREN, yychar, yyline, yytext());
            }
          case 56: break;
          case 13: 
            { return new Symbol (Sym.LBRACE, yychar, yyline, yytext());
            }
          case 57: break;
          case 14: 
            { return new Symbol (Sym.RBRACE, yychar, yyline, yytext());
            }
          case 58: break;
          case 15: 
            { return new Symbol (Sym.LBRACKET, yychar, yyline, yytext());
            }
          case 59: break;
          case 16: 
            { return new Symbol (Sym.RBRACKET, yychar, yyline, yytext());
            }
          case 60: break;
          case 17: 
            { return new Symbol (Sym.SEMICOLON, yychar, yyline, yytext());
            }
          case 61: break;
          case 18: 
            { return new Symbol (Sym.COMMA, yychar, yyline, yytext());
            }
          case 62: break;
          case 19: 
            { return new Symbol (Sym.DOT, yychar, yyline, yytext());
            }
          case 63: break;
          case 20: 
            { return new Symbol (Sym.LT, yychar, yyline, yytext());
            }
          case 64: break;
          case 21: 
            { /* Ignore */
            }
          case 65: break;
          case 22: 
            { return new Symbol (Sym.AND, yychar, yyline, yytext());
            }
          case 66: break;
          case 23: 
            { return new Symbol (Sym.NOT_EQUALS, yychar, yyline, yytext());
            }
          case 67: break;
          case 24: 
            { return new Symbol (Sym.EQUALS, yychar, yyline, yytext());
            }
          case 68: break;
          case 25: 
            { return new Symbol (Sym.IF, yychar, yyline, yytext());
            }
          case 69: break;
          case 26: 
            { return new Symbol (Sym.INTEGER_TYPE, yychar, yyline, yytext());
            }
          case 70: break;
          case 27: 
            { return new Symbol (Sym.NEW, yychar, yyline, yytext());
            }
          case 71: break;
          case 28: 
            { return new Symbol (Sym.ELSE, yychar, yyline, yytext());
            }
          case 72: break;
          case 29: 
            { return new Symbol (Sym.TRUE, yychar, yyline, yytext());
            }
          case 73: break;
          case 30: 
            { return new Symbol (Sym.THIS, yychar, yyline, yytext());
            }
          case 74: break;
          case 31: 
            { return new Symbol (Sym.NULL, yychar, yyline, yytext());
            }
          case 75: break;
          case 32: 
            { return new Symbol (Sym.MAIN, yychar, yyline, yytext());
            }
          case 76: break;
          case 33: 
            { return new Symbol (Sym.VOID, yychar, yyline, yytext());
            }
          case 77: break;
          case 34: 
            { return new Symbol (Sym.CLASS, yychar, yyline, yytext());
            }
          case 78: break;
          case 35: 
            { return new Symbol (Sym.WHILE, yychar, yyline, yytext());
            }
          case 79: break;
          case 36: 
            { return new Symbol (Sym.FALSE, yychar, yyline, yytext());
            }
          case 80: break;
          case 37: 
            { return new Symbol (Sym.PUBLIC, yychar, yyline, yytext());
            }
          case 81: break;
          case 38: 
            { return new Symbol (Sym.LENGTH, yychar, yyline, yytext());
            }
          case 82: break;
          case 39: 
            { return new Symbol (Sym.STATIC, yychar, yyline, yytext());
            }
          case 83: break;
          case 40: 
            { return new Symbol (Sym.STRING, yychar, yyline, yytext());
            }
          case 84: break;
          case 41: 
            { return new Symbol (Sym.RETURN, yychar, yyline, yytext());
            }
          case 85: break;
          case 42: 
            { return new Symbol (Sym.BOOLEAN_TYPE, yychar, yyline, yytext());
            }
          case 86: break;
          case 43: 
            { return new Symbol (Sym.EXTENDS, yychar, yyline, yytext());
            }
          case 87: break;
          case 44: 
            { return new Symbol (Sym.SYSTEM_OUT_PRINTLN, yychar, yyline, yytext());
            }
          case 88: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
