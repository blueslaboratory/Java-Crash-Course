package ejemplos004_scanner;

import java.util.*;
//el * significa todos los paquetes
//import java.util.Scanner;
//necesario para utilizar scanner


public class JavaScanner {
//No se puede llamar a la clase Scanner porque se hace lio con la que importas
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String mensaje;
//		int num;
		
		Scanner teclado = new Scanner(System.in);
//		//new coche (color y marca)
//		//objeto coche
//		//Si un metodo no es estatico, necesitas hacer un new 
//		
//		System.out.println("Introduce un numero: ");
//		num = teclado.nextInt(); //Para leer enteros
//		//En la variable num guardo lo que me devuelve el 
//		//metodo nextInt asociado a teclado
//		
//		mensaje = (num >= 0) ? "Positivo" : "Negativo";
//		
//		System.out.println("Has introducido un numero: " + mensaje);
//		
//		
//		System.out.println("Introduce un numero: ");
//		teclado.nextFloat();
//		System.out.println("Introduce un numero: ");
//		teclado.nextDouble();
		
		
		//No se puede leer numeros y strings a la vez en este orden, 
		//por eso he tenido que comentar lo anterior
		
		System.out.print("Introduce tu nombre: ");
		String nombre = teclado.nextLine();
		System.out.print("Hola " + nombre);
		
		

		teclado.close();
	}

}
