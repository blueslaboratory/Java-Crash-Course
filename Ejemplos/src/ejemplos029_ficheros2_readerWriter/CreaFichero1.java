package ejemplos029_ficheros2_readerWriter;

import java.io.*;

public class CreaFichero1 {
	public static void main(String args[]) {
		
		// Crea un fichero dada la ruta completa
		File f1 = new File("C:\\Ficheros\\nuevo.txt");
		try {
			// A partir del objeto File creamos el fichero fisicamente
			if (f1.createNewFile())
				System.out.println("El fichero se ha creado correctamente");
			else
				System.out.println("No ha podido ser creado el fichero");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		
		// Crea un fichero dada la ruta del directorio y el nombre 
		// del fichero por separado
		File f2 = new File("C:\\Ficheros", "nuevo2.txt");
		// Crea/abre un fichero dado el directorio y el nombre
		// del fichero por separado
		try {
			// A partir del objeto File creamos el fichero fisicamente
			if (f2.createNewFile())
				System.out.println("El fichero se ha creado correctamente");
			else
				System.out.println("No ha podido ser creado el fichero");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		
		File dir = new File("C:\\Ficheros");
		File f3 = new File(dir, "nuevo3.txt");
		try {
			// A partir del objeto File creamos el fichero fisicamente
			if (f3.createNewFile())
				System.out.println("El fichero se ha creado correctamente");
			else
				System.out.println("No ha podido ser creado el fichero");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

	}
}