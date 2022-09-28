// Llamada a 016 Multiproceso.procesos2_lectura.Leer

package procesos2_llamada;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Ej004_LlamadaLeerFichero {
	public static final String RUTA = "G:\\DOCUMENTS\\DA1D1E\\Programación\\Eclipse-workspace\\016 Multiproceso\\bin";
	
	public static void main(String[] args) throws IOException, InterruptedException {	
		
		// creamos los objetos File 
		// File directorio = new
		File nombre = new File(RUTA, "nombre.txt");
		File minombre = new File(RUTA, "minombre.txt");
		File directorio = new File(RUTA);
		
		// El proceso a ejecutar
		ProcessBuilder pb = new ProcessBuilder("java", "procesos2_lectura.Ej004_LeerFichero");

		// se establece el directorio donde se encuentra el ejecutable
		pb.directory(directorio);
		System.out.printf("Directorio de trabajo: %s%n", pb.directory());

		pb.redirectInput(nombre);
		pb.redirectOutput(minombre);
		
		// se ejecuta el proceso
		Process p = pb.start();

		int estadoProceso;
		estadoProceso = p.waitFor();
		
		System.out.println("Estado del programa " + estadoProceso);

	}
}