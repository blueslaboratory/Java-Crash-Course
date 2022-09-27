//Project -> Properties -> Run/Debug settings -> Nombre (class Name) -> edit ->
//-> arguments -> aqui manda mi... 7777

package ejemplos026_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjConExcepciones2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean ex = false;
		
		//Bucle para que siga pidiendo la posicion hasta que el dato leido se corresponda
		//con un dato entero y en el argumento en la posicion adecuada tenga un valor numerico
		
		while(!ex) {
			try {
				System.out.print("Introduce una posicion: "); //aqui manda mi... 7777
				mostrarEntero(args, Integer.parseInt(sc.nextLine())); //3 (posicion 3 del array)
				//mostrarEntero(args, sc.nextInt());
				//nextInt devuelve excepcion y no llega a vaciar el buffer
				//por lo que podria no volver a pedir la posicion
				ex = true;
			} 
			catch (ArrayIndexOutOfBoundsException error) {
				System.out.println("Error: " +"Introduzca una posicion dentro del rango que hay");
			} 
			catch (InputMismatchException error) {
				System.out.println("Error: " +"Introduzca una posicion en formato numerico");
			} 
			catch (NumberFormatException error) {
				System.out.println("Error: " +"El dato leido no es numerico");
			} 
			catch (Exception error) {
				System.out.println("Error: " +error); //Ejecuta el metodo toString()
			}
		} 
		
		
		sc.close();
	}
	
	public static void mostrarEntero(String args[], int n) {
		System.out.println("Entero " +obtenerEntero(args, n));
	}
	
	public static int obtenerEntero(String args[], int n) {
		return Integer.parseInt(args[n]);
		//si pones el raton sobre .parseInt te sale el throws NumberFormatException
	}
}