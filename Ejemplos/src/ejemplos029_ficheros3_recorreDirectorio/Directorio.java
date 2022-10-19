package ejemplos029_ficheros3_recorreDirectorio;

import java.io.*;
import java.util.*;

public class Directorio extends File {
	// te deja el extends porque File no es final

	private static final long serialVersionUID = 1L;

	public Directorio(String _ruta) {
		super(_ruta);
		// para que File tambien tenga la ruta
	}

	// Lista los ficheros y directorios del primer nivel a partir del 
	// path pasado
	public void listarDir1Nivel() throws IOException {

		if (!this.isDirectory()) // (!isDirectory())
			throw new Error(this.getAbsolutePath() + " No es un directorio");
			// lanzamos un Error
		else {
			File[] ficheros = listFiles(); // this.listFiles();
			// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html
			// listFiles(): Returns an array of abstract pathnames denoting the files 
			// in the directory denoted by this abstract pathname.
			// No esta garantizado el orden
			
			for (int i=0; i<ficheros.length; i++) {
				Date fecha = new Date(ficheros[i].lastModified());
				String nombre = ficheros[i].getName();
				System.out.println(fecha + "\t" + nombre);
			}
		}

	}

	// Ahora con recursividad
	public void listarDirTodo(File dir, int nivel) {

		// Indentacion segun el nivel
		String indentacion = "";
		for (int i = 0; i < nivel; i++)
			indentacion += "  ";

		// Listamos los ficheros y subdirectorios
		File[] lista = dir.listFiles();
		for (int i = 0; i < lista.length; i++) {
			System.out.println(indentacion + lista[i].getName());
			if (lista[i].isDirectory())
				listarDirTodo(lista[i], nivel + 1);
		}

	}

	// Borra en el primer nivel ficheros y directorios vacios
	public void borrarDir1Nivel() throws IOException {

		if (!isDirectory()) {
			System.out.println(this.getAbsoluteFile());
			System.out.println("Se borrara el fichero " + this.getAbsoluteFile());
			delete();
		} else {
			System.out.println(this.getAbsoluteFile());
			File[] ficheros = listFiles();
			for (int i = 0; i < ficheros.length; i++) {

				if (!ficheros[i].delete())
					System.out.println("El directorio " + ficheros[i].getName() + " no se puede borrar por no estar vacio");
					// esto es una suposicion, se supone que no esta vacio pero podria estar bloqueado x ejemplo
				else {
					// cuando llegamos aqui ya se ha borrado; se borra en el: if (!ficheros[i].delete())
					if (ficheros[i].isDirectory())
						System.out.println("Se borrara el directorio " + ficheros[i].getName());
					else
						System.out.println("Se borrara el fichero " + ficheros[i].getName());
				}
			}
		}

	}

	// Ahora borramos con recursividad
	public void borrarDirTodo(File dir, int nivel) {//No borra la carpeta que se manda
		// Recorremos los ficheros y subdirectorios
		File[] lista = dir.listFiles();
		for (int i = 0; i < lista.length; i++) {
			if (lista[i].isDirectory())
				borrarDirTodo(lista[i], nivel + 1);
			if (!lista[i].delete()) // intento borrar el elemento al que apunta lista[i]
				System.out.println("No se ha borrado " + lista[i]);
			else
				System.out.println("Se ha borrado " + lista[i]);
		}

	}

}