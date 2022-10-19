//Crea un programa que pida al usuario dos numeros y muestre su division si el segundo 
//no es cero, o un mensaje de aviso en caso contrario.



package ejercicios;

import java.util.Scanner;


public class Ej004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float num1, num2;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el 1er numero: ");
		num1 = sc.nextFloat();
		System.out.print("Introduce el 2do numero: ");
		num2 = sc.nextFloat();
		
		
		if (num2 == 0) {
			System.out.print("El segundo numero es 0, no se puede dividir por 0");
			
			System.out.print("Introduce el 2do numero: ");
			num2 = sc.nextFloat();
			
			System.out.print("El resultado es " +(float)num1/num2);
		}
		
		else
			System.out.print("El resultado es " +(float)num1/num2);
		
		sc.close();
		
	}

}

