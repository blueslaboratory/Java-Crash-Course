//Escribe un programa que pida el limite inferior y superior de un intervalo. 
//Si el limite inferior es mayor que el superior lo tiene que volver a pedir.
//A continuacion se van introduciendo numeros hasta que introduzcamos el 0. 
//Cuando termine el programa dara las siguientes informaciones:
//	* La suma de los numeros que estan dentro del intervalo (intervalo abierto).
//	* Cuantos numeros estan fuera del intervalo.
//	* He informa si hemos introducido algun numero igual a los limites del intervalo.

//Si el numero pertenece al intervalo -> lo voy sumando (necesito un acumulador)
//Si el numero no pertenece al intervalo, lo cuento (necesito un contador)
//Si el numero es igual a algun limite, lo indico (necesito un indicador)



package ejercicios;

import java.util.Scanner;


public class Ej008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int lim_i, lim_s;
		float num;
		float acum;
		int cont;
		boolean flag;
		Scanner sc = new Scanner(System.in);
		
		acum = 0;
		cont = 0;
		flag = false;
		
		
		do {
			System.out.println("El limite superior debe ser mayor que el limite inferior.");
			
			System.out.print("Dime el limite inferior: ");
			lim_i = sc.nextInt();
			System.out.print("Dime el limite superior: ");
			lim_s = sc.nextInt();
		} while(!(lim_s>lim_i)); //cuando lo niegas es como usar un hasta que
		
		
		do {
			System.out.print("Dime los numeros (pulsa 0 para salir): ");
			num = sc.nextFloat();
			
			if (num>lim_i && num<lim_s) 
				acum += num; //acum = acum + num;
			else if (num == lim_i || num == lim_s)
				flag = true;
			else if (num != 0)
				cont += 1; //cont = cont + 1;		
		} while (!(num == 0));
		
		System.out.println("El intervalo es (" +lim_i +"," +lim_s +")");
		System.out.println("Suma de los numeros dentro del intervalo: " +acum);
		System.out.println("Numeros fuera del intervalo: " +cont);
		System.out.println("Hay algun numero igual a algun limite del intervalo: " +flag);
				
		
		sc.close();
	}

}
