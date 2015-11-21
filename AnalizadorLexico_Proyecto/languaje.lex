
package comp;

%%

%class Analizador
%type TokenClass
%public
%unicode
%line
%column

KEYWORD = "int"|"float"|"bool"|"char"|"string"|"if"|"else"|"then"|"while"|"do"|"input"|"output"|"return"
CARACT_ESP = ","|";"|":"|"("|")"|"["|"]"|"{"|"}"|"+"|"-"|"*"|"/"|">"|"<"|"="|"!"|"&"|"$"
OP_COMP = ">="|"<="|"!="|"&&"|"||"|"=="

ID = [a-z][_a-zA-Z0-9]*

ENTERO = (-)?[0-9]+
FLOTANTE = [0-9]+"."[0-9]+
BOOL = true|false
CARACTER = "'"[^ \n\t]"'"
STRING = \"[^ \n\t]+\"

%%
{KEYWORD}		{	return new TokenClass("Palabra reservada", yytext()); }
{CARACT_ESP}		{	return new TokenClass("Caracter especial", yytext()); }
{OP_COMP}		{	return new TokenClass("Operador compuesto", yytext()); }
{BOOL} {	return new TokenClass("bool", yytext()); }
{ID}		{	return new TokenClass("Identificador", yytext()); }
{ENTERO}		{	return new TokenClass("int", yytext()); }
{FLOTANTE}		{	return new TokenClass("float", yytext()); }
{CARACTER}		{	return new TokenClass("char", yytext()); }
{STRING}		{	return new TokenClass("string", yytext()); }
[ \n\t] {}
[^ \n\t] {	return new TokenClass("ERROR: Token no identificado", yytext(),yyline,yycolumn); }