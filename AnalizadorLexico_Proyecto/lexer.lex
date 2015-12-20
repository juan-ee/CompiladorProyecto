/*Anafflizador Lexico*/
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


KEYWORD = if|else|then|while|do|input|output|return
TIPO = int|float|char|String|bool

CARACT_ESP = ">"|"<"|"!"|"&"|"$"


ID = [a-z][_a-zA-Z0-9]*
ENTERO = -?[0-9]+
FLOTANTE = {ENTERO}"."[0-9]+
BOOL = true|false
CARACTER = '[^ \n\t]'
STRING = \".+\"
COMENT_1 = "//".*
COMENT_M = "/*"[^"*/"]*"*/"
OP_UNARIO = "++"|"--"
OP_BINARIO = "+"|"-"|"*"|"/"
OP_COMP = ">="|"<="|"!="|"&&"|"||"|"=="
IGUAL = "="
%%

/*Sin usar todavia*/
{CARACT_ESP} { return new Symbol( sym.CARACT_ESP, yyline + 1 , yycolumn + 1  );}
{ENTERO} { return new Symbol( sym.ENTERO, yyline + 1 , yycolumn + 1  );}
{FLOTANTE} { return new Symbol( sym.FLOTANTE, yyline + 1 , yycolumn + 1  );}
{CARACTER} { return new Symbol( sym.CARACTER, yyline + 1 , yycolumn + 1  );}
{STRING} { return new Symbol( sym.STRING, yyline + 1 , yycolumn + 1  );}
{BOOL} { return new Symbol( sym.BOOL, yyline + 1 , yycolumn + 1  );}
{KEYWORD}  { return new Symbol( sym.KEYWORD, yyline + 1 , yycolumn + 1  ) ;  }

/*Usados actualmente*/
{TIPO}  { return new Symbol( sym.TIPO,yyline+1,yycolumn+1) ;  }
{ID}    { return new Symbol( sym.ID,yyline+1,yycolumn+1) ;  }
";"   	{ return new Symbol( sym.END,yyline+1,yycolumn+1) ;  }
"," 	{ return new Symbol( sym.COMA,yyline+1,yycolumn+1) ;  }
":"		{ return new Symbol( sym.DOSPUN,yyline+1,yycolumn+1) ;}
"("		{ return new Symbol( sym.PAR_AB,yyline+1,yycolumn+1);} 
")"		{ return new Symbol( sym.PAR_CER,yyline+1,yycolumn+1);} 
"{"		{ return new Symbol( sym.LLAV_AB,yyline+1,yycolumn+1);} 
"}"		{ return new Symbol( sym.LLAV_CER,yyline+1,yycolumn+1);} 
"["		{ return new Symbol( sym.COR_AB,yyline+1,yycolumn+1);} 
"]"		{ return new Symbol( sym.COR_CER,yyline+1,yycolumn+1);} 

{OP_UNARIO}	 {return new Symbol( sym.OP_UNARIO , yyline + 1 , yycolumn + 1  ) ;}
{OP_BINARIO} {return new Symbol( sym.OP_BINARIO , yyline + 1 , yycolumn + 1 ) ;}
{IGUAL}		 {return new Symbol( sym.IGUAL , yyline + 1 , yycolumn + 1  ) ;}
{OP_COMP}	 {return new Symbol( sym.OP_COMP , yyline + 1 , yycolumn + 1  ) ;}

/*Ignora los espacios y comentarios*/
[ \n\t\r]
| {COMENT_1}
| {COMENT_M} {}

/*Errores Lexicos*/
[^ \n\t\r] {	System.out.println("ERROR: Token no identificado --> "+yytext()+" en la linea: "+
									(yyline+1)+", columna: "+(yycolumn+1)); }
