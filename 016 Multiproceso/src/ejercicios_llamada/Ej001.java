package ejercicios_llamada;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Ej001 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// creamos objeto File al directorio donde esta Ejemplo2
		// File directorio = new
		File directorio = new File("G:\\DOCUMENTS\\DA1D1E\\Programación\\Eclipse-workspace\\016 Multiproceso\\bin");
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el numero: ");
		String numero = sc.nextLine();

		// El proceso a ejecutar es Ejemplo2
		ProcessBuilder pb = new ProcessBuilder("java", "ejercicios_lectura.Ej001_Leer");

		// se establece el directorio donde se encuentra el ejecutable
		pb.directory(directorio);

		System.out.printf("Directorio de trabajo: %s%n", pb.directory());

		// se ejecuta el proceso
		Process p = pb.start();

		// nombre = nombre +"/n";
		OutputStream os = p.getOutputStream();
		os.write(numero.getBytes());
		os.flush();
		os.close();

		// COMPROBACION DE ERROR - 0 bien - 1 mal
		int exitVal = -1;
		try {
			exitVal = p.waitFor(); // le pide el valor del otro proceso cuando sale
			System.out.println("Valor de Salida: " + exitVal);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		if (exitVal == 1) {

			// obtener la salida devuelta por el proceso
			try {
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
