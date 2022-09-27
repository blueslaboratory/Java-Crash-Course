package ejemplos006_repetitivas;

import java.util.Scanner;


public class BucleDoWhile_J {

	public static void main(String[] args) {
		
		int i = 0;
		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("Introducir un numero distinto de 0");
			i = teclado.nextInt();
			System.out.println("Valor de i " + i);
			//aqui el 0 te lo imprime, eso no deberia pasar
			//ver BucleDoWhile2
		} while (i != 0);
		
		teclado.close();
	}

}