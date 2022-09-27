//Crea una aplicacion que permita adivinar un numero. La aplicacion genera un 
//numero aleatorio del 1 al 100. A continuacion va pidiendo numeros y va 
//respondiendo si el numero a adivinar es mayor o menor que el introducido,
//ademas de los intentos que te quedan (tienes 10 intentos para acertarlo). 
//El programa termina cuando se acierta el numero (ademas te dice en cuantos 
//intentos lo has acertado), si se llega al limite de intentos te muestra el 
//numero que habia generado.


package ejercicios;

import java.util.Scanner;
import java.util.Random;

public class Ej002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sol,i,num,inten;
		Scanner sc = new Scanner(System.in);
		
		inten = 1;
		sol = (int)((Math.random()*(100+1)));
		
		//Math.random() devuelve un numero aleatorio entre 0.0 y 1.0, excluido este ultimo valor
		//para conseguir un numero entero entre [N, M] con N < M y ambos incluidos, 
		//debemos usar esta formula: 
		//int valorEntero = (int)(Math.random()*(M-N+1)+N);
		//int valorEntero = (int)Math.floor(Math.random()*(M-N+1)+N);
		
		//creo que tambien valdria con Math.round
		//sol = (int)Math.round(Math.random()*(100));
		
		
		//ALEATORIO CON RANDOM
		//int sol2;
		//Random r = new Random();
		//sol2 = r.nextInt(100)+1; //(M-N+1)+N (100-0+1)+0
	
		
		
		System.out.print("Cuantos intentos quieres: ");
		i = sc.nextInt();
		
		//1er inten
		System.out.print("Adivine el numero (de 1 a 100): ");
		num = sc.nextInt();
		
		//Demas inten
		while (i>1 && num!=sol) {
			if (sol>num)
				System.out.println("La solucion es mayor");
			else
				System.out.println("La solucion es menor");
			
			i = i-1; //i--
			System.out.print("Tienes " +i +" intentos para averiguar un numero del [1-100]: ");
			num = sc.nextInt();
			
			inten = inten+1; //inten++
		}
		
		if (num==sol)
			System.out.println("Numero correcto! Has tardado " +inten +" intentos");
		else
			System.out.println("La solucion era: " +sol);
		
		sc.close();
	}

}
