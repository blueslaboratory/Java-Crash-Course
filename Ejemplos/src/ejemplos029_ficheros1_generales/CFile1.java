package ejemplos029_ficheros1_generales;

// Utilizar los metodos de la clase File para indicar las propiedades del archivo 
// autoexec.nt en un sistema windows y para listar el contenido del fichero actual.
import java.io.*;

public class CFile1 {
	public static void main(String args[]) {
		File f1, f2, f3, f4;
		String[] listaArchivos;
		int i;

		// Doble barra pues \ es un simbolo especial hay que escaparlo
		f1 = new File("C:\\WINDOWS\\system32", "xmllite.dll");

		// Sin path absoluto
		// f1 = new File("/WINDOWS/system32", "xmllite.dllt");//No es absoluto
		// Con path absoluto
		// f1 = new File("C:\\WINDOWS\\system32\\xmllite.dll");//Si es absoluto

		System.out.println("Nombre: " + f1.getName());
		System.out.println("Camino: " + f1.getPath());
		System.out.println("Camino absoluto: " + f1.getAbsolutePath());
		System.out.println();
		
		
		// Imprime "C:\autoexec.nt"
		System.out.println("Padre: " + f1.getParent()); // Imprime "C:\"
		System.out.println("Existe: " + f1.exists()); // Imprime true o false
		System.out.println("Se puede leer: " + f1.canRead()); // true o false
		System.out.println("Se puede Escribir: " + f1.canWrite()); // true o false
		System.out.println("Es directorio: " + f1.isDirectory()); // true o false
		System.out.println("Es fichero: " + f1.isFile()); // true o false
		System.out.println("Es absoluto: " + f1.isAbsolute()); // true o false
		System.out.println("Longitud: " + f1.length()); // Imprime la longitud
		System.out.println();
		
		
		f2 = new File("pepito.xxx"); // No crea fisicamente el archivo
		f3 = new File(".."); // No crea fisicamente el archivo
	
		// Crear los archivos seria asi:		
		/* 
		try {
			f2.createNewFile();
			f3.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		System.out.println("Existe f2: " + f2.exists()); // Imprime true o false
		System.out.println("Existe f3: " + f3.exists()); // Imprime true o false
		
		System.out.println("Camino absoluto de f2: " + f2.getAbsolutePath());
		System.out.println("Camino absoluto de f3: " + f3.getAbsolutePath());
		System.out.println("Es absoluto f2: " + f2.isAbsolute());
		System.out.println("Es absoluto f3: " +f3.isAbsolute());

		f3 = new File(f3.getAbsolutePath());
		System.out.println("Es absoluto f3.getAbsolutePath(): " +f3.isAbsolute());
		System.out.println();
		
		
		if (f3.isDirectory()) {
			listaArchivos = f3.list();
			// Si f3 no es directorio daria error
			// es curioso como un . es un direcorio
			System.out.println("Contenido del directorio actual");
			for (i=0; i<listaArchivos.length; i++)
				System.out.println(listaArchivos[i]); // Imprime un archivo o directorio
		} else {
			System.out.println("No es un directorio.");
		}

	}
}
// --------------------------------------- Final del fichero CFile1.java