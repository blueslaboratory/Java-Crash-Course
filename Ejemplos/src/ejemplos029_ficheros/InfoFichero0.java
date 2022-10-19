// Project / Properties / Run-Debug settings / InfoFichero0.class /edit / Arguments ->
// "G:\DOCUMENTS\DA1D1E\Programación\T9 Ficheros en Java\Ficheros\F000.txt"
// "G:\DOCUMENTS\DA1D1E\Programación\T9 Ficheros en Java\Ficheros\F000.jpg"

package ejemplos029_ficheros;

import java.io.File;

public class InfoFichero0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length == 1) {
			File f = new File(args[0]); //descriptor que apunta a la info del fichero
			System.out.println("Nombre: " + f.getName());
			System.out.println("Camino: " + f.getPath());
			
			if (f.exists()) {
				
				System.out.print("Fichero existente ");
				System.out.print((f.canRead() ? " y se puede leer" : " y no se puede leer"));
				System.out.print((f.canWrite() ? " y se puede escribir" : " y no se puede escribir"));
				System.out.println(".");
				System.out.println("La longitud del fichero es de " + f.length() + " bytes");
				
				if(f.isDirectory())
					System.out.println(f.getPath() + " es un directorio");
				else
					System.out.println(f.getPath() + " es un fichero");
				
			} else
				System.out.println("El fichero no existe.");
		} else
			System.out.println("Debe indicar un fichero. ");

	}

}