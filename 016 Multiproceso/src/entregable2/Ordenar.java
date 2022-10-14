/*

Partiendo del ejercicio anterior, realiza los cambios necesarios para que la salida del primer
programa sea a un fichero llamado impares.txt. Este fichero sera la entrada en el segundo
programa y la salida de este se enviara a un fichero llamado orden.

*/

package entregable2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ordenar {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		ArrayList<Integer> desordenados = new ArrayList<Integer>();
		String stringOrdenados = "";
		Integer numero, counter = 10;

		// String nombreArchivo = args[0];
		String nombreArchivo = "impares";

		String ruta = "E:\\DOCUMENTS\\DA2D1E-2\\Programacion\\Eclipse-workspace\\016 Multiproceso\\" 
					  + nombreArchivo
					  + ".txt";

		// Leyendo del file
		File file = new File(ruta);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);

		Scanner sc = new Scanner(file);

		while (sc.hasNextLine() && counter > 0) {

			try {
				numero = Integer.parseInt(br.readLine());
				desordenados.add(numero);
				counter--;

			} catch (Exception e) {
				System.out.println("Valor no numerico introducido");
				// e.printStackTrace();

				// seteando exitVal
				// System.exit(-1);
			}

		}

		Collections.sort(desordenados);

		for (Integer i : desordenados) {
			stringOrdenados += i + "\n";
			System.out.println(i);
		}
		

		System.exit(69);

	}

}
