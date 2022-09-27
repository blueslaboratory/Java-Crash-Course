//################################################################################
//Algoritmo que muestre la tabla de multiplicar de los numeros 1,2,3,4 y 5.
//################################################################################
//Analisis
//Debo repetir 5 veces (desde el numero 1 hasta el 5) mostrar 
//la tabla de multiplicar de ese numero.
//Como vimos en otro ejercicio para una tabla de multiplicar debemos repetir
//10 veces para mostrar cada linea de la tabla.
//Por lo tanto necesito dos bucles anidados.
// Datos de entrada: Nada
// Informacion de salida: Las cinco tablas de multiplicar
// Variables:tabla,num(entero)
//################################################################################
//Diseño
//1.- Para tabla desde 1 hasta 5
//		2.-Para num desde 1 hasta 10
//			3.- Mostrar tabla * num = (tabla*num)
//################################################################################


package ejercicios;

import java.util.Scanner;


public class Ej010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tabla, num;
		Scanner sc = new Scanner(System.in);
		
		// ES MEJOR UTILIZAR CONSTANTES CUANDO EL NUMERO NO VA A CAMBIAR
		final int LIMITE = 5;
		
		
		//Esta es la forma sencilla y elegante
		for (tabla=1; tabla<=LIMITE; tabla++) {
			System.out.println("\nTabla del " +tabla);
			for (num=1; num<=10; num++)
				System.out.println(tabla +" * " +num +" = " +tabla*num);
		}
		
		sc.close();
	}

}

