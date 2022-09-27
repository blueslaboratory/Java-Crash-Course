//Pide al usuario dos numeros y muestra la "distancia" entre ellos 
//(el valor absoluto de su diferencia, de modo que el resultado sea siempre positivo).

package ejercicios;

import java.util.Scanner;


public class Ej011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float num1, num2;
		
		Scanner sc = new Scanner(System.in); //crear un objeto Scanner
		
		
		System.out.print("Dime el numero 1: ");
		num1 = sc.nextFloat();
		
		System.out.print("Dime el numero 2: ");
		num2 = sc.nextFloat();
		
		System.out.print("Distancia: " +Math.abs(num1-num2));
		
		sc.close();
	}

}
