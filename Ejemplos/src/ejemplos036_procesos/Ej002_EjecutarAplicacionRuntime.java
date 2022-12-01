package ejemplos036_procesos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej002_EjecutarAplicacionRuntime {

	/**
	 * @param args
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		
		/*
		Every Java application has a single instance of class Runtime that allows the application to 
		interface with the environment in which the application is running. The current runtime can 
		be obtained from the getRuntime method. An application cannot create its own instance of this 
		class.
		*/
		
		
		
		// WINDOWS 
		/*
		Runtime entorno = Runtime.getRuntime();

		Process p1, p2;
		p1 = entorno.exec("C:\\Windows\\notepad.exe");
		// Desde la ventana de DOS arrancamos otra venta de DOS:
		p2 = entorno.exec("cmd /c start"); 

		// Con esta linea, main no finaliza hasta que se cierre notepad.exe
		p1.waitFor();
		
		System.out.println(p1.exitValue());
		*/
		
		
		
		// LINUX
		Runtime entorno = Runtime.getRuntime();

		Process p;
		
		// Run a shell command:
		p = entorno.exec("ls /home/alejandro");
		
		// run a shell script:
		// p = entorno.exec("/home/alejandro/scripts/hello.sh"); 
		
		// Con esta linea, main no finaliza hasta que se cierre la consola
		int exitVal = p.waitFor();
		
		StringBuilder sb = new StringBuilder();
		InputStreamReader isr = new InputStreamReader(p.getInputStream());
		BufferedReader br = new BufferedReader(isr);

		String line;
		
		while ((line = br.readLine()) != null) {
			sb.append(line + "\n");
		}

		
		if (exitVal == 0) {
			System.out.println("Success!");
			System.out.println(sb);
			System.out.println("exitValue: " +p.exitValue());
			System.exit(0);
		} else {
			//abnormal...
			System.out.println("Failure :(");
			System.out.println("exitValue: " +p.exitValue());
		}
		
	}

}