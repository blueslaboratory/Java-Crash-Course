package ejemplos036_procesos;

import java.io.File;
import java.io.IOException;

public class Ej011_EjecutarFicheroBat {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		// WINDOWS 
		// ProcessBuilder pb = new ProcessBuilder("CMD");
		
		
		// LINUX
		ProcessBuilder pb = new ProcessBuilder();
		// "consola bash", "comando -c", "comando a ejecutar"
		pb.command("bash", "-c", "ls /home");
		Process p = pb.start();
		
		
		
		File fBat = new File("fichero.bat");
		File fOut = new File("salida.txt");
		File fErr = new File("error.txt");
		
		
		// Coger los datos de fBat y meterlos en el buffer
		pb.redirectInput(fBat);
		// Coger los datos del buffer y meterlos en el fichero fOut
		pb.redirectOutput(fOut);
		// Coger los datos de error y meterlos en el fichero fErr
		pb.redirectError(fErr);
		
		
		pb.start();
	}

}
