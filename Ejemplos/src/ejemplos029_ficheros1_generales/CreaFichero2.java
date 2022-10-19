// No ver, ver este:
// Mejor explicado en ejemplos029_ficheros -> CreaFichero2.java

package ejemplos029_ficheros1_generales;

import java.io.*;

public class CreaFichero2 {
	public static void main(String args[]){
		
		// Crea un fichero dada la ruta completa
		System.out.println("CASO 1");	
		File f1 = new File("C:\\Practicas\\texto1.txt");
		// El directorio tiene que existir previamente a createNewFile()
		// Sin embargo, si existe el fichero, createNewFile devuelve falso
		if (!f1.exists()) {
			try {
		    	
		    	// A partir del objeto File creamos el fichero fisicamente
		    	if (f1.createNewFile())
		         	System.out.println("El fichero se ha creado correctamente");
		        else
		          	System.out.println("No ha podido ser creado el fichero");
		     } catch (IOException ioe) { 
		    	 // si pones el raton encima de createNewFile() te dice el throws
		    	 ioe.printStackTrace();
		    }	
    	}
		else
			System.out.println("El fichero ya existe");
	    
		
		
		// Crea un fichero dada la ruta del directorio y el nombre 
		// del fichero por separado
		System.out.println("CASO 2");	
		File f2 = new File("C:\\Practicas" , "texto2.txt");	    
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
		}
		else 
			System.out.println("El fichero ya existe");
		
		
		
		// Crea un fichero dada la ruta del directorio y el nombre 
		// del fichero por separado, con File como primer parametro
		System.out.println("CASO 3");
		File dir = new File("C:\\Practicas");
		File f3 = new File(dir, "texto3.txt");
					
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
		}
		else
			System.out.println("El fichero ya existe"); 
	}
}
