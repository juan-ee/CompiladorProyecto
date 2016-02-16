/* The following code was generated by JFlex 1.4.3 on 15/02/16 23:11 */

/*Analizador Lexico*/
/*Integrantes: Juan Erazo, Luis Unapanta*/

package comp;
import java_cup.runtime.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 15/02/16 23:11 from the specification file
 * <tt>D:/Documents/Github/AnalizadorLexico_Proyecto/AnalizadorLexico_Proyecto/generador_lexer.lex</tt>
 */
public class AnalizadorLexico implements java_cup.runtime.Scanner {

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
    "\11\0\1\22\1\24\2\0\1\60\22\0\1\22\1\1\1\23\1\0"+
    "\1\3\1\0\1\2\1\21\1\52\1\53\1\26\1\27\1\50\1\6"+
    "\1\10\1\25\12\7\1\51\1\47\1\30\1\31\1\30\2\0\22\5"+
    "\1\44\7\5\1\56\1\0\1\57\1\0\1\5\1\0\1\16\1\43"+
    "\1\42\1\41\1\14\1\15\1\45\1\37\1\33\2\4\1\17\1\4"+
    "\1\34\1\36\1\35\1\4\1\12\1\20\1\11\1\13\1\46\1\40"+
    "\3\4\1\54\1\32\1\55\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\3\2\1\3\1\4\1\5\4\3\1\1"+
    "\1\6\1\1\3\4\1\7\1\10\1\1\6\3\1\1"+
    "\1\3\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\7\1\22\1\23\1\0\6\3\2\0"+
    "\1\6\1\0\1\24\3\3\1\25\2\3\1\0\1\3"+
    "\1\26\6\3\1\27\1\30\1\0\1\31\5\3\1\0"+
    "\1\3\1\32\1\33\1\3\1\34\4\3\1\35\1\36"+
    "\1\0\1\37\1\3\1\40\1\41\1\3\1\42\1\0"+
    "\1\43\1\44\1\45";

