package ejemplos029_ficheros2_bufferedReader;

import java.io.*;

public class LeeFicheroLineas3 {
	public static void main(String[] args) {
		String linea = "";
		
		try {
			// Ruta:
			// G:\DOCUMENTS\DA1D1E\Programación\Eclipse-workspace\Ejemplos
			// BufferedReader recibe como parametro la entrada de lectura
			BufferedReader br = new BufferedReader(new FileReader("fich1.txt"));

			while (linea != null) {
				// procesar el texto de la linea
				linea = br.readLine();
				System.out.println(linea);
			}
			br.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			// No se encontro el fichero
		} catch (IOException e) {
			// Algo fue mal al leer o cerrar el fichero
		}
		
		System.out.println("\nIntroducido: " + linea);
	}
}
