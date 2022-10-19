// Llamada a 016 Multiproceso.procesos2_lectura.Leer

package procesos2_llamada;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Ej003_LlamadaLeer {
	public static void main(String[] args) throws IOException, InterruptedException {

		// creamos objeto File al directorio donde esta Ejemplo2
		// File directorio = new
		// File directorio = new File("G:\\DOCUMENTS\\DA1D1E\\Programación\\Eclipse-workspace\\016 Multiproceso\\bin");
		File directorio = new File("E:\\DOCUMENTS\\DA2D1E-2\\Programacion\\Eclipse-workspace\\016 Multiproceso\\bin");
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el nombre: ");
		String nombre = sc.nextLine();

		// El proceso a ejecutar es Ejemplo2
		ProcessBuilder pb = new ProcessBuilder("java", "procesos2_lectura.Ej003_Leer");

		// se establece el directorio donde se encuentra el ejecutable
		pb.directory(directorio);

		System.out.printf("Directorio de trabajo: %s%n", pb.directory());
		
		// se ejecuta el proceso
		Process p = pb.start();
		
		// escribimos el buffer de Ej003_LlamadaLeer
		OutputStream os = p.getOutputStream();
		os.write(nombre.getBytes());
		os.flush();
		os.close();

		// COMPROBACION DE ERROR 
		// 99 bien 
		// -1 mal
		int exitVal = -1;
		
		try {
			exitVal = p.waitFor();
			System.out.println("Valor de Salida: " + exitVal);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// obtener la salida devuelta por el proceso si exitVal=99
		if (exitVal == 99) {
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