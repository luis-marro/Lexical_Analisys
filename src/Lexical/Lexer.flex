package Lexical;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
%%
%public
%class Yylex
%unicode
%line
%column
%type String
%cup

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
    return new Symbol(sym.INTCONST, new Integer(Integer.parseint(yytext()))) ;
}

"int" | "int"{WhiteSpace}
{
    /*fixed = yycolumn + 2;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is int";*/
    return new Symbol(sym.INT);
}

"double"{WhiteSpace} | "double"
{
    /*fixed = yycolumn + 5;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is double";*/
    return new Symbol(sym.DOUBLE);
}

"void"{WhiteSpace} | "void"
{
    /*fixed = yycolumn + 3;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is void";*/
    return new Symbol(sym.VOID);
}

"bool"{WhiteSpace} | "bool"
{
    /*fixed = yycolumn + 3;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is bool";*/
    return new Symbol(sym.BOOL);
}

"string"{WhiteSpace} | "string"
{
    /*fixed = yycolumn + 5;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is string";*/
    return new Symbol(sym.STRING);
}

"class"{WhiteSpace} | "class"
{
    /*fixed = yycolumn + 4;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is class";*/
    return new Symbol(sym.CLASS);
}

"interface"{WhiteSpace} | "interface"
{
    /*fixed = yycolumn + 8;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is interface";*/
    return new Symbol(sym.INTERFACE);
}

"null"{WhiteSpace} | "null"
{
    /*fixed = yycolumn + 3;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is null";*/
    return new Symbol(sym.NULL);
}

"this"{WhiteSpace} | "this"
{
    /*fixed = yycolumn + 3;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is this";*/
    return new Symbol(sym.THIS);
}

"extends"{WhiteSpace} | "extends"
{
    /*fixed = yycolumn + 6;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is extends";*/
    return new Symbol(sym.EXTENDS);
}

"implements"{WhiteSpace} | "implements"
{
    /*fixed = yycolumn + 9;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is implements";*/
    return new Symbol(sym.IMPLEMENTS);
}

"for"{WhiteSpace} | "for"
{
    /*fixed = yycolumn + 2;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is for";*/
    return new Symbol(sym.FOR);
}

"while"{WhiteSpace} | "while"
{
    /*fixed = yycolumn + 4;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is while";*/
    return new Symbol(sym.WHILE);
}

"if"{WhiteSpace} | "if"
{
    /*fixed = yycolumn + 1;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is if";*/
    return new Symbol(sym.IF);
}

"else"{WhiteSpace} "else"
{
    /*fixed = yycolumn + 3;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is else";*/
    return new Symbol(sym.ELSE);
}

"return"{WhiteSpace} "return"
{
    /*fixed = yycolumn + 5;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is return";*/
    return new Symbol(sym.RETURN);
}

"break"{WhiteSpace} | "break"
{
    /*fixed = yycolumn + 4;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is break";*/
    return new Symbol(sym.BREAK);
}

"New"{WhiteSpace} | "New"
{
    /*fixed = yycolumn + 2;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is New";*/
    return new Symbol(sym.NEW);
}

"NewArray"{WhiteSpace} | "NewArray"
{
    /*fixed = yycolumn + 7;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is NewArray";*/
    return new Symbol(sym.NEWARRAY);
}

"GetByte"{WhiteSpace} | "GetByte"
{
    /*fixed = yycolumn + 2;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is GetByte";*/
    return new Symbol(sym.GETBYTE);
}

"SetByte"{WhiteSpace} | "SetByte"
{
    /*fixed = yycolumn + 2;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is SetByte";*/
    return new Symbol(sym.SETBYTE);
}

"Print"{WhiteSpace} | "Print"
{
    /*fixed = yycolumn + 4;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is Print";*/
    return new Symbol(sym.PRINT);
}

"ReadInteger"{WhiteSpace} | "ReadInteger"
{
    /*fixed = yycolumn + 10;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is ReadInteger";*/
    return new Symbol(sym.READINTEGER);
}

"ReadLine"{WhiteSpace} | "ReadLine"
{
    /*fixed = yycolumn + 7;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is ReadLine";*/
    return new Symbol(sym.READLINE);
}

"Malloc"{WhiteSpace} | "Malloc"
{
    /*fixed = yycolumn + 5;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is Malloc";*/
    return new Symbol(sym.MALLOC);
}

<YYINITIAL>"\[\]"
{
    /*fixed = yycolumn + 1;
    whites = blankSpaces(2);
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is " + "'[]'";*/
    return new Symbol(sym.TWOBRACK);
}

