//Algoritmo que pida un numero y diga si es positivo, negativo o 0.


package ejercicios;

import java.util.Scanner;


public class Ej002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float num;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el numero: ");
		num = sc.nextFloat();
		
		if (num > 0)
			System.out.print("El numero " +num +" es positivo");
		else if (num < 0)
			System.out.print("El numero " +num +" es negativo");
		else
			System.out.print("El numero " +num +" es cero");
		
		sc.close();
	}

}