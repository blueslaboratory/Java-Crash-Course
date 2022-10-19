package ejemplos029_ficheros4_ficheroTextoBuffered;

import java.io.*;
import java.time.LocalDate;

public class PruebaEscritura {

	public static void main(String[] args) {
		/* Con BufferedWriter sobre FileWriter */
		try {
			// G:\DOCUMENTS\DA1D1E\Programación\Eclipse-workspace\Ejemplos
			FileWriter connection = new FileWriter("test.txt", true);
			// true si se abre el archivo para anadir datos 
			// false para crearlo por primera vez; 
			// si tuviese datos estos se borrarian en este segundo caso. 
			PrintWriter file = new PrintWriter(connection);

			file.println(LocalDate.now());
			file.println("Hola"); // a method from "PrintWriter".
			file.println("Hola");
			file.close(); 
			// close the stream. and data on buffer writes to the file. without "close();",
			// nothing writes to the file.

			escribirMas();
		} catch (IOException e) {
			System.out.println("IOException");
		}
	}

	/* Con BufferedWriter sobre FileWriter */
	public static void escribirMas() throws IOException {
		// hay que reabrir por el close
		FileWriter connection = new FileWriter("test.txt", true);
		BufferedWriter file = new BufferedWriter(connection);

		file.write("Adios");
		file.newLine();
		file.write("Adios");
		file.newLine();
		file.close();
	}

}