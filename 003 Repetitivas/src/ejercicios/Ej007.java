//################################################################################
//Realizar una algoritmo que muestre la tabla de multiplicar de un numero 
//introducido por teclado.

package ejercicios;

import java.util.Scanner;


public class Ej007 {
	
	public static void main(String[] args) {
		
		int num, cont;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime el numero: ");
		num = sc.nextInt();
		
		
		
		//FOR
		System.out.println("\nCON FOR");
		for (cont=1; cont<=10; cont++)
			System.out.println(num +" * " +cont +" = " +num*cont);
		
		
		//WHILE
		System.out.println("\nCON WHILE");
		cont = 1;
		while (cont<=10) {
			System.out.println(num +" * " +cont +" = " +num*cont);
			cont++;
		}
		
		
		//DO-WHILE
		System.out.println("\nCON DO-WHILE");
		cont = 1;
		do {
			System.out.println(num +" * " +cont +" = " +num*cont);
			cont++;
		} while (cont<=10);
		
		
		
		sc.close();
	}
}
