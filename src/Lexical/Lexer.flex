package Lexical;

import java.io;
%%
%public
%class Yylex
%unicode
%line
%column
%type String

LineTerminator = \r|\n|\r\n
nputCharacter = [^\r\n]
WhiteSpace     = {LineTerminator} | [ \t\f]
%%

[\t\r\f]+
{
    // accion vacia: se ignoran los espacios y tabuladores
}

“0x”|"0X"[0-9A-Fa-f]+
{
    return “numero_hexadecimal ” + yytext() + ” en linea: “ + yyline + ” columna “ + yycolumn ;
}

[0-9]+
{
    return "numero entero " + yytext() + " en linea: " + yyline+ " columna " + yycolumn;
}

"int"
{
    return "palabra clave " + yytext() + " en linea: " + yyline+ " columna " + yycolumn;
}

"double"
{
    return "palabra clave " + yytext() + " en linea: " + yyline+ " columna " + yycolumn;
}

"void"
{
    return "palabra clave " + yytext() + " en linea: " + yyline+ " columna " + yycolumn;
}

"string"
{
    return "palabra clave " + yytext() + " en linea: " + yyline+ " columna " + yycolumn;
}

"class"
{
    return "palabra clave " + yytext() + " en linea: " + yyline+ " columna " + yycolumn;
}

"interface"
{
    return "palabra clave " + yytext() + " en linea: " + yyline+ " columna " + yycolumn;
}

"null"
{
    return "palabra clave " + yytext() + " en linea: " + yyline+ " columna " + yycolumn;
}

"this"
{
    return "palabra clave " + yytext() + " en linea: " + yyline+ " columna " + yycolumn;
}

"extends"
{
    return "palabra clave " + yytext() + " en linea: " + yyline+ " columna " + yycolumn;
}

"implements"
{
    return "palabra clave " + yytext() + " en linea: " + yyline+ " columna " + yycolumn;
}

"for"
{
    return "palabra clave " + yytext() + " en linea: " + yyline+ " columna " + yycolumn;
}

"while"
{
    return "palabra clave " + yytext() + " en linea: " + yyline+ " columna " + yycolumn;
}

"if"
{
    return "palabra clave " + yytext() + " en linea: " + yyline+ " columna " + yycolumn;
}

"else"
{
    return "palabra clave " + yytext() + " en linea: " + yyline+ " columna " + yycolumn;
}

"return"
{
    return "palabra clave " + yytext() + " en linea: " + yyline+ " columna " + yycolumn;
}

"break"
{
    return "palabra clave " + yytext() + " en linea: " + yyline+ " columna " + yycolumn;
}

"New"
{
    return "palabra clave " + yytext() + " en linea: " + yyline+ " columna " + yycolumn;
}

"NewArray"
{
    return "palabra clave " + yytext() + " en linea: " + yyline+ " columna " + yycolumn;
}

[+-*\/%<>=!;.,\[\]()\{\}]
{
    return "operador " + yytext() + " en linea: " + yyline+ " columna " + yycolumn;
}

"\<="
{
    return "operador " + yytext() + " en linea: " + yyline+ " columna " + yycolumn;
}

"\>="
{
    return "operador " + yytext() + " en linea: " + yyline+ " columna " + yycolumn;
}

"!="
{
    return "operador " + yytext() + " en linea: " + yyline+ " columna " + yycolumn;
}

"&&"
{
    return "operador " + yytext() + " en linea: " + yyline+ " columna " + yycolumn;
}

\\||
{
    return "palabra " + yytext() + " en linea: " + yyline+ " columna " + yycolumn;
}

"\\[]"
{
    return "Simbolo " + yytext() + " en linea: " + yyline+ " columna " + yycolumn;
}

"\\{}"
{
    return "Simbolo " + yytext() + " en linea: " + yyline+ " columna " + yycolumn;
}

"\\()"
{
    return "Simbolo " + yytext() + " en linea: " + yyline+ " columna " + yycolumn;
}

"true"
{
    return "constante booleana " + yytext() + " en linea: " + yyline+ " columna " + yycolumn;
}

"false"
{
    return "constante booleana " + yytext() + " en linea: " + yyline+ " columna " + yycolumn;
}

[0-9][0-9]*"\."[0-9][0-9]*
{
    return "Punto Flotante " + yytext() + " en linea: " + yyline+ " columna " + yycolumn;
}

[A-Za-z][A-Za-z0-9_]*[1, 31]
{
    return "identificador " + yytext() + " en linea: " + yyline+ " columna " + yycolumn;
}

[A-Za-z][A-Za-z0-9_]*[32, 1000]
{
    return "*** Error linea " + yyline + " identificador muy largo ";
}

[0-9_][A-Za-z0-9_]*
{
    return "*** Error linea " + ttline + " identificador inválido ";
}

.
{
    return "Token no reconocido: " + yytext() + " en linea: " + yyline+ " columna " + yycolumn;
}

















































































