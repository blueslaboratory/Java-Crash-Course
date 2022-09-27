package ejemplos029_ficheros;

import java.io.*;

public class CreaFichero2 {
	public static void main(String args[]) {
		
		// Crear un fichero dada la ruta completa
		System.out.println("CASO 1");
		File f1 = new File("G:\\DOCUMENTS\\DA1D1E\\ProgramaciXón\\T9 Ficheros en Java\\Ficheros\\Practicas\\texto1.txt");

		if (!f1.exists()) {
			try {
				// El directorio tiene que existir previamente a createNewFile()
				// Sin embargo, si existe el fichero, createNewFile devuelve falso
				// A partir del objeto File creamos el fichero fisicamente
				if (f1.createNewFile()) 
					System.out.println("El fichero se ha creado correctamente");
				else
					System.out.println("No ha podido ser creado el fichero");
			} catch (IOException ioe) { 
				// si pones el raton encima de createNewFile() te dice el throws
				ioe.printStackTrace();
			}
		} else
			System.out.println("El fichero ya existe");
		
		
		
		// Crear un fichero dada la ruta del directorio 
		// y el nombre del fichero por separado	
		System.out.println("CASO 2");
		File f2 = new File("G:\\DOCUMENTS\\DA1D1E\\Programación\\T9 Ficheros en Java\\Ficheros\\Practicas",
						   "texto2.txt");

		if (!f2.exists()) {
			try {
				// A partir del objeto File creamos el fichero fisicamente
				if (f2.createNewFile())
					System.out.println("El fichero se ha creado correctamente");
				else
					System.out.println("No ha podido ser creado el fichero");
			} catch (IOException ioe) {
				// si pones el raton encima de createNewFile() te dice el throws
				ioe.printStackTrace();
			}
		} else
			System.out.println("El fichero ya existe");
		
		

		// Crear un fichero dada la ruta del directorio y el nombre
		// del fichero por separado, con File como primer parametro
		System.out.println("CASO 3");
		File dir = new File("G:\\DOCUMENTS\\DA1D1E\\Programación\\T9 Ficheros en Java\\Ficheros\\Practicas");
		File f3 = new File(dir, "texto3.txt");

		// Lo borramos antes de crearlo:
		if(f3.delete()) 
			System.out.println(f3.getPath() +", se ha podido borrar."); 
		else
			System.out.println(f3.getPath() +", no se ha podido borrar.");
			// si es una carpeta y esta "rellena" no se puede borrar
		
		if (!f3.exists()) {
			try {
				// A partir del objeto File creamos el fichero fisicamente
				if (f3.createNewFile())
					System.out.println("El fichero se ha creado correctamente");
				else
					System.out.println("No ha podido ser creado el fichero");
			} catch (IOException ioe) {
				// si pones el raton encima de createNewFile() te dice el throws
				ioe.printStackTrace();
			}
		} else
			System.out.println("El fichero ya existe");
	}
}
