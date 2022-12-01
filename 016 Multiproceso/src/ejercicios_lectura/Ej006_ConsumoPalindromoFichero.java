/*
Partiendo del ejercicio anterior, realiza los cambios necesarios para que la entrada al primer
programa se haga a partir de un fichero llamado texto.txt en lugar de pedir por consola y las
salidas se redirijan a ficheros llamados palindromo.txt y error.txt.
*/

package ejercicios_lectura;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej006_ConsumoPalindromoFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String r = "";
		boolean flag = false;

		try {
			r = br.readLine();
			flag = palindromo(r);
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("\nError: fin de ejecucion");
			System.exit(-1);
		}

		System.out.println("\npalindromo: " + flag);

		System.exit(99); // exitVal
	}

	
	public static boolean palindromo(String cad) {

		boolean flag = false;

		String cadAux = "";
		System.out.println("\nDentro del metodo palindromo");
		System.out.println("cadena: " + cad);

		// facilito
		// cadAux = new StringBuilder(cad).reverse().toString();

		// complicadito
		cadAux = "";

		for (int i = cad.length() - 1; i >= 0; i--) {
			cadAux += cad.charAt(i);
		}

		
		System.out.println("cadena auxiliar: " + cadAux);

		if (cad.equals(cadAux))
			flag = true;

		return flag;
	}

}
