package entregable3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Random;

public class Generar {

	public static void main(String[] args) throws IOException {
		// File directorio = new File("C:\\Users\\jparr\\OneDrive\\Escritorio\\M�dulo\\2� A�o\\Programacion DM\\OrdenaNumeros\\bin");
		File directorio = new File("/media/alejandro/MSI DATA/DOCUMENTS/DA2D1E-2/Programacion/Eclipse-workspace/016 Multiproceso/bin");
		File fTxt = new File("../impares.txt");

		Random r = new Random();
		int numero;

		
		// escribimos los aleatorios en imparest.txt
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(fTxt))) {
			for (int i = 0; i < 10; i++) {
				
				numero = r.nextInt(100);
				while (numero % 2 == 0) {
					numero = r.nextInt(100);
				}

				bw.write(numero + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		ProcessBuilder pb = new ProcessBuilder("java", "entregable3.Ordenar");
		
		pb.directory(directorio);
		pb.redirectInput(fTxt);
		Process p = pb.start();

		
		int exitVal = -1;
		try {
			exitVal = p.waitFor();
			System.out.println("NUMEROS ORDENADOS DE MENOR A MAYOR");
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

		// NUNCA SE VA A PRODUCIR EL -1 PORQUE ES ALGO QUE GENERAMOS 
		// Y NO INTRODUCIMOS POR TECLADO

	}

}
