/*
Partiendo del ejercicio anterior, realiza los cambios necesarios para que la entrada al primer
programa se haga a partir de un fichero llamado numeros.txt en lugar de pedir por consola y las
salidas se redirijan a ficheros llamados suma.txt y error.txt
*/

package ejercicios_llamada;

import java.io.File;
import java.io.IOException;

public class Ej004_LlamadaAsteriscoFichero {

	// TIENE QUE ESTAR EN LA RUTA DEL QUE CONSUME NO DEL QUE LLAMA
	public static final String RUTA = "E:\\DOCUMENTS\\DA2D1E-2\\Programacion\\Eclipse-workspace\\016 Multiproceso\\bin";

	public static void main(String[] args) throws IOException, InterruptedException {

		// creamos los objetos File
		// entrada datos consumo
		File fichero = new File(RUTA, "numeros.txt");
		// entrada datos salida
		File salida = new File(RUTA, "suma.txt");
		// entrada datos errores
		File error = new File(RUTA, "error.txt");
		// dato.txt -> hay que tenerlo creado en E:\DOCUMENTS\DA2D1E - 2\Programacion\Eclipse-workspace\016 Multiproceso\bin
		File directorio = new File(RUTA);

		// El proceso a ejecutar
		ProcessBuilder pb = new ProcessBuilder("java", "ejercicios_lectura.Ej004_ConsumoAsteriscoFichero");

		// se establece el directorio donde se encuentra el ejecutable
		pb.directory(directorio);
		System.out.printf("Directorio de trabajo: %s%n", pb.directory());

		pb.redirectInput(fichero);
		pb.redirectOutput(salida);
		pb.redirectError(error);

		// se ejecuta el proceso
		Process p = pb.start();

		int estadoProceso;
		estadoProceso = p.waitFor(); // System.exit(estadoProceso);

		System.out.println("Estado del programa " + estadoProceso);

	}

}
