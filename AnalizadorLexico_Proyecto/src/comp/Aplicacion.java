package comp;

import java.io.*;
import com.csvreader.CsvWriter;

public class Aplicacion {

	public static void main(String[] args) {
		Reader entrada;
		AnalizadorLexico lexer;
		CsvWriter salida;		
		
		try {			
			entrada = new BufferedReader(new FileReader("entrada.txt"));
			lexer = new AnalizadorLexico(entrada);
			//archivo de salida .csv
			salida = new CsvWriter(new FileWriter("salida.csv"), ',');
			salida.write("Lexema");
			salida.write("TokenClass");
			salida.write("Linea de Error");
			salida.write("Columna de Error");
			salida.endRecord();			

			/*while (true) {
				token = lexer.yylex();
				if (token == null) {
					break;
				}				

				//Imprimimos en el csv
				salida.write(token.token);
				salida.write(token.tipo);
				salida.endRecord();				
			}
			entrada.close();
			salida.close();*/

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}