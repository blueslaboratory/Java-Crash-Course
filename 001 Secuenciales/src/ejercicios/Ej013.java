//Realizar un algoritmo que lea un numero y que muestre su raiz cuadrada y su raiz cubica.
//PSeInt no tiene ninguna funcion predefinida que permita calcular la raiz cubica,
//¿como se puede calcular?

package ejercicios;

import java.util.Scanner;


public class Ej013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime el numero: ");
		num = sc.nextFloat();
		
		System.out.println("Raiz cuadrada: " + Math.pow(num, 0.5));
		System.out.println("Raiz cuadrada: " + Math.sqrt(num));
		System.out.println("Raiz cubica: " + Math.pow(num, (float)1/3));
		//1/3 no me lo coge a menos que haga un casting o ponga 1.0/3
		
		sc.close();

	}

}
