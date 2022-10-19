package ejercicios_llamada;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Ej005_LlamadaPalindromo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// creamos objeto File al directorio donde esta ejercicios_lectura.Ej003
		File directorio = new File("E:\\DOCUMENTS\\DA2D1E-2\\Programacion\\Eclipse-workspace\\016 Multiproceso\\bin");
		Scanner sc = new Scanner(System.in);

		// El proceso a ejecutar es Ej003
		ProcessBuilder pb = new ProcessBuilder("java", "ejercicios_lectura.Ej005_ConsumoPalindromo");

		// se establece el directorio donde se encuentra el ejecutable
		pb.directory(directorio);

		System.out.printf("Directorio de trabajo: %s%n", pb.directory());

		
		// Logica
		String cadena = "";

		System.out.print("Introduce un string: ");
		cadena = sc.nextLine();

		System.out.println("String: " + cadena);
		// se ejecuta el proceso
		Process p = pb.start();

		// nombre = nombre +"/n";
		OutputStream os = p.getOutputStream();
		os.write(cadena.getBytes());
		os.flush();
		os.close();

		
		// COMPROBACION DE ERROR
		// 99 bien
		// -1 mal
		int exitVal = -1;
		try {
			exitVal = p.waitFor(); // le pide el valor del otro proceso cuando sale
			System.out.println("Valor de Salida: " + exitVal);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// obtener la salida devuelta por el proceso si exitVal==99 o exitVal==-1
		if (exitVal == 99 || exitVal == -1) {
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