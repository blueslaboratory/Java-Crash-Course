/*

Partiendo del ejercicio anterior, realiza los cambios necesarios para que la salida del primer
programa sea a un fichero llamado impares.txt. Este fichero sera la entrada en el segundo
programa y la salida de este se enviara a un fichero llamado orden.

*/

package entregable2;

import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Aleatorios {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		ArrayList<Integer> aleatorios = new ArrayList<Integer>();
		String stringAleatorios = "";

		// En general, para conseguir un numero entero entre [N, M]
		// con N < M y ambos incluidos, debemos usar esta formula:
		// int valorEntero = Math.floor(Math.random()*(M-N+1)+N);
		// Valor entre M y N, ambos incluidos.

		int x = 0, counter = 0;

		while (counter < 10) {
			x = (int) Math.floor(Math.random() * (10000 - 0 + 1) + 0);

			if (x % 2 != 0) {
				aleatorios.add(x);
				counter++;
			}
		}

		for (int index = 0; index < counter; index++) {
			// System.out.println("nº " + index + ": " + aleatorios.get(index));
			stringAleatorios += aleatorios.get(index) + "\n";
		}

		System.out.println(stringAleatorios);

		// Metiendolo en un file
		// creando el archivo impares.txt
		try {
			File fileImpares = new File("impares.txt");
			if (fileImpares.createNewFile()) {
				System.out.println("Exito al crear el archivo: " + fileImpares.getName());
			} else {
				System.out.println("Ya existe el archivo");
			}
		} catch (IOException e) {
			System.out.println("Error al crear el archivo");
			e.printStackTrace();
		}

		// escribiendo en el file
		try {
			FileWriter fw = new FileWriter("impares.txt", false); // overwrites file
			fw.write(stringAleatorios);
			fw.close();
			System.out.println("Exito al escribir en el archivo");
		} catch (IOException e) {
			System.out.println("Error al escribir en el archivo");
			e.printStackTrace();
		}

		System.exit(69);
	}
}
