import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java_cup.runtime.Symbol;
%%
%public
%cup
%class Yylex
%unicode
%line
%column
%type String
%cup
%function next_token
%type java_cup.runtime.Symbol

Ignored = [\t\r\f\n]
LineTerminator = \r|\n|\r\n
WhiteSpace     = {LineTerminator} | [ \t\f]
quote = [\"]
%{
    String token = "";
    int fixed = 0;
    String whites = "";
    public List<String> errors = new LinkedList<String>();

    public List<String> getError(){
          return errors;
    }

    private String longIdentifier(String text){
        if(text.length() > 31){
            return text.substring(0, 31);
        }else{
            return text;
        }
    }

    private String blankSpaces(int length){
        // allow 32 to be the max white space between token and the next word
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < 32 - length; i++){
            builder.append(" ");
        }
        return builder.toString();
    }

    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn, yytext());
    }

    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }

%}

MultilineComment = ("/*"~"*/")

%%

{Ignored} | {WhiteSpace}
{
    // accion vacia: se ignoran los espacios y tabuladores
}

// ignore the comments
<YYINITIAL>"//".*
{
    // ignore single line comments
}

//<YYINITIAL>\/\*{WhiteSpace}?(.*\n.*)*{WhiteSpace}?\*\/
{MultilineComment}
{
    // ignore multiline comments
    //return "Comentario multi linea";
}

// not closed multiline comment
("/*")([^"*/"])*
{
    //errors.add(yytext() + "comment not closed");
    //return yytext() + "comment not closed";
}

[0-9][0-9]*
{/*
    token = yytext();
    fixed = (token.length() == 1) ? fixed = yycolumn : token.length() - 1;
    whites = blankSpaces(token.length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed +  " is intConstant  " + "(value = " + token + ")"; */
    return symbol(sym.INTCONST, new Integer(Integer.parseInt(yytext()))) ;
}

"int" | "int"{WhiteSpace}
{
    /*fixed = yycolumn + 2;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is int";*/
    return symbol(sym.INT);
}

"double"{WhiteSpace} | "double"
{
    /*fixed = yycolumn + 5;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is double";*/
    return symbol(sym.DOUBLE);
}

"void"{WhiteSpace} | "void"
{
    /*fixed = yycolumn + 3;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is void";*/
    return symbol(sym.VOID);
}

"bool"{WhiteSpace} | "bool"
{
    /*fixed = yycolumn + 3;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is bool";*/
    return symbol(sym.BOOL);
}

"string"{WhiteSpace} | "string"
{
    /*fixed = yycolumn + 5;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is string";*/
    return symbol(sym.STRING);
}

"class"{WhiteSpace} | "class"
{
    /*fixed = yycolumn + 4;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is class";*/
    return symbol(sym.CLASS);
}

"interface"{WhiteSpace} | "interface"
{
    /*fixed = yycolumn + 8;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is interface";*/
    return symbol(sym.INTERFACE);
}

"null"{WhiteSpace} | "null"
{
    /*fixed = yycolumn + 3;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is null";*/
    return symbol(sym.NULL);
}

"this"{WhiteSpace} | "this"
{
    /*fixed = yycolumn + 3;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is this";*/
    return symbol(sym.THIS);
}

"extends"{WhiteSpace} | "extends"
{
    /*fixed = yycolumn + 6;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is extends";*/
    return symbol(sym.EXTENDS);
}

"implements"{WhiteSpace} | "implements"
{
    /*fixed = yycolumn + 9;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is implements";*/
    return symbol(sym.IMPLEMENTS);
}

"for"{WhiteSpace} | "for"
{
    /*fixed = yycolumn + 2;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is for";*/
    return symbol(sym.FOR);
}

"while"{WhiteSpace} | "while"
{
    /*fixed = yycolumn + 4;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is while";*/
    return symbol(sym.WHILE);
}

"if"{WhiteSpace} | "if"
{
    /*fixed = yycolumn + 1;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is if";*/
    return symbol(sym.IF);
}

"else"{WhiteSpace} "else"
{
    /*fixed = yycolumn + 3;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is else";*/
    return symbol(sym.ELSE);
}

"return"{WhiteSpace} "return"
{
    /*fixed = yycolumn + 5;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is return";*/
    return symbol(sym.RETURN);
}

"break"{WhiteSpace} | "break"
{
    /*fixed = yycolumn + 4;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is break";*/
    return symbol(sym.BREAK);
}

"New"{WhiteSpace} | "New"
{
    /*fixed = yycolumn + 2;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is New";*/
    return symbol(sym.NEW);
}

"NewArray"{WhiteSpace} | "NewArray"
{
    /*fixed = yycolumn + 7;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is NewArray";*/
    return symbol(sym.NEWARRAY);
}

"GetByte"{WhiteSpace} | "GetByte"
{
    /*fixed = yycolumn + 2;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is GetByte";*/
    return symbol(sym.GETBYTE);
}

