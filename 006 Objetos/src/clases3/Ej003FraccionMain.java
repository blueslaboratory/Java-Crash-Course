/*
3.- Implementa una clase en Java que represente una fracci�n 
de n�meros enteros. Implementa asimismo los siguientes m�todos 
en la clase Fracci�n:

-	Suma de dos fracciones, que ser� una nueva fracci�n. Resta 
de dos fracciones, similar a la suma. 
-	Divisi�n de dos fracciones.
-	Multiplicaci�n de dos fracciones.
-	Calculo de la inversa de una fracci�n (cambiar numerador 
por denominador y viceversa).

Todos los m�todos se realizan sobre un objeto Fracci�n pas�ndole 
por par�metro la segunda fracci�n cuando sea necesario.

Intenta simplificar los resultados usando un nuevo m�todo.

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
