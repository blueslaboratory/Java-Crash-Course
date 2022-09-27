/*
1.- Realiza un programa que calcule el valor del factorial de un numero que 
se pide al usuario. Si el numero es negativo debe saltar una excepcion llamada 
FactorialNegExc creada por el programador que indique que no se puede calcular 
el factorial de un numero negativo. En la clausula finally escribira el 
resultado, siempre que haya sido posible calcularlo.
*/

package excepciones_Ej001Factorial;

import java.util.Scanner;

public class Ej001Factorial {
	public static void main(String[] args) {
		
		int numero;
		String result="";
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		
		
		do {
			try {
				System.out.print("Numero: ");
				numero = Integer.parseInt(sc.nextLine());
				
				result = String.valueOf(factorial(numero));
				flag = false;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				flag = true;
			} finally {
				if(!flag)
					System.out.println(result);
			}
			
		} while (flag);
		
		sc.close();
	}
	
	public static int factorial(int num) throws Ej001Excepcion {
		int resultado, cont;
		int aux = num;
		
		comprobar(num);
		//DO-WHILE 
		resultado = 1;
		System.out.print(num +"!" +" es ");
		cont = num;
		do {
			System.out.print(cont +"*");
			resultado = resultado*cont;
			cont = cont-1;
		} while(cont!=1);
		
		System.out.println("1 = " +resultado);
		
		return resultado;
	}
	
	public static void comprobar(int numero) throws Ej001Excepcion{
		if (numero<0) {
			throw(new Ej001Excepcion("El numero no puede ser negativo"));
		}
		
	}
}