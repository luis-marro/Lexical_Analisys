package Lexical;

import java.io.*;
%%
%public
%class Yylex
%unicode
%line
%column
%type String

%{
    string token = "";
    int fixed = 0;
}%

symbol = [\/%<>=!;.,\[\]()\{\}]
Ignored = [\t\r\f\n]
LineTerminator = \r|\n|\r\n
WhiteSpace     = {LineTerminator} | [ \t\f]
%%

{Ignored} | {WhiteSpace}
{
    // accion vacia: se ignoran los espacios y tabuladores
}

// Ignore comments
\\//
{
    // Empty action, ignore single line comments
}

// Multiline Comments
/\*.\*/
{
    // for testing
    return "Comentario multilinea brother";
}


“0x”|"0X"[0-9A-Fa-f]+
{
    token = yytext();
    fixed = token.lenght() - 1;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is hexadecimal";
}

[0-9][0-9]*
{
    token = yytext();
    fixed = token.lenght() - 1;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed +  " is intConstant  " + "(value = " + token + ")";
}

"int" | "int"{WhiteSpace}
{
    fixed = yycolumn + 2;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is int";
}

"double"{WhiteSpace} | "double"
{
    fixed = yycolumn + 5;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is double";
}

"void"{WhiteSpace} | "void"
{
    fixed = yycolumn + 3;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is void";
}

"string"{WhiteSpace} | "string"
{
    fixed = yycolumn + 5;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is string";
}

"class"{WhiteSpace} | "class"
{
    fixed = yycolumn + 4;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is class";
}

"interface"{WhiteSpace} | "interface"
{
    fixed = yycolumn + 8;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is interface";
}

"null"{WhiteSpace} | "null"
{
    fixed = yycolumn + 3;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is null";
}

"this"{WhiteSpace} | "this"
{
    fixed = yycolumn + 3;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is this";
}

"extends"{WhiteSpace} | "extends"
{
    fixed = yycolumn + 6;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is extends";
}

"implements"{WhiteSpace} | "implements"
{
    fixed = yycolumn + 9;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is implements";
}

"for"{WhiteSpace} | "for"
{
    fixed = yycolumn + 2;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is for";
}

"while"{WhiteSpace} | "while"
{
    fixed = yycolumn + 4;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is while";
}

"if"{WhiteSpace} "if"
{
    fixed = yycolumn + 1;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is if";
}

"else"{WhiteSpace} "else"
{
    fixed = yycolumn + 3;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is else";
}

"return"{WhiteSpace} "return"
{
    fixed = yycolumn + 5;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is return";
}

"break"{WhiteSpace} | "break"
{
    fixed = yycolumn + 4;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is break";
}

"New"{WhiteSpace} | "New"
{
    fixed = yycolumn + 2;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is New";
}

"NewArray"{WhiteSpace} "NewArray"
{
    fixed = yycolumn + 7;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is NewArray";
}

{symbol}
{
    token = yytext();
    return yytext() + " line " + yyline + " cols " + yycolumn + " is " + "'" + token + "'";
}

"\<="
{
    token = yytext();
    fixed = yycolumn + 1;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed +  " is " + "'" + token + "'";
}

"\>="
{
    token = yytext();
    fixed = yycolumn + 1;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is " + "'" + token + "'";
}

"!="
{
    token = yytext();
    fixed = yycolumn + 1;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is " + "'" + token + "'";
}

"&&"
{
    token = yytext();
    fixed = yycolumn + 1;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is " + "'" + token + "'";
}

\|\|
{
    fixed = yycolumn + 1;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is " + "'||'";
}

"\\[]"
{
    fixed = yycolumn + 1;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is " + "'[]'";
}

"\\{}"
{
    fixed = yycolumn + 1;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is " + "'{}'";
}

"\\()"
{
    fixed = yycolumn + 1;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is " + "'()'";
}

"\+"
{
    return yytext() + " line " + yyline + " cols " + yycolumn + " is " + "'+'";
}

"\-"
{
    return yytext() + " line " + yyline + " cols " + yycolumn + " is " + "'-'";
}

"true"
{
    fixed = yycolumn + 3;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is boolConstant (value = true)";
}

"false"
{
     fixed = yycolumn + 4;
     return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + " is boolConstant (value = false)";
}

[0-9][0-9]*"\."[0-9][0-9]* | [0-9][0-9]*"\."[0-9][0-9]*(E|e)(\+|\-)[0-9][0-9]* | [0-9][0-9]*"\."[0-9][0-9]*(E|e)[0-9][0-9]*
{
    token = yytext();
    fixed = yycolumn + token.lenght() - 1;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + "is float (value = " + token + ")";
}

[A-Za-z][A-Za-z0-9_]*[1, 31] | [A-Za-z][A-Za-z0-9_]*[1, 31]{WhiteSpace}
{
    token = yytext();
    fixed = yycolumn + token.lenght() - 1;
    return yytext() + " line " + yyline + " cols " + yycolumn + "-" + fixed + "is identifier"
}

[A-Za-z][A-Za-z0-9_]*[32, 1000]
{
    return "*** Error linea " + yyline + " identificador muy largo ";
}

[0-9_.][A-Za-z0-9_.]*
{
    return "*** Error linea " + yyline + " identificador inválido ";
}

.
{
    return "Token no reconocido: " + yytext() + " en linea: " + yyline+ " columna " + yycolumn;
}

















































































