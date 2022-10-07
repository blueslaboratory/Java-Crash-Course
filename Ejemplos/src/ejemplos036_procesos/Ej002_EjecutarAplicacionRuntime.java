package ejemplos036_procesos;

import java.io.IOException;

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
		be obtained from the getRuntime method. An application cannot create its own instance of this class.
		*/
		
		Runtime entorno = Runtime.getRuntime();

		Process p1, p2;
		p1 = entorno.exec("C:\\Windows\\notepad.exe");
		p2 = entorno.exec("cmd /c start"); // Desde la ventana de DOS arrancamos otra venta de DOS

		// Con esta linea, main no finaliza hasta que se cierre notepad.exe
		p1.waitFor();
		
		System.out.println(p1.exitValue());

	}

}