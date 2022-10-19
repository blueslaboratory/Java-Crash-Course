//Algoritmo que pida dos numeros e indique si el primero es mayor que el segundo o no.

package ejercicios;

import java.util.Scanner;


public class Ej001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		float a,b;

		
		System.out.print("Introduce el 1er numero: ");
		a = sc.nextFloat();
		System.out.print("Introduce el 2do numero: ");
		b = sc.nextFloat();
		
		
		if (a>b)
			System.out.println(a + " es mayor que " +b);
		else if (a<b)
			System.out.println(b + " es mayor que " +a);
		else
			System.out.println(b + " es igual que " +a);
		
		
		sc.close();
	}

}
