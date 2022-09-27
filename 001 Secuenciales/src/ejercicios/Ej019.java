//Escribir un algoritmo para calcular la nota final de un estudiante, considerando que: 
//por cada respuesta correcta 5 puntos, por una incorrecta -1 y por respuestas en 
//blanco 0. Imprime el resultado obtenido por el estudiante.

package ejercicios;

import java.util.Scanner;


public class Ej019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int correctas, incorrectas, puntos;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Dime cantidad de respuestas correctas: ");
		correctas = sc.nextInt();
		System.out.print("Dime cantidad de respuestas incorrectas: ");
		incorrectas = sc.nextInt();
		
		puntos = correctas*5 + incorrectas*(-1);
		System.out.print("Puntos: " +puntos);
		
		
		sc.close();
		
	}

}
