package ejemplos036_procesos;

import java.io.File;
import java.io.IOException;

public class Ej011_Ejecutar {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
		// WINDOWS
		//ProcessBuilder pb = new ProcessBuilder("CMD", "/C", "DIR");
		
		
		// LINUX
		ProcessBuilder pb = new ProcessBuilder();
		pb.command("bash", "-c", "ls /home/alejandro/");
		Process p = pb.start();
		
		
		
		File fOut = new File("salida.txt");
		File fErr = new File("error.txt");
		
		// redireccioname el output de pb.command a fOut:
		pb.redirectOutput(fOut);
		pb.redirectError(fErr);
		pb.start();
	}

}
