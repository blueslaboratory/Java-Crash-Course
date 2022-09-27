//13. Haz un programa que imprima el triangulo de Floyd hasta un valor dado. 
//El triangulo contiene los numeros naturales correlativos, uno en la primera 
//linea, dos en la segunda, etc.; es decir, en la fila n-esima aparecen n valores.
//Ejemplo: 
//1 
//1 2 
//1 2 3 
//1 2 3 4 
//1 2 3 4 5



package basicos2repaso;

import java.util.Scanner;


public class Ej013TrianguloFloyd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		int i;
		String numString;
		Scanner sc = new Scanner(System.in);
		
		numString = "";
		
		do {
			System.out.print("Introduzca el numero: ");
		    num = Integer.parseInt(sc.nextLine());
		} while (num<1);
		
		for (i=1; i<=num; i++) {
			numString = numString + " " + i +" "; 
			System.out.println(numString);
		}
		
		sc.close();
	}

}
