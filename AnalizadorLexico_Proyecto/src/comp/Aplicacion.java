package comp;

import java.io.*;

public class Aplicacion {

	public static void main(String[] args) {
		 try {	
			 int a,d,c;
	            AnalizadorLexico lexer = new AnalizadorLexico( new FileReader("entrada.c") );	            
	            AnalizadorSintactico p = new AnalizadorSintactico(lexer);	            
	            p.parse();	   
	        } catch (Exception e) {
	            // TODO: Add catch code
	            e.printStackTrace();
	        }

}
}