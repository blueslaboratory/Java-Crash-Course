//Dadas dos variables numericas A y B, que el usuario debe teclear, 
//se pide realizar un algoritmo que intercambie los valores de ambas variables 
//y muestre cuanto valen al final las dos variables.


package repaso;

import java.util.Scanner;


public class Ej015Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float a,b,aux;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce valor de la variable A: ");
		a = sc.nextFloat();
		
		System.out.print("Introduce valor de la variable B: ");
		b = sc.nextFloat();
		
		aux = a;
		a = b;
		b = aux;
		
		System.out.println("Nuevo valor de A: " +a);
		System.out.println("Nuevo valor de B: " +b);
		
		sc.close();
	}

}
