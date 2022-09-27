/*
3.- Implementa una clase en Java que represente una fracción 
de números enteros. Implementa asimismo los siguientes métodos 
en la clase Fracción:

-	Suma de dos fracciones, que será una nueva fracción. Resta 
de dos fracciones, similar a la suma. 
-	División de dos fracciones.
-	Multiplicación de dos fracciones.
-	Calculo de la inversa de una fracción (cambiar numerador 
por denominador y viceversa).

Todos los métodos se realizan sobre un objeto Fracción pasándole 
por parámetro la segunda fracción cuando sea necesario.

Intenta simplificar los resultados usando un nuevo método.

*/

package clases3;

public class Ej003FraccionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ej003Fraccion f1 = new Ej003Fraccion(1,2);
		Ej003Fraccion f2 = new Ej003Fraccion(3,4);
		Ej003Fraccion f3 = new Ej003Fraccion(270, 192);
		
		
		System.out.println("El resultado de: " +f1 +" + " +f2 +" es " +f1.suma(f2));
		System.out.println("El resultado de: " +f1 +" - " +f2 +" es " +f1.resta(f2));
		System.out.println("El resultado de: " +f1 +" * " +f2 +" es " +f1.multiplica(f2));
		System.out.println("El resultado de: " +f1 +" / " +f2 +" es " +f1.divide(f2));
		
		
		System.out.println(f3 +" simplificada es " +f3.simplificada());
		System.out.println("Inversa: " +f3.simplificada().inversa());
	}
}
