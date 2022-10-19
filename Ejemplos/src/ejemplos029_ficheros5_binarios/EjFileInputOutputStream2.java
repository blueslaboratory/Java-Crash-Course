package ejemplos029_ficheros5_binarios;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* 	Descripcion

	Clase obtiene los bytes de lectura de un fichero. 
	Es ideal para la lectura de streams de datos de ficheros.
	Sintaxis
	Ahora lo usamos para un fichero de texto

	public class FileInputStream extends InputStream
	
	esto es una copia de un .txt a otro
*/

public class EjFileInputOutputStream2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int TAM = 1024;
		final String ORIGEN = "origen.txt",
					 DESTINO = "destino.txt";
		
		try (FileInputStream fis = new FileInputStream(ORIGEN);
			 FileOutputStream fos = new FileOutputStream(DESTINO)) {						
			byte[] buf = new byte[TAM];
			int len;

			while ((len = fis.read(buf)) > 0) {
				fos.write(buf, 0, len);
			}
						  
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (Exception ioe) {
			ioe.printStackTrace();
		}
	}
}