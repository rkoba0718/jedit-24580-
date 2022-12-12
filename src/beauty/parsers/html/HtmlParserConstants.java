/* Generated By:JavaCC: Do not edit this line. HtmlParserConstants.java */
package beauty.parsers.html;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface HtmlParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int ALPHA_CHAR = 1;
  /** RegularExpression Id. */
  int NUM_CHAR = 2;
  /** RegularExpression Id. */
  int ALPHANUM_CHAR = 3;
  /** RegularExpression Id. */
  int IDENTIFIER_CHAR = 4;
  /** RegularExpression Id. */
  int IDENTIFIER = 5;
  /** RegularExpression Id. */
  int QUOTED_STRING_NB = 6;
  /** RegularExpression Id. */
  int QUOTED_STRING = 7;
  /** RegularExpression Id. */
  int WHITESPACE = 8;
  /** RegularExpression Id. */
  int NEWLINE = 9;
  /** RegularExpression Id. */
  int QUOTE = 10;
  /** RegularExpression Id. */
  int EL_ESCAPE = 11;
  /** RegularExpression Id. */
  int TEXT_IN_EL = 12;
  /** RegularExpression Id. */
  int NO_JSP_TAG_END = 13;
  /** RegularExpression Id. */
  int NO_TAG_END = 14;
  /** RegularExpression Id. */
  int EOL = 15;
  /** RegularExpression Id. */
  int TAG_START = 16;
  /** RegularExpression Id. */
  int SCRIPTLET_TAG = 17;
  /** RegularExpression Id. */
  int ENDTAG_START = 18;
  /** RegularExpression Id. */
  int COMMENT_START = 19;
  /** RegularExpression Id. */
  int DECL_START = 20;
  /** RegularExpression Id. */
  int PCDATA = 21;
  /** RegularExpression Id. */
  int BLANK_LINES = 22;
  /** RegularExpression Id. */
  int TAG_SCRIPT = 23;
  /** RegularExpression Id. */
  int TAG_STYLE = 24;
  /** RegularExpression Id. */
  int TAG_NAME = 25;
  /** RegularExpression Id. */
  int LST_ERROR = 26;
  /** RegularExpression Id. */
  int ATTR_NAME = 28;
  /** RegularExpression Id. */
  int TAG_END = 29;
  /** RegularExpression Id. */
  int TAG_PERCENTEND = 30;
  /** RegularExpression Id. */
  int TAG_SLASHEND = 31;
  /** RegularExpression Id. */
  int ATTR_EQ = 32;
  /** RegularExpression Id. */
  int IMPLICIT_TAG_END = 33;
  /** RegularExpression Id. */
  int LIT_ERROR = 34;
  /** RegularExpression Id. */
  int SINGLE_QUOTE = 35;
  /** RegularExpression Id. */
  int DOUBLE_QUOTE = 36;
  /** RegularExpression Id. */
  int ENDING_SINGLE_QUOTE = 38;
  /** RegularExpression Id. */
  int UNPARSED_TEXT_NO_SINGLE_QUOTES = 39;
  /** RegularExpression Id. */
  int DOLLAR_OR_HASH_SINGLE_QUOTE = 40;
  /** RegularExpression Id. */
  int ENDING_DOUBLE_QUOTE = 41;
  /** RegularExpression Id. */
  int UNPARSED_TEXT_NO_DOUBLE_QUOTES = 42;
  /** RegularExpression Id. */
  int DOLLAR_OR_HASH_DOUBLE_QUOTE = 43;
  /** RegularExpression Id. */
  int EL_EXPRESSION_IN_ATTRIBUTE = 44;
  /** RegularExpression Id. */
  int VALUE_BINDING_IN_ATTRIBUTE = 45;
  /** RegularExpression Id. */
  int JSP_EXPRESSION_IN_ATTRIBUTE = 46;
  /** RegularExpression Id. */
  int JSP_TAG_IN_ATTRIBUTE = 47;
  /** RegularExpression Id. */
  int ATTR_VAL = 48;
  /** RegularExpression Id. */
  int COMMENT_END = 49;
  /** RegularExpression Id. */
  int DASH = 50;
  /** RegularExpression Id. */
  int COMMENT_EOL = 51;
  /** RegularExpression Id. */
  int COMMENT_WORD = 52;
  /** RegularExpression Id. */
  int SCRIPTLET_END = 53;
  /** RegularExpression Id. */
  int DECL_ANY = 54;
  /** RegularExpression Id. */
  int DECL_END = 55;
  /** RegularExpression Id. */
  int SCRIPT_END = 56;
  /** RegularExpression Id. */
  int STYLE_END = 57;
  /** RegularExpression Id. */
  int BLOCK_EOL = 58;
  /** RegularExpression Id. */
  int BLOCK_LBR = 59;
  /** RegularExpression Id. */
  int BLOCK_WORD = 60;

  /** Lexical state. */
  int LexStyle = 0;
  /** Lexical state. */
  int LexScript = 1;
  /** Lexical state. */
  int LexDecl = 2;
  /** Lexical state. */
  int LexScriptlet = 3;
  /** Lexical state. */
  int LexComment = 4;
  /** Lexical state. */
  int LexInAttrVal = 5;
  /** Lexical state. */
  int AttrValueBetweenDoubleQuotesState = 6;
  /** Lexical state. */
  int AttrValueBetweenSingleQuotesState = 7;
  /** Lexical state. */
  int LexAttrVal = 8;
  /** Lexical state. */
  int LexInTag = 9;
  /** Lexical state. */
  int LexStartTag = 10;
  /** Lexical state. */
  int DEFAULT = 11;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "<ALPHA_CHAR>",
    "<NUM_CHAR>",
    "<ALPHANUM_CHAR>",
    "<IDENTIFIER_CHAR>",
    "<IDENTIFIER>",
    "<QUOTED_STRING_NB>",
    "<QUOTED_STRING>",
    "<WHITESPACE>",
    "<NEWLINE>",
    "<QUOTE>",
    "<EL_ESCAPE>",
    "<TEXT_IN_EL>",
    "<NO_JSP_TAG_END>",
    "<NO_TAG_END>",
    "<EOL>",
    "<TAG_START>",
    "\"<%\"",
    "\"</\"",
    "<COMMENT_START>",
    "\"<!\"",
    "<PCDATA>",
    "<BLANK_LINES>",
    "<TAG_SCRIPT>",
    "<TAG_STYLE>",
    "<TAG_NAME>",
    "<LST_ERROR>",
    "<token of kind 27>",
    "<ATTR_NAME>",
    "\">\"",
    "\"%>\"",
    "\"/>\"",
    "\"=\"",
    "\"<\"",
    "<LIT_ERROR>",
    "\"\\\'\"",
    "\"\\\"\"",
    "<token of kind 37>",
    "\"\\\'\"",
    "<UNPARSED_TEXT_NO_SINGLE_QUOTES>",
    "<DOLLAR_OR_HASH_SINGLE_QUOTE>",
    "\"\\\"\"",
    "<UNPARSED_TEXT_NO_DOUBLE_QUOTES>",
    "<DOLLAR_OR_HASH_DOUBLE_QUOTE>",
    "<EL_EXPRESSION_IN_ATTRIBUTE>",
    "<VALUE_BINDING_IN_ATTRIBUTE>",
    "<JSP_EXPRESSION_IN_ATTRIBUTE>",
    "<JSP_TAG_IN_ATTRIBUTE>",
    "<ATTR_VAL>",
    "<COMMENT_END>",
    "\"-\"",
    "<COMMENT_EOL>",
    "<COMMENT_WORD>",
    "<SCRIPTLET_END>",
    "<DECL_ANY>",
    "\">\"",
    "<SCRIPT_END>",
    "<STYLE_END>",
    "<BLOCK_EOL>",
    "\"<\"",
    "<BLOCK_WORD>",
  };

}