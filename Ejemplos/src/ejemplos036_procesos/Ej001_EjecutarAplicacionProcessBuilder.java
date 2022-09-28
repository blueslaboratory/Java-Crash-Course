package ejemplos036_procesos;

import java.io.IOException;

public class Ej001_EjecutarAplicacionProcessBuilder {

	static int retorno = -2;// En caso de que se haya ejecutado correctamente devolvera 0

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		ProcessBuilder pb = new ProcessBuilder("C:\\windows\\notepad.exe"); // "notas.txt"
		// pb.directory(new File("c:/Julio/"));

		Process p = null;
		p = pb.start();

		retorno = p.waitFor();
		System.out.println("Llegamos aqui cuando la ejecucion del proceso finaliza");
		System.out.println("La ejecución devuelve: " + retorno);
	}

}
