/*

Partiendo del ejercicio anterior, realiza los cambios necesarios para que la salida del primer
programa sea a un fichero llamado impares.txt. Este fichero sera la entrada en el segundo
programa y la salida de este se enviara a un fichero llamado orden.

*/

package entregable3;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;


public class Llamar {

	
	public static final String RUTA = "/media/alejandro/MSI DATA/DOCUMENTS/DA2D1E-2/Programacion/Eclipse-workspace/016 Multiproceso/bin";
	
	public static void main(String[] args) throws IOException {
		
		//File directorio= new File("C:\\Users\\jparr\\OneDrive\\Escritorio\\M�dulo\\2� A�o\\Programacion DM\\GeneraNumeros\\bin");
		File directorio = new File(RUTA);
		//File fOut= new File(RUTA, "../ordenados.txt");
		File fOut= new File("/media/alejandro/MSI DATA/DOCUMENTS/DA2D1E-2/Programacion/Eclipse-workspace/txts/ordenados.txt");
		
		ProcessBuilder pb= new ProcessBuilder("java","entregable3.Generar");
		
		pb.directory(directorio);
		System.out.printf("Directorio de trabajo: %s%n", pb.directory());

		pb.redirectOutput(fOut);
		Process p = pb.start();
		
		
		int exitVal = -1;
		try {
			exitVal = p.waitFor();
			System.out.println("Valor de Salida: " + exitVal);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		if (exitVal == 0 || exitVal == -1) {

			// obtener la salida devuelta por el proceso
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