package ejemplos029_ficheros3_recorreDirectorio;

// Ejemplo que demuestra como borrar un directorio y todo su contenido

import java.io.File;

public class VerYBorrarDirectorio {

	public static void main(String[] args) {
		final String SDIRECTORIO = "C:\\Users\\W10Alex\\Desktop\\Borrar";

		File f = new File(SDIRECTORIO);
		if (!f.exists()) {
			System.out.println("Directorio no existe");
		} else { // Directorio existe
			borrarDirectorio(f);
		}
	}

	/**
	 * Metodo para borrar recursivamente el contenido de una carpeta
	 * solucion distinta al otro ejemplo
	 * 
	 * @param f
	 */
	private static void borrarDirectorio(File f) {//Borra tambien la carpeta que se manda
		if (f.isDirectory()) {
			// Si es una carpeta y esta vacia la borro 
			if (f.list().length == 0)
				f.delete();
			else {
				// si no esta vacia, tengo que recorrerla hasta llegar 
				// a los ficheros o carpetas que tenga vacias
				for (String temp : f.list()) {
					File fileDelete = new File(f, temp);
					// borrado recursivo
					borrarDirectorio(fileDelete);
				}

				// Volvemos a comprobar si el directorio esta vacio, 
				// si lo esta lo borramos
				if (f.list().length == 0)
					f.delete();
			}
		} else {
			// si es un fichero, lo borro
			f.delete();
		}
	}

//	The main difference between list and listFiles is that The list() method returns the names
//	of all files in the given directory in the form of a String array. 
//	The ListFiles() method returns the objects (File) of the files in the given directory, 
//	in the form of an array of type File.

}
