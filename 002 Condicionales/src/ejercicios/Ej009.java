// Algoritmo que pida tres numeros y los muestre ordenados (de mayor a menor)

// Diseño
// 1. Leer num1,num2,num3
// 2. Si num1>num2>num3 mostrar num1,num2,num3
// 3. Si num1>num3>num2 mostrar num1,num3,num2
// 4. Si num2>num1>num3 mostrar num2,num1,num3
// 5. Si num2>num3>num1 mostrar num2,num3,num1
// 6. Si num3>num2>num1 mostrar num3,num2,num1
// 7. Si num3>num1>num2 mostrar num3,num1,num2


package ejercicios;

import java.util.Scanner;


public class Ej009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime el numero 1: ");
		num1 = sc.nextFloat();
		
		System.out.print("Dime el numero 2: ");
		num2 = sc.nextFloat();
		
		System.out.print("Dime el numero 3: ");
		num3 = sc.nextFloat();
		
		
		
		
		System.out.println("Con operadores logicos");
		
		if (num1>num2 && num2>num3)
			System.out.println("" +num1 +" > " +num2 +" > " +num3);
			
		if (num1>num3 && num3>num2)
			System.out.println("" +num1 +" > " +num3 +" > " +num2);
		
		if (num2>num1 && num1>num3)
			System.out.println("" +num2 +" > " +num1 +" > " +num3);

		if (num2>num3 && num3>num1)
			System.out.println("" +num2 +" > " +num3 +" > " +num1);
		
		if (num3>num1 && num1>num2)
			System.out.println("" +num3 +" > " +num1 +" > " +num2);

		if (num3>num2 && num2>num1)
			System.out.println("" +num3 +" > " +num2 +" > " +num1);
		
		
		
		
		System.out.println("Estructuras alternativas (sencillo)");
		
		if (num1>num2) {
			if (num2>num3)
				System.out.println("" +num1 +" > " +num2 +" > " +num3);
			else //num3>num2
				if (num1>num3)
					System.out.println("" +num1 +" > " +num3 +" > " +num2);	
		}
			
		if (num2>num1) {
			if (num1>num3)
				System.out.println("" +num2 +" > " +num1 +" > " +num3);
			else //num3>num1
				if (num2>num3)
					System.out.println("" +num2 +" > " +num3 +" > " +num1);	
		}
		
		if (num3>num1) {
			if (num1>num2)
				System.out.println("" +num3 +" > " +num1 +" > " +num2);
			else //num2>num1
				if (num3>num2)
					System.out.println("" +num3 +" > " +num2 +" > " +num1);	
		}
		
		
		
		
		System.out.println("Estructuras alternativas (solucion)");
		
		if (num1>num2 && num1>num3) {
			if (num2>num3)
				System.out.println("" +num1 +" > " +num2 +" > " +num3);
			else //num3>num2
				System.out.println("" +num1 +" > " +num3 +" > " +num2);	
		}
			
		if (num2>num1 && num2>num3) {
			if (num1>num3)
				System.out.println("" +num2 +" > " +num1 +" > " +num3);
			else //num3>num1
				System.out.println("" +num2 +" > " +num3 +" > " +num1);	
		}
		
		if (num3>num1 && num3>num2) {
			if (num1>num2)
				System.out.println("" +num3 +" > " +num1 +" > " +num2);
			else //num2>num1
				System.out.println("" +num3 +" > " +num2 +" > " +num1);	
		}
	
		
		
		
		sc.close();
		
	}
}
