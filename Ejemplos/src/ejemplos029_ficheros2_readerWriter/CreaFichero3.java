package ejemplos029_ficheros2_readerWriter;

import java.io.*;
import java.time.LocalDate;

public class CreaFichero3 {
	public static void main(String[] args) {
		String frase = "Esto es un ejemplo de escritura de ficheros de texto - " +LocalDate.now();
		
		try {
			// Ahora mandamos directamente el nombre del fichero con una ruta relativa		
			// Crear objeto FileWriter que sera el que nos ayude a escribir sobre el archivo
			// FileWriter escribir = new FileWriter("texto2.txt");
			// Crea el fichero en la carpeta del proyecto
			
			// al descomentar este, comentar el anterior
			FileWriter escribir = new FileWriter("texto2.txt", true); // Para anadir
			// true: si ya existe el fichero no lo machaco, continuo escribiendo donde lo deje
			// Se escribe en el archivo con el metodo write
			escribir.write(frase);
			escribir.write("\n");
			// Se cierra la conexion
			escribir.close();
		} catch (Exception e) {
			// si lo tienes abierto te salta esta excepcion
			System.out.println("Error al escribir");
		}
	}
}