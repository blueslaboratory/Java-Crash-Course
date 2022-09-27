//Crea una aplicacion que pida un numero y calcule su factorial (El factorial de un numero 
//es el producto de todos los enteros entre 1 y el propio numero y se representa por el numero 
//seguido de un signo de exclamacion. Por ejemplo 5! = 1x2x3x4x5=120),


package repaso;

import java.util.Scanner;


public class Ej001Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, resultado, cont;
		Scanner sc = new Scanner(System.in);
		
		
		resultado = 1;
		System.out.print("Dime un numero: ");
		num = sc.nextInt();
		
		
		//WHILE SUMANDO
		cont = 2;
		while (cont<=num) {
			resultado = resultado*cont;
			cont = cont+1;
		}
		System.out.println("El factorial es " +resultado);
		
	
		//DO-WHILE 
		resultado = 1;
		System.out.print("Dime un numero: ");
		num = sc.nextInt();
		System.out.print(num +"!" +" es ");
		cont = num;
		do {
			System.out.print(cont +" * ");
			resultado = resultado*cont;
			cont = cont-1;
		} while(cont!=1);
		
		System.out.println("1 = " +resultado);
		
	
		//FOR
		resultado = 1;
		System.out.print("Dime un numero: ");
		num = sc.nextInt();
		for(cont=2; cont<=num; cont++) {
			resultado = resultado * cont;
		}
		System.out.println("El factorial es " +resultado);
		

		sc.close();
	}

}
