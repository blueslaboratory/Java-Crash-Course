//6. Hacer un programa para resolver una ecuacion de segundo grado, 
//sin tener en cuenta las soluciones complejas. 
// (-b +-(b²-4*a*c)^(1/2))/2a


package basicos1repaso;

import java.util.Scanner;


public class Ej006Ecuaciones {
	
	public static void main(String[] args) {
		
		double a, b, c, res1, res2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dada una ecuacion de la forma: ax² + bx + c = 0");
		System.out.print("Dime a: ");
		a = sc.nextDouble();
		System.out.print("Dime b: ");
		b = sc.nextDouble();
		System.out.print("Dime c: ");
		c = sc.nextDouble();
		
		if (Math.pow(b,2) > (4*a*c)) {
			res1 = (-b + Math.sqrt((Math.pow(b,2)-4*a*c)))/(2*a);
			res2 = (-b - Math.sqrt((Math.pow(b,2)-4*a*c)))/(2*a);		
			
			System.out.println("Resultado x1: " +res1);
			System.out.println("Resultado x2: " +res2);
		}
		
		else 
			System.out.println("Resultado con soluciones complejas.");
		
		
		sc.close();
	}
}
