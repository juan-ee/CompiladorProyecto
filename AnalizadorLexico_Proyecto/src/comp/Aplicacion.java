package comp;

import java.io.*;
import java.util.ArrayList;

public class Aplicacion {	
	
	
	

	
	public static void main(String[] args) {	
		
		try {									
			AnalizadorLexico lexer = new AnalizadorLexico(new FileReader("entrada.c"));
			AnalizadorSintactico p = new AnalizadorSintactico(lexer);
			p.parse();
			
			
			if(lexer.errores==0&&p.errores==0&&p.action_obj.errores==0){
				AnalizadorLexicoGen lexer2 = new AnalizadorLexicoGen(new FileReader("entrada.c"));
				GeneradorCup nuevo=new GeneradorCup(lexer2);				
				nuevo.parse();				
				BufferedReader arch=new BufferedReader(new FileReader("salida.txt"));
				System.out.println("CODIGO GENERADO:\n");
				while(arch.ready()){
					System.out.println(arch.readLine());
				}
				arch.close();
			}

		} catch (Exception e) {
			// TODO: Add catch code
			e.printStackTrace();
		}
				
		String comparar="";
	
	}
}