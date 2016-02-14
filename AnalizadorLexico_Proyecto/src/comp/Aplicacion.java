package comp;

import java.io.*;

public class Aplicacion {	
	
	public static void main(String[] args) {			
		try {									
			AnalizadorLexico lexer = new AnalizadorLexico(new FileReader("entrada.c"));
			AnalizadorSintactico p = new AnalizadorSintactico(lexer);
			p.parse();
			System.out.println("\nRESUMEN\nErrores lexicos: "+lexer.errores+"\nErrores sintacticos: "+p.errores + "\nErrores semanticos: "+p.action_obj.errores);

		} catch (Exception e) {
			// TODO: Add catch code
			e.printStackTrace();
		}

	}
}