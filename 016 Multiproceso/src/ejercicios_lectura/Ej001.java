/*
Escribe un programa que reciba un argumento y que retorne (System.exit()) los siguientes
valores:
	- Devolvera -1 si el argumento viene vacio
	- Devolvera -2 si el argumento no es un entero
	- Devolvera -3 si el argumento es un entero negativo
	- Devolvera 0 si el argumento es un entero positivo
Escribe otro programa que pida por consola que se introduzca un numero entero positivo.
Con el dato introducido llamara al programa anterior y le confirmara al usuario si el dato
introducido es correcto.
Prueba y documenta todas las posibles respuestas.
*/

package ejercicios_lectura;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ej001 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Leyendo numero del buffer");
		String numero = br.readLine();
		
		if (numero == null) {
			System.exit(-1); // seteando el exitVal
		}
		else {
			try {
				Integer n = Integer.parseInt(numero);
				
				if(n<0)
					System.exit(-3);
				else
					System.exit(0);
				
			} catch (Exception e) {
				System.out.println("No has escrito un entero");
				System.exit(-2);
			}
		}

	}

}
