//2. Haz un programa en Java que muestre si dos números son o no amigos. 
//Los números se pedirán por teclado. Explicación: Se dice que dos números 
//son amigos si la suma de los divisores del primero (excluido el propio 
//número) es el segundo número y viceversa. 
//
//Ej: Los números 220 y 284 son amigos 
//220 = 1+2+4+5+10+11+20+22+44+55+110 = 284 
//284 = 1+2+4+71+142 = 220

//Intentos hasta resolver el ejercicio = 1;

package basicos3repaso;

import java.util.Scanner;

public class Ej002Amigos {
	
	public static void main(String[] args) {
		
		int num1, num2;
		int acum1, acum2;
		int i, divisor;
		Scanner sc = new Scanner(System.in);
		
		acum1=0;
		acum2=0;
		
		System.out.print("Numero 1: ");
		num1 = Integer.parseInt(sc.nextLine());

		System.out.print("Numero 2: ");
		num2 = Integer.parseInt(sc.nextLine());
		
		System.out.println("Divisores numero 1: ");
		for(i=1; i<num1; i++) {
			if (num1%i == 0) {
				divisor = i;
				acum1 += divisor;
				System.out.println(+divisor);
			}
				
		}
		
		System.out.println("Divisores numero 2: ");
		for(i=1; i<num1; i++) {
			if (num2%i == 0) {
				divisor = i;
				acum2 += divisor;
				System.out.println(+divisor);
				}
		}
		
		
		if (acum1==num2 && acum2==num1) {
			System.out.println(+num1 +" y " +num2 +" son amigos");
		}
		
		else {
			System.out.println(+num1 +" y " +num2 +" no son amigos");
		}
			
		
	}
}