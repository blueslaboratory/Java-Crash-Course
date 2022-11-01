// Ejercicio 003
// Crea un programa que lee desde la entrada estandar hasta escribir un *. Por cada linea
// leida debe validar si es un numero, una cadena o un *.
// Si en alguna linea hay una cadena, el programa saldra con un error -1 (System.exit()).
// Si no hay cadenas, los numeros se sumaran hasta que aparezca un *.
// Cuando lea un *, dejara de leer la entrada estandar.El programa dejara en la salida 
// estandar la suma de los numeros recibidos y devolvera que
// todo ha ido correctamente.
// Haz otro programa que le pida al usuario que vaya metiendo numeros por consola. El
// programa debe permitir meter numeros hasta que se introduzca un *. No debe validar si lo
// que se mete son numeros o no.
// Una vez se haya acabado de meter numeros, llamara al programa anterior pasando los
// datos que se han recogido de la consola y pintara la salida con la suma de los numeros
// introducidos.

package ejercicios_lectura;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej003_ConsumoAsterisco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);

		Float suma = (float) 0;
		String r = "*";
		

		do {
			try {

				r = br.readLine();
				
				//if (r.compareToIgnoreCase("*") == 0 )
				if (r.equals("*") == true) {
					System.out.println("Suma: " + suma);
				}
				else {
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

		System.exit(99); //exitVal
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
