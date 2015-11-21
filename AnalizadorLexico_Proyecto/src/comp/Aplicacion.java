package comp;

import java.io.*;

public class Aplicacion {

	public static void main(String[] args) {
		
		try {
			Reader entrada = new BufferedReader(new FileReader("entrada.txt"));
			Analizador lexer=new Analizador(entrada);		
			
			while(true){
				TokenClass token=lexer.yylex();
				if(token==null){
					return;
				}
				System.out.println(token);				
			}						
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
