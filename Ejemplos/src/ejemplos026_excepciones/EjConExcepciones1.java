//Project -> Properties -> Run/Debug settings -> Nombre (class Name) -> edit ->
//-> arguments -> aqui manda mi... 7777
//					0	1	  2		3

package ejemplos026_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjConExcepciones1 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		
		try {
			System.out.print("Introduce una posicion: "); //aqui manda mi... 7777
			
			//num = Integer.parseInt(sc.nextLine());
			num = sc.nextInt(); //si utilizas este en un bucle hay un error, se queda algo en el buffer
			mostrarEntero(args, num); //3 (posicion 3 del array)
	
			
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Error: " +"Introduzca una posicion dentro del rango que hay"); //23
		} catch (InputMismatchException ex) {
			System.out.println("Error: " +"Introduzca una posicion en formato numerico"); //ee
		} catch (NumberFormatException ex) {
			System.out.println("Error: " +"El dato leido no es numerico"); 
		} catch (Exception ex) {
			System.out.println("Error: " +ex); //Ejecuta el metodo toString()
		}	
		
	}
	
	public static void mostrarEntero(String args[], int n) {
		System.out.println("Entero " +obtenerEntero(args, n));
	}
	
	public static int obtenerEntero(String args[], int n) {
		return Integer.parseInt(args[n]);
	}
}
