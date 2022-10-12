package entregable1;

/*

Escribe un programa Java que genera 10 numeros aleatorios impares y los escribe en la
salida estandar.

Escribe otro programa Java que recibe por la entrada estandar 10 numeros, los ordena de
menor a mayor y escribe en la salida estandar los 10 numeros ya ordenados.

Escribe un tercer programa Java que llama al primer programa, conecta la salida del primer
programa con el del segundo programa y escribe en la salida los 10 numeros generados por
el primer programa ordenados por el segundo programa.
Prueba y documenta.

*/

import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

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
			stringAleatorios += aleatorios.get(index) +"\n";
		}

		System.out.println(stringAleatorios);
		
		//seteando el exitVal = 69
		System.exit(69);
	}
}