  private static int [] zzUnpackAction() {
    int [] result = new int[100];
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
    "\0\0\0\61\0\142\0\223\0\61\0\304\0\365\0\u0126"+
    "\0\u0157\0\u0188\0\u01b9\0\u01ea\0\u021b\0\61\0\u024c\0\u027d"+
    "\0\61\0\u02ae\0\142\0\142\0\u02df\0\u0310\0\u0341\0\u0372"+
    "\0\u03a3\0\u03d4\0\u0405\0\u0436\0\u0467\0\61\0\61\0\61"+
    "\0\61\0\61\0\61\0\61\0\61\0\61\0\61\0\61"+
    "\0\61\0\u0498\0\u04c9\0\u04fa\0\u052b\0\u055c\0\u058d\0\u05be"+
    "\0\u05ef\0\u0620\0\u0651\0\u0682\0\304\0\u06b3\0\u06e4\0\u0715"+
    "\0\304\0\u0746\0\u0777\0\u07a8\0\u07d9\0\u0498\0\u080a\0\u083b"+
    "\0\u086c\0\u089d\0\u08ce\0\u08ff\0\61\0\u0620\0\u0930\0\304"+
    "\0\u0961\0\u0992\0\u09c3\0\u09f4\0\u0a25\0\u0a56\0\u0a87\0\304"+
    "\0\304\0\u0ab8\0\304\0\u0ae9\0\u0b1a\0\u0b4b\0\u0b7c\0\304"+
    "\0\304\0\u0bad\0\304\0\u0bde\0\304\0\304\0\u0c0f\0\304"+
    "\0\u0c40\0\304\0\304\0\61";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[100];
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
    "\1\2\1\3\1\4\1\5\1\6\1\2\1\7\1\10"+
    "\1\2\1\11\1\12\1\6\1\13\1\14\3\6\1\15"+
    "\1\16\1\17\1\16\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\2\6\1\27\1\6\1\30\1\31\1\32"+
    "\1\33\1\34\1\6\1\35\1\36\1\37\1\40\1\41"+
    "\1\42\1\43\1\44\1\45\1\46\1\16\112\0\1\47"+
    "\31\0\1\50\62\0\2\6\1\0\1\6\1\0\10\6"+
    "\12\0\14\6\20\0\1\51\1\10\60\0\1\10\1\52"+
    "\54\0\2\6\1\0\1\6\1\0\1\6\1\53\6\6"+
    "\12\0\4\6\1\54\7\6\16\0\2\6\1\0\1\6"+
    "\1\0\3\6\1\55\4\6\12\0\14\6\16\0\2\6"+
    "\1\0\1\6\1\0\6\6\1\56\1\6\12\0\14\6"+
    "\16\0\2\6\1\0\1\6\1\0\5\6\1\57\1\60"+
    "\1\6\12\0\14\6\12\0\22\61\1\0\1\61\1\0"+
    "\34\61\24\62\1\0\34\62\25\0\1\63\1\64\61\0"+
    "\1\51\63\0\1\50\32\0\2\6\1\0\1\6\1\0"+
    "\4\6\1\65\3\6\12\0\1\6\1\66\12\6\16\0"+
    "\2\6\1\0\1\6\1\0\2\6\1\67\5\6\12\0"+
    "\14\6\16\0\2\6\1\0\1\6\1\0\10\6\12\0"+
    "\4\6\1\70\7\6\16\0\2\6\1\0\1\6\1\0"+
    "\10\6\12\0\3\6\1\71\10\6\16\0\2\6\1\0"+
    "\1\6\1\0\10\6\12\0\4\6\1\72\7\6\16\0"+
    "\2\6\1\0\1\6\1\0\10\6\12\0\3\6\1\73"+
    "\10\6\23\0\1\74\53\0\2\6\1\0\1\6\1\0"+
    "\10\6\12\0\3\6\1\75\10\6\21\0\1\76\55\0"+
    "\2\6\1\0\1\6\1\0\2\6\1\77\5\6\12\0"+
    "\14\6\16\0\2\6\1\0\1\6\1\0\3\6\1\100"+
    "\4\6\12\0\14\6\16\0\2\6\1\0\1\6\1\0"+
    "\1\101\7\6\12\0\14\6\16\0\2\6\1\0\1\6"+
    "\1\0\7\6\1\102\12\0\14\6\16\0\2\6\1\0"+
    "\1\6\1\0\6\6\1\103\1\6\12\0\14\6\16\0"+
    "\2\6\1\0\1\6\1\0\10\6\12\0\3\6\1\104"+
    "\10\6\33\0\1\105\37\0\23\62\1\106\1\0\34\62"+
    "\24\63\1\0\34\63\25\64\1\0\1\107\32\64\4\0"+
    "\2\6\1\0\1\6\1\0\1\110\7\6\12\0\2\6"+
    "\1\111\11\6\16\0\2\6\1\0\1\6\1\0\1\112"+
    "\7\6\12\0\14\6\16\0\2\6\1\0\1\6\1\0"+
    "\10\6\12\0\1\113\13\6\16\0\2\6\1\0\1\6"+
    "\1\0\5\6\1\114\2\6\12\0\14\6\16\0\2\6"+
    "\1\0\1\6\1\0\10\6\12\0\3\6\1\115\10\6"+
    "\24\0\1\116\52\0\2\6\1\0\1\6\1\0\10\6"+
    "\12\0\1\117\13\6\16\0\2\6\1\0\1\6\1\0"+
    "\3\6\1\120\4\6\12\0\14\6\16\0\2\6\1\0"+
    "\1\6\1\0\10\6\12\0\1\6\1\121\12\6\16\0"+
    "\2\6\1\0\1\6\1\0\2\6\1\122\5\6\12\0"+
    "\14\6\16\0\2\6\1\0\1\6\1\0\3\6\1\123"+
    "\4\6\12\0\14\6\16\0\2\6\1\0\1\6\1\0"+
    "\7\6\1\77\12\0\14\6\16\0\2\6\1\0\1\6"+
    "\1\0\5\6\1\124\2\6\12\0\14\6\37\0\1\16"+
    "\37\0\2\6\1\0\1\6\1\0\2\6\1\125\5\6"+
    "\12\0\14\6\16\0\2\6\1\0\1\6\1\0\10\6"+
    "\12\0\2\6\1\126\11\6\16\0\2\6\1\0\1\6"+
    "\1\0\6\6\1\127\1\6\12\0\14\6\16\0\2\6"+
    "\1\0\1\6\1\0\1\6\1\130\6\6\12\0\14\6"+
    "\16\0\2\6\1\0\1\6\1\0\6\6\1\131\1\6"+
    "\12\0\14\6\45\0\1\132\31\0\2\6\1\0\1\6"+
    "\1\0\10\6\12\0\6\6\1\133\5\6\16\0\2\6"+
    "\1\0\1\6\1\0\1\6\1\134\6\6\12\0\14\6"+
    "\16\0\2\6\1\0\1\6\1\0\1\135\7\6\12\0"+
    "\14\6\16\0\2\6\1\0\1\6\1\0\1\136\7\6"+
    "\12\0\14\6\16\0\2\6\1\0\1\6\1\0\2\6"+
    "\1\137\5\6\12\0\14\6\16\0\2\6\1\0\1\6"+
    "\1\0\3\6\1\140\4\6\12\0\14\6\46\0\1\141"+
    "\30\0\2\6\1\0\1\6\1\0\10\6\12\0\1\6"+
    "\1\142\12\6\16\0\2\6\1\0\1\6\1\0\1\143"+
    "\7\6\12\0\14\6\57\0\1\144\13\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3185];
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
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\1\11\10\1\1\11\2\1\1\11"+
    "\14\1\14\11\1\0\6\1\2\0\1\1\1\0\7\1"+
    "\1\0\10\1\1\11\1\1\1\0\6\1\1\0\13\1"+
    "\1\0\6\1\1\0\2\1\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[100];
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

  /* user code: */
	int errores=0;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public AnalizadorLexico(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public AnalizadorLexico(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 130) {
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
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
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
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
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

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
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
          yycolumn++;
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


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
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
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 20: 
          { return new Symbol( GeneradorSym.IF,yyline+1,yycolumn+1);
          }
        case 38: break;
        case 19: 
          { return new Symbol( GeneradorSym.OP_UNARIO , yyline + 1 , yycolumn + 1  ) ;
          }
        case 39: break;
        case 26: 
          { return new Symbol( GeneradorSym.BOOLEANO, yyline + 1 , yycolumn + 1  );
          }
        case 40: break;
        case 29: 
          { return new Symbol( GeneradorSym.CHAR,yyline+1,yycolumn+1,GeneradorSym.CHAR) ;
          }
        case 41: break;
        case 35: 
          { return new Symbol( GeneradorSym.RETURN,yyline+1,yycolumn+1);
          }
        case 42: break;
        case 3: 
          { return new Symbol( GeneradorSym.ID,yyline+1,yycolumn+1,new String(yytext())) ;
          }
        case 43: break;
        case 31: 
          { return new Symbol( GeneradorSym.VOID,yyline+1,yycolumn+1,GeneradorSym.VOID) ;
          }
        case 44: break;
        case 23: 
          { return new Symbol( GeneradorSym.CARACTER, yyline + 1 , yycolumn + 1  );
          }
        case 45: break;
        case 28: 
          { return new Symbol( GeneradorSym.ELSE,yyline+1,yycolumn+1);
          }
        case 46: break;
        case 15: 
          { return new Symbol( GeneradorSym.LLAV_CER,yyline+1,yycolumn+1);
          }
        case 47: break;
        case 10: 
          { return new Symbol( GeneradorSym.COMA,yyline+1,yycolumn+1) ;
          }
        case 48: break;
        case 17: 
          { return new Symbol( GeneradorSym.COR_CER,yyline+1,yycolumn+1);
          }
        case 49: break;
        case 1: 
          { System.out.println("ERROR LEXICO: Token '"+yytext()+"' no identificado. Linea: "+
									(yyline+1)+", columna: "+(yycolumn)); errores++;
          }
        case 50: break;
        case 24: 
          { return new Symbol( GeneradorSym.CADENA, yyline + 1 , yycolumn + 1  );
          }
        case 51: break;
        case 2: 
          { return new Symbol( GeneradorSym.CARACT_ESP, yyline + 1 , yycolumn + 1  );
          }
        case 52: break;
        case 25: 
          { return new Symbol( GeneradorSym.INT,yyline+1,yycolumn+1,GeneradorSym.INT) ;
          }
        case 53: break;
        case 5: 
          { return new Symbol( GeneradorSym.ENTERO, yyline + 1 , yycolumn + 1 , Integer.parseInt(yytext()) );
          }
        case 54: break;
        case 32: 
          { return new Symbol( GeneradorSym.FLOAT,yyline+1,yycolumn+1,GeneradorSym.FLOAT) ;
          }
        case 55: break;
        case 16: 
          { return new Symbol( GeneradorSym.COR_AB,yyline+1,yycolumn+1);
          }
        case 56: break;
        case 11: 
          { return new Symbol( GeneradorSym.DOSPUN,yyline+1,yycolumn+1 ) ;
          }
        case 57: break;
        case 7: 
          { return new Symbol( GeneradorSym.OP_COMP , yyline + 1 , yycolumn + 1  ) ;
          }
        case 58: break;
        case 22: 
          { return new Symbol( GeneradorSym.FLOTANTE, yyline + 1 , yycolumn + 1  );
          }
        case 59: break;
        case 13: 
          { return new Symbol( GeneradorSym.PAR_CER,yyline+1,yycolumn+1);
          }
        case 60: break;
        case 30: 
          { return new Symbol( GeneradorSym.BOOL,yyline+1,yycolumn+1,GeneradorSym.BOOL) ;
          }
        case 61: break;
        case 14: 
          { return new Symbol( GeneradorSym.LLAV_AB,yyline+1,yycolumn+1);
          }
        case 62: break;
        case 12: 
          { return new Symbol( GeneradorSym.PAR_AB,yyline+1,yycolumn+1);
          }
        case 63: break;
        case 21: 
          { return new Symbol( GeneradorSym.DO,yyline+1,yycolumn+1);
          }
        case 64: break;
        case 34: 
          { return new Symbol( GeneradorSym.WHILE,yyline+1,yycolumn+1);
          }
        case 65: break;
        case 8: 
          { return new Symbol( GeneradorSym.IGUAL , yyline + 1 , yycolumn + 1  ) ;
          }
        case 66: break;
        case 36: 
          { return new Symbol( GeneradorSym.OUTPUT,yyline+1,yycolumn+1);
          }
        case 67: break;
        case 27: 
          { return new Symbol( GeneradorSym.THEN,yyline+1,yycolumn+1);
          }
        case 68: break;
        case 18: 
          { return new Symbol( GeneradorSym.OP_COMP_L , yyline + 1 , yycolumn + 1  ) ;
          }
        case 69: break;
        case 33: 
          { return new Symbol( GeneradorSym.INPUT,yyline+1,yycolumn+1);
          }
        case 70: break;
        case 37: 
          { return new Symbol( GeneradorSym.STRING,yyline+1,yycolumn+1,GeneradorSym.STRING) ;
          }
        case 71: break;
        case 4: 
          { return new Symbol( GeneradorSym.OP_BINARIO , yyline + 1 , yycolumn + 1  ) ;
          }
        case 72: break;
        case 6: 
          { 
          }
        case 73: break;
        case 9: 
          { return new Symbol( GeneradorSym.END,yyline+1,yycolumn+1) ;
          }
        case 74: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
