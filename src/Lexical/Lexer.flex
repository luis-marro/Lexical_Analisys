package Lexical;

import java.io.*;
%%
%public
%class Yylex
%unicode
%line
%column
%type String

symbol = [%<>=!;.,\[\]()\{\}]
Ignored = [\t\r\f\n]
LineTerminator = \r|\n|\r\n
WhiteSpace     = {LineTerminator} | [ \t\f]
quote = [\"]
%{
    String token = "";
    int fixed = 0;
    String whites = "";

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

<YYINITIAL>\/\*{WhiteSpace}?(.*\n.*)*{WhiteSpace}?\*\/
{
    // ignore multiline comments
}


“0x”|"0X"[0-9A-Fa-f]+
{
    token = yytext();
    fixed = token.length() - 1;
    whites = blankSpaces(token.length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is hexadecimal";
}

[0-9][0-9]*
{
    token = yytext();
    fixed = token.length() - 1;
    whites = blankSpaces(token.length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed +  " is intConstant  " + "(value = " + token + ")";
}

"int" | "int"{WhiteSpace}
{
    fixed = yycolumn + 2;
    whites = blankSpaces(yytext().length() - 1);
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is int";
}

"double"{WhiteSpace} | "double"
{
    fixed = yycolumn + 5;
    whites = blankSpaces(yytext().length() - 1);
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is double";
}

"void"{WhiteSpace} | "void"
{
    fixed = yycolumn + 3;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is void";
}

"string"{WhiteSpace} | "string"
{
    fixed = yycolumn + 5;
    whites = blankSpaces(yytext().length() - 1);
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is string";
}

"class"{WhiteSpace} | "class"
{
    fixed = yycolumn + 4;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is class";
}

"interface"{WhiteSpace} | "interface"
{
    fixed = yycolumn + 8;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is interface";
}

"null"{WhiteSpace} | "null"
{
    fixed = yycolumn + 3;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is null";
}

"this"{WhiteSpace} | "this"
{
    fixed = yycolumn + 3;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is this";
}

"extends"{WhiteSpace} | "extends"
{
    fixed = yycolumn + 6;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is extends";
}

"implements"{WhiteSpace} | "implements"
{
    fixed = yycolumn + 9;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is implements";
}

"for"{WhiteSpace} | "for"
{
    fixed = yycolumn + 2;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is for";
}

"while"{WhiteSpace} | "while"
{
    fixed = yycolumn + 4;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is while";
}

"if"{WhiteSpace} | "if"
{
    fixed = yycolumn + 1;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is if";
}

"else"{WhiteSpace} "else"
{
    fixed = yycolumn + 3;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is else";
}

"return"{WhiteSpace} "return"
{
    fixed = yycolumn + 5;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is return";
}

"break"{WhiteSpace} | "break"
{
    fixed = yycolumn + 4;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is break";
}

"New"{WhiteSpace} | "New"
{
    fixed = yycolumn + 2;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is New";
}

"NewArray"{WhiteSpace} "NewArray"
{
    fixed = yycolumn + 7;
    whites = blankSpaces(yytext().length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is NewArray";
}

<YYINITIAL>"\[\]"
{
    fixed = yycolumn + 1;
    whites = blankSpaces(2);
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is " + "'[]'";
}

<YYINITIAL>"\{\}"
{
    fixed = yycolumn + 1;
    whites = blankSpaces(2);
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is " + "'{}'";
}

<YYINITIAL>"\(\)"
{
    fixed = yycolumn + 1;
    whites = blankSpaces(2);
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is " + "'()'";
}

{symbol}
{
    token = yytext();
    whites = blankSpaces(1);
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + " is " + "'" + token + "'";
}

"\<="
{
    token = yytext();
    fixed = yycolumn + 1;
    whites = blankSpaces(2);
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed +  " is " + "'" + token + "'";
}

"\>="
{
    token = yytext();
    fixed = yycolumn + 1;
    whites = blankSpaces(2);
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is " + "'" + token + "'";
}

"!="
{
    token = yytext();
    fixed = yycolumn + 1;
    whites = blankSpaces(2);
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is " + "'" + token + "'";
}

"\/"
{
    token = yytext();
    whites = blankSpaces(1);
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + " is " + "'" + token + "'";
}

"&&"
{
    token = yytext();
    fixed = yycolumn + 1;
    whites = blankSpaces(2);
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is " + "'" + token + "'";
}

\|\|
{
    fixed = yycolumn + 1;
    whites = blankSpaces(2);
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is " + "'||'";
}

"\+"
{
    whites = blankSpaces(1);
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + " is " + "'+'";
}

"\-"
 {
     whites = blankSpaces(1);
     return yytext() + whites + "line " + yyline + " cols " + yycolumn + " is " + "'-'";
 }

 "\*"
 {
     whites = blankSpaces(1);
     return yytext() + whites + "line " + yyline + " cols " + yycolumn + " is " + "'*'";
 }

"true"
{
    fixed = yycolumn + 3;
    whites = blankSpaces(4);
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is boolConstant (value = true)";
}

"false"
{
     fixed = yycolumn + 4;
     whites = blankSpaces(5);
     return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is boolConstant (value = false)";
}

[0-9][0-9]*"\."[0-9][0-9]* | [0-9][0-9]*"\."[0-9][0-9]*(E|e)(\+|\-)[0-9][0-9]* | [0-9][0-9]*"\."[0-9][0-9]*(E|e)[0-9][0-9]*
{
    token = yytext();
    fixed = yycolumn + token.length() - 1;
    whites = blankSpaces(token.length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is float (value = " + token + ")";
}


[A-Za-z][A-Za-z0-9_]*[1, 31] | [A-Za-z][A-Za-z0-9_]*{WhiteSpace}[1, 31]
{
    token = longIdentifier(yytext());
    fixed = yycolumn + token.length() - 2;
    whites = blankSpaces(token.length());
    return token + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is identifier";
}


[0-9_.][A-Za-z0-9_.]*
{
    return "*** Error en linea " + yyline + " identificador inválido: " + yytext();
}

// string rules
{quote}.*{quote}
{
    token = yytext();
    fixed = yycolumn + token.length() - 2;
    whites = blankSpaces(token.length());
    return yytext() + whites + "line " + yyline + " cols " + yycolumn + "-" + fixed + " is string variable";
}

.
{
    return "*** Error en linea " + yyline + " caracter no reconocido " + yytext();
}

















































































