package ejemplos029_ficheros2_readerWriter;

//Ejemplo de lectura de un fichero caracter a caracter.  
import java.io.*;

public class LeeFicheroCaracter {
	public static void main(String arg[]) {
		final String NOMFICH = "texto.txt";
		// Se define un int que va a contener los caracteres del archivo
		int c;

		try {
			// Se crea un objeto FileReader que enlaza con el archivo
			FileReader lector = new FileReader(NOMFICH);
			// G:\DOCUMENTS\DA1D1E\Programación\Eclipse-workspace\Ejemplos
			// Con FileReader solo se lee caracter a caracter

//			c = lector.read();
//			while (c != -1) { //c=-1 indica el fin de fichero
//				System.out.print((char) c);
//				c = lector.read();
//			}
			 
			// Todo a la vez: 
			while ((c = lector.read()) != -1)
				System.out.print((char) c);

			
//			// Lee en lineas de 10 chars
//			char[] cadena = new char[10];
//			while ((lector.read(cadena)) != -1)
//				System.out.println(cadena);

			lector.close();
		} catch (Exception e) {
			System.out.println("Error al leer");
		}
	}
}
