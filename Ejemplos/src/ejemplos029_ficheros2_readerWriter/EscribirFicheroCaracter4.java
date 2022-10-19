// Es como el caso 3 pero ahora cerramos con finally
package ejemplos029_ficheros2_readerWriter;

import java.io.*;
import java.util.Scanner;

public class EscribirFicheroCaracter4 {
	public static void main(String[] args) {
		final String NOMFICH1 = "texto1.txt";
		final String NOMFICH2 = "texto2.txt";
		FileWriter escribir = null;
		Scanner sc = null;

		try {
			// G:\DOCUMENTS\DA1D1E\Programación\Eclipse-workspace\Ejemplos
			File archivo1 = new File(NOMFICH1);
			File archivo2 = new File(NOMFICH2);
			sc = new Scanner(archivo1);

			// Crear objeto FileWriter que sera el que nos ayude a escribir
			// sobre el archivo

			escribir = new FileWriter(archivo2);

			// Crea el fichero en la carpeta del proyecto por defecto

			// FileWriter escribir = new FileWriter(archivo,true); // Para
			// aniadir

			// Se escribe en el archivo con el metodo write
			String linea;

			while (sc.hasNext()) {
				System.out.print("Introducido en el archivo2: ");
				linea = sc.nextLine();
				System.out.println(linea);
				escribir.write("Modificacion: " +linea + "\r\n");
				// "\r\n" para conservar la escritura en la copia
				// Ctrl-Z para salir del bucle
				// la coge del de entrada y la escribe en el de salida
			}

		} catch (Exception e) {
			System.out.println("Error al escribir");
			System.out.println(e.getMessage());
		} finally {
			// los cerramos en un finally como tiene que ser
			try {
				escribir.close();
				sc.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}