/* The following code was generated by JFlex 1.6.1 */

package Lexical;

import java.io.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>src/Lexical/lexer.flex</tt>
 */
public class Yylex {

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
    "\11\0\1\2\1\2\1\65\1\2\1\2\22\0\1\61\1\42\3\0"+
    "\1\1\1\44\1\0\1\53\1\54\1\0\1\55\1\62\1\55\1\56"+
    "\1\1\1\4\1\63\1\64\1\63\6\11\1\0\1\1\1\42\1\43"+
    "\1\42\2\0\1\40\5\10\7\57\1\37\11\57\1\7\2\57\1\47"+
    "\1\46\1\50\1\0\1\60\1\0\1\30\1\20\1\27\1\15\1\22"+
    "\1\31\1\26\1\32\1\12\1\57\1\36\1\21\1\33\1\13\1\16"+
    "\1\34\1\57\1\25\1\24\1\14\1\17\1\23\1\35\1\5\1\41"+
    "\1\57\1\51\1\45\1\52\7\0\1\65\u1f96\0\1\3\1\6\12\0"+
    "\1\65\1\65\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\1\1\4\1\1\1\4"+
    "\15\1\1\2\3\1\1\5\1\6\1\0\1\6\1\0"+
    "\1\7\1\0\2\10\1\0\1\11\20\0\1\12\4\0"+
    "\1\13\1\14\1\11\16\0\1\11\1\13\2\0\1\15"+
    "\22\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[97];
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
    "\0\0\0\66\0\66\0\66\0\154\0\242\0\330\0\u010e"+
    "\0\u0144\0\u017a\0\u01b0\0\u01e6\0\u021c\0\u0252\0\u0288\0\u02be"+
    "\0\u02f4\0\u032a\0\u0360\0\u0396\0\u03cc\0\u0402\0\u0438\0\u046e"+
    "\0\u04a4\0\66\0\u04da\0\u0510\0\u0546\0\u057c\0\330\0\330"+
    "\0\66\0\330\0\u05b2\0\330\0\u05e8\0\u061e\0\u0654\0\u068a"+
    "\0\u06c0\0\u06f6\0\u072c\0\u0762\0\u0798\0\u07ce\0\u0804\0\u083a"+
    "\0\u0870\0\u08a6\0\u08dc\0\u0912\0\66\0\u0948\0\u097e\0\u09b4"+
    "\0\u09ea\0\u0546\0\u057c\0\u0a20\0\u0a56\0\u0a8c\0\u0ac2\0\u0af8"+
    "\0\u0b2e\0\u0b64\0\u0b9a\0\u0bd0\0\u0c06\0\u0c3c\0\u0c72\0\u0ca8"+
    "\0\u0cde\0\u0d14\0\u0d4a\0\66\0\u0d80\0\u0db6\0\330\0\u0dec"+
    "\0\u0e22\0\u0e58\0\u0e8e\0\u0ec4\0\u0efa\0\u0f30\0\u0f66\0\u0f9c"+
    "\0\u0fd2\0\u1008\0\u103e\0\u1074\0\u10aa\0\u10e0\0\u1116\0\u114c"+
    "\0\u1182";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[97];
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
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\2\2\7"+
    "\1\10\1\11\1\12\1\13\1\14\2\7\1\15\1\7"+
    "\1\16\1\17\1\20\1\21\1\7\1\22\1\7\1\23"+
    "\3\7\1\24\1\7\1\25\2\7\1\26\1\3\1\27"+
    "\1\30\1\31\6\3\1\32\1\3\1\7\1\33\1\2"+
    "\1\3\2\10\73\0\1\34\65\0\1\10\1\33\1\0"+
    "\1\35\1\33\1\10\30\33\14\0\1\36\2\33\2\0"+
    "\2\10\5\0\1\37\1\40\1\0\33\40\15\0\2\40"+
    "\2\41\1\42\1\37\5\0\1\10\1\33\1\0\2\33"+
    "\1\10\30\33\14\0\1\36\2\33\2\0\2\10\5\0"+
    "\1\37\1\40\1\0\4\40\1\43\15\40\1\44\1\40"+
    "\1\45\6\40\15\0\2\40\2\41\1\42\1\37\5\0"+
    "\1\37\1\40\1\0\10\40\1\46\22\40\15\0\2\40"+
    "\2\41\1\42\1\37\5\0\1\37\1\40\1\0\16\40"+
    "\1\47\4\40\1\50\7\40\15\0\2\40\2\41\1\42"+
    "\1\37\5\0\1\37\1\40\1\0\7\40\1\51\23\40"+
    "\15\0\2\40\2\41\1\42\1\37\5\0\1\37\1\40"+
    "\1\0\16\40\1\52\14\40\15\0\2\40\2\41\1\42"+
    "\1\37\5\0\1\37\1\53\1\0\12\40\1\54\20\40"+
    "\15\0\2\40\2\41\1\42\1\37\5\0\1\37\1\40"+
    "\1\0\7\40\1\55\23\40\15\0\2\40\2\41\1\42"+
    "\1\37\5\0\1\37\1\40\1\0\5\40\1\56\25\40"+
    "\15\0\2\40\2\41\1\42\1\37\5\0\1\37\1\40"+
    "\1\0\13\40\1\57\17\40\15\0\2\40\2\41\1\42"+
    "\1\37\5\0\1\37\1\40\1\0\12\40\1\60\20\40"+
    "\15\0\2\40\2\41\1\42\1\37\5\0\1\37\1\40"+
    "\1\0\7\40\1\61\11\40\1\62\11\40\15\0\2\40"+
    "\2\41\1\42\1\37\5\0\1\37\1\40\1\0\23\40"+
    "\1\63\7\40\15\0\2\40\2\41\1\42\1\37\5\0"+
    "\1\37\1\40\1\0\13\40\1\64\17\40\15\0\2\40"+
    "\2\41\1\42\1\37\44\0\1\3\66\0\1\3\66\0"+
    "\1\65\67\0\1\66\1\0\1\67\1\0\1\70\16\0"+
    "\2\33\1\0\33\33\15\0\2\33\2\0\2\33\6\0"+
    "\1\71\64\0\1\72\1\33\1\0\1\33\2\72\3\33"+
    "\1\72\2\33\1\72\1\33\1\72\4\33\3\72\6\33"+
    "\1\72\1\33\15\0\2\33\2\0\2\72\5\0\1\73"+
    "\4\0\1\73\51\0\2\73\5\0\1\37\1\40\1\0"+
    "\5\40\1\74\25\40\15\0\2\40\2\41\1\42\1\37"+
    "\5\0\1\37\1\40\1\0\25\40\1\75\5\40\15\0"+
    "\2\40\2\41\1\42\1\37\5\0\1\37\1\40\1\0"+
    "\12\40\1\76\20\40\15\0\2\40\2\41\1\42\1\37"+
    "\5\0\1\37\1\40\1\0\10\40\1\77\22\40\15\0"+
    "\2\40\2\41\1\42\1\37\5\0\1\37\1\40\1\0"+
    "\3\40\1\100\27\40\15\0\2\40\2\41\1\42\1\37"+
    "\5\0\1\37\1\40\1\0\10\40\1\101\22\40\15\0"+
    "\2\40\2\41\1\42\1\37\5\0\1\37\1\40\1\0"+
    "\13\40\1\102\17\40\15\0\2\40\2\41\1\42\1\37"+
    "\5\0\1\37\1\40\1\0\5\40\1\103\25\40\15\0"+
    "\2\40\2\41\1\42\1\37\5\0\1\37\1\40\1\0"+
    "\15\40\1\104\15\40\15\0\2\40\2\41\1\42\1\37"+
    "\5\0\1\37\1\40\1\0\3\40\1\105\27\40\15\0"+
    "\2\40\2\41\1\42\1\37\5\0\1\37\1\40\1\0"+
    "\16\40\1\106\14\40\15\0\2\40\2\41\1\42\1\37"+
    "\5\0\1\37\1\40\1\0\5\40\1\107\25\40\15\0"+
    "\2\40\2\41\1\42\1\37\5\0\1\37\1\40\1\0"+
    "\21\40\1\110\11\40\15\0\2\40\2\41\1\42\1\37"+
    "\5\0\1\37\1\40\1\0\16\40\1\44\14\40\15\0"+
    "\2\40\2\41\1\42\1\37\5\0\1\37\1\40\1\0"+
    "\12\40\1\111\20\40\15\0\2\40\2\41\1\42\1\37"+
    "\5\0\1\37\1\40\1\0\3\40\1\112\27\40\15\0"+
    "\2\40\2\41\1\42\1\37\5\0\1\37\1\40\1\0"+
    "\26\40\1\113\4\40\15\0\2\40\2\41\1\42\1\37"+
    "\51\0\1\32\67\0\1\32\67\0\1\32\17\0\1\114"+
    "\63\0\1\37\1\40\1\0\13\40\1\115\17\40\15\0"+
    "\2\40\2\41\1\42\1\37\5\0\1\37\1\40\1\0"+
    "\12\40\1\116\20\40\15\0\2\40\2\41\1\42\1\37"+
    "\5\0\1\37\1\40\1\0\12\40\1\44\20\40\15\0"+
    "\2\40\2\41\1\42\1\37\5\0\1\37\1\40\1\0"+
    "\13\40\1\117\17\40\15\0\2\40\2\41\1\42\1\37"+
    "\5\0\1\37\1\40\1\0\15\40\1\44\15\40\15\0"+
    "\2\40\2\41\1\42\1\37\5\0\1\37\1\40\1\0"+
    "\11\40\1\112\21\40\15\0\2\40\2\41\1\42\1\37"+
    "\5\0\1\37\1\40\1\0\21\40\1\120\11\40\15\0"+
    "\2\40\2\41\1\42\1\37\5\0\1\37\1\40\1\0"+
    "\13\40\1\121\17\40\15\0\2\40\2\41\1\42\1\37"+
    "\5\0\1\37\1\40\1\0\13\40\1\44\17\40\15\0"+
    "\2\40\2\41\1\42\1\37\5\0\1\37\1\40\1\0"+
    "\6\40\1\44\24\40\15\0\2\40\2\41\1\42\1\37"+
    "\5\0\1\37\1\40\1\0\3\40\1\122\27\40\15\0"+
    "\2\40\2\41\1\42\1\37\5\0\1\37\1\40\1\0"+
    "\10\40\1\123\22\40\15\0\2\40\2\41\1\42\1\37"+
    "\5\0\1\37\1\40\1\0\15\40\1\100\15\40\15\0"+
    "\2\40\2\41\1\42\1\37\5\0\1\37\1\40\1\0"+
    "\15\40\1\77\15\40\15\0\2\40\2\41\1\42\1\37"+
    "\5\0\1\37\1\40\1\0\12\40\1\104\20\40\15\0"+
    "\2\40\2\41\1\42\1\37\5\0\1\37\1\40\1\0"+
    "\31\40\1\124\1\40\15\0\2\40\2\41\1\42\1\37"+
    "\5\0\1\37\1\40\1\0\16\40\1\125\14\40\15\0"+
    "\2\40\2\41\1\42\1\37\5\0\1\37\1\40\1\0"+
    "\13\40\1\126\17\40\15\0\2\40\2\41\1\42\1\37"+
    "\5\0\1\37\1\40\1\0\27\40\1\44\3\40\15\0"+
    "\2\40\2\41\1\42\1\37\5\0\1\37\1\40\1\0"+
    "\4\40\1\127\26\40\15\0\2\40\2\41\1\42\1\37"+
    "\5\0\1\37\1\40\1\0\4\40\1\130\26\40\15\0"+
    "\2\40\2\41\1\42\1\37\5\0\1\37\1\40\1\0"+
    "\16\40\1\131\14\40\15\0\2\40\2\41\1\42\1\37"+
    "\5\0\1\37\1\40\1\0\16\40\1\132\14\40\15\0"+
    "\2\40\2\41\1\42\1\37\5\0\1\37\1\40\1\0"+
    "\22\40\1\133\10\40\15\0\2\40\2\41\1\42\1\37"+
    "\5\0\1\37\1\40\1\0\24\40\1\134\6\40\15\0"+
    "\2\40\2\41\1\42\1\37\5\0\1\37\1\40\1\0"+
    "\6\40\1\100\24\40\15\0\2\40\2\41\1\42\1\37"+
    "\5\0\1\37\1\40\1\0\17\40\1\44\13\40\15\0"+
    "\2\40\2\41\1\42\1\37\5\0\1\37\1\40\1\0"+
    "\4\40\1\44\26\40\15\0\2\40\2\41\1\42\1\37"+
    "\5\0\1\37\1\40\1\0\16\40\1\135\14\40\15\0"+
    "\2\40\2\41\1\42\1\37\5\0\1\37\1\40\1\0"+
    "\21\40\1\136\11\40\15\0\2\40\2\41\1\42\1\37"+
    "\5\0\1\37\1\40\1\0\13\40\1\137\17\40\15\0"+
    "\2\40\2\41\1\42\1\37\5\0\1\37\1\40\1\0"+
    "\21\40\1\140\11\40\15\0\2\40\2\41\1\42\1\37"+
    "\5\0\1\37\1\40\1\0\20\40\1\104\12\40\15\0"+
    "\2\40\2\41\1\42\1\37\5\0\1\37\1\40\1\0"+
    "\4\40\1\141\26\40\15\0\2\40\2\41\1\42\1\37"+
    "\5\0\1\37\1\40\1\0\32\40\1\44\15\0\2\40"+
    "\2\41\1\42\1\37\5\0\1\37\1\40\1\0\5\40"+
    "\1\100\25\40\15\0\2\40\2\41\1\42\1\37\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4536];
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
    "\1\0\3\11\25\1\1\11\1\1\1\0\1\1\1\0"+
    "\1\1\1\0\1\11\1\1\1\0\1\1\20\0\1\11"+
    "\4\0\3\1\16\0\1\1\1\11\2\0\1\1\22\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[97];
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


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Yylex(java.io.Reader in) {
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
    while (i < 198) {
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
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public String yylex() throws java.io.IOException {
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
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
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
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return "Token no reconocido: " + yytext() + " en linea: " + yyline+ " columna " + yycolumn;
            }
          case 14: break;
          case 2: 
            { return "operador " + yytext() + " en linea: " + yyline+ " columna " + yycolumn;
            }
          case 15: break;
          case 3: 
            { // accion vacia: se ignoran los espacios y tabuladores
            }
          case 16: break;
          case 4: 
            { return "numero entero " + yytext() + " en linea: " + yyline+ " columna " + yycolumn;
            }
          case 17: break;
          case 5: 
            { return "Simbolo " + yytext() + " en linea: " + yyline+ " columna " + yycolumn;
            }
          case 18: break;
          case 6: 
            { return "*** Error linea " + yyline + " identificador inválido ";
            }
          case 19: break;
          case 7: 
            { return "*** Error linea " + yyline + " identificador muy largo ";
            }
          case 20: break;
          case 8: 
            { return "identificador " + yytext() + " en linea: " + yyline+ " columna " + yycolumn;
            }
          case 21: break;
          case 9: 
            { return "palabra clave " + yytext() + " en linea: " + yyline+ " columna " + yycolumn;
            }
          case 22: break;
          case 10: 
            { return "palabra " + yytext() + " en linea: " + yyline+ " columna " + yycolumn;
            }
          case 23: break;
          case 11: 
            { return "numero_hexadecimal " + yytext() + " en linea: " + yyline + " columna " + yycolumn ;
            }
          case 24: break;
          case 12: 
            { return "Punto Flotante " + yytext() + " en linea: " + yyline+ " columna " + yycolumn;
            }
          case 25: break;
          case 13: 
            { return "constante booleana " + yytext() + " en linea: " + yyline+ " columna " + yycolumn;
            }
          case 26: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
