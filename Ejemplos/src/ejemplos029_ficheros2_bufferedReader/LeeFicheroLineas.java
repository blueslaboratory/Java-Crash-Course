package ejemplos029_ficheros2_bufferedReader;

import java.io.*;

public class LeeFicheroLineas {
	public static void main(String arg[]) {
		// final String NOMFICH="c:\\fich1.txt";
		final String NOMFICH = "fich1.txt";
		String texto = "";
		// ruta del fichero: G:\DOCUMENTS\DA1D1E\Programación\Eclipse-workspace\Ejemplos
		// Creamos manualmente el fichero con lineas con un editor
		// Creamos un String que va a ir conteniendo el texto del archivo linea a linea.

		try {
			// Se crea un objeto FileReader para conectarse con el archivo
			// FileReader lector = new FileReader(NOMFICH);
			// El contenido del objeto se envuelve en un BufferedReader
			// BufferedReader contenido = new BufferedReader(lector);
			// Se puede abreviar asi:
			BufferedReader contenido = new BufferedReader(new FileReader(NOMFICH));

			// Cambiar en properties del proyecto a UTF-8 en la codificacion
			// para que se vean los acentos bien.

			/* 
			Se puede hacer una lectura adelantada como lo siguiente
			texto = contenido.readLine(); 			
			while(texto!=null){                   
				System.out.println(texto);                   
				texto = contenido.readLine();
			}
			*/ 

			// O usar el metodo ready:
			while (contenido.ready()) {
				texto = contenido.readLine();
				System.out.println(texto);
			}
			contenido.close();

		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el fichero");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
