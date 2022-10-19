//Escribe un programa que lea un numero e indique si es par o impar.


package ejercicios;

import java.util.Scanner;


public class Ej003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		Scanner sc = new Scanner(System.in);

		
		System.out.print("Dime un numero: ");
		num = sc.nextInt();
		
		if (num%2 == 0)
			System.out.println("El numero " +num +" es par"); 
		else 
			System.out.println("El numero " +num +" es impar");
			
		
		sc.close();
	}

}
