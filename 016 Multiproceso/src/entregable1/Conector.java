/*

Escribe un programa Java que genera 10 numeros aleatorios impares y los escribe en la
salida estandar.

Escribe otro programa Java que recibe por la entrada estandar 10 numeros, los ordena de
menor a mayor y escribe en la salida estandar los 10 numeros ya ordenados.

Escribe un tercer programa Java que llama al primer programa, conecta la salida del primer
programa con el del segundo programa y escribe en la salida los 10 numeros generados por
el primer programa ordenados por el segundo programa.
Prueba y documenta.

*/

package entregable1;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Conector {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// String ruta = "E:\\DOCUMENTS\\DA2D1E-2\\Programacion\\Eclipse-workspace\\016 Multiproceso\\bin";
		String ruta = "/media/alejandro/MSI DATA/DOCUMENTS/DA2D1E-2/Programacion/Eclipse-workspace/016 Multiproceso/bin";

		// creamos objeto File al directorio donde esta Aleatorios
		File directorio = new File(ruta);

		String desordenados = "";
		String ordenados = "";

		// ALEATORIOS
		try {
			System.out.println("Desordenados:");
			desordenados = aleatorios(directorio);
		} catch (IOException e) {
			System.out.println("error: funcion aleatorios");
			e.printStackTrace();
		}

		// ORDENAR
		try {
			System.out.println("Ordenados:");
			ordenados = ordenar(directorio, desordenados);
			System.out.println(ordenados);
		} catch (IOException e) {
			System.out.println("error: funcion ordenados");
			e.printStackTrace();
		}
		
	}

	
	
	public static String aleatorios(File directorio) throws IOException {

		String numeros = "";

		// El proceso a ejecutar es Aleatorios
		ProcessBuilder pb = new ProcessBuilder("java", "entregable1.Aleatorios");

		// se establece el directorio donde se encuentra el ejecutable
		pb.directory(directorio);

		System.out.printf("Directorio de trabajo: %s%n", pb.directory());

		// se ejecuta el proceso
		Process p = pb.start();

		// COMPROBACION DE ERROR:
		// 69 bien
		// -1 mal

		int exitVal = -1;
		try {
			exitVal = p.waitFor();
			System.out.println("Valor de Salida: " + exitVal);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// solo entra aqui si exitVal==69
		if (exitVal == 69) {

			// obtener la salida devuelta por el proceso si exitVal==69
			try {
				InputStream is = p.getInputStream();
				int c;

				while ((c = is.read()) != -1) {
					// System.out.print((char) c);
					// en vez de un print lo metemos en un string mejor
					numeros += (char) c;
				}

				System.out.println(numeros);

				is.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return numeros;

	}

	
	
	public static String ordenar(File directorio, String numeros) throws IOException {
		
		String ordenados = "";
		
		// El proceso a ejecutar es Ordenar
		ProcessBuilder pb2 = new ProcessBuilder("java", "entregable1.Ordenar");

		// se establece el directorio donde se encuentra el ejecutable
		pb2.directory(directorio);

		System.out.printf("Directorio de trabajo: %s%n", pb2.directory());

		// se ejecuta el proceso
		Process p2 = pb2.start();

		// COMPROBACION DE ERROR:
		// 69 bien
		// -1 mal

		
		OutputStream os = p2.getOutputStream(); // recogemos el OutputStream de Ordenar
		// getOutputStream()
		// Returns the output stream connected to the normal input of the process.
		// Output to the stream is piped into the standard input of the process
		// represented by this Process object.
		os.write(numeros.getBytes()); // escribimos en el buffer, es decir el output de Ordenar
		// Writes b.length bytes from the specified byte array to this output stream.
		os.flush(); // vacia el buffer de salida
		// Flushes this output stream and forces any buffered output bytes to be written
		// out.
		os.close();

		int exitVal = -1;
		try {
			exitVal = p2.waitFor();
			System.out.println("Valor de Salida: " + exitVal);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// solo entra aqui si exitVal==69
		// obtener la salida devuelta por el proceso si exitVal==69
		if (exitVal == 69) {
			
			try {
				InputStream is = p2.getInputStream();
				int c;

				while ((c = is.read()) != -1) {
					// System.out.print((char) c);
					// en vez de un print lo metemos en un string mejor
					ordenados += (char) c;
				}

				is.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return ordenados;
	}
}
