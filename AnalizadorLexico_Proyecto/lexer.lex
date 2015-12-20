/*Analizador Lexico*/
/*Integrantes: Juan Erazo, Luis Unapanta*/

package comp;
import java_cup.runtime.*;

%%

%class AnalizadorLexico
%cup
%public
%unicode
%line
%column


KEYWORD = int|float|bool|char|string|if|else|then|while|do|input|output|return
CARACT_ESP = ","|";"|":"|"("|")"|"["|"]"|"{"|"}"|"+"|"-"|"*"|"/"|">"|"<"|"="|"!"|"&"|"$"
OP_COMP = ">="|"<="|"!="|"&&"|"||"|"=="


ID = [a-z][_a-zA-Z0-9]*
FUNCION = {ID}"()" 
ENTERO = -?[0-9]+
FLOTANTE = {ENTERO}"."[0-9]+
BOOL = true|false
CARACTER = '[^ \n\t]'
STRING = \".+\"
COMENT_1 = "//".*
COMENT_M = "/*"[^"*/"]*"*/"

%%

/*{KEYWORD}		{	return new TokenClass("Palabra reservada", yytext()); }
{CARACT_ESP}		{	return new TokenClass("Caracter especial", yytext()); }
{OP_COMP}		{	return new TokenClass("Operador compuesto", yytext()); }
{BOOL} {	return new TokenClass("bool", yytext()); }
{ID}		{	return new TokenClass("Identificador", yytext()); }
{FUNCION}		{	return new TokenClass("Funcion", yytext()); }
{ENTERO}		{	return new TokenClass("int", yytext()); }
{FLOTANTE}		{	return new TokenClass("float", yytext()); }
{CARACTER}		{	return new TokenClass("char", yytext()); }
{STRING}		{	return new TokenClass("string", yytext()); }*/

{STRING}		{	return new Symbol(sym.STRING,yyline); }

[ \n\t\r]
| {COMENT_1}
| {COMENT_M} {}

[^ \n\t\r] {	System.out.println("ERROR: Token no identificado --> "+yytext()+" en la linea: "+
									(yyline+1)+", columna: "+yycolumn); }