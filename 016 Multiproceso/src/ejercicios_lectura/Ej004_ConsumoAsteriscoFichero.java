/*
Partiendo del ejercicio anterior, realiza los cambios necesarios para que la entrada al primer
programa se haga a partir de un fichero llamado numeros.txt en lugar de pedir por consola y las
salidas se redirijan a ficheros llamados suma.txt y error.txt
*/

package ejercicios_lectura;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej004_ConsumoAsteriscoFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		Float suma = (float) 0;
		String r = "*";

		do {
			try {

				r = br.readLine();

				//if (r.compareToIgnoreCase("*") == 0 )
				if (r.equals("*") == true) {
					System.out.println("Suma: " + suma);
				} else {
					System.out.print("Suma: " + suma + "+" + r + " = ");

					suma = sumar(r, suma);
					System.out.println(suma);
				}

			} catch (Exception e) {
				// e.printStackTrace();
				System.out.println("\nFin de ejecucion: no has introducido un numero");
				System.exit(-1);

			}
		} while (r.compareToIgnoreCase("*") != 0);
		// } while(r.equals("*") == false);

		System.exit(99); // exitVal
	}

	public static float sumar(String r, float suma) throws Exception {

		// Podemos lanzar la excepcion o capturarla aqui
		//		try {
					suma = suma + Float.parseFloat(r);
		//		} catch (Exception e) {
		//			System.out.println("No has escrito un numero");
		//			System.exit(-1);
		//		}

		return suma;
	}
}