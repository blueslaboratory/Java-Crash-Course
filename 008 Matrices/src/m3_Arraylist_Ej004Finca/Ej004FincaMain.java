/*
4. Se pide hacer una aplicacion en java que represente una finca mediante una clase.
De la finca se quiere guardar su nombre y el numero de metros cuadrados que posee. 

Ademas, se quiere guardar informacion sobre la casa y la parcela que la componen.

De la casa se quiere saber los metros cuadrados, el numero de plantas y el numero 
de habitaciones que posee.

De la parcela se quiere saber tambien el numero de metros cuadrados que tiene y si 
se dedica a explotacion agricola y/o ganadera.

Una vez que se haya modelizado todo mediante clases, se anadira un menu que permita:
•	Crear una nueva finca y guardarla.
•	Mostrar los datos de una finca dado el nombre de la misma, que se pedira al usuario.
•	Mostrar todas las fincas con todos sus datos.

El ejercicio lo haras usando un arrayList para almacenar cada una de las fincas.
*/


package m3_Arraylist_Ej004Finca;

import java.util.Scanner;
import java.util.ArrayList;

public class Ej004FincaMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ej004Fincas fincas = new Ej004Fincas();
		int opcion;
		
		do {
			opcion = menu(sc);
			switch (opcion) {
			case 0:
				break;
			case 1:
				crearFinca(fincas, sc);
				break;
			case 2:
				mostrarFinca(fincas, sc);
				break;
			case 3:
				//fincas.print();
				printFincas(fincas);
				break;
			default:
				System.out.println("Por favor introduzca una opcion valida");
				break;
			}
			
		} while(opcion!=0);
		
	}
	
	public static int menu(Scanner sc) {
		int opcion;
		
		System.out.println("MENU");
		System.out.println("0. Salir");
		System.out.println("1. Crear una nueva finca");
		System.out.println("2. Mostrar datos de la finca");
		System.out.println("3. Mostrar todas las fincas");
		System.out.print("Opcion: ");
		opcion = Integer.parseInt(sc.nextLine());
				
		return opcion;
	}
	
	
	//1
	public static void crearFinca(Ej004Fincas fincas, Scanner sc) {
		String nombre;
		double metrosFinca;
		int casas;
		
		System.out.print("Nombre de la finca: ");
		nombre = sc.nextLine();
		System.out.print("Metros de la finca: ");
		metrosFinca = Double.parseDouble(sc.nextLine());
		System.out.print("Casas en la finca: ");
		casas = Integer.parseInt(sc.nextLine());
		
		Ej004Finca f = new Ej004Finca(nombre, metrosFinca, casas);
		
		f.addCasa(crearCasa(sc));
		f.addParcela(crearParcela(sc));
		
		fincas.add(f);
	}
	
	
	//1.1
	public static Ej004FincaCasa crearCasa(Scanner sc) {
		int nPlanta, nHabitacion;
		double metrosCasa;
		
		System.out.print("Numero de plantas: ");
		nPlanta = Integer.parseInt(sc.nextLine());
		System.out.print("Numero de habitaciones: ");
		nHabitacion = Integer.parseInt(sc.nextLine());
		System.out.print("Metros de la casa: ");
		metrosCasa = Double.parseDouble(sc.nextLine());
		
		return new Ej004FincaCasa(nPlanta, nHabitacion, metrosCasa);
	}
	
	//1.2
	public static Ej004FincaParcela crearParcela(Scanner sc) {
		double metrosParcela;
		boolean agricola, ganadera;
		char respuesta;
		
		System.out.print("Metros de la parcela: ");
		metrosParcela = Double.parseDouble(sc.nextLine());
		
		System.out.print("Es agricola (s/n):");
		respuesta = sc.nextLine().charAt(0);
		if(respuesta == 's')
			agricola = true;
		else 
			agricola = false;
		
		System.out.print("Es ganadera (s/n):");
		respuesta = sc.nextLine().charAt(0);
		if(respuesta == 's')
			ganadera = true;
		else 
			ganadera = false;
		
		return new Ej004FincaParcela(metrosParcela, agricola, ganadera);
	}
	
	//2
	public static void mostrarFinca(Ej004Fincas fincas, Scanner sc) {
		int opcion;
		
		do {
			System.out.print("Introduce la finca a mostrar (" +fincas.getFincas().size() +")" +": ");
			opcion = Integer.parseInt(sc.nextLine());
		}while(opcion<0 || opcion>fincas.getFincas().size());
		
		System.out.println(fincas.getFincas().get(opcion-1));
	}
	
	//3
	public static void printFincas(Ej004Fincas fincas) {
		for(int i=0; i<fincas.getFincas().size(); i++) {
			System.out.println(fincas.getFincas().get(i));
		}
			
	}
}
