package procesos2_llamada;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Ej002_LlamarPintarNombre {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// creamos objeto File al directorio donde esta Ej002_PintarNombre
		// File directorio = new
		// File directorioWindows = new File("E:\\DOCUMENTS\\DA2D1E-2\\Programacion\\Eclipse-workspace\\016 Multiproceso\\bin");
		File directorioLinux = new File("/media/alejandro/MSI DATA/DOCUMENTS/DA2D1E-2/Programacion/Eclipse-workspace/016 Multiproceso/bin");
				
		// El proceso a ejecutar es Ejemplo2
		// El 3er parametro es de tipo Strin[] args y lo recibe el main
		ProcessBuilder pb = new ProcessBuilder("java", "procesos2_lectura.Ej002_PintarNombre", "Pepito");

		// se establece el directorio donde se encuentra el ejecutable
		pb.directory(directorioLinux);

		System.out.printf("Directorio de trabajo: %s%n", pb.directory());

		// se ejecuta el proceso
		Process p = pb.start();

		// COMPROBACION DE ERROR:
		// 777 bien 
		// -1 mal
		int exitVal = -1;
		
		try {
			exitVal = p.waitFor();
			System.out.println("Valor de Salida: " + exitVal);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// obtener la salida devuelta por el proceso si exitVal==777
		// ((en LINUX pasa una cosa rara que devuelve exitVal=9 y funciona con este valor))
		// if (exitVal == 9) {
		if (exitVal == 777) {
			try {
				InputStream is = p.getInputStream();
				int c;
				while ((c = is.read()) != -1)
					System.out.print((char) c);
				is.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
