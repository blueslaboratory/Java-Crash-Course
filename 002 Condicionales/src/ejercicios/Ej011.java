//Programa que lea 3 datos de entrada A, B y C. Estos corresponden a las dimensiones de los lados de un triangulo. 
//El programa debe determinar que tipo de triangulo es, teniendo en cuenta los siguiente:
//Si se cumple Pitagoras entonces es triangulo rectangulo
//Si solo dos lados del triangulo son iguales entonces es isosceles.
//Si los 3 lados son iguales entonces es equilatero.
//Si no se cumple ninguna de las condiciones anteriores, es escaleno.


package ejercicios;

import java.util.Scanner;


public class Ej011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float a,b,c;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime los lados del triangulo");
		System.out.print("Dime a: ");
		a = sc.nextFloat();
		System.out.print("Dime b: ");
		b = sc.nextFloat();
		System.out.print("Dime c: ");
		c = sc.nextFloat();
		
		
		if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)	||	
			Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2)	||	
			Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2))
			System.out.print("El triangulo es rectangulo");
		
		else
			System.out.print("El triangulo no es rectangulo");
		

		//puede ser rectangulo e isosceles, de ahi que haya 2 bloques
		
		if (a == b && b!=c	|| a == c && c!=b	||	b == c && c!=a)
			System.out.print("El triangulo es isosceles");
		
		else if (a == b && b == c)
			System.out.print("El triangulo es equilatero");
		
		else
			System.out.print("El triangulo es escaleno");
			
		
		sc.close();
		
	}

}