<YYINITIAL>"\{\}"
{
    /*fixed = yycolumn + 1;
    whites = blankSpaces(2);
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is " + "'{}'";*/
    return new Symbol(sym.TWOCURLY);
}

<YYINITIAL>"\(\)"
{
    /*fixed = yycolumn + 1;
    whites = blankSpaces(2);
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is " + "'()'";*/
    return new Symbol(sym.TWOPAR);
}

"%"
{
    /*token = yytext();
    whites = blankSpaces(1);
    return yytext() + whites + "line " + yyline + " col " + yycolumn + " is " + "'" + token + "'";*/
    return new Symbol(sym.PERCENT);
}

"<"
{
    /*token = yytext();
    whites = blankSpaces(1);
    return yytext() + whites + "line " + yyline + " col " + yycolumn + " is " + "'" + token + "'";*/
    return new Symbol(sym.LESST);
}

">"
{
    /*token = yytext();
    whites = blankSpaces(1);
    return yytext() + whites + "line " + yyline + " col " + yycolumn + " is " + "'" + token + "'";*/
    return new Symbol(sym.GREATT);
}

"=="
{
    /*token = yytext();
    fixed = yycolumn + 1;
    whites = blankSpaces(2);
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is " + "'" + token + "'";*/
    return new Symbol(sym.COMPEQUALS);
}

"="
{
    /*token = yytext();
    whites = blankSpaces(1);
    return yytext() + whites + "line " + yyline + " col " + yycolumn + " is " + "'" + token + "'";*/
    return new Symbol(sym.EQUALS);
}

"!"
{
    /*token = yytext();
    whites = blankSpaces(1);
    return yytext() + whites + "line " + yyline + " col " + yycolumn + " is " + "'" + token + "'";*/
    return new Symbol(sym.EXCLA);
}

";"
{
    /*token = yytext();
    whites = blankSpaces(1);
    return yytext() + whites + "line " + yyline + " col " + yycolumn + " is " + "'" + token + "'";*/
    return new Symbol(sym.PAC);
}

"["
{
     /*token = yytext();
     whites = blankSpaces(1);
     return yytext() + whites + "line " + yyline + " col " + yycolumn + " is " + "'" + token + "'";*/
     return new Symbol(sym.LEFTBRACKET);
}

"]"
{
    /*token = yytext();
    whites = blankSpaces(1);
    return yytext() + whites + "line " + yyline + " col " + yycolumn + " is " + "'" + token + "'";*/
    return new Symbol(sym.RIGHTBRACKET);
}

"("
{
    /*token = yytext();
    whites = blankSpaces(1);
    return yytext() + whites + "line " + yyline + " col " + yycolumn + " is " + "'" + token + "'";*/
    return new Symbol(sym.LEFTPAR);
}

")"
{
    /*token = yytext();
    whites = blankSpaces(1);
    return yytext() + whites + "line " + yyline + " col " + yycolumn + " is " + "'" + token + "'";*/
    return new Symbol(sym.RIGHTPAR);
}

"{"
{
    /*token = yytext();
    whites = blankSpaces(1);
    return yytext() + whites + "line " + yyline + " col " + yycolumn + " is " + "'" + token + "'";*/
    return new Symbol(sym.LEFTCURLY);
}

"}"
{
    /*token = yytext();
    whites = blankSpaces(1);
    return yytext() + whites + "line " + yyline + " col " + yycolumn + " is " + "'" + token + "'";*/
    return new Symbol(sym.RIGHTCURLY);
}

"\<="
{
    /*token = yytext();
    fixed = yycolumn + 1;
    whites = blankSpaces(2);
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed +  " is " + "'" + token + "'";*/
    return new Symbol(sym.LESSEQ);
}

"\>="
{
    /*token = yytext();
    fixed = yycolumn + 1;
    whites = blankSpaces(2);
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is " + "'" + token + "'";*/
    return new Symbol(sym.GTREQ);
}

"!="
{
    /*token = yytext();
    fixed = yycolumn + 1;
    whites = blankSpaces(2);
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is " + "'" + token + "'";*/
    return new Symbol(sym.DIFFERENT);
}

"\/"
{
    /*token = yytext();
    whites = blankSpaces(1);
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + " is " + "'" + token + "'";*/
    return new Symbol(sym.DIV);
}

"&&"
{
    /*token = yytext();
    fixed = yycolumn + 1;
    whites = blankSpaces(2);
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is " + "'" + token + "'";*/
    return new Symbol(sym.AND);
}

