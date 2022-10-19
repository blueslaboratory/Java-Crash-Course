// Listar el contenido de un directorio  almacenando los nombres en un array
// de String y crear un archivo y un directorio.
// El main tiene que lanzar una excepcion por el uso de createNewFile

package ejemplos029_ficheros1_generales;

import java.io.*;

public class CFile2 {
	public static void main(String args[]) throws IOException {

		String dirname = "C:\\Users";
		File fc = new File(dirname);

		if (fc.exists()) {
			if (fc.isDirectory()) {

				String[] listaArchivos = fc.list();

				System.out.println("Directorio de " + dirname);
				System.out.println("Contenido del directorio actual: ");
				System.out.println();
				
				for (int i=0; i<listaArchivos.length; i++) {
					File f = new File(dirname + "\\" + listaArchivos[i]);
					if (f.isDirectory())
						System.out.println(listaArchivos[i] + ": Es un directorio");
					else
						System.out.println(listaArchivos[i] + ": Es un archivo");
				}
			} else
				System.out.println(dirname + ": No es un directorio");
		} else
			System.out.println("El fichero/directorio no existe");

	}

}
//--------------------------------------- Final del fichero CFile2.java
