package ejemplos029_ficheros1_generales;

import java.io.File;

public class CreaFichero1_2 {
	public static void main(String[] args) {

		File f1 = new File("C:\\Practicas\\uno");
		// Hacer la prueba existiendo la carpeta y no existiendo

		
		// mkdir()
		System.out.println("\nCASO 1: mkdir()");
		if (f1.exists()) {
			if (f1.isDirectory())
				System.out.println(f1.getPath() + " es un directorio.");
			else
				System.out.println(f1.getPath() + " es un fichero.");
		} else {// El directorio no existe
			System.out.println(f1.getPath() + ", no existe.");
			if (f1.mkdir())
				System.out.println(f1.getPath() + ", lo creamos con mkdir.");
			else
				System.out.println(f1.getPath() + ", no se ha podido crear con mkdir.");
		}

		
		// mkdirs()
		System.out.println("\nCASO 2: mkdirs()");
		if (f1.exists()) {
			if (f1.isDirectory())
				System.out.println(f1.getPath() + " es un directorio.");
			else
				System.out.println(f1.getPath() + " es un fichero.");
		} else {// El directorio no existe
			System.out.println(f1.getPath() + ", no existe.");
			if (f1.mkdirs())
				System.out.println(f1.getPath() + ", lo creamos con mkdirs.");
			else
				System.out.println(f1.getPath() + ", no se ha podido crear con mkdirs.");
		}

		
		// Prueba:
		System.out.println("\nBORRAR: ");
		if (f1.delete())
			System.out.println(f1.getPath() + ", se ha podido borrar.");
		else
			System.out.println(f1.getPath() + ", no se ha podido borrar.");

		f1 = new File("C:\\Practicas");
		if (f1.delete())
			System.out.println(f1.getPath() + ", se ha podido borrar.");
		else
			System.out.println(f1.getPath() + ", no se ha podido borrar.");
	}

}