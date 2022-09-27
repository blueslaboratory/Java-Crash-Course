//Realiza un algoritmo que calcule la potencia, para ello pide por teclado la base y el exponente. 
//Pueden ocurrir tres cosas:
//El exponente sea positivo, solo tienes que imprimir la potencia.
//El exponente sea 0, el resultado es 1.
//El exponente sea negativo, el resultado es 1/potencia con el exponente positivo.


package ejercicios;

import java.util.Scanner;


public class Ej007 {
	
	public static void main(String[] args) {
		
		float num1, num2;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Introduce la base: ");
		num1 = sc.nextFloat();
		System.out.print("Introduce el exponente: ");
		num2 = sc.nextFloat();
		
		
		System.out.println("La potencia es " +Math.pow(num1, num2));

		
		sc.close();
		
		
		
	}

}
