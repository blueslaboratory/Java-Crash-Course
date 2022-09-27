//7. La secuencia de Collatz de un número entero se 
//construye de la siguiente forma: 
//    • si el número es par, se divide por dos; 
//    • si es impar, se multiplica tres y se le suma uno; 
//    • la sucesión termina al llegar a uno. 
//
//La conjetura de Collatz afirma que, al partir desde 
//cualquier número, la secuencia siempre llegará a 1. 
//A pesar de ser una afirmación a simple vista muy simple, 
//no se ha podido demostrar si es cierta o no. 
//Usando computadores, se ha verificado que la sucesión 
//efectivamente llega a 1 partiendo desde cualquier número 
//natural menor que 258. 
//
//a) Hacer un programa que muestre la secuencia de Collatz 
//de un número entero, que se pedirá por teclado. 
//
//Ej:
//n: 18 
//18 9 28 14 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
//n: 19 
//19 58 29 88 44 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
//n: 20 
//20 10 5 16 8 4 2 1 
//
//b) Hacer un programa que grafique los largos de las secuencias 
//de Collatz (número de elementos que hay que generar hasta que 
//se llega al 1) de los números enteros positivos menores 
//que el ingresado por el usuario: 
//
//n: 20 
//1 * 
//2 ** 
//3 ******** 
//4 *** 
//5 ****** 
//6 ********* 
//7 ***************** 
//8 **** 
//9 ******************** 
//10 ******* 
//11 *************** 
//12 ********** 
//13 ********** 
//14 ****************** 
//15 ****************** 
//16 ***** 
//17 ************* 
//18 ********************* 
//19 ********************* 
//20 ********

package basicos4;

import java.util.Scanner;

public class Ej007Collatz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Dime un numero entero positivo: ");
			num = Integer.parseInt(sc.nextLine());
		} while (num<1);
		
		collatz(num);
		
		
		//b
		int cont = collatz(num);
		int b = cont;
		
		for(int i=1; i<=num; i++) {
			System.out.println();
			System.out.print(i +": ");
			//for(int j=num; j!=1; j=collatz(num))
			for(cont=collatz2(i); cont>=1; cont--) {
				System.out.print("*");
			}
			
		}
		
		
		sc.close();
		
	}
	
	
	
	public static int collatz(int num) {
		int cont = 1;
		System.out.print(num + " ");
		
		while(num!=1) {
			if (num%2 == 0) {
				num/=2;
				System.out.print(num + " ");
				cont++;
			}
				
			else if (num%2 != 0) {
				num = num*3 +1;
				System.out.print(num + " ");
				cont++;
			}		
		}
		
		System.out.println();
		return cont;
	}
	

	public static int collatz2(int num) {
		int cont = 1;
		//System.out.print(num + " ");
		
		while(num!=1) {
			if (num%2 == 0) {
				num/=2;
				//System.out.print(num + " ");
				cont++;
			}
				
			else if (num%2 != 0) {
				num = num*3 +1;
				//System.out.print(num + " ");
				cont++;
			}		
		}
		
		return cont;
	}
}
