//################################################################################
//Escribe un programa que dados dos numeros, uno real (base) y un entero positivo 
//(exponente), saque por pantalla el resultado de la potencia. No se puede 
//utilizar el operador de potencia

//Tambien funcionan para exponente = 0

package ejercicios;

import java.util.Scanner;


public class Ej009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float base;
		int exponente;
		
		float acum;
		int cont;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Indica la base (numero real): ");
		base = sc.nextFloat();
		
		do {
			System.out.print("Indica el exponente (numero entero positivo (>0)): ");
			exponente = sc.nextInt();
		} while (exponente<0);
		
		
		//CON FOR
		acum = 1;
		for(cont=1; cont<=exponente; cont++)
			acum = acum * base;
		
		System.out.println( base +" elevado a " +exponente +" es " +acum);
		
		
		//CON DO-WHILE 
		acum = 1;
		cont = 0;
		
		if (exponente > 0) {
			do {
				acum = acum * base;
				cont = cont + 1;
			} while(cont!=exponente);
		}
	
		System.out.println( base +" elevado a " +exponente +" es " +acum);
		
		
		
		System.out.println( base +" elevado a " +exponente +" es " +Math.pow(base, exponente));
		
		
		sc.close();
	}

}

