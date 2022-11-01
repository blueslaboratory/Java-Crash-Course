/*

Partiendo del ejercicio anterior, realiza los cambios necesarios para que la salida del primer
programa sea a un fichero llamado impares.txt. Este fichero sera la entrada en el segundo
programa y la salida de este se enviara a un fichero llamado orden.

*/

package entregable2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Conector {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//String ruta = "E:\\DOCUMENTS\\DA2D1E-2\\Programacion\\Eclipse-workspace\\016 Multiproceso\\bin";
		String ruta = "/media/alejandro/MSI DATA/DOCUMENTS/DA2D1E-2/Programacion/Eclipse-workspace/016 Multiproceso/bin";
		
		// creamos objeto File al directorio donde esta Aleatorios
		File directorio = new File(ruta);

		String desordenados = "";
		String ordenados = "";

		
		/**********************************/
		// ALEATORIOS
		try {
			System.out.println("Desordenados:");
			desordenados = aleatorios(directorio);
		} catch (IOException e) {
			System.out.println("error: funcion aleatorios");
			e.printStackTrace();
		}
		
		escribirFichero("impares.txt", desordenados);

	
		/**********************************/
		// ORDENAR
		try {
			System.out.println("Ordenados:");
			ordenados = ordenar(directorio, desordenados);
			System.out.println(ordenados);
		} catch (IOException e) {
			System.out.println("error: funcion ordenados");
			e.printStackTrace();
		}
		
		escribirFichero("ordenados.txt", ordenados);
	}

	
	public static void escribirFichero(String nombreFichero, String datos) {
		// Metiendolo en un file
		// creando el archivo nombreFichero.txt
		try {
			File fileOrdenados = new File(nombreFichero);
			if (fileOrdenados.createNewFile()) {
				System.out.println("Exito al crear el archivo: " + fileOrdenados.getName());
			} else {
				System.out.println("Ya existe el archivo");
			}
		} catch (IOException e) {
			System.out.println("Error al crear el archivo");
			e.printStackTrace();
		}

		// escribiendo en el file datos
		try {
			FileWriter fw = new FileWriter(nombreFichero, false); // overwrites file
			fw.write(datos);
			fw.close();
			System.out.println("Exito al escribir en el archivo");
		} catch (IOException e) {
			System.out.println("Error al escribir en el archivo");
			e.printStackTrace();
		}
	}
	
	public static String aleatorios(File directorio) throws IOException {

		String numeros = "";

		// El proceso a ejecutar es Aleatorios
		ProcessBuilder pb = new ProcessBuilder("java", "entregable2.Aleatorios");

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
		ProcessBuilder pb2 = new ProcessBuilder("java", "entregable2.Ordenar");

		// se establece el directorio donde se encuentra el ejecutable
		pb2.directory(directorio);

		System.out.printf("Directorio de trabajo: %s%n", pb2.directory());

		// se ejecuta el proceso
		Process p2 = pb2.start();

		// COMPROBACION DE ERROR:
		// 69 bien
		// -1 mal

		// escribimos en el buffer, es decir el output de Ordenar
		OutputStream os = p2.getOutputStream();
		// getOutputStream()
		// Returns the output stream connected to the normal input of the process.
		// Output to the stream is piped into the standard input of the process
		// represented by this Process object.
		os.write(numeros.getBytes());
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
