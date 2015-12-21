package comp;

import java.io.*;

public class Aplicacion {

	public static void main(String[] args) {
		 try {	            
	            AnalizadorLexico lexer = new AnalizadorLexico( new FileReader("entrada.txt") );	            
	            AnalizadorSintactico p = new AnalizadorSintactico(lexer);	            
	            p.parse();	     
	        } catch (Exception e) {
	            // TODO: Add catch code
	            e.printStackTrace();
	        }

}
}