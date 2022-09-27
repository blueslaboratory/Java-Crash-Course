//6.- Realiza un programa en Java que permita crear cuentas bancarias 
//pidiendo la cantidad inicial al usuario, así como realizar operaciones 
//de ingresar y sacar dinero de esas cuentas. Si la cantidad de dinero 
//a sacar es superior a la que hay en la cuenta se mostrará un mensaje 
//advirtiendo que no se puede realizar la operación. El programa irá 
//contando el número de cuentas creadas y lo mostrará al final. El 
//programa dispondrá de un método que imprima la cantidad de dinero que 
//queda en la cuenta. Crea un método main que implemente la solución.

package composicion1;
import java.util.Scanner;

public class Ej002CuentaMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int SIZE = 3;
		int i = 0;
		int opcion;
		
		Ej002Cuenta [] cuentas = new Ej002Cuenta[SIZE];
		
		
		do {
			opcion = menu(sc);
			switch (opcion) {
			case 1:
				if (i < SIZE-1) {
					i = (int)cuentas[i].cuenta();		
					cuentas[i] = new Ej002Cuenta();
				}
					
				else
					System.out.println("Se ha alcanzado el maximo de cuentas");
				break;
			case 2:
				cuentas[i].ingresar(sc, 0);
				break;
			case 3:
				cuentas[i].retirar(sc, 0);
				break;
			case 4:
				System.out.println(cuentas[i]);
				break;
			case 5:
				for(int j=0; j<cuentas.length; j++) {
					if (cuentas[j]!=null) 
						System.out.println("Cuenta " +j +cuentas[j]);
				}
				break;
			case 6:
				break;
			default:
				System.out.println("Introduzca una opcion valida: ");
				break;
			}
			
		}while (opcion!=6);
		
		
	}
	
	
	
	public static int menu(Scanner sc) {
		int opcion;
		
		System.out.println("1. Abrir cuenta");
		System.out.println("2. Ingresar dinero en cuenta");
		System.out.println("3. Sacar dinero de cuenta");
		System.out.println("4. Mostrar cuenta");
		System.out.println("5. Mostrar todas las cuentas");
		System.out.println("6. Salir");
		System.out.print("\nOpcion: ");
		opcion = Integer.parseInt(sc.nextLine());

		return opcion;
	}
	
	
	
}
