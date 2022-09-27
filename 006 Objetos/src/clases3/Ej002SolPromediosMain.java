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

public class Ej002SolPromediosMain {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int longitud, opt, num;
		
		System.out.println("Introduce el numero maximo de numeros");
		longitud = sc.nextInt();
		
		Ej002SolPromedios prom = new Ej002SolPromedios(longitud);
		
		do {
			System.out.print("\n1. Agregar numero"
							+"\n2. Obtener promedio"
							+"\n3. Ver los datos introducidos"
							+"\n0. Salir"
							+"\nElija una opcion: " );
			
			opt = sc.nextInt();
			switch (opt) {
				case 1:
					System.out.print("Introduce el numero: ");
					num = sc.nextInt();
					prom.agregarNumero(num);
					break;
				case 2:
					System.out.println("El promedio es...");
					System.out.println(prom.obtenerPromedio());
					break;
				case 3:
					System.out.println("Los valores introducidos son los siguientes: ");
					prom.mostrarValores();
					System.out.println();
					System.out.println(prom);
					System.out.println();
					break;
				case 0:
					System.out.println("Hasta luego");
					opt = 0;
					break;
				default:
					System.out.println("Introduzca una opcion valida");
					break;
			}
			
		} while(opt!=0);
	}
	
}
