//9. Haz un programa que pida 2 numeros por teclado y calcule su producto 
//mediante sumas sucesivas. Imprimir su resultado. 

package basicos2repaso;

import java.util.Scanner;


public class Ej009ProductoSumas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2;
		int i, suma;
		Scanner sc = new Scanner(System.in);
		
		suma = 0;
		
		System.out.print("Dime el numero 1: ");
		num1 = Integer.parseInt(sc.nextLine());
		System.out.print("Dime el numero 2: ");
		num2 = Integer.parseInt(sc.nextLine());
		
		//POSITIVOS
		if(num1>0) {
			for (i=1; i<=num1; i++) {
				suma += num2;
				if (num2>0)
					System.out.print("+" +num2);
				if (num2<0)
					System.out.print(+num2);
				
				//System.out.print("+" +num2);
			}
		}
		
		//NEGATIVOS
		if(num1<0) {
			for (i=-1; i>=num1; i--) {
				suma -= num2;
				if (num2>0)
					System.out.print("-" +num2);
				if (num2<0)
					System.out.print("+" +Math.abs(num2));
					
				//System.out.print("-" +num2);
			}
		}
		
		
		System.out.print(" = " +suma);
		System.out.println("\nProducto en forma de sumas = " +suma);
		
		
		sc.close();
	}

}
