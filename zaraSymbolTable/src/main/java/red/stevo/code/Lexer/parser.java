
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package red.stevo.code.Lexer;

import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\056\000\002\002\004\000\002\002\004\000\002\002" +
    "\002\000\002\002\004\000\002\002\004\000\002\003\003" +
    "\000\002\003\011\000\002\003\011\000\002\003\003\000" +
    "\002\003\003\000\002\020\007\000\002\021\004\000\002" +
    "\021\002\000\002\022\003\000\002\022\003\000\002\024" +
    "\005\000\002\010\005\000\002\010\003\000\002\011\004" +
    "\000\002\011\003\000\002\011\003\000\002\011\003\000" +
    "\002\012\005\000\002\012\004\000\002\023\012\000\002" +
    "\025\005\000\002\025\003\000\002\025\002\000\002\026" +
    "\004\000\002\004\006\000\002\027\005\000\002\027\003" +
    "\000\002\027\002\000\002\004\005\000\002\004\005\000" +
    "\002\004\003\000\002\005\005\000\002\005\005\000\002" +
    "\005\003\000\002\006\003\000\002\006\003\000\002\006" +
    "\003\000\002\006\005\000\002\014\003\000\002\014\005" +
    "\000\002\017\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\125\000\016\002\uffff\003\004\036\uffff\050\uffff\051" +
    "\uffff\060\uffff\001\002\000\006\031\126\037\127\001\002" +
    "\000\014\002\010\036\015\050\006\051\013\060\016\001" +
    "\002\000\004\040\120\001\002\000\016\002\ufff9\031\ufff9" +
    "\036\ufff9\050\ufff9\051\ufff9\060\ufff9\001\002\000\004\002" +
    "\001\001\002\000\016\002\ufffc\031\ufffc\036\ufffc\050\ufffc" +
    "\051\ufffc\060\ufffc\001\002\000\016\002\ufff8\031\ufff8\036" +
    "\ufff8\050\ufff8\051\ufff8\060\ufff8\001\002\000\004\040\112" +
    "\001\002\000\016\002\000\031\000\036\000\050\000\051" +
    "\000\060\000\001\002\000\004\004\026\001\002\000\004" +
    "\004\017\001\002\000\004\030\020\001\002\000\006\031" +
    "\ufff5\036\ufff5\001\002\000\006\031\022\036\015\001\002" +
    "\000\016\002\ufff7\031\ufff7\036\ufff7\050\ufff7\051\ufff7\060" +
    "\ufff7\001\002\000\006\031\ufff4\036\ufff4\001\002\000\006" +
    "\031\ufff6\036\ufff6\001\002\000\006\031\ufff3\036\ufff3\001" +
    "\002\000\010\016\032\037\030\040\031\001\002\000\016" +
    "\002\ufff2\031\ufff2\036\ufff2\050\ufff2\051\ufff2\060\ufff2\001" +
    "\002\000\016\002\ufff0\031\ufff0\036\ufff0\050\ufff0\051\ufff0" +
    "\060\ufff0\001\002\000\010\032\uffe6\036\101\041\uffe6\001" +
    "\002\000\014\004\043\005\033\006\045\007\036\040\037" +
    "\001\002\000\020\012\uffda\013\uffda\014\uffda\015\uffda\032" +
    "\uffda\037\uffda\041\uffda\001\002\000\010\012\060\013\057" +
    "\037\uffed\001\002\000\006\025\076\037\uffec\001\002\000" +
    "\004\037\uffee\001\002\000\012\004\056\005\033\006\045" +
    "\040\037\001\002\000\020\012\uffde\013\uffde\014\063\015" +
    "\064\032\uffde\037\uffde\041\uffde\001\002\000\004\037\073" +
    "\001\002\000\020\012\uffdb\013\uffdb\014\uffdb\015\uffdb\032" +
    "\uffdb\037\uffdb\041\uffdb\001\002\000\020\012\uffd9\013\uffd9" +
    "\014\uffd9\015\uffd9\016\050\037\uffd9\040\047\001\002\000" +
    "\010\025\uffd6\037\uffd6\041\uffd6\001\002\000\020\012\uffd8" +
    "\013\uffd8\014\uffd8\015\uffd8\032\uffd8\037\uffd8\041\uffd8\001" +
    "\002\000\004\037\uffef\001\002\000\016\004\056\005\033" +
    "\006\045\032\uffe1\040\037\041\uffe1\001\002\000\004\004" +
    "\052\001\002\000\004\037\uffea\001\002\000\004\016\050" +
    "\001\002\000\004\037\uffeb\001\002\000\006\032\071\041" +
    "\070\001\002\000\012\012\060\013\057\032\uffe2\041\uffe2" +
    "\001\002\000\020\012\uffd9\013\uffd9\014\uffd9\015\uffd9\032" +
    "\uffd9\040\047\041\uffd9\001\002\000\012\004\062\005\033" +
    "\006\045\040\037\001\002\000\012\004\062\005\033\006" +
    "\045\040\037\001\002\000\020\012\uffe0\013\uffe0\014\063" +
    "\015\064\032\uffe0\037\uffe0\041\uffe0\001\002\000\020\012" +
    "\uffd9\013\uffd9\014\uffd9\015\uffd9\032\uffd9\037\uffd9\041\uffd9" +
    "\001\002\000\012\004\062\005\033\006\045\040\037\001" +
    "\002\000\012\004\062\005\033\006\045\040\037\001\002" +
    "\000\020\012\uffdc\013\uffdc\014\uffdc\015\uffdc\032\uffdc\037" +
    "\uffdc\041\uffdc\001\002\000\020\012\uffdd\013\uffdd\014\uffdd" +
    "\015\uffdd\032\uffdd\037\uffdd\041\uffdd\001\002\000\020\012" +
    "\uffdf\013\uffdf\014\063\015\064\032\uffdf\037\uffdf\041\uffdf" +
    "\001\002\000\014\012\uffe4\013\uffe4\032\uffe4\037\uffe4\041" +
    "\uffe4\001\002\000\012\004\056\005\033\006\045\040\037" +
    "\001\002\000\012\012\060\013\057\032\uffe3\041\uffe3\001" +
    "\002\000\016\002\ufff1\031\ufff1\036\ufff1\050\ufff1\051\ufff1" +
    "\060\ufff1\001\002\000\010\012\060\013\057\041\075\001" +
    "\002\000\020\012\uffd7\013\uffd7\014\uffd7\015\uffd7\032\uffd7" +
    "\037\uffd7\041\uffd7\001\002\000\002\001\002\000\010\025" +
    "\uffd5\037\uffd5\041\uffd5\001\002\000\006\032\105\041\104" +
    "\001\002\000\004\004\103\001\002\000\006\032\uffe7\041" +
    "\uffe7\001\002\000\006\032\uffe5\041\uffe5\001\002\000\004" +
    "\030\107\001\002\000\004\036\101\001\002\000\006\032" +
    "\uffe8\041\uffe8\001\002\000\016\003\004\031\uffff\036\uffff" +
    "\050\uffff\051\uffff\060\uffff\001\002\000\014\031\111\036" +
    "\015\050\006\051\013\060\016\001\002\000\016\002\uffe9" +
    "\031\uffe9\036\uffe9\050\uffe9\051\uffe9\060\uffe9\001\002\000" +
    "\002\001\002\000\006\025\076\041\114\001\002\000\004" +
    "\030\115\001\002\000\016\003\004\031\uffff\036\uffff\050" +
    "\uffff\051\uffff\060\uffff\001\002\000\014\031\117\036\015" +
    "\050\006\051\013\060\016\001\002\000\016\002\ufffb\031" +
    "\ufffb\036\ufffb\050\ufffb\051\ufffb\060\ufffb\001\002\000\002" +
    "\001\002\000\006\025\076\041\122\001\002\000\004\030" +
    "\123\001\002\000\016\003\004\031\uffff\036\uffff\050\uffff" +
    "\051\uffff\060\uffff\001\002\000\014\031\125\036\015\050" +
    "\006\051\013\060\016\001\002\000\016\002\ufffa\031\ufffa" +
    "\036\ufffa\050\ufffa\051\ufffa\060\ufffa\001\002\000\016\002" +
    "\ufffd\031\ufffd\036\ufffd\050\ufffd\051\ufffd\060\ufffd\001\002" +
    "\000\016\002\ufffe\031\ufffe\036\ufffe\050\ufffe\051\ufffe\060" +
    "\ufffe\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\125\000\004\002\004\001\001\000\002\001\001\000" +
    "\012\003\013\020\011\023\006\024\010\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\021\020\001\001\000\010\022\023\023\024\024\022" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\010\026\001\001\000\002" +
    "\001\001\000\002\001\001\000\006\025\077\026\101\001" +
    "\001\000\016\004\033\005\037\006\041\011\040\014\034" +
    "\015\043\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\010\004\073\005\037" +
    "\006\041\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\012\045\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\012\004\054\005" +
    "\037\006\041\027\053\001\001\000\004\013\050\001\001" +
    "\000\002\001\001\000\004\012\052\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\006\005\066\006\041\001\001\000\006\005\060\006" +
    "\041\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\006\065\001\001\000\004\006\064\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\010\004\071\005\037\006\041\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\015\076\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\026\105\001\001\000\002\001" +
    "\001\000\004\002\107\001\001\000\012\003\013\020\011" +
    "\023\006\024\010\001\001\000\002\001\001\000\006\014" +
    "\112\015\043\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\002\115\001\001\000\012\003\013\020\011\023" +
    "\006\024\010\001\001\000\002\001\001\000\006\014\120" +
    "\015\043\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\002\123\001\001\000\012\003\013\020\011\023\006" +
    "\024\010\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



  private ZaraLexer scanner;

  public parser(ZaraLexer s) {
    this.scanner = s;
  }

  public java_cup.runtime.Symbol scan() throws java.lang.Exception {
     return scanner.yylex();
  }



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= StmtList EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // StmtList ::= StmtList Stmt 
            {
              Object RESULT =null;
		System.out.println("Parsed StmtList: StmtList Stmt");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("StmtList",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // StmtList ::= 
            {
              Object RESULT =null;
		 System.out.println("Parsed empty StmtList"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("StmtList",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // StmtList ::= error SEMI_COLON 
            {
              Object RESULT =null;
		 System.err.println("Error"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("StmtList",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // StmtList ::= error PUNCTUATION_CURLED_RIGHT 
            {
              Object RESULT =null;
		 System.err.println("Error"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("StmtList",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // Stmt ::= VarDecl 
            {
              Object RESULT =null;
		 System.out.println("Parsed Stmt ::= VarDecl"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Stmt",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // Stmt ::= IF PUNCTUATION_LEFT condition PUNCTUATION_RIGHT PUNCTUATION_CURLED_LEFT StmtList PUNCTUATION_CURLED_RIGHT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Stmt",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // Stmt ::= WHILE PUNCTUATION_LEFT condition PUNCTUATION_RIGHT PUNCTUATION_CURLED_LEFT StmtList PUNCTUATION_CURLED_RIGHT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Stmt",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // Stmt ::= FuncDecl 
            {
              Object RESULT =null;
		 System.out.println("Parsed Stmt ::= FuncDecl"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Stmt",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // Stmt ::= ClassDecl 
            {
              Object RESULT =null;
		 System.out.println("Parsed Stmt ::= ClassDecl"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Stmt",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // ClassDecl ::= CLASS IDENTIFIER PUNCTUATION_CURLED_LEFT ClassBody PUNCTUATION_CURLED_RIGHT 
            {
              Object RESULT =null;
		

  
              CUP$parser$result = parser.getSymbolFactory().newSymbol("ClassDecl",14, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // ClassBody ::= ClassBody ClassMember 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ClassBody",15, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // ClassBody ::= 
            {
              Object RESULT =null;
		 System.out.println("Parsed empty ClassBody"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("ClassBody",15, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // ClassMember ::= VarDecl 
            {
              Object RESULT =null;
		 System.out.println("Parsed ClassMember ::= Variable Declaration"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("ClassMember",16, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // ClassMember ::= FuncDecl 
            {
              Object RESULT =null;
		 System.out.println("Parsed ClassMember ::= FuncDecl"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("ClassMember",16, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // VarDecl ::= DATATYPE IDENTIFIER initialize 
            {
              Object RESULT =null;
		
    System.out.println("Parsed VarDecl ::= DATATYPE IDENTIFIER initialize");
  
              CUP$parser$result = parser.getSymbolFactory().newSymbol("VarDecl",18, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // initialize ::= ASSIGN valueAssign SEMI_COLON 
            {
              Object RESULT =null;
		 System.out.println("Parsed initialize ::= ASSIGN valueAssign SEMI_COLON"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("initialize",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // initialize ::= SEMI_COLON 
            {
              Object RESULT =null;
		 System.out.println("Parsed initialize ::= SEMI_COLON"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("initialize",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // valueAssign ::= IDENTIFIER multipleAssign 
            {
              Object RESULT =null;
		System.out.println("Parsed valueAssign ::= multipleAssign");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("valueAssign",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // valueAssign ::= STRING_LITERAL 
            {
              Object RESULT =null;
		System.out.println("Parsed valueAssign ::= STRING_LITERAL");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("valueAssign",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // valueAssign ::= Expr 
            {
              Object RESULT =null;
		System.out.println("Parsed valueAssign ::= Expr");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("valueAssign",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // valueAssign ::= condition 
            {
              Object RESULT =null;
		System.out.println("Parsed valueAssign ::= condition");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("valueAssign",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // multipleAssign ::= ASSIGN IDENTIFIER multipleAssign 
            {
              Object RESULT =null;
		System.out.println("Parsed multipleAssign ::= ASSIGN IDENTIFIER multipleAssign");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("multipleAssign",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // multipleAssign ::= ASSIGN multiAssignValue 
            {
              Object RESULT =null;
		System.out.println("Parsed multipleAssign ::= ASSIGN IDENTIFIER ");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("multipleAssign",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // FuncDecl ::= DATATYPE IDENTIFIER PUNCTUATION_LEFT ParamList PUNCTUATION_RIGHT PUNCTUATION_CURLED_LEFT StmtList PUNCTUATION_CURLED_RIGHT 
            {
              Object RESULT =null;
		

  
              CUP$parser$result = parser.getSymbolFactory().newSymbol("FuncDecl",17, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // ParamList ::= ParamList PUNCTUATION_COMMA Param 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ParamList",19, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // ParamList ::= Param 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ParamList",19, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // ParamList ::= 
            {
              Object RESULT =null;
		 System.out.println("Parsed empty ParamList"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("ParamList",19, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // Param ::= DATATYPE IDENTIFIER 
            {
              Object RESULT =null;
		 System.out.println("Parsed Param ::= DATATYPE IDENTIFIER"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Param",20, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // Expr ::= IDENTIFIER PUNCTUATION_LEFT ArgList PUNCTUATION_RIGHT 
            {
              Object RESULT =null;
		 System.out.println("Parsed Function Call"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expr",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // ArgList ::= ArgList PUNCTUATION_COMMA Expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ArgList",21, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // ArgList ::= Expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ArgList",21, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // ArgList ::= 
            {
              Object RESULT =null;
		 System.out.println("Parsed empty ArgList"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("ArgList",21, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // Expr ::= Expr OPERATOR_ADD Term 
            {
              Object RESULT =null;
		System.out.println("Parsed Expr: Expr OPERATOR_ADD Term");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expr",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // Expr ::= Expr OPERATOR_SUB Term 
            {
              Object RESULT =null;
		System.out.println("Parsed Expr: Expr OPERATOR_SUB Term");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expr",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // Expr ::= Term 
            {
              Object RESULT =null;
		System.out.println("Parsed Expr: Term");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expr",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // Term ::= Term OPERATOR_MUL Factor 
            {
              Object RESULT =null;
		System.out.println("Parsed Term: Term OPERATOR_MUL Factor");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Term",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // Term ::= Term OPERATOR_DIV Factor 
            {
              Object RESULT =null;
		System.out.println("Parsed Term: Term OPERATOR_DIV Factor");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Term",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // Term ::= Factor 
            {
              Object RESULT =null;
		System.out.println("Parsed Term: Factor");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Term",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // Factor ::= CONSTANT 
            {
              Object RESULT =null;
		System.out.println("Parsed Factor: CONSTANT");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Factor",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // Factor ::= IDENTIFIER 
            {
              Object RESULT =null;
		System.out.println("Parsed Factor: IDENTIFIER");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Factor",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // Factor ::= FLOAT 
            {
              Object RESULT =null;
		System.out.println("Parsed Factor: FLOAT");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Factor",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // Factor ::= PUNCTUATION_LEFT Expr PUNCTUATION_RIGHT 
            {
              Object RESULT =null;
		System.out.println("Parsed Factor: ( Expr )");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Factor",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // condition ::= boolTerm 
            {
              Object RESULT =null;
		System.out.println("Parsed condition ::= boolTerm");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("condition",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // condition ::= condition OPERATOR_OR boolTerm 
            {
              Object RESULT =null;
		System.out.println("Parsed condition ::= condition OPERATOR_OR boolTerm");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("condition",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 45: // relationOp ::= OPERATOR_NOT_EQUAL 
            {
              Object RESULT =null;
		System.out.println("Parsed relationOp ::= OPERATOR_NO"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("relationOp",13, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
