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

%{
	int errores=0;
%}

CARACT_ESP = "!"|"&"|"$"


ID = [a-z][_a-zA-Z0-9]*
ENTERO = -?[0-9]+
FLOTANTE = {ENTERO}"."[0-9]+
BOOLEANO = true|false
CARACTER = '[^ \n\t]'
STRING = \".+\"
COMENT_1 = "//".*
COMENT_M = "/*"[^"*/"]*"*/"
OP_UNARIO = "++"|"--"
OP_BINARIO = "+"|"-"|"*"|"/"
OP_COMP = ">"|"<"|">="|"<="|"!="|"=="
OP_COMP_L = "&&" | "||"

%%

/*--Tokens sin usar todavia--*/
{CARACT_ESP} { return new Symbol( sym.CARACT_ESP, yyline + 1 , yycolumn + 1  );}



/*--Tokens usados actualmente--*/

 /*Operaciones de entrada, salida y retorno*/
 input { return new Symbol( sym.INPUT,yyline+1,yycolumn+1);}
 output { return new Symbol( sym.OUTPUT,yyline+1,yycolumn+1);}
 return { return new Symbol( sym.RETURN,yyline+1,yycolumn+1);}
{STRING} { return new Symbol( sym.CADENA, yyline + 1 , yycolumn + 1  );}

/*Control de flujo*/
if	{ return new Symbol( sym.IF,yyline+1,yycolumn+1);} 
else	{ return new Symbol( sym.ELSE,yyline+1,yycolumn+1);} 
then	{ return new Symbol( sym.THEN,yyline+1,yycolumn+1);} 
while	{ return new Symbol( sym.WHILE,yyline+1,yycolumn+1);}

do	{ return new Symbol( sym.DO,yyline+1,yycolumn+1);}
{OP_COMP}	 {return new Symbol( sym.OP_COMP , yyline + 1 , yycolumn + 1  ) ;}
{OP_COMP_L}	 {return new Symbol( sym.OP_COMP_L , yyline + 1 , yycolumn + 1  ) ;}
{ENTERO} { return new Symbol( sym.ENTERO, yyline + 1 , yycolumn + 1 , Integer.parseInt(yytext()) );}
{FLOTANTE} { return new Symbol( sym.FLOTANTE, yyline + 1 , yycolumn + 1  );}
{CARACTER} { return new Symbol( sym.CARACTER, yyline + 1 , yycolumn + 1  );}
{BOOLEANO} { return new Symbol( sym.BOOLEANO, yyline + 1 , yycolumn + 1  );}

/*Para declaraciones*/
int  { return new Symbol( sym.INT,yyline+1,yycolumn+1,sym.INT) ;  }
float { return new Symbol( sym.FLOAT,yyline+1,yycolumn+1,sym.FLOAT) ;  }
char { return new Symbol( sym.CHAR,yyline+1,yycolumn+1,sym.CHAR) ;  }
bool { return new Symbol( sym.BOOL,yyline+1,yycolumn+1,sym.BOOL) ;  }
String { return new Symbol( sym.STRING,yyline+1,yycolumn+1,sym.STRING) ;  }
void { return new Symbol( sym.VOID,yyline+1,yycolumn+1,sym.VOID) ;  }

{ID}    { return new Symbol( sym.ID,yyline+1,yycolumn+1,new String(yytext())) ;  }
";"   	{ return new Symbol( sym.END,yyline+1,yycolumn+1) ;  }
"," 	{ return new Symbol( sym.COMA,yyline+1,yycolumn+1) ; }
":"		{ return new Symbol( sym.DOSPUN,yyline+1,yycolumn+1 ) ;}

/*Delimitadores*/
"("		{ return new Symbol( sym.PAR_AB,yyline+1,yycolumn+1);} 
")"		{ return new Symbol( sym.PAR_CER,yyline+1,yycolumn+1);} 
"{"		{ return new Symbol( sym.LLAV_AB,yyline+1,yycolumn+1);} 
"}"		{ return new Symbol( sym.LLAV_CER,yyline+1,yycolumn+1);} 
"["		{ return new Symbol( sym.COR_AB,yyline+1,yycolumn+1);} 
"]"		{ return new Symbol( sym.COR_CER,yyline+1,yycolumn+1);} 

/*Para Atribuciones*/
"="		 {return new Symbol( sym.IGUAL , yyline + 1 , yycolumn + 1  ) ;}
{OP_UNARIO}	 {return new Symbol( sym.OP_UNARIO , yyline + 1 , yycolumn + 1  ) ;}
{OP_BINARIO}	 {return new Symbol( sym.OP_BINARIO , yyline + 1 , yycolumn + 1  ) ;}



/*Ignora los espacios y comentarios*/
[ \t\n\r]
| {COMENT_1}
| {COMENT_M} {}


/*Errores Lexicos*/
[^ \n\t\r] {	System.out.println("ERROR LEXICO: Token '"+yytext()+"' no identificado. Linea: "+
									(yyline+1)+", columna: "+(yycolumn)); errores++;}
