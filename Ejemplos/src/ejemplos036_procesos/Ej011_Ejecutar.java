package ejemplos036_procesos;

import java.io.File;
import java.io.IOException;

public class Ej011_Ejecutar {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ProcessBuilder pb = new ProcessBuilder("CMD", "/C", "DIR");
		
		File fOut = new File("salida.txt");
		File fErr = new File("error.txt");
		
		pb.redirectOutput(fOut);
		pb.redirectError(fErr);
		pb.start();
	}

}
