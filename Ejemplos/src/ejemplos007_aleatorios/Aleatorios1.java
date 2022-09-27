package ejemplos007_aleatorios;

import java.util.*;
import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom; //Forma 3

public class Aleatorios1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n, lim, lim1, lim2;
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
		//En general, para conseguir un numero entero entre [N, M] 
		//con N < M y ambos incluidos, debemos usar esta formula: 
		//int valorEntero = Math.floor(Math.random()*(M-N+1)+N);  
		//Valor entre M y N, ambos incluidos.
		
		
		System.out.print("Introduce la cantidad de numeros a generar: ");
		n = sc.nextInt();
		System.out.print("Introduce el limite superior: ");
		lim = sc.nextInt();
		
		System.out.println("\n*** Aleatorios generados de 1 a " +lim +" ***");
		for(int i=1; i<=n; i++)
			System.out.print((int)(Math.random()*lim+1) + " ");
		System.out.println("");
		
		
		
		System.out.print("\nIntroduce la cantidad de numeros a generar: ");
		n = sc.nextInt();
		System.out.print("Introduce el limite inferior: ");
		lim1 = sc.nextInt();
		System.out.print("Introduce el limite superior: ");
		lim2 = sc.nextInt();
		
		
		System.out.println("\n*** Forma 1 ***");
		for(int i=1; i<=n; i++)
			System.out.print((int)(Math.random()*(lim2-lim1+1) + lim1) +" ");
		
		System.out.println("\n*** Forma 2 ***");
		for(int i=1; i<=n; i++)
			System.out.print(Math.floor(Math.random()*(lim2-lim1+1) + lim1) +" ");
			//Muestra decimales con .0, es un double
		
		System.out.println("\n*** Forma 3 ***");
		for(int i=1; i<=n; i++)
			System.out.print(ThreadLocalRandom.current().nextInt(lim1, (lim2+1)) +" ");
			//Muestra decimales con .0, es un double
		
		System.out.println("\n*** Forma 4 ***");
		Random aleatorio = new Random();
		for(int i=1; i<=n; i++)
			System.out.print(aleatorio.nextInt(lim2-lim1 +1) +lim1 +" ");
			
		System.out.println("\n*** Forma 5 ***");
		for(int i=1; i<=n; i++)
			System.out.print((Math.random()*(lim2-lim1+1) + lim1) +" ");
		//Muestra decimales, no casteamos y nunca genera el limite superior
			
	}

}

