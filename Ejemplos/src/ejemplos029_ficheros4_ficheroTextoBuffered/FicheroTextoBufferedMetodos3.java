package ejemplos029_ficheros4_ficheroTextoBuffered;

import java.io.*; //Importamos todas las clases de java.io.
import java.util.*;

public class FicheroTextoBufferedMetodos3 {

	public static void main(String[] args) {
		final String FICH = "C:\\Users\\W10Alex\\Desktop\\fichero1.txt";
		// Escribimos en el fichero
		escribeFichero(FICH);

		// Leemos el fichero y lo mostramos por pantalla
		leeFichero(FICH);
	}

	/**
	 * escribeFichero
	 */
	public static void escribeFichero(String fichero) {
		Scanner sc = null;
		BufferedWriter bw = null;

		try {
			bw = new BufferedWriter(new FileWriter(new File(fichero)));
			// Escribimos en el fichero
			sc = new Scanner(System.in);
			String leido = null;

			while (!(leido = sc.nextLine()).equals("fin")) {
				bw.write(leido);
				bw.newLine();
			}
		} catch (IOException e) {
			System.out.println("Error E/S: " + e);
		} finally {
			try {
				if (sc != null)
					sc.close();
				if (bw != null)
					bw.close();
			} catch (IOException e) {
				System.out.println("Error E/S: " + e);
			}
		}
	}

	/**
	 * leeFichero
	 */
	public static void leeFichero(String fichero) {
		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader(fichero));
			// Leemos el fichero y lo mostramos por pantalla
			String linea = br.readLine();
			while (linea != null) {
				System.out.println(linea);
				linea = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error E/S: " + e);
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
				System.out.println("Error E/S: " + e);
			}
		}

	}
}
