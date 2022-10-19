package ejemplos029_ficheros4_ficheroTextoBuffered;

import java.io.*; //Importamos todas las clases de java.io.
import java.util.*;

public class FicheroTextoBufferedMetodos4 {

	public static void main(String[] args) {
		final String FICH = "C:\\Users\\W10Alex\\Desktop\\fichero1.txt";
		// Escribimos en el fichero
		escribeFichero(FICH);

		// Leemos el fichero y lo mostramos por pantalla
		leeFichero(FICH);
		
		// No puedes abrir Scanner aqui porque has cerrado el flujo en escribeFichero
		// Scanner sc = new Scanner(System.in);
		// String s = sc.nextLine();
	}

	/**
	 * escribeFichero
	 */
	public static void escribeFichero(String fichero) {

		// try: Con la version 8 de Java
		// este try coge parametros
		// es una variable que solo va a existir en el bloque, hay que declarla en el try
		try (Scanner sc = new Scanner(System.in); 
			// esto no te deja volver a usar el scanner porque cierra el flujo de System.in
			 BufferedWriter bw = new BufferedWriter(new FileWriter(fichero));) {
			
			// Escribimos en el fichero

			String leido = null;

			System.out.print("> ");
			while (!(leido = sc.nextLine()).equals("fin")) {
				System.out.print("> ");
				bw.write(leido);
				bw.newLine();
			}
		} catch (IOException e) {
			System.out.println("Error E/S: " + e);
		}

	}

	/**
	 * leeFichero
	 */
	public static void leeFichero(String fichero) {

		try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {

			// Leemos el fichero y lo mostramos por pantalla
			// Elegante
			String linea;
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
			}
		} catch (IOException e) {
			System.out.println("Error E/S: " + e);
		}

	}
}
