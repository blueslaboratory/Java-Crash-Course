package ejemplos031_ficherosRAF;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UTFDataFormatException;
import java.util.Scanner;

public class Aleatorios3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RandomAccessFile fichero = null;
		String palabra, cadena;
		long pos = 0;
		final String FICHERO = "fichero1.txt";
		
		try {
			// se abre el fichero para R/W
			fichero = new RandomAccessFile(FICHERO,"rw");
			// **********************//
			// fichero.seek(pos);
			// Tiene que estar escrito en el fichero con writeUTF
			// para que funcione
			
			fichero.writeUTF("La cabra y el lobo\r\n"
					+ "\r\n" 
					+ "Al salir la cabra de su establo encargo a su hijo el cuidado..." 
					+ "ESTA SE COPIA\r\n"
					+ "No tardo mucho en llegar el enemigo..."
					+ "Al mirar el cabrito por una rendija vio..."
					+ "ESTA SE COPIA\r\n"
					+ "- Bien se que eres nuestro mayor adversario y que..."
					+ "ESTA SE COPIA\r\n");
			// **********************//
			
			if(fichero.length()!=0) {
				
				fichero.seek(pos);
//				cadena = fichero.readUTF();
				
				// Se pide la palabra a buscar
				System.out.print("Introduce una String: ");
				palabra = sc.nextLine();
				
				while((cadena = fichero.readUTF())!=null) { 
//				while(cadena !=null) { // mientras no lleguemos al final del fichero
					System.out.println("Cadena inicial: " +cadena);
					
					cadena = cadena.replaceAll(palabra, palabra.toUpperCase());
					System.out.println("Cadena final: " +cadena);
					
					fichero.seek(pos);
					// fichero.writeBytes(cadena + "\r\n");
					fichero.writeUTF(cadena); // Probar
					// writeBytes no incluye salto de linea por lo que hay que 
					// incluirlo en la cadena de caracteres si se desea anadir:
					// writeBytes(cadena + "\r\n");
					pos = fichero.getFilePointer();
					// posicion de la linea actual que voy a leer
					// cadena = fichero.readLine(); 
					
//					cadena = fichero.readUTF(); // lectura de la linea
					
				}
			} else 
				throw new ExceptionFicheroVacio("El fichero esta vacio");
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (UTFDataFormatException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (ExceptionFicheroVacio e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fichero!=null) {
					fichero.close();
				}
				sc.close();
			} catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}