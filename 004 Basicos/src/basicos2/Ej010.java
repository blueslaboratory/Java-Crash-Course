//10. Hacer un programa que pida 2 numeros por teclado y calcule su division 
//mediante restas sucesivas. Imprimir su resultado. Divide siempre el mas 
//grande entre el mas pequeño.
//
//Ejemplo: 1324 entre 312.
//
//1324 - 312 = 1012 contamos una vez y seguimos porque 1012 >= 312
//1012 - 312 = 700 contamos 2 veces y continuamos porque 700 >= 312
//700 - 312 = 388 contamos 3 veces y continuamos porque 388 >= 312 
//388 - 312 = 76 contamos 4 veces y paramos porque 76 < 312
//
//Luego la division es 4 y el resto 76.



package basicos2;

import java.util.Scanner;


public class Ej010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2, aux;
		int contador, resta;
		Scanner sc = new Scanner(System.in);
		
		resta = 0;
		contador = 0;
		
		
		System.out.print("Dime el numero 1: ");
		num1 = Integer.parseInt(sc.nextLine());
		System.out.print("Dime el numero 2: ");
		num2 = Integer.parseInt(sc.nextLine());
		
		
		// Te piden que dividas el mas grande entre el mas pequeno
		if (num2>num1) {
			aux = num2;
			num2 = num1;
			num1 = aux;
			//System.out.println("Num2: " +num2);
			//System.out.println("Num1: " +num1);
			//System.out.println("aux: " +aux);
		}
		
		
		do {
			resta = num1 - num2;
			if (resta>=num2) {
				num1 = resta;
			}
			contador++;
			System.out.println("Resta: " +resta);
			
		} while( resta>= num2);
		
		System.out.println("La division es: " +contador);
		System.out.println("Resto: " +resta);
		
		sc.close();
	}

}
