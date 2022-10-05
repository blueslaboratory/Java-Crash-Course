// A partir del paquete ejemplos036_procesos se corresponde a la asignatura de Programacion de Servicios y Procesos

package ejemplos036_procesos;

import java.io.IOException;

public class Ej001_EjecutarAplicacionProcessBuilder {

	static int retorno = -2;// En caso de que se haya ejecutado correctamente devolvera 0

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		/*
		ProcessBuilder
		This class is used to create operating system processes.

		Each ProcessBuilder instance manages a collection of process attributes. 
		The start() method creates a new Process instance with those attributes. 
		The start() method can be invoked repeatedly from the same instance to create new subprocesses with identical or related attributes.
		*/
		
		ProcessBuilder pb = new ProcessBuilder("C:\\windows\\notepad.exe"); // "notas.txt"
		// pb.directory(new File("c:/Julio/"));

		Process p = null;
		p = pb.start();

		retorno = p.waitFor();
		
		System.out.println("Llegamos aqui cuando la ejecucion del proceso finaliza");
		System.out.println("La ejecucion devuelve: " + retorno);
		
	}

}
