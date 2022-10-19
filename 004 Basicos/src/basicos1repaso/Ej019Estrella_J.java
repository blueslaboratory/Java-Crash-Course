//19. Hacer un programa que lea por teclado un numero N e imprima 
//un triangulo rectangulo, de N filas. EJ: N=5, se pintara lo siguiente: 

//* 
//* * 
//* * * 
//* * * * 
//* * * * * 


package basicos1repaso;

import java.util.Scanner;


public class Ej019Estrella_J {
	
	public static void main(String[] args) {
		
		int i, n;
		String estrella;
		Scanner sc = new Scanner(System.in);
		
		estrella = "*";
		
		System.out.print("Dime N: ");
		n = Integer.parseInt(sc.nextLine());
		
		for (i=1; i<=n; i++) {
			System.out.println(estrella);
			estrella = estrella + " *";
		}
		
		
	}
}
