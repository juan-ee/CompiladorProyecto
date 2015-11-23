package comp;

import java.io.*;
import com.csvreader.CsvWriter;

public class Aplicacion {

	public static void main(String[] args) {
		Reader entrada;
		Analizador lexer;
		CsvWriter salida;
		TokenClass token;
		
		try {			
			entrada = new BufferedReader(new FileReader("entrada.txt"));
			lexer = new Analizador(entrada);
			//archivo de salida .csv
			salida = new CsvWriter(new FileWriter("salida.csv"), ',');
			salida.write("Lexema");
			salida.write("TokenClass");
			salida.write("Linea de Error");
			salida.write("Columna de Error");
			salida.endRecord();

			while (true) {
				token = lexer.yylex();
				if (token == null) {
					break;
				}
				System.out.println(token);

				//Imprimimos en el csv
				salida.write(token.token);
				salida.write(token.tipo);
				if (token.num_linea == -1) {
					salida.write("-");
					salida.write("-");
				} else {
					salida.write(String.valueOf(token.num_linea));
					salida.write(String.valueOf(token.num_column));
				}
				salida.endRecord();				
			}
			entrada.close();
			salida.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}