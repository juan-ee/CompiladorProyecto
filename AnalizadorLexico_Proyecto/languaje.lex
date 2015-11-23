/* Proyecto Analizador lexico 
* Integrantes: Juan Erazo, Luis Unapanta */

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
FUNCION = {ID}"()"
ENTERO = -?[0-9]+
FLOTANTE = {ENTERO}"."[0-9]+
BOOL = true|false
CARACTER = '[^ \n\t]'
STRING = \"[^\n\t]+\"
COMENT_1 = "//".*
COMENT_M = "/*"[^"*/"]*"*/"

%%
{KEYWORD}		{	return new TokenClass("Palabra reservada", yytext()); }

{CARACT_ESP}		{	return new TokenClass("Caracter especial", yytext()); }
{OP_COMP}		{	return new TokenClass("Operador compuesto", yytext()); }
{BOOL} {	return new TokenClass("bool", yytext()); }
{ID}		{	return new TokenClass("Identificador", yytext()); }
{FUNCION}		{	return new TokenClass("Funcion", yytext()); }
{ENTERO}		{	return new TokenClass("int", yytext()); }
{FLOTANTE}		{	return new TokenClass("float", yytext()); }
{CARACTER}		{	return new TokenClass("char", yytext()); }
{STRING}		{	return new TokenClass("string", yytext()); }

[ \n\t\r]
| {COMENT_1}
| {COMENT_M} {}

[^ \n\t\r] {	return new TokenClass("ERROR: Token no identificado", yytext(),yyline,yycolumn); }