\|\|
{
    /*fixed = yycolumn + 1;
    whites = blankSpaces(2);
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is " + "'||'";*/
    return new Symbol(sym.OR);
}

"\+"
{
    /*whites = blankSpaces(1);
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + " is " + "'+'";*/
    return new Symbol(sym.ADD);
}

"\-"
 {
     /*whites = blankSpaces(1);
     return yytext() + whites + "line " + yyline + " cols " + yycolumn + " is " + "'-'";*/
     return new Symbol(sym.MINUS);
 }

 "\*"
 {
     /*whites = blankSpaces(1);
     return yytext() + whites + "line " + yyline + " cols " + yycolumn + " is " + "'*'";*/
     return new Symbol(sym.MULT);
 }

 // Hexadecimal 0x12aE
 <YYINITIAL>0[xX][0-9a-fA-F]*
 {
     /*token = yytext();
     fixed = token.length() - 1;
     whites = blankSpaces(token.length());
     return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is hexadecimal " + "(value = " + token + ")";*/
     return new Symbol(sym.HEX, new Integer(Integer.parseInt("0x45E213".replace("0x",""), 16)));
 }

"true"
{
    /*fixed = yycolumn + 3;
    whites = blankSpaces(4);
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is boolConstant (value = true)";*/
    return new Symbol(sym.TRUE);
}

"false"
{
     /*fixed = yycolumn + 4;
     whites = blankSpaces(5);
     return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is boolConstant (value = false)";*/
     return new Symbol(sym.FALSE);
}

<YYINITIAL>[0-9][0-9]*"\."[0-9][0-9]*(E|e)(\+|\-)[0-9][0-9]* | [0-9][0-9]*"\."[0-9][0-9]*(E|e)[0-9][0-9]*
{
    // Give priority to doubles with exponential values
    /*token = yytext();
    fixed = yycolumn + token.length() - 1;
    whites = blankSpaces(token.length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is double (value = " + token + ")";*/
    return new Symbol(sym.DOUBLECONST, new Double(Double.parseDouble(yytext())));
}

//[0-9][0-9]*"\."[0-9]* | [0-9][0-9]*"\."[0-9][0-9]*(E|e)(\+|\-)[0-9][0-9]* | [0-9][0-9]*"\."[0-9][0-9]*(E|e)[0-9][0-9]*
[0-9][0-9]*"\."[0-9]*
{
    /*token = yytext();
    fixed = yycolumn + token.length() - 1;
    whites = blankSpaces(token.length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is double (value = " + token + ")";*/
    return new Symbol(sym.DOUBLECONST, new Double(Double.parseDouble(yytext())));
}

<YYINITIAL>"\."
{
    /*token = yytext();
    whites = blankSpaces(1);
    return yytext() + whites + "line " + yyline + " col " + yycolumn + " is " + ".";*/
    return new Symbol(sym.DOT);
}

[A-Za-z][_A-Za-z0-9]* | [A-Za-z][_A-Za-z0-9]*{WhiteSpace}
{
    token = longIdentifier(yytext());
    fixed = (token.length() == 1) ? (yycolumn) : yycolumn + token.length() - 2;
    whites = blankSpaces(token.length());
    if(yytext().length() <= 31)
        return new Symbol(sym.IDENTIFIER, fixed);
        //return token + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is identifier";
    else
        return new Symbol(sym.IDENTIFIER, fixed);
        //return token + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is identifier (truncated)";
}

[0-9_][A-Za-z0-9_]*
{
    /*errors.add("*** Error en linea " + yyline + " identificador inválido: " + yytext());
    return "*** Error en linea " + yyline + " identificador inválido: " + yytext();*/
    return new Symbol(sym.ERROR);
}

<YYINITIAL>{WhiteSpace}*"\,"{WhiteSpace}*
{
    /*token = yytext();
    whites = blankSpaces(token.length());
    return yytext() + whites + "line " + yyline + " col " + yycolumn + " is " + ",";*/
    return new Symbol(sym.COMMA);
}

// string rules
{quote}.*[^\"]{quote}
{
    /*token = yytext();
    fixed = yycolumn + token.length() - 2;
    whites = blankSpaces(token.length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is string constant (Value = " + yytext() + " )" ;*/
    return new Symbol(sym.STRINGCONST);
}



.
{
    /*errors.add("*** Error en linea " + yyline + " caracter no reconocido " + yytext());
    return "*** Error en linea " + yyline + " caracter no reconocido " + yytext();*/
    return new Symbol(sym.ERROR);
}

















































































