//Escribir un programa que convierta un valor dado en grados Fahrenheit a grados Celsius.
//C = (F-32)*5/9

package ejercicios;

import java.util.Scanner;


public class Ej005 {

	public static void main(String[] args) {
		
		Float C,F;
		
		Scanner sc = new Scanner(System.in); //crear un objeto Scanner
		
		System.out.print("Dime los grados Fahrenheit: ");
		F = sc.nextFloat();
		
		C = (F-32)*5/9;
		//(5/9) no funciona porque lo trunca como entero a 0
		
		System.out.println("La temperatura en Celsius es " +C +"ºC");
		
		sc.close();
	}

}
