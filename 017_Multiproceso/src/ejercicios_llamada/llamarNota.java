package ejercicios_llamada;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class llamarNota {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe el nombre de la asignatura:");
		String nombreAsignatura = sc.nextLine();

		System.out.println("Escribe el nombre del archivo:");
		String nombreArchivo = sc.nextLine();

		// creamos objeto File al directorio donde esta notas
		File directorio = new File("E:\\DOCUMENTS\\DA2D1E-2\\Programacion\\Eclipse-workspace\\016_Multiproceso\\bin");

		// El proceso a ejecutar es Ejemplo2
		ProcessBuilder pb = new ProcessBuilder("java", "paquete1.ejercicios_lectura", nombreAsignatura, nombreArchivo);

		// se establece el directorio donde se encuentra el ejecutable
		pb.directory(directorio);

		// se ejecuta el proceso
		Process p = pb.start();


		// COMPROBACION DE ERROR - 0 bien - 1 mal
		int exitVal = -1;
		try {
			exitVal = p.waitFor();
			System.out.println("Valor de Salida: " + exitVal);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		try {
			InputStream is = p.getInputStream();
			// mostramos en pantalla caracter a caracter
			int c;
			while ((c = is.read()) != -1)
				System.out.print((char) c);
			// is.close();
			System.exit(0);

		} catch (Exception e) {
			System.exit(-1);
			e.printStackTrace();
		}

		sc.close();
	}
}