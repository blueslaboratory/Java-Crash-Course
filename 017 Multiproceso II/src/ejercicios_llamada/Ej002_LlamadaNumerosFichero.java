// Ejercicio 002
// Partiendo del ejercicio anterior, realiza los cambios necesarios para que la entrada
// al primer programa se haga a partir de un fichero llamado dato.txt en lugar de 
// recibirlo por argumento.

package ejercicios_llamada;

import java.io.File;
import java.io.IOException;

public class Ej002_LlamadaNumerosFichero {

	// TIENE QUE ESTAR EN LA RUTA DEL QUE CONSUME NO DEL QUE LLAMA
	// public static final String RUTA = "E:\\DOCUMENTS\\DA2D1E-2\\Programacion\\Eclipse-workspace\\016 Multiproceso\\bin";
	public static final String RUTA = "/media/alejandro/MSI DATA/DOCUMENTS/DA2D1E-2/Programacion/Eclipse-workspace/016 Multiproceso/bin";

	
	public static void main(String[] args) throws IOException, InterruptedException {

		// creamos los objetos File
		// File directorio = new
		File fichero = new File(RUTA, "dato.txt");
		// dato.txt -> hay que tenerlo creado en el directorio de ruta:
		// 		E:\DOCUMENTS\DA2D1E-2\Programacion\Eclipse-workspace\016 Multiproceso\bin
		//		/media/alejandro/MSI DATA/DOCUMENTS/DA2D1E-2/Programacion/Eclipse-workspace/016 Multiproceso/bin
		File directorio = new File(RUTA);

		// El proceso a ejecutar
		ProcessBuilder pb = new ProcessBuilder("java", "ejercicios_lectura.Ej002_ConsumoNumerosFichero");

		// se establece el directorio donde se encuentra el ejecutable
		pb.directory(directorio);
		System.out.printf("Directorio de trabajo: %s%n", pb.directory());

		pb.redirectInput(fichero);
		
		// se ejecuta el proceso
		Process p = pb.start();

		int estadoProceso;
		estadoProceso = p.waitFor();
		

		System.out.println("Estado del programa " + estadoProceso);

	}

}
