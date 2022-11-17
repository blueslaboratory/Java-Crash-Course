package ejemplos036_procesos;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Ej007_LlamarEjemploDirectorio {
	public static void main(String[] args) throws IOException, InterruptedException {

		String rutaWindows = "E:\\DOCUMENTS\\DA2D1E-2\\Programacion\\Eclipse-workspace\\Ejemplos\\bin";
		String rutaLinux = "/media/alejandro/MSI DATA/DOCUMENTS/DA2D1E-2/Programacion/Eclipse-workspace/Ejemplos/bin";
		
		// creamos objeto File al directorio donde esta Ejemplo2
		// File directorio = new
		// File("C:\\Users\\jhorn\\eclipse-workspace\\Ejemplo1\\bin");
		
		// G:\\DOCUMENTS\\DA1D1E\\Programaci�n\\Eclipse-workspace\\Ejemplos\\bin
		// File directorio = new File(rutaWindows);
		File directorio = new File(rutaLinux);

		// El proceso a ejecutar es ejemplos036_procesos.Ej007_EjemploDirectorio
		ProcessBuilder pb = new ProcessBuilder("java", "ejemplos036_procesos.Ej007_EjemploDirectorio");

		// se establece el directorio donde se encuentra el ejecutable
		pb.directory(directorio);

		System.out.printf("Directorio de trabajo: %s%n", pb.directory());

		// se ejecuta el proceso
		Process p = pb.start();

		// COMPROBACION DE ERROR:
		//   0 bien 
		//  -1 mal
		
		int exitVal = -1;
		try {
			exitVal = p.waitFor();
			System.out.println("Valor de Salida: " + exitVal);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// solo entra aqui si exitVal==0
		if (exitVal == 0) {

			// 2. obtener la salida devuelta por el proceso si exitVal==0
			try {
				InputStream is = p.getInputStream();
				int c;
				
				// 3. pintamos la salida como podriamos meterla en un fichero 
				while ((c = is.read()) != -1)
					System.out.print((char) c);
				
				is.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
