package ejemplos006_repetitivas;

import java.util.Scanner;


public class Pares {
	
	public static void main(String[] args) {
		
		int numpares, cont, num, n, sumpares;
		float mediapares;
		Scanner sc = new Scanner(System.in);
		
		numpares = 0;
		sumpares = 0;
		cont = 1;
		
		//El concepto contador es distinto del de acumulador
		
		//Un contador es una variable entera que la utilizamos 
		//para contar cuando ocurre un suceso
		
		//Un acumulador es una variable numerica que permite ir acumulando operaciones.
		//Se inicializa a un valor inicial segun la operacion que se va a acumular: 
		//a 0 si es una suma o a 1 si es un producto.
		//Se acumula un valor intermedio
		
		System.out.print("Numero de numeros que quieres introducir: ");
		n = sc.nextInt();
		
		
		
		//CON WHILE (MIENTRAS)
		
		while (cont <= n){
			System.out.print("Dime un numero: ");
			num = sc.nextInt();
			
			if (num%2 == 0) {
				numpares = numpares + 1;
				sumpares = sumpares + num;
			}
			
			cont = cont+1;	
		}
		
		mediapares = (float)sumpares/numpares;
		
		System.out.println("El numero de pares introducido es " +numpares);
		System.out.println("La suma de pares introducidos es " +sumpares);
		System.out.println("La media de pares introducidos es " +(float)sumpares/numpares);
		System.out.println("La media de pares introducidos es " +mediapares);

		
		
		//CON DO-WHILE (REPETIR MIENTRAS/(HASTA QUE))
		
		numpares = 0;
		sumpares = 0;
		
		System.out.print("Numero de numeros que quieres introducir: ");
		n = sc.nextInt();
		
		do {
			System.out.print("Dime un numero: ");
			num = sc.nextInt();
			
			if (num%2 == 0) {
				numpares = numpares + 1;
				sumpares = sumpares + num;
			}
			
			n = n-1;	
		} while (n != 0);
		
		
		mediapares = (float)sumpares/numpares;
		
		System.out.println("El numero de pares introducido es " +numpares);
		System.out.println("La suma de pares introducidos es " +sumpares);
		System.out.println("La media de pares introducidos es " +(float)sumpares/numpares);
		System.out.println("La media de pares introducidos es " +mediapares);

		
		sc.close();
	}
}
