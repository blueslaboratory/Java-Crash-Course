//Escribir un programa que lea un año e indique si es bisiesto. 
//Nota: un año es bisiesto si es un numero divisible por 4, pero 
//no si es divisible por 100, excepto que tambien sea divisible por 400.


package ejercicios;

import java.util.Scanner;

public class Ej012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Dime el year: ");
		a = sc.nextInt();
		
		
		if (a%4==0 && a%100!=0	|| a%400==0)
			System.out.println("Es bisiesto");
		else
			System.out.println("No es bisiesto");
		
		
		// CON OPERADOR CONDICIONAL
		String bisiesto;
		
		bisiesto = (a%4==0 && a%100!=0	|| a%400==0) ? "Es bisiesto" : "No es bisiesto";
		System.out.println(bisiesto);
		
		
		sc.close();
	}

}
