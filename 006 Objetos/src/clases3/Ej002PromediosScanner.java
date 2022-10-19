/*
2.-  Implementa una clase en Java que permita realizar promedios. 
La clase debe tener dos métodos, uno para ingresar un nuevo número, 
llamado agregarNumero(int numero) y otro para obtener el promedio 
hasta el momento, llamado obtenerPromedio(). Determina qué atributos 
son necesarios para implementarla.

Implementa luego una clase de prueba que permita introducir algunos 
valores y que muestre el promedio. 
*/

package clases3;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ej002PromediosScanner {
	static float pool = 0;
	static int cont = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		
		do {
			opcion = menu(sc);
			switch (opcion) {
				case 1:
					Ej002PromediosScanner.agregarNumero(sc);
					break;
				case 2:
					Ej002PromediosScanner.obtenerPromedio();
					break;
				case 3:
					break;
				default:
					System.out.println("Introduzca una opcion valida");
					break;
			}
			
		} while(opcion!=3);
		
		
		
		
		sc.close();
	}
	
	public static int menu(Scanner teclado) {
		int opcion;
		do {
			System.out.print(
					 "\n1. Introducir numero"
					+"\n2. Calcular promedio"
					+"\n3. Imprimir todos los numeros introducidos"
					+"\n4. Salir"
					+"\nElija una opcion: " );
			opcion = Integer.parseInt(teclado.nextLine());
				
		} while(opcion<1 || opcion>3);
		
		return opcion;
	}
	
	public static void agregarNumero(Scanner teclado) {
		float num;
		
		System.out.print("Introduce el numero a agregar: ");
		num = Integer.parseInt(teclado.nextLine());
		pool+=num;
		cont++;
	}
	
	public static void obtenerPromedio() {
		System.out.println("Promedio: " +pool/cont);
	}
}
