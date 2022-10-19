//https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html
//"Lo peor de ficheros es la cantidad de metodos"- Esther

package ejemplos029_ficheros;

import java.io.File;

public class CreaFichero1 {
	public static void main(String[] args) {
		
		// Hacer la prueba existiendo la carpeta y no existiendo
		// Hay que poner \\ para que te lea una \
		File f1 = new File("G:\\DOCUMENTS\\DA1D1E\\Programación\\T9 Ficheros en Java\\Ficheros\\Hola");
		
		if(f1.exists()) { 
			// si f1 no existe, no se devuelve una excepcion, por eso usamos .exists()
			if (f1.isDirectory())
				System.out.println(f1.getPath() + " es un directorio.");
			else
				System.out.println(f1.getPath() + " es un fichero.");
		}
		else { // El directorio no existe
			System.out.println(f1.getPath() +", no existe.");
			if (f1.mkdir())
				System.out.println(f1.getPath() +", se ha creado.");
			else
				System.out.println(f1.getPath() +", no se ha podido crear con mkdir.");
				// para que funcione tiene que existir el directorio donde se va a crear
				// para crear varios habria que poner f1.mkdirs()
				// mkdirs() puede crear todos los directorios hasta la ruta
		}
		
		
		//Prueba: borrar dir "Hola"
		//comentar esto para que no se borre automaticamente
		if(f1.delete()) 
			System.out.println(f1.getPath() +", se ha podido borrar."); 
		else
			System.out.println(f1.getPath() +", no se ha podido borrar.");
			// si esta "rellena" no se puede borrar
		
			
	}
	
}