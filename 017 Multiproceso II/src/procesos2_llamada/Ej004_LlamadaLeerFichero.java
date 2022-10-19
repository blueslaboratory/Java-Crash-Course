// Llamada a 016 Multiproceso.procesos2_lectura.Leer

package procesos2_llamada;

import java.io.File;
import java.io.IOException;

public class Ej004_LlamadaLeerFichero {
	// DEBE DE ESTAR EN LA RUTA DEL QUE CONSUME NO DEL QUE LLAMA
	// public static final String RUTA = "G:\\DOCUMENTS\\DA1D1E\\Programación\\Eclipse-workspace\\016 Multiproceso\\bin";
	public static final String RUTA = "E:\\DOCUMENTS\\DA2D1E-2\\Programacion\\Eclipse-workspace\\016 Multiproceso\\bin";
	
	public static void main(String[] args) throws IOException, InterruptedException {	
		
		// creamos los objetos File 
		// File directorio = new
		File nombre = new File(RUTA, "nombre.txt"); 
		// nombre.txt -> hay que tenerlo creado en E:\DOCUMENTS\DA2D1E-2\Programacion\Eclipse-workspace\016 Multiproceso\bin
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
		estadoProceso = p.waitFor(); // asignamos System.exit("nuestro valor");
		
		System.out.println("Estado del programa " + estadoProceso);
		
		

	}
}