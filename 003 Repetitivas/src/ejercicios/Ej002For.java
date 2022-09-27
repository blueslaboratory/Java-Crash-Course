//Crea una aplicacion que permita adivinar un numero. La aplicacion genera un 
//numero aleatorio del 1 al 100. A continuacion va pidiendo numeros y va 
//respondiendo si el numero a adivinar es mayor o menor que el introducido,
//ademas de los intentos que te quedan (tienes 10 intentos para acertarlo). 
//El programa termina cuando se acierta el numero (ademas te dice en cuantos 
//intentos lo has acertado), si se llega al limite de intentos te muestra el 
//numero que habia generado.

package ejercicios;

import java.util.Scanner;


public class Ej002For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sol,i,num,inten;
		int p;
		Scanner sc = new Scanner(System.in);
		
		//Math.random() devuelve un numero aleatorio entre 0.0 y 1.0, excluido este ultimo valor
		//para conseguir un numero entero entre [N, M] con N < M y ambos incluidos, 
		//debemos usar esta formula: 
		//int valorEntero = (int)(Math.random()*(M-N+1)+N);
		//int valorEntero = (int)Math.floor(Math.random()*(M-N+1)+N);
		
		sol = (int)((Math.random()*(100+1)));
		inten = 0;
		
		System.out.print("Cuantos intentos quieres: ");
		i = sc.nextInt();
		
		
		for (p=i; p>=1; p--) {
			System.out.print("Adivine el numero (de 1 a 100): ");
			num = sc.nextInt();
			inten = inten+1;
			
			if (num==sol) {
				System.out.println("Correcto! Has acertado en " +inten +" intentos");
				p = 1;
				// esta solucion no es elegante, esto nunca se hace.
			}
				
			else {
				if (sol>num && p>=1)
					// V V V: Ejecuta
					// V F F: Al SiNo
					// F V F: Al SiNo
					// No veo para que necesitas p>=1 (me parece redundante)
					System.out.println("La solucion es mayor, te quedan " +(i-1) +" intentos");
				else //sol<num
					System.out.println("La solucion es menor, te quedan " +(i-1) +" intentos");
				
				i = i-1;
			}
			
			if (p==1 && sol!=num) 
				System.out.println("Tus intentos han terminado. El numero era " +sol);
		}
		
		
		sc.close();
	}

}
