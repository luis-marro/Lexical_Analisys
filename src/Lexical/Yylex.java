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
    "\11\0\1\2\1\4\1\10\1\11\1\3\22\0\1\5\1\54\1\6"+
    "\2\0\1\1\1\55\1\0\1\64\1\65\1\12\1\66\1\74\1\67"+
    "\1\70\1\7\1\14\1\75\1\21\1\75\6\21\1\0\1\1\1\52"+
    "\1\53\1\54\2\0\1\50\3\20\1\71\1\20\7\72\1\47\11\72"+
    "\1\17\2\72\1\60\1\57\1\61\1\0\1\73\1\0\1\40\1\30"+
    "\1\37\1\25\1\32\1\41\1\36\1\42\1\22\1\72\1\46\1\31"+
    "\1\43\1\23\1\26\1\44\1\72\1\35\1\34\1\24\1\27\1\33"+
    "\1\45\1\15\1\51\1\72\1\62\1\56\1\63\7\0\1\10\u1f96\0"+
    "\1\13\1\16\12\0\1\10\1\10\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\2\3\1\1\1\2\1\4\1\1"+
    "\1\5\1\1\1\5\15\1\2\2\3\1\1\6\1\7"+
    "\1\2\1\10\1\0\1\11\1\12\2\0\2\10\2\0"+
    "\1\13\1\0\2\13\1\0\1\14\20\0\1\15\1\16"+
    "\1\17\10\0\1\20\1\21\1\22\2\14\14\0\1\23"+
    "\2\0\1\24\1\25\1\26\1\27\4\0\1\30\1\20"+
    "\1\10\2\22\2\0\1\31\1\32\1\33\4\0\1\34"+
    "\3\0\2\23\2\0\2\24\2\0\1\30\1\21\3\0"+
    "\2\31\2\33\1\0\1\35\3\0\1\13\2\34\2\0"+
    "\1\36\1\37\1\40\1\0\1\30\1\21\2\0\1\41"+
    "\2\35\2\0\1\42\1\0\2\36\2\40\3\0\2\41"+
    "\1\43\1\0\2\42\2\0\1\13\3\0\2\43\3\0"+
    "\1\44\1\0\1\45\3\0\1\13\2\44\1\46\2\0"+
    "\2\46\4\0\1\47\4\0\1\50";

  private static int [] zzUnpackAction() {
    int [] result = new int[212];
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
    "\0\0\0\76\0\76\0\76\0\174\0\272\0\370\0\76"+
    "\0\u0136\0\u0174\0\u01b2\0\u01f0\0\u022e\0\u026c\0\u02aa\0\u02e8"+
    "\0\u0326\0\u0364\0\u03a2\0\u03e0\0\u041e\0\u045c\0\u049a\0\u04d8"+
    "\0\u0516\0\u0554\0\u0592\0\u05d0\0\u060e\0\u064c\0\76\0\76"+
    "\0\u068a\0\u068a\0\272\0\272\0\u06c8\0\u0706\0\u0744\0\u0782"+
    "\0\u07c0\0\u07fe\0\u083c\0\u07fe\0\u01b2\0\76\0\u01b2\0\u087a"+
    "\0\u08b8\0\u08f6\0\u0934\0\u0972\0\u09b0\0\u09ee\0\u0a2c\0\u0a6a"+
    "\0\u0aa8\0\u0ae6\0\u0b24\0\u0b62\0\u0ba0\0\u0bde\0\u0c1c\0\u0c5a"+
    "\0\u0c98\0\76\0\76\0\76\0\u0cd6\0\u0d14\0\u0d52\0\u0d90"+
    "\0\u0dce\0\u0e0c\0\u0e4a\0\u0e88\0\u0782\0\u0ec6\0\u0f04\0\u07fe"+
    "\0\u0f42\0\u0f80\0\u0fbe\0\u0ffc\0\u103a\0\u1078\0\u10b6\0\u10f4"+
    "\0\u1132\0\u1170\0\u11ae\0\u11ec\0\u122a\0\u1268\0\u12a6\0\u12e4"+
    "\0\u1322\0\76\0\76\0\76\0\u1360\0\u139e\0\u13dc\0\u141a"+
    "\0\u0d90\0\76\0\u1458\0\u07fe\0\u1496\0\u14d4\0\u1512\0\u1550"+
    "\0\u01b2\0\u158e\0\u15cc\0\u160a\0\u1648\0\u1686\0\u16c4\0\u1702"+
    "\0\u1740\0\u177e\0\u07fe\0\u17bc\0\u17fa\0\u1838\0\u07fe\0\u1876"+
    "\0\u18b4\0\u18f2\0\u0e0c\0\u1930\0\u196e\0\u19ac\0\u19ea\0\u07fe"+
    "\0\u1a28\0\u07fe\0\u1a66\0\u1aa4\0\u1ae2\0\u1b20\0\u1b5e\0\u1b9c"+
    "\0\u1b5e\0\u07fe\0\u1bda\0\u1c18\0\u1c56\0\u1c94\0\u01b2\0\u1cd2"+
    "\0\u1d10\0\76\0\u196e\0\u1d4e\0\u1d8c\0\u1dca\0\u07fe\0\u1e08"+
    "\0\u1e46\0\u1e84\0\u1ec2\0\u1f00\0\u07fe\0\u1f3e\0\u07fe\0\u1f7c"+
    "\0\u1fba\0\u1ff8\0\u2036\0\u07fe\0\u2074\0\u20b2\0\u20f0\0\u07fe"+
    "\0\u212e\0\u216c\0\u21aa\0\u216c\0\u21e8\0\u2226\0\u2264\0\u07fe"+
    "\0\u22a2\0\u22e0\0\u231e\0\u235c\0\u239a\0\u23d8\0\76\0\u2416"+
    "\0\u2454\0\u2492\0\u2454\0\u07fe\0\u24d0\0\u250e\0\u254c\0\u258a"+
    "\0\u07fe\0\u25c8\0\u2606\0\u2644\0\u2682\0\u26c0\0\76\0\u26fe"+
    "\0\u273c\0\u277a\0\u27b8\0\76";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[212];
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
    "\1\2\1\3\1\4\1\5\2\4\1\6\1\7\1\0"+
    "\1\4\1\10\1\11\1\12\1\13\1\2\2\13\1\14"+
    "\1\15\1\16\1\17\1\20\2\13\1\21\1\13\1\22"+
    "\1\23\1\24\1\25\1\13\1\26\1\13\1\27\3\13"+
    "\1\30\1\13\1\31\2\13\1\32\1\3\1\33\1\34"+
    "\1\35\1\36\6\3\1\37\1\40\1\41\2\13\1\42"+
    "\1\3\1\14\102\0\1\4\71\0\3\43\2\0\1\43"+
    "\1\44\1\43\2\0\64\43\7\0\1\45\2\0\1\46"+
    "\77\0\1\47\75\0\1\14\1\42\1\0\1\50\1\42"+
    "\1\14\30\42\16\0\1\51\3\42\1\0\1\14\2\0"+
    "\1\52\1\53\1\52\1\54\3\0\1\52\2\0\2\55"+
    "\1\0\33\55\17\0\3\55\1\56\1\57\14\0\1\14"+
    "\1\42\1\0\2\42\1\14\30\42\16\0\1\51\3\42"+
    "\1\0\1\14\2\0\1\52\1\53\1\52\1\54\3\0"+
    "\1\52\2\0\2\55\1\0\4\55\1\60\15\55\1\61"+
    "\1\55\1\62\6\55\17\0\3\55\1\56\1\57\2\0"+
    "\1\52\1\53\1\52\1\54\3\0\1\52\2\0\2\55"+
    "\1\0\10\55\1\63\22\55\17\0\3\55\1\56\1\57"+
    "\2\0\1\52\1\53\1\52\1\54\3\0\1\52\2\0"+
    "\2\55\1\0\16\55\1\64\4\55\1\65\7\55\17\0"+
    "\3\55\1\56\1\57\2\0\1\52\1\53\1\52\1\54"+
    "\3\0\1\52\2\0\2\55\1\0\7\55\1\66\23\55"+
    "\17\0\3\55\1\56\1\57\2\0\1\52\1\53\1\52"+
    "\1\54\3\0\1\52\2\0\2\55\1\0\16\55\1\67"+
    "\14\55\17\0\3\55\1\56\1\57\2\0\1\52\1\53"+
    "\1\52\1\54\3\0\1\52\2\0\1\55\1\70\1\0"+
    "\12\55\1\71\20\55\17\0\3\55\1\56\1\57\2\0"+
    "\1\52\1\53\1\52\1\54\3\0\1\52\2\0\2\55"+
    "\1\0\7\55\1\72\23\55\17\0\3\55\1\56\1\57"+
    "\2\0\1\52\1\53\1\52\1\54\3\0\1\52\2\0"+
    "\2\55\1\0\5\55\1\73\25\55\17\0\3\55\1\56"+
    "\1\57\2\0\1\52\1\53\1\52\1\54\3\0\1\52"+
    "\2\0\2\55\1\0\13\55\1\74\17\55\17\0\3\55"+
    "\1\56\1\57\2\0\1\52\1\53\1\52\1\54\3\0"+
    "\1\52\2\0\2\55\1\0\12\55\1\75\20\55\17\0"+
    "\3\55\1\56\1\57\2\0\1\52\1\53\1\52\1\54"+
    "\3\0\1\52\2\0\2\55\1\0\7\55\1\76\11\55"+
    "\1\77\11\55\17\0\3\55\1\56\1\57\2\0\1\52"+
    "\1\53\1\52\1\54\3\0\1\52\2\0\2\55\1\0"+
    "\23\55\1\100\7\55\17\0\3\55\1\56\1\57\2\0"+
    "\1\52\1\53\1\52\1\54\3\0\1\52\2\0\2\55"+
    "\1\0\13\55\1\101\17\55\17\0\3\55\1\56\1\57"+
    "\53\0\1\102\75\0\1\103\77\0\1\103\76\0\1\104"+
    "\77\0\1\105\1\0\1\106\1\0\1\107\25\0\2\42"+
    "\1\0\33\42\16\0\4\42\1\0\1\42\3\45\2\0"+
    "\3\45\2\0\64\45\2\110\2\111\1\112\1\111\2\110"+
    "\1\0\1\111\1\113\63\110\15\0\1\114\74\0\1\115"+
    "\1\42\1\0\1\42\2\115\3\42\1\115\2\42\1\115"+
    "\1\42\1\115\4\42\3\115\6\42\1\115\1\42\16\0"+
    "\1\42\1\115\2\42\1\0\1\115\14\0\1\116\1\42"+
    "\1\0\2\42\1\116\30\42\16\0\4\42\1\0\1\116"+
    "\5\0\1\56\66\0\2\56\4\0\1\52\1\56\66\0"+
    "\2\56\2\0\1\52\1\53\1\52\1\54\3\0\1\52"+
    "\2\0\2\55\1\0\5\55\1\117\25\55\17\0\3\55"+
    "\1\56\1\57\2\0\1\120\1\121\2\120\3\0\1\120"+
    "\2\0\2\55\1\0\33\55\17\0\3\55\1\56\1\57"+
    "\2\0\1\52\1\53\1\52\1\54\3\0\1\52\2\0"+
    "\2\55\1\0\25\55\1\122\5\55\17\0\3\55\1\56"+
    "\1\57\2\0\1\52\1\53\1\52\1\54\3\0\1\52"+
    "\2\0\2\55\1\0\12\55\1\123\20\55\17\0\3\55"+
    "\1\56\1\57\2\0\1\52\1\53\1\52\1\54\3\0"+
    "\1\52\2\0\2\55\1\0\10\55\1\124\22\55\17\0"+
    "\3\55\1\56\1\57\2\0\1\52\1\53\1\52\1\54"+
    "\3\0\1\52\2\0\2\55\1\0\3\55\1\125\27\55"+
    "\17\0\3\55\1\56\1\57\2\0\1\52\1\53\1\52"+
    "\1\54\3\0\1\52\2\0\2\55\1\0\10\55\1\126"+
    "\22\55\17\0\3\55\1\56\1\57\2\0\1\52\1\53"+
    "\1\52\1\54\3\0\1\52\2\0\2\55\1\0\13\55"+
    "\1\127\17\55\17\0\3\55\1\56\1\57\2\0\1\52"+
    "\1\53\1\52\1\54\3\0\1\52\2\0\2\55\1\0"+
    "\5\55\1\130\25\55\17\0\3\55\1\56\1\57\2\0"+
    "\1\52\1\53\1\52\1\54\3\0\1\52\2\0\2\55"+
    "\1\0\15\55\1\131\15\55\17\0\3\55\1\56\1\57"+
    "\2\0\1\52\1\53\1\52\1\54\3\0\1\52\2\0"+
    "\2\55\1\0\3\55\1\132\27\55\17\0\3\55\1\56"+
    "\1\57\2\0\1\52\1\53\1\52\1\54\3\0\1\52"+
    "\2\0\2\55\1\0\16\55\1\133\14\55\17\0\3\55"+
    "\1\56\1\57\2\0\1\52\1\53\1\52\1\54\3\0"+
    "\1\52\2\0\2\55\1\0\5\55\1\134\25\55\17\0"+
    "\3\55\1\56\1\57\2\0\1\52\1\53\1\52\1\54"+
    "\3\0\1\52\2\0\2\55\1\0\21\55\1\135\11\55"+
    "\17\0\3\55\1\56\1\57\2\0\1\52\1\53\1\52"+
    "\1\54\3\0\1\52\2\0\2\55\1\0\16\55\1\136"+
    "\14\55\17\0\3\55\1\56\1\57\2\0\1\52\1\53"+
    "\1\52\1\54\3\0\1\52\2\0\2\55\1\0\12\55"+
    "\1\137\20\55\17\0\3\55\1\56\1\57\2\0\1\52"+
    "\1\53\1\52\1\54\3\0\1\52\2\0\2\55\1\0"+
    "\3\55\1\140\27\55\17\0\3\55\1\56\1\57\2\0"+
    "\1\52\1\53\1\52\1\54\3\0\1\52\2\0\2\55"+
    "\1\0\26\55\1\141\4\55\17\0\3\55\1\56\1\57"+
    "\61\0\1\142\77\0\1\143\77\0\1\144\10\0\3\110"+
    "\1\0\1\112\3\110\2\0\66\110\1\145\1\146\1\112"+
    "\1\145\2\110\1\0\1\147\1\113\63\110\3\112\1\146"+
    "\4\112\1\0\1\147\1\150\63\112\3\110\1\0\1\112"+
    "\2\110\1\151\2\0\64\110\16\0\1\152\73\0\1\116"+
    "\1\42\1\0\2\42\1\116\10\42\1\153\17\42\16\0"+
    "\1\42\1\153\2\42\1\0\1\116\2\0\1\154\1\155"+
    "\2\154\3\0\1\154\2\0\2\55\1\0\13\55\1\156"+
    "\17\55\17\0\3\55\1\56\1\57\4\0\1\120\1\56"+
    "\66\0\2\56\2\0\1\52\1\53\1\52\1\54\3\0"+
    "\1\52\2\0\2\55\1\0\12\55\1\157\20\55\17\0"+
    "\3\55\1\56\1\57\2\0\1\52\1\53\1\52\1\54"+
    "\3\0\1\52\2\0\2\55\1\0\12\55\1\160\20\55"+
    "\17\0\3\55\1\56\1\57\2\0\1\52\1\53\1\52"+
    "\1\54\3\0\1\52\2\0\2\55\1\0\13\55\1\161"+
    "\17\55\17\0\3\55\1\56\1\57\2\0\1\52\1\53"+
    "\1\52\1\54\3\0\1\52\2\0\2\55\1\0\15\55"+
    "\1\162\15\55\17\0\3\55\1\56\1\57\2\0\1\52"+
    "\1\53\1\52\1\54\3\0\1\52\2\0\2\55\1\0"+
    "\11\55\1\163\21\55\17\0\3\55\1\56\1\57\2\0"+
    "\1\52\1\53\1\52\1\54\3\0\1\52\2\0\2\55"+
    "\1\0\21\55\1\164\11\55\17\0\3\55\1\56\1\57"+
    "\2\0\1\52\1\53\1\52\1\54\3\0\1\52\2\0"+
    "\2\55\1\0\13\55\1\165\17\55\17\0\3\55\1\56"+
    "\1\57\2\0\1\52\1\53\1\52\1\54\3\0\1\52"+
    "\2\0\2\55\1\0\13\55\1\166\17\55\17\0\3\55"+
    "\1\56\1\57\2\0\1\52\1\53\1\52\1\54\3\0"+
    "\1\52\2\0\2\55\1\0\6\55\1\167\24\55\17\0"+
    "\3\55\1\56\1\57\2\0\1\52\1\53\1\52\1\54"+
    "\3\0\1\52\2\0\2\55\1\0\3\55\1\170\27\55"+
    "\17\0\3\55\1\56\1\57\2\0\1\52\1\53\1\52"+
    "\1\54\3\0\1\52\2\0\2\55\1\0\10\55\1\171"+
    "\22\55\17\0\3\55\1\56\1\57\2\0\1\52\1\53"+
    "\1\52\1\54\3\0\1\52\2\0\2\55\1\0\15\55"+
    "\1\172\15\55\17\0\3\55\1\56\1\57\2\0\1\173"+
    "\1\174\2\173\3\0\1\173\2\0\2\55\1\0\33\55"+
    "\17\0\3\55\1\56\1\57\2\0\1\52\1\53\1\52"+
    "\1\54\3\0\1\52\2\0\2\55\1\0\15\55\1\175"+
    "\15\55\17\0\3\55\1\56\1\57\2\0\1\52\1\53"+
    "\1\52\1\54\3\0\1\52\2\0\2\55\1\0\12\55"+
    "\1\176\20\55\17\0\3\55\1\56\1\57\2\0\1\177"+
    "\1\200\2\177\3\0\1\177\2\0\2\55\1\0\31\55"+
    "\1\201\1\55\17\0\3\55\1\56\1\57\3\110\1\0"+
    "\1\112\3\110\2\0\1\113\63\110\4\0\1\147\5\0"+
    "\1\202\75\0\1\202\63\0\3\112\1\146\3\112\1\203"+
    "\1\0\1\147\1\150\63\112\14\0\1\204\1\42\1\0"+
    "\2\42\1\204\30\42\14\0\2\205\4\42\1\0\1\204"+
    "\4\0\1\154\1\56\66\0\2\56\2\0\1\52\1\53"+
    "\1\52\1\54\3\0\1\52\2\0\2\55\1\0\16\55"+
    "\1\206\14\55\17\0\3\55\1\56\1\57\2\0\1\52"+
    "\1\53\1\52\1\54\3\0\1\52\2\0\2\55\1\0"+
    "\13\55\1\207\17\55\17\0\3\55\1\56\1\57\2\0"+
    "\1\210\1\211\2\210\3\0\1\210\2\0\2\55\1\0"+
    "\33\55\17\0\3\55\1\56\1\57\2\0\1\212\1\213"+
    "\2\212\3\0\1\212\2\0\2\55\1\0\33\55\17\0"+
    "\3\55\1\56\1\57\2\0\1\52\1\53\1\52\1\54"+
    "\3\0\1\52\2\0\2\55\1\0\12\55\1\214\20\55"+
    "\17\0\3\55\1\56\1\57\2\0\1\52\1\53\1\52"+
    "\1\54\3\0\1\52\2\0\2\55\1\0\27\55\1\215"+
    "\3\55\17\0\3\55\1\56\1\57\2\0\1\52\1\53"+
    "\1\52\1\54\3\0\1\52\2\0\2\55\1\0\4\55"+
    "\1\216\26\55\17\0\3\55\1\56\1\57\2\0\1\217"+
    "\1\220\1\217\1\221\3\0\1\217\2\0\2\55\1\0"+
    "\33\55\17\0\3\55\1\56\1\57\2\0\1\222\1\223"+
    "\2\222\3\0\1\222\2\0\2\55\1\0\33\55\17\0"+
    "\3\55\1\56\1\57\2\0\1\52\1\53\1\52\1\54"+
    "\3\0\1\52\2\0\2\55\1\0\4\55\1\224\26\55"+
    "\17\0\3\55\1\56\1\57\2\0\1\52\1\53\1\52"+
    "\1\54\3\0\1\52\2\0\2\55\1\0\16\55\1\225"+
    "\14\55\17\0\3\55\1\56\1\57\2\0\1\52\1\53"+
    "\1\52\1\54\3\0\1\52\2\0\2\55\1\0\15\55"+
    "\1\226\15\55\17\0\3\55\1\56\1\57\4\0\1\173"+
    "\1\56\66\0\2\56\2\0\1\52\1\53\1\52\1\54"+
    "\3\0\1\52\2\0\2\55\1\0\13\55\1\227\17\55"+
    "\17\0\3\55\1\56\1\57\2\0\1\52\1\53\1\52"+
    "\1\54\3\0\1\52\2\0\2\55\1\0\13\55\1\230"+
    "\17\55\17\0\3\55\1\56\1\57\4\0\1\177\1\56"+
    "\66\0\2\56\2\0\1\52\1\53\1\52\1\54\3\0"+
    "\1\52\2\0\2\55\1\0\16\55\1\231\14\55\17\0"+
    "\3\55\1\56\1\57\7\0\1\232\102\0\1\204\1\42"+
    "\1\0\2\42\1\204\30\42\16\0\4\42\1\0\1\204"+
    "\14\0\1\233\4\0\1\233\53\0\1\233\2\0\1\52"+
    "\1\53\1\52\1\54\3\0\1\52\2\0\2\55\1\0"+
    "\22\55\1\234\10\55\17\0\3\55\1\56\1\57\2\0"+
    "\1\52\1\53\1\52\1\54\3\0\1\52\2\0\2\55"+
    "\1\0\24\55\1\235\6\55\17\0\3\55\1\56\1\57"+
    "\4\0\1\210\1\56\66\0\2\56\4\0\1\212\1\56"+
    "\66\0\2\56\2\0\1\52\1\53\1\52\1\54\3\0"+
    "\1\52\2\0\2\55\1\0\13\55\1\236\17\55\17\0"+
    "\3\55\1\56\1\57\2\0\1\237\1\240\2\237\3\0"+
    "\1\237\2\0\2\55\1\0\33\55\17\0\3\55\1\56"+
    "\1\57\2\0\1\52\1\53\1\52\1\54\3\0\1\52"+
    "\2\0\2\55\1\0\6\55\1\241\24\55\17\0\3\55"+
    "\1\56\1\57\5\0\1\56\24\0\1\242\41\0\2\56"+
    "\4\0\1\217\1\56\24\0\1\242\41\0\2\56\4\0"+
    "\1\222\1\56\66\0\2\56\2\0\1\52\1\53\1\52"+
    "\1\54\3\0\1\52\2\0\2\55\1\0\17\55\1\243"+
    "\13\55\17\0\3\55\1\56\1\57\2\0\1\52\1\53"+
    "\1\52\1\54\3\0\1\52\2\0\2\55\1\0\4\55"+
    "\1\244\26\55\17\0\3\55\1\56\1\57\2\0\1\245"+
    "\1\246\2\245\3\0\1\245\2\0\2\55\1\0\33\55"+
    "\17\0\3\55\1\56\1\57\2\0\1\247\1\250\2\247"+
    "\3\0\1\247\2\0\2\55\1\0\33\55\17\0\3\55"+
    "\1\56\1\57\2\0\1\52\1\53\1\52\1\54\3\0"+
    "\1\52\2\0\2\55\1\0\16\55\1\251\14\55\17\0"+
    "\3\55\1\56\1\57\2\0\1\52\1\53\1\52\1\54"+
    "\3\0\1\52\2\0\2\55\1\0\21\55\1\252\11\55"+
    "\17\0\3\55\1\56\1\57\2\0\1\52\1\53\1\52"+
    "\1\54\3\0\1\52\2\0\2\55\1\0\13\55\1\253"+
    "\17\55\17\0\3\55\1\56\1\57\2\0\1\254\1\255"+
    "\2\254\3\0\1\254\2\0\2\55\1\0\33\55\17\0"+
    "\3\55\1\56\1\57\4\0\1\237\1\56\66\0\2\56"+
    "\2\0\1\52\1\53\1\52\1\54\3\0\1\52\2\0"+
    "\2\55\1\0\15\55\1\256\15\55\17\0\3\55\1\56"+
    "\1\57\31\0\1\257\46\0\1\260\1\261\2\260\3\0"+
    "\1\260\2\0\2\55\1\0\33\55\17\0\3\55\1\56"+
    "\1\57\2\0\1\262\1\263\1\262\1\264\3\0\1\262"+
    "\2\0\2\55\1\0\33\55\17\0\3\55\1\56\1\57"+
    "\4\0\1\245\1\56\66\0\2\56\4\0\1\247\1\56"+
    "\66\0\2\56\2\0\1\52\1\53\1\52\1\54\3\0"+
    "\1\52\2\0\2\55\1\0\21\55\1\265\11\55\17\0"+
    "\3\55\1\56\1\57\2\0\1\52\1\53\1\52\1\54"+
    "\3\0\1\52\2\0\2\55\1\0\20\55\1\266\12\55"+
    "\17\0\3\55\1\56\1\57\2\0\1\52\1\53\1\52"+
    "\1\54\3\0\1\52\2\0\2\55\1\0\4\55\1\267"+
    "\26\55\17\0\3\55\1\56\1\57\4\0\1\254\1\56"+
    "\66\0\2\56\2\0\1\270\1\271\2\270\3\0\1\270"+
    "\2\0\2\55\1\0\33\55\17\0\3\55\1\56\1\57"+
    "\34\0\1\272\45\0\1\260\1\56\66\0\2\56\5\0"+
    "\1\56\27\0\1\273\36\0\2\56\4\0\1\262\1\56"+
    "\27\0\1\273\36\0\2\56\2\0\1\52\1\53\1\52"+
    "\1\54\3\0\1\52\2\0\2\55\1\0\32\55\1\274"+
    "\17\0\3\55\1\56\1\57\2\0\1\52\1\53\1\52"+
    "\1\54\3\0\1\52\2\0\2\55\1\0\13\55\1\275"+
    "\17\55\17\0\3\55\1\56\1\57\2\0\1\52\1\53"+
    "\1\52\1\54\3\0\1\52\2\0\2\55\1\0\5\55"+
    "\1\276\25\55\17\0\3\55\1\56\1\57\4\0\1\270"+
    "\1\56\66\0\2\56\32\0\1\277\75\0\1\300\45\0"+
    "\1\301\1\302\1\301\1\303\3\0\1\301\2\0\2\55"+
    "\1\0\33\55\17\0\3\55\1\56\1\57\2\0\1\304"+
    "\1\305\2\304\3\0\1\304\2\0\2\55\1\0\33\55"+
    "\17\0\3\55\1\56\1\57\2\0\1\52\1\53\1\52"+
    "\1\54\3\0\1\52\2\0\2\55\1\0\15\55\1\306"+
    "\15\55\17\0\3\55\1\56\1\57\24\0\1\307\56\0"+
    "\1\56\41\0\1\310\24\0\2\56\4\0\1\301\1\56"+
    "\41\0\1\310\24\0\2\56\4\0\1\304\1\56\66\0"+
    "\2\56\2\0\1\311\1\312\2\311\3\0\1\311\2\0"+
    "\2\55\1\0\33\55\17\0\3\55\1\56\1\57\27\0"+
    "\1\313\100\0\1\314\47\0\1\311\1\56\66\0\2\56"+
    "\35\0\1\315\105\0\1\316\53\0\1\317\122\0\1\320"+
    "\62\0\1\321\75\0\1\322\100\0\1\323\106\0\1\324"+
    "\24\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[10230];
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
    "\1\0\3\11\3\1\1\11\26\1\2\11\2\1\1\0"+
    "\2\1\2\0\2\1\2\0\1\1\1\0\1\11\1\1"+
    "\1\0\1\1\20\0\3\11\10\0\5\1\14\0\1\1"+
    "\2\0\1\1\3\11\4\0\1\1\1\11\3\1\2\0"+
    "\3\1\4\0\1\1\3\0\2\1\2\0\2\1\2\0"+
    "\2\1\3\0\4\1\1\0\1\1\3\0\3\1\2\0"+
    "\3\1\1\0\1\11\1\1\2\0\3\1\2\0\1\1"+
    "\1\0\4\1\3\0\3\1\1\0\2\1\2\0\1\1"+
    "\3\0\2\1\3\0\1\1\1\0\1\11\3\0\4\1"+
    "\2\0\2\1\4\0\1\11\4\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[212];
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
    String token = "";
    int fixed = 0;

    private String longIdentifier(String text){
        if(text.length() > 31){
            return text.substring(0, 31);
        }else{
            return text;
        }
    }


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
    while (i < 204) {
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
          case 41: break;
          case 2: 
            { token = yytext();
    return yytext() + " line " + yyline + " cols " + yycolumn + " is " + "'" + token + "'";
            }
          case 42: break;
          case 3: 
            { // accion vacia: se ignoran los espacios y tabuladores
            }
          case 43: break;
          case 4: 
            { return yytext() + " line " + yyline + " cols " + yycolumn + " is " + "'*'";
            }
          case 44: break;
          case 5: 
            { token = yytext();
    fixed = token.length() - 1;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed +  " is intConstant  " + "(value = " + token + ")";
            }
          case 45: break;
          case 6: 
            { return yytext() + " line " + yyline + " cols " + yycolumn + " is " + "'+'";
            }
          case 46: break;
          case 7: 
            { return yytext() + " line " + yyline + " cols " + yycolumn + " is " + "'-'";
            }
          case 47: break;
          case 8: 
            { return "*** Error linea " + yyline + " identificador inválido ";
            }
          case 48: break;
          case 9: 
            { token = yytext();
    fixed = yycolumn + token.length() - 2;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is string variable";
            }
          case 49: break;
          case 10: 
            { // ignore single line comments
            }
          case 50: break;
          case 11: 
            { token = longIdentifier(yytext());
    fixed = yycolumn + token.length() - 2;
    return token + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is identifier";
            }
          case 51: break;
          case 12: 
            { fixed = yycolumn + 1;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is if";
            }
          case 52: break;
          case 13: 
            { token = yytext();
    fixed = yycolumn + 1;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed +  " is " + "'" + token + "'";
            }
          case 53: break;
          case 14: 
            { token = yytext();
    fixed = yycolumn + 1;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is " + "'" + token + "'";
            }
          case 54: break;
          case 15: 
            { fixed = yycolumn + 1;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is " + "'||'";
            }
          case 55: break;
          case 16: 
            { token = yytext();
    fixed = token.length() - 1;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is hexadecimal";
            }
          case 56: break;
          case 17: 
            { token = yytext();
    fixed = yycolumn + token.length() - 1;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is float (value = " + token + ")";
            }
          case 57: break;
          case 18: 
            { fixed = yycolumn + 2;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is int";
            }
          case 58: break;
          case 19: 
            { fixed = yycolumn + 2;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is for";
            }
          case 59: break;
          case 20: 
            { fixed = yycolumn + 2;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is New";
            }
          case 60: break;
          case 21: 
            { fixed = yycolumn + 1;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is " + "'[]'";
            }
          case 61: break;
          case 22: 
            { fixed = yycolumn + 1;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is " + "'{}'";
            }
          case 62: break;
          case 23: 
            { fixed = yycolumn + 1;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is " + "'()'";
            }
          case 63: break;
          case 24: 
            { // ignore multiline comments
            }
          case 64: break;
          case 25: 
            { fixed = yycolumn + 3;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is null";
            }
          case 65: break;
          case 26: 
            { fixed = yycolumn + 3;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is boolConstant (value = true)";
            }
          case 66: break;
          case 27: 
            { fixed = yycolumn + 3;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is this";
            }
          case 67: break;
          case 28: 
            { fixed = yycolumn + 3;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is void";
            }
          case 68: break;
          case 29: 
            { fixed = yycolumn + 4;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is break";
            }
          case 69: break;
          case 30: 
            { fixed = yycolumn + 4;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is class";
            }
          case 70: break;
          case 31: 
            { fixed = yycolumn + 4;
     return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is boolConstant (value = false)";
            }
          case 71: break;
          case 32: 
            { fixed = yycolumn + 4;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is while";
            }
          case 72: break;
          case 33: 
            { fixed = yycolumn + 5;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is double";
            }
          case 73: break;
          case 34: 
            { fixed = yycolumn + 5;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is string";
            }
          case 74: break;
          case 35: 
            { fixed = yycolumn + 6;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is extends";
            }
          case 75: break;
          case 36: 
            { fixed = yycolumn + 8;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is interface";
            }
          case 76: break;
          case 37: 
            { fixed = yycolumn + 3;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is else";
            }
          case 77: break;
          case 38: 
            { fixed = yycolumn + 9;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is implements";
            }
          case 78: break;
          case 39: 
            { fixed = yycolumn + 5;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is return";
            }
          case 79: break;
          case 40: 
            { fixed = yycolumn + 7;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is NewArray";
            }
          case 80: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
