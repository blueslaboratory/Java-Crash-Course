// A partir del paquete ejemplos036_procesos se corresponde a la asignatura de 
// Programacion de Servicios y Procesos

package ejemplos036_procesos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej001_EjecutarAplicacionProcessBuilder {

	static int retorno = -2;// En caso de que se haya ejecutado correctamente devolvera 0

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		/*
		ProcessBuilder
		This class is used to create operating system processes.

		Each ProcessBuilder instance manages a collection of process attributes. 
		The start() method creates a new Process instance with those attributes. 
		The start() method can be invoked repeatedly from the same instance to create new subprocesses 
		with identical or related attributes.
		*/
		
		
		
		// WINDOWS
		/*
		ProcessBuilder pbWindows = new ProcessBuilder("C:\\windows\\notepad.exe"); // "notas.txt"
		// pb.directory(new File("c:/Julio/"));

		Process p = pbWindows.start();

		// Con esta linea, main no finaliza hasta que se cierre notepad.exe
		retorno = p.waitFor();
		
		System.out.println("Llegamos aqui cuando la ejecucion del proceso finaliza");
		System.out.println("La ejecucion devuelve: " + retorno);
		*/
		
		
		
		// LINUX
		ProcessBuilder pbLinux = new ProcessBuilder();

		pbLinux.command("cal", "2023", "-m 2");

		Process p = pbLinux.start(); // abre la terminal
		// Con esta linea, main no finaliza hasta que se cierre  la terminal:
		retorno = p.waitFor();

		InputStreamReader isr = new InputStreamReader(p.getInputStream());

		// Try con recursos
		try (BufferedReader br = new BufferedReader(isr)) {

			String line;

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		}

		System.out.println("Llegamos aqui cuando la ejecucion del proceso finaliza");
		System.out.println("La ejecucion devuelve: " + retorno);
		
		
		
		// LINUX ORIGIN
		// https://zetcode.com/java/processbuilder/
		/*
		var processBuilder = new ProcessBuilder();

        processBuilder.command("cal", "2022", "-m 2");

        var process = processBuilder.start();

        try (var reader = new BufferedReader(
            new InputStreamReader(process.getInputStream()))) {

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        }
        */
	}
}