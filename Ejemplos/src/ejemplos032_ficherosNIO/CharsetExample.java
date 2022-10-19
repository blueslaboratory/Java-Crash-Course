// JAVA NIO NO ENTRA EN EL EXAMEN

package ejemplos032_ficherosNIO;

import java.nio.charset.Charset;

public class CharsetExample {

	public static void main(String[] args) {
		
		System.out.println("Conjunto de caracteres por defecto = " +Charset.defaultCharset());
		
		// lo cambiamos
		System.setProperty("file.encoding", "UTF-8");
		System.out.println("file.encoding = " +System.getProperty("file.encoding"));
		
		System.out.println("Conjunto de caracteres por defecto = " +Charset.defaultCharset());
		
		// Example of directly using charset objects
		Charset ascii = Charset.forName("US-ASCII");
		System.out.println("En sistemas antiguos este es el conjunto de caracteres = " +ascii);

	}

}
