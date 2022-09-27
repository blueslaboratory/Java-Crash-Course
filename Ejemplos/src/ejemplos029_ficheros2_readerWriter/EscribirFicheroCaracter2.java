//
// Despues de hacer EscribirFicheroCaracter y LeerFicheroCaracter
// Escribimos en el fichero no una frase dada sino lo que se va introduciendo en
// la consola hasta pulsar Ctrl-Z (EscribirFicheroCaracter2)
//
package ejemplos029_ficheros2_readerWriter;

import java.io.*;

public class EscribirFicheroCaracter2 {
	public static void main(String[] args) {
		final String NOMFICH = "texto.txt";

		try {
			// Crear un objeto File se encarga de crear o abrir acceso a un archivo que
			// se especifica en su constructor (el fichero no tiene por que existir)
			File archivo = new File(NOMFICH);

			// Crear objeto FileWriter que sera el que nos ayude a escribir
			// sobre el archivo

			FileWriter escribir = new FileWriter(archivo);

			// Crea el fichero en la carpeta del proyecto por defecto

			// FileWriter escribir = new FileWriter(archivo, true); 
			// Para aniadir

			// Se escribe en el archivo con el metodo write
			int c;
			while ((c = System.in.read()) != -1) {
				escribir.write(c);
			}
			// Ctrl-Z debe ir en una linea solo 
			// (la linea donde se detecta no se escribira)
			// Hay que hacer intro antes de Ctrl-Z

			// Se cierra la conexion
			System.out.println("Cerramos fichero de escritura");
			escribir.close();
		} catch (Exception e) {
			System.out.println("Error al escribir");
		}

	}
}
