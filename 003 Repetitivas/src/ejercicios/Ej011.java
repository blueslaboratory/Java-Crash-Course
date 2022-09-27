//################################################################################
//Escribe un programa que diga si un numero introducido por teclado es o no primo. 
//Un numero primo es aquel que solo es divisible entre el mismo y la unidad. 
//Nota: Es suficiente probar hasta la raiz cuadrada del numero para ver si es 
//divisible por algun otro numero.
//################################################################################
//Analisis
//Leemos un numero y vamos comprobando si es divisible entre 2 hasta la raiz
//cuadrada del numero. Si es divisible por algun numero no es primo.
//Si no es divisible por ningun numero es primo.
//Para saber si es divisible usamos el operador modulo.
// Datos de entrada: el numero a comprobar si es primo o no
// Informacion de salida: Un mensaje diciendo si es primo o no
// Variables: numero_es_primo (entero), num (entero) contador desde 2 hasta 
//raiz cuadrada del num_es_primo, es_primo (logico)
//################################################################################
//Diseño
//1.- Supongo que el numero es primo -> es_primo<-Verdadero
//2.-Leer num_es_primo
//3.- Desde num = 2 hasta raiz(numero_es_rpimo)
//		4.- Si numero_es_primo es divisible entre num -> es_primo<-Falso
//5.- Si es_primo -> Mostrar "Es primo"
//6.- Si no -> Mostrar "No es primo"
//################################################################################


package ejercicios;

import java.util.Scanner;


public class Ej011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero_es_primo, num;
		boolean es_primo;
		Scanner sc = new Scanner(System.in);
		
		es_primo = true; // pienso que es primo hasta que encuentre con que dividirlo
		
		System.out.print("Introduce un numero para comprobar si es primo: ");
		numero_es_primo = sc.nextInt();
		
		for (num=2; num<=(Math.sqrt(numero_es_primo)); num++) {
			if (numero_es_primo % num == 0)
				es_primo = false;
		}
		
		if (es_primo || numero_es_primo == 1) 
			System.out.println("Es primo");
		else
			System.out.println("No es primo");
		
		
		
	//NO PUEDES HACER LO QUE HAY A CONTINUACION
	//PORQUE UN NUMERO NO ES DIVISIBLE ENTRE TODOS LOS NUMEROS
	//QUE LE PRECEDEN
	//EJEMPLO: 100 no es divisible entre 7
		
	for (num=2; num<(Math.sqrt(numero_es_primo)); num++) {
		if (numero_es_primo % num != 0) {
			System.out.println("Es primo");
			num = numero_es_primo;
		}
	}
		
		sc.close();
	}

}

