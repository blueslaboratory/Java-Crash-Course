package ejemplos029_ficheros4_ficheroTextoBuffered;

import java.io.*; //Importamos todas las clases de java.io.
import java.util.*;

public class FicheroTextoBufferedMetodos2 {

	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;

		try {
			// Escribimos en el fichero
			bw = new BufferedWriter(new FileWriter("C:\\Users\\W10Alex\\Desktop\\fichero1.txt"));
			escribeFichero(bw);

			// Guardamos los cambios del fichero
			bw.flush();

			// Leemos el fichero y lo mostramos por pantalla
			br = new BufferedReader(new FileReader("C:\\Users\\W10Alex\\Desktop\\fichero1.txt"));
			leeFichero(br);
			
		} catch (IOException e) {
			System.out.println("Error E/S: " + e);
		} finally {
			try {
				if (br != null)	br.close();
				if (bw != null)	bw.close();
			} catch (IOException e) {
				System.out.println("Error E/S: " + e);
			}
		}
	}

	/**
	 * escribeFichero
	 */
	public static void escribeFichero(BufferedWriter bw) throws IOException {
		// Escribimos en el fichero
		Scanner sc = new Scanner(System.in);
		String leido = null;

		while (!(leido = sc.nextLine()).equals("fin")) {
			bw.write(leido);
			bw.newLine();
		}

		sc.close();
	}

	/**
	 * leeFichero
	 */
	public static void leeFichero(BufferedReader br) throws IOException {
		// Leemos el fichero y lo mostramos por pantalla
		String linea = br.readLine();
		while (linea != null) {
			System.out.println(linea);
			linea = br.readLine();
		}
	}

}