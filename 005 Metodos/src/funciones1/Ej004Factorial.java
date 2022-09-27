//4.- Crea una funci�n en java que reciba un n�mero entero y devuelva su factorial.

//Intentos fallidos: 0

package funciones1;

import java.util.Scanner;


public class Ej004Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime N: ");
		num = Integer.parseInt(sc.nextLine());
		
		factorial(num);
		
		
		sc.close();
	}
	
	public static int factorial(int f) {
		int resultado, cont;
		
		cont = f;
		resultado = 1;
		System.out.print(f +"! = ");
		
		do {
			System.out.print(cont +"*");
			resultado = resultado*cont;
			cont--;
		} while(cont!=1);
			
		System.out.println("1 = " +resultado);
		
		return resultado;
	}

}