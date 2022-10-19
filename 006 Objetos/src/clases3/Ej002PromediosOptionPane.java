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

public class Ej002PromediosOptionPane {
	static float pool = 0;
	static int cont = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		
		do {
			opcion = menu(sc);
			switch (opcion) {
				case 1:
					Ej002PromediosOptionPane.agregarNumero(sc);
					break;
				case 2:
					Ej002PromediosOptionPane.obtenerPromedio();
					break;
				case 3:
					break;
				default:
					JOptionPane.showMessageDialog(null, "Introduzca una opcion valida");
					break;
			}
			
		} while(opcion!=3);
		
		
		
		
		sc.close();
	}
	
	public static int menu(Scanner teclado) {
		int opcion;
		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(
					"Elija opcion: " 
				   +"\n1. Introducir numero"
			       +"\n2. Calcular promedio"
				   +"\n3. Salir"));
				
		} while(opcion<1 || opcion>3);
		
		return opcion;
	}
	
	public static void agregarNumero(Scanner teclado) {
		float num;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero a agregar: "));
		pool+=num;
		cont++;
	}
	
	public static void obtenerPromedio() {
		JOptionPane.showMessageDialog(null, "Promedio: " +pool/cont);
	}
}
