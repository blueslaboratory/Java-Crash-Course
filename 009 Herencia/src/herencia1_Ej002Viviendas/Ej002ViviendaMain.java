/*
2.- Realiza un programa en java con las siguientes clases:
    - Vivienda: 
            + Atributos: metros cuadrados, calle y numero.
            + Metodos para devolver/establecer valores a los atributos.
            + Constructor con valores por defecto (0,â€�â€�,0)
            + Constructor con valores para los atributos
    - Chalet: Una vivienda que siempre tiene 120m2 y puede 
    		  o no tener jardin (verdadero o falso)
    - Palacio: Una vivienda de la que interesa el numero de habitaciones.

En el programa principal se mostrara el siguiente menu:

1. Insertar vivienda
2. Insertar chalet
3. Insertar palacio
4. Mostrar viviendas
5. Mostrar palacios
6. Borrar vivienda
7. Salir

Elija opcion: 


En las tres primeras opciones nos pediran los datos de 
cada tipo de vivienda (el tipo general corresponde a una 
vivienda que no es ni chalet ni palacio).
En la cuarta opcion se mostraran todas las viviendas de 
cualquier tipo.
En la quinta opcion se mostraran los datos de los palacios.
En la sexta opcion se pide el nombre de la calle y el numero 
de la vivienda a borrar y la eliminamos de la lista.

Un arrayList en otra clase ya
*/

package herencia1_Ej002Viviendas;

import java.util.Scanner;
import java.util.ArrayList;

public class Ej002ViviendaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ej002Viviendas viviendas = new Ej002Viviendas(); 
		Scanner sc = new Scanner(System.in);
		int opcion;
		
		do {
			opcion = menu(sc);
			switch (opcion) {
			case 1:
				viviendas.add(Ej002Lector.crearVivienda(sc));
				break;
			case 2:
				viviendas.add(Ej002Lector.crearChalet(sc));
				break;
			case 3:
				viviendas.add(Ej002Lector.crearPalacio(sc));
				break;
			case 4:
				viviendas.printViviendas();
				break;
			case 5:
				viviendas.printPalacios();
				break;
			case 6:
				viviendas.borrarVivienda(sc);
				break;
			case 7:
				break;
			default:
				System.out.println("Introduzca una opcion valida [1-7]");
				break;
			}
		} while (opcion != 7);
	}

	public static int menu(Scanner sc) {
		int opcion;
		
		System.out.println("\n1. Insertar vivienda");
		System.out.println("2. Insertar chalet");
		System.out.println("3. Insertar palacio");
		System.out.println("4. Mostrar viviendas");
		System.out.println("5. Mostrar palacios");
		System.out.println("6. Borrar vivienda");
		System.out.println("7. Salir");

		System.out.print("\nElija opcion: ");
		opcion = Integer.parseInt(sc.nextLine());

		return opcion;
	}
	
} 