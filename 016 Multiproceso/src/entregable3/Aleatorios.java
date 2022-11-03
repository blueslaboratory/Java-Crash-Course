/*

Partiendo del ejercicio anterior, realiza los cambios necesarios para que la salida del primer
programa sea a un fichero llamado impares.txt. Este fichero sera la entrada en el segundo
programa y la salida de este se enviara a un fichero llamado orden.

*/

package entregable3;

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
			// System.out.println("n� " + index + ": " + aleatorios.get(index));
			stringAleatorios += aleatorios.get(index) + "\n";
		}

		System.out.println(stringAleatorios);

		

		System.exit(69);
	}
}