"SetByte"{WhiteSpace} | "SetByte"
{
    /*fixed = yycolumn + 2;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is SetByte";*/
    return symbol(sym.SETBYTE);
}

"Print"{WhiteSpace} | "Print"
{
    /*fixed = yycolumn + 4;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is Print";*/
    return symbol(sym.PRINT);
}

"ReadInteger"{WhiteSpace} | "ReadInteger"
{
    /*fixed = yycolumn + 10;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is ReadInteger";*/
    return symbol(sym.READINTEGER);
}

"ReadLine"{WhiteSpace} | "ReadLine"
{
    /*fixed = yycolumn + 7;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is ReadLine";*/
    return symbol(sym.READLINE);
}

"Malloc"{WhiteSpace} | "Malloc"
{
    /*fixed = yycolumn + 5;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is Malloc";*/
    return symbol(sym.MALLOC);
}


"const"{WhiteSpace} | "const"
{
    /*fixed = yycolumn + 5;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is Malloc";*/
    return symbol(sym.CONST);
}

<YYINITIAL>"\[\]"
{
    /*fixed = yycolumn + 1;
    whites = blankSpaces(2);
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is " + "'[]'";*/
    return symbol(sym.TWOBRACK);
}

<YYINITIAL>"\{\}"
{
    /*fixed = yycolumn + 1;
    whites = blankSpaces(2);
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is " + "'{}'";*/
    return symbol(sym.TWOCURLY);
}

<YYINITIAL>"\(\)"
{
    /*fixed = yycolumn + 1;
    whites = blankSpaces(2);
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is " + "'()'";*/
    return symbol(sym.TWOPAR);
}

"%"
{
    /*token = yytext();
    whites = blankSpaces(1);
    return yytext() + whites + "line " + yyline + " col " + yycolumn + " is " + "'" + token + "'";*/
    return symbol(sym.PERCENT);
}

"<"
{
    /*token = yytext();
    whites = blankSpaces(1);
    return yytext() + whites + "line " + yyline + " col " + yycolumn + " is " + "'" + token + "'";*/
    return symbol(sym.LESST);
}

">"
{
    /*token = yytext();
    whites = blankSpaces(1);
    return yytext() + whites + "line " + yyline + " col " + yycolumn + " is " + "'" + token + "'";*/
    return symbol(sym.GREATT);
}

"=="
{
    /*token = yytext();
    fixed = yycolumn + 1;
    whites = blankSpaces(2);
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is " + "'" + token + "'";*/
    return symbol(sym.COMPEQUALS);
}

"="
{
    /*token = yytext();
    whites = blankSpaces(1);
    return yytext() + whites + "line " + yyline + " col " + yycolumn + " is " + "'" + token + "'";*/
    return symbol(sym.EQUALS);
}

"!"
{
    /*token = yytext();
    whites = blankSpaces(1);
    return yytext() + whites + "line " + yyline + " col " + yycolumn + " is " + "'" + token + "'";*/
    return symbol(sym.EXCLA);
}

";"
{
    /*token = yytext();
    whites = blankSpaces(1);
    return yytext() + whites + "line " + yyline + " col " + yycolumn + " is " + "'" + token + "'";*/
    return symbol(sym.PAC);
}

"["
{
     /*token = yytext();
     whites = blankSpaces(1);
     return yytext() + whites + "line " + yyline + " col " + yycolumn + " is " + "'" + token + "'";*/
     return symbol(sym.LEFTBRACKET);
}

"]"
{
    /*token = yytext();
    whites = blankSpaces(1);
    return yytext() + whites + "line " + yyline + " col " + yycolumn + " is " + "'" + token + "'";*/
    return symbol(sym.RIGHTBRACKET);
}

"("
{
    /*token = yytext();
    whites = blankSpaces(1);
    return yytext() + whites + "line " + yyline + " col " + yycolumn + " is " + "'" + token + "'";*/
    return symbol(sym.LEFTPAR);
}

")"
{
    /*token = yytext();
    whites = blankSpaces(1);
    return yytext() + whites + "line " + yyline + " col " + yycolumn + " is " + "'" + token + "'";*/
    return symbol(sym.RIGHTPAR);
}

"{"
{
    /*token = yytext();
    whites = blankSpaces(1);
    return yytext() + whites + "line " + yyline + " col " + yycolumn + " is " + "'" + token + "'";*/
    return symbol(sym.LEFTCURLY);
}

"}"
{
    /*token = yytext();
    whites = blankSpaces(1);
    return yytext() + whites + "line " + yyline + " col " + yycolumn + " is " + "'" + token + "'";*/
    return symbol(sym.RIGHTCURLY);
}

"\<="
{
    /*token = yytext();
    fixed = yycolumn + 1;
    whites = blankSpaces(2);
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed +  " is " + "'" + token + "'";*/
    return symbol(sym.LESSEQ);
}

"\>="
{
    /*token = yytext();
    fixed = yycolumn + 1;
    whites = blankSpaces(2);
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is " + "'" + token + "'";*/
    return symbol(sym.GTREQ);
}

