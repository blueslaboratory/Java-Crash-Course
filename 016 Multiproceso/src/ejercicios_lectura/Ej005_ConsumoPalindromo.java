// Realiza un programa Java que reciba una cadena y compruebe si es palindromo o no.
// Realiza un segundo programa Java que recoja una cadena desde la consola 
// y llame al anterior y visualice la respuesta en la consola.

package ejercicios_lectura;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej005_ConsumoPalindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
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

		System.out.println("\npalindromo: " +flag);
		
		System.exit(99); // exitVal
	}

	
	public static boolean palindromo(String cad) {
		
		boolean flag = false;
		
		String cadAux = "";
		System.out.println("\nDentro del metodo palindromo");
		System.out.println("cadena: " +cad);

		// facilito
		cadAux = new StringBuilder(cad).reverse().toString();

		// System.out.println("Cadena: " + cad);
		// System.out.println("Cadena auxiliar:" + cadAux);
		cadAux = "";

		for (int i = cad.length() - 1; i >= 0; i--) {
			cadAux += cad.charAt(i);
		}

		System.out.println("cadena auxiliar: " + cadAux);
		
		if(cad.equals(cadAux))
			flag = true;
		
		return flag;
	}

}