package ejemplos036_procesos;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Ej007_EjemploDirectorio {
	public static void main(String[] args) throws IOException {

		
		// WINDOWS: Creando otro proceso que lista el directorio C:\\Users\\W10Alex
		/*
		ProcessBuilder pb = new ProcessBuilder("CMD", "/C", "DIR");
		pb.directory(new File("C:\\Users\\W10Alex"));
		Process p = pb.start();
		*/
		
		
		// LINUX: Creando otro proceso que lista el directorio /home/alejandro/
		ProcessBuilder pb = new ProcessBuilder();
		pb.command("bash", "-c", "ls /home/alejandro/");
		Process p = pb.start();
		
		
		
		// COMPROBACION DE ERROR:
		// 0 bien
		// -1 mal

		int exitVal = -1;
		try {
			exitVal = p.waitFor();
			System.out.println("Valor de Salida: " + exitVal);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		if (exitVal == 0) {
			try {
				InputStream is = p.getInputStream();
				int c;

				// mostramos en pantalla caracter a caracter
				while ((c = is.read()) != -1)
					System.out.print((char) c);

				is.close();
				System.exit(0);

			} catch (Exception e) {
				System.exit(-1);
				e.printStackTrace();
			}
		}
	}
}
