//16. Hacer un programa para sumar los N primeros terminos de una progresion 
//geometrica de primer termino A y razon R (dados por teclado). Se debe realizar 
//la suma sin emplear la formula que existe para ello. Muestra tambien los 
//terminos de la serie.
//
//Ejemplo de ejecucion:
//
//Introducir numero de terminos: 6
//Introducir el primer terminos: 5
//Introducir la razon: 3
//
//Salida:
//5 15 45 135 405 1215
//La suma de los terminos de la serie es 1820


package basicos1;

import java.util.Scanner;


public class Ej016 {
	
	public static void main(String[] args) {
		
		int n, termino, razon, suma;
		int i;
		Scanner sc = new Scanner(System.in);
		
		suma = 0;
		
		do {
			System.out.print("Numero de terminos de la progresion: ");
			n = Integer.parseInt(sc.nextLine());
		} while(n<1);
		
		System.out.print("Introducir el primer termino: ");
		termino = Integer.parseInt(sc.nextLine());
		
		System.out.print("Razon de la progresion: ");
		razon = Integer.parseInt(sc.nextLine());
		
		
		for(i=1; i<=n; i++) {
			System.out.println("Termino " +i +": " +termino);
			suma += termino;
			termino = termino*razon;
		}
		
		System.out.println("Suma de los " +(i-1) +" terminos: " +suma);
		
		sc.close();
	}
}