"!="
{
    /*token = yytext();
    fixed = yycolumn + 1;
    whites = blankSpaces(2);
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is " + "'" + token + "'";*/
    return symbol(sym.DIFFERENT);
}

"\/"
{
    /*token = yytext();
    whites = blankSpaces(1);
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + " is " + "'" + token + "'";*/
    return symbol(sym.DIV);
}

"&&"
{
    /*token = yytext();
    fixed = yycolumn + 1;
    whites = blankSpaces(2);
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is " + "'" + token + "'";*/
    return symbol(sym.AND);
}

\|\|
{
    /*fixed = yycolumn + 1;
    whites = blankSpaces(2);
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is " + "'||'";*/
    return symbol(sym.OR);
}

"\+"
{
    /*whites = blankSpaces(1);
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + " is " + "'+'";*/
    return symbol(sym.ADD);
}

"\-"
 {
     /*whites = blankSpaces(1);
     return yytext() + whites + "line " + yyline + " cols " + yycolumn + " is " + "'-'";*/
     return symbol(sym.MINUS);
 }

 "\*"
 {
     /*whites = blankSpaces(1);
     return yytext() + whites + "line " + yyline + " cols " + yycolumn + " is " + "'*'";*/
     return symbol(sym.MULT);
 }

 // Hexadecimal 0x12aE
 <YYINITIAL>0[xX][0-9a-fA-F]*
 {
     /*token = yytext();
     fixed = token.length() - 1;
     whites = blankSpaces(token.length());
     return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is hexadecimal " + "(value = " + token + ")";*/
     return symbol(sym.DOUBLECONST, new Integer(Integer.parseInt("0x45E213".replace("0x",""), 16)));
 }

"true"
{
    /*fixed = yycolumn + 3;
    whites = blankSpaces(4);
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is boolConstant (value = true)";*/
    return symbol(sym.TRUE);
}

"false"
{
     /*fixed = yycolumn + 4;
     whites = blankSpaces(5);
     return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is boolConstant (value = false)";*/
     return symbol(sym.FALSE);
}


<YYINITIAL>[0-9][0-9]*"\."[0-9][0-9]*(E|e)(\+|\-)[0-9][0-9]* | [0-9][0-9]*"\."[0-9][0-9]*(E|e)[0-9][0-9]*
{
    // Give priority to doubles with exponential values
    /*token = yytext();
    fixed = yycolumn + token.length() - 1;
    whites = blankSpaces(token.length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is double (value = " + token + ")";*/
    return symbol(sym.DOUBLECONST, new Double(Double.parseDouble(yytext())));
}

//[0-9][0-9]*"\."[0-9]* | [0-9][0-9]*"\."[0-9][0-9]*(E|e)(\+|\-)[0-9][0-9]* | [0-9][0-9]*"\."[0-9][0-9]*(E|e)[0-9][0-9]*
[0-9][0-9]*"\."[0-9]*
{
    /*token = yytext();
    fixed = yycolumn + token.length() - 1;
    whites = blankSpaces(token.length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is double (value = " + token + ")";*/
    return symbol(sym.DOUBLECONST, new Double(Double.parseDouble(yytext())));
}

<YYINITIAL>"\."
{
    /*token = yytext();
    whites = blankSpaces(1);
    return yytext() + whites + "line " + yyline + " col " + yycolumn + " is " + ".";*/
    return symbol(sym.DOT);
}

[A-Za-z][_A-Za-z0-9]* | [A-Za-z][_A-Za-z0-9]*{WhiteSpace}
{
    token = longIdentifier(yytext());
    fixed = (token.length() == 1) ? (yycolumn) : yycolumn + token.length() - 2;
    whites = blankSpaces(token.length());
    if(yytext().length() <= 31)
        return symbol(sym.IDENTIFIER, fixed);
        //return token + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is identifier";
    else
        return symbol(sym.IDENTIFIER, fixed);
        //return token + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is identifier (truncated)";
}

[0-9_][A-Za-z0-9_]*
{
    /*errors.add("*** Error en linea " + yyline + " identificador inválido: " + yytext());
    return "*** Error en linea " + yyline + " identificador inválido: " + yytext();*/
    return symbol(sym.ERROR);
}

<YYINITIAL>{WhiteSpace}*"\,"{WhiteSpace}*
{
    /*token = yytext();
    whites = blankSpaces(token.length());
    return yytext() + whites + "line " + yyline + " col " + yycolumn + " is " + ",";*/
    return symbol(sym.COMMA);
}

// string rules
(\"([^\n\\\"]|\\.)*\")
{
    /*token = yytext();
    fixed = yycolumn + token.length() - 2;
    whites = blankSpaces(token.length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is string constant (Value = " + yytext() + " )" ;*/
    return symbol(sym.STRINGCONST);
}



.
{
    errors.add("*** Error en linea " + yyline + " caracter no reconocido " + yytext());
    //return "*** Error en linea " + yyline + " caracter no reconocido " + yytext();
    return symbol(sym.ERROR);
}
