package ejemplos029_ficheros5_binarios;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* 	Descripcion

	Clase obtiene los bytes de lectura de un fichero. 
	Es ideal para la lectura de streams de datos de ficheros.
	Sintaxis

	public class FileInputStream extends InputStream
*/

public class EjFileInputOutputStream1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int TAM = 1024;
		final String ORIGEN = "C:\\Users\\Public\\Pictures\\Desert.jpg";
		final String DESTINO = "Desierto.jpg";
		
		// Try con recursos: cierra automaticamente (Disponible a partir de java 8)
		try (FileInputStream fis = new FileInputStream(ORIGEN); // leo de aqui
		 	 FileOutputStream fos = new FileOutputStream(DESTINO)) { // escribo aqui 
			byte[] buf = new byte[TAM]; // buffer de 1024 bytes para guardar lo leido 
			int len;

 			// si pones el cursor encima del read te pone el return del metodo (-1 cuando termina)
			while ((len = fis.read(buf)) > 0) { // lo leo en el buffer, en trozos de 1024 bytes
				// lo vuelco en un fichero de salida lo que tengo en el buf [0, len]
				// es importante que sea hasta len, porque de [len, 1024] esta relleno 
				// del buffer anterior despues de los multiplos de 1024
				fos.write(buf, 0, len); 
				
			}

		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (Exception ioe) {
			ioe.printStackTrace();
		}
	}
}
