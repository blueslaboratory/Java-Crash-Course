package ejemplos036_procesos;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Ej009_Pedir {
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("Escribe un numero:");
		Scanner sc = new Scanner(System.in);

		// entrada de una cadena
		String respuesta = sc.nextLine();

		// creamos objeto File al directorio donde esta ejemplos036_procesos.Ej009_Calcular
		// G:\\DOCUMENTS\\DA1D1E\\Programaci�n\\Eclipse-workspace\\Ejemplos\
		File directorioWindows = new File("E:\\DOCUMENTS\\DA2D1E-2\\Programacion\\Eclipse-workspace\\Ejemplos\\bin");
		File directorioLinux = new File("/media/alejandro/MSI DATA/DOCUMENTS/DA2D1E-2/Programacion/Eclipse-workspace/Ejemplos/bin");

		// El proceso a ejecutar es Ejemplo2
		ProcessBuilder pb = new ProcessBuilder("java", "ejemplos036_procesos.Ej009_CalcularParImpar");

		// se establece el directorio donde se encuentra el ejecutable
		pb.directory(directorioLinux);

		// se ejecuta el proceso
		Process p = pb.start();
		
		
		respuesta = respuesta + "\n";
		// escribimos en el buffer, es decir escribimos en el input el output de Ej009_Calcular
		// REDDIT: You write to an OutputStream, so use that to give the process your input.
		OutputStream os = p.getOutputStream();
		// getOutputStream()
		// Returns the output stream connected to the normal input of the process. 
		// Output to the stream is piped into the standard input of the process 
		// represented by this Process object.
		os.write(respuesta.getBytes());
		// Writes b.length bytes from the specified byte array to this output stream.
		os.flush(); // vacia el buffer de salida
		// Flushes this output stream and forces any buffered output bytes to be written out.

		
		// COMPROBACION DE ERROR 
		// 69 bien
		// -1 mal
		int exitVal = -1;
		try {
			exitVal = p.waitFor();
			System.out.println("Valor de Salida: " + exitVal);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// obtener la salida devuelta por el proceso si exitVal==69
		if (exitVal == 69) {
			try {
				// REDDIT: You can only read from an InputStream, so use that to catch 
				// the output of your process.
				InputStream is = p.getInputStream();
				int c;
				while ((c = is.read()) != -1)
					System.out.print((char) c);
				is.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
