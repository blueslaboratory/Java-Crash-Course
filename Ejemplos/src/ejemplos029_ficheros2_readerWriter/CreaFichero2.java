package ejemplos029_ficheros2_readerWriter;

import java.io.*;
import java.time.LocalDate;

public class CreaFichero2 {
	public static void main(String[] args) {
		String frase = "\nEsto es un ejemplo de escritura de ficheros de texto - " +LocalDate.now();
		
		try {
			// Crear un objeto File se encarga de crear o abrir acceso a un archivo que
			// se especifica en su constructor
			File archivo = new File("mitxt.txt");
			// se crea en la carpeta del proyecto
			
			// Crear objeto FileWriter que sera el que nos ayude a escribir sobre el archivo
			// FileWriter escribir = new FileWriter(archivo);
			// Crea el fichero en la carpeta del proyecto
			// G:\DOCUMENTS\DA1D1E\Programación\Eclipse-workspace\Ejemplos
			
			FileWriter escribir = new FileWriter(archivo, true); // Para anadir
			// true: si ya existe el fichero no lo machaco, continuo escribiendo donde lo deje
			
			// Se escribe en el archivo con el metodo write
			escribir.write(frase);
			
			// Se cierra la conexion
			escribir.close();
			
		} catch (Exception e) {
			System.out.println("Error al escribir");
		}
	}
}
