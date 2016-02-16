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
{CARACT_ESP} { return new Symbol( GeneradorSym.CARACT_ESP, yyline + 1 , yycolumn + 1  );}



/*--Tokens usados actualmente--*/

 /*Operaciones de entrada, salida y retorno*/
 input { return new Symbol( GeneradorSym.INPUT,yyline+1,yycolumn+1);}
 output { return new Symbol( GeneradorSym.OUTPUT,yyline+1,yycolumn+1);}
 return { return new Symbol( GeneradorSym.RETURN,yyline+1,yycolumn+1);}
{STRING} { return new Symbol( GeneradorSym.CADENA, yyline + 1 , yycolumn + 1  );}

/*Control de flujo*/
if	{ return new Symbol( GeneradorSym.IF,yyline+1,yycolumn+1);} 
else	{ return new Symbol( GeneradorSym.ELSE,yyline+1,yycolumn+1);} 
then	{ return new Symbol( GeneradorSym.THEN,yyline+1,yycolumn+1);} 
while	{ return new Symbol( GeneradorSym.WHILE,yyline+1,yycolumn+1);}

do	{ return new Symbol( GeneradorSym.DO,yyline+1,yycolumn+1);}
{OP_COMP}	 {return new Symbol( GeneradorSym.OP_COMP , yyline + 1 , yycolumn + 1  ) ;}
{OP_COMP_L}	 {return new Symbol( GeneradorSym.OP_COMP_L , yyline + 1 , yycolumn + 1  ) ;}
{ENTERO} { return new Symbol( GeneradorSym.ENTERO, yyline + 1 , yycolumn + 1 , Integer.parseInt(yytext()) );}
{FLOTANTE} { return new Symbol( GeneradorSym.FLOTANTE, yyline + 1 , yycolumn + 1  );}
{CARACTER} { return new Symbol( GeneradorSym.CARACTER, yyline + 1 , yycolumn + 1  );}
{BOOLEANO} { return new Symbol( GeneradorSym.BOOLEANO, yyline + 1 , yycolumn + 1  );}

/*Para declaraciones*/
int  { return new Symbol( GeneradorSym.INT,yyline+1,yycolumn+1,GeneradorSym.INT) ;  }
float { return new Symbol( GeneradorSym.FLOAT,yyline+1,yycolumn+1,GeneradorSym.FLOAT) ;  }
char { return new Symbol( GeneradorSym.CHAR,yyline+1,yycolumn+1,GeneradorSym.CHAR) ;  }
bool { return new Symbol( GeneradorSym.BOOL,yyline+1,yycolumn+1,GeneradorSym.BOOL) ;  }
String { return new Symbol( GeneradorSym.STRING,yyline+1,yycolumn+1,GeneradorSym.STRING) ;  }
void { return new Symbol( GeneradorSym.VOID,yyline+1,yycolumn+1,GeneradorSym.VOID) ;  }

{ID}    { return new Symbol( GeneradorSym.ID,yyline+1,yycolumn+1,new String(yytext())) ;  }
";"   	{ return new Symbol( GeneradorSym.END,yyline+1,yycolumn+1) ;  }
"," 	{ return new Symbol( GeneradorSym.COMA,yyline+1,yycolumn+1) ; }
":"		{ return new Symbol( GeneradorSym.DOSPUN,yyline+1,yycolumn+1 ) ;}

/*Delimitadores*/
"("		{ return new Symbol( GeneradorSym.PAR_AB,yyline+1,yycolumn+1);} 
")"		{ return new Symbol( GeneradorSym.PAR_CER,yyline+1,yycolumn+1);} 
"{"		{ return new Symbol( GeneradorSym.LLAV_AB,yyline+1,yycolumn+1);} 
"}"		{ return new Symbol( GeneradorSym.LLAV_CER,yyline+1,yycolumn+1);} 
"["		{ return new Symbol( GeneradorSym.COR_AB,yyline+1,yycolumn+1);} 
"]"		{ return new Symbol( GeneradorSym.COR_CER,yyline+1,yycolumn+1);} 

/*Para Atribuciones*/
"="		 {return new Symbol( GeneradorSym.IGUAL , yyline + 1 , yycolumn + 1  ) ;}
{OP_UNARIO}	 {return new Symbol( GeneradorSym.OP_UNARIO , yyline + 1 , yycolumn + 1  ) ;}
{OP_BINARIO}	 {return new Symbol( GeneradorSym.OP_BINARIO , yyline + 1 , yycolumn + 1  ) ;}



/*Ignora los espacios y comentarios*/
[ \t\n\r]
| {COMENT_1}
| {COMENT_M} {}


/*Errores Lexicos*/
[^ \n\t\r] {	System.out.println("ERROR LEXICO: Token '"+yytext()+"' no identificado. Linea: "+
									(yyline+1)+", columna: "+(yycolumn)); errores++;}
