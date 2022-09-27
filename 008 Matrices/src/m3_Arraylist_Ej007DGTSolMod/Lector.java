/*
7.- Definir los atributos de las clases de objetos necesarias para almacenar la 
informacion relativa a unas muestras de alcoholemia recogidas en un analisis preventivo 
de la Direccion General de Trafico, de forma que: 
a)	Para cada conductor interesa tener su nombre, DNI. y una coleccion de referencias a 
las muestras que se le han tomado durante el periodo de estudio. 
b)	Cada muestra tendra los siguientes datos: Dia y hora de la muestra, codigo del puesto 
de control preventivo (dos letras y dos numeros), matricula del vehiculo y la tasa de 
alcohol espirado en aire (entre 0 y 2.5 mg/l). 
Hacer una simulacion del funcionamiento de estas clases usando el siguiente menu:

1. Introducir un nuevo conductor.
2. Introducir una muestra.
3. Mostrar los datos de un conductor.
4. Mostrar las muestras de un conductor.
5. Mostrar los datos de todos los conductores.
6. Salir.
Elige una opcion:
Hacerlo con Arrays y ArrayList.
Al introducir una muestra, se elige de que conductor por su dni.
Los datos del conductor se muestran buscando por dni.


Cambios pedidos:
1.	Mostrar los conductores con su numero de orden para identificar de que conductor 
se quieren introducir muestras.
2.	Hacer el control de formato de codigo y de alcohol con dos nuevas excepciones que 
crearas. (se vuelve a pedir en caso de saltar la excepcion) La fecha y hora de las 
muestras sera obtenida por programa como las actuales, no se piden al usuario ya.

*/

package m3_Arraylist_Ej007DGTSolMod;

import java.util.Scanner;

public class Lector {
	public static final int MAX_OP = 6;
	
	public static int menu(Scanner sc) {
		int menuOp;

		System.out.println();
		System.out.println("MENU");
		System.out.println("1. Introducir un nuevo conductor");
		System.out.println("2. Introducir una muestra");
		System.out.println("3. Mostrar los datos de un conductor");
		System.out.println("4. Mostrar las muestras de un conductor");
		System.out.println("5. Mostrar los datos de todos los conductores");
		System.out.println("6. Salir");

		do {
			System.out.print("Elige una opcion: ");
			menuOp = Integer.parseInt(sc.nextLine());
			System.out.println();
		} while (menuOp < 1 || menuOp > MAX_OP);

		return menuOp;
	}
	
	
	
	//1. Introducir un nuevo conductor
	public static void addConductor(Scanner sc, Conductor[] arrayConductores) {
		if (Conductor.getNumCond() < arrayConductores.length) {
			arrayConductores[Conductor.getNumCond()] = crearConductor(sc);
		} 
		else {
			System.out.println("No se pueden crear mas conductores");
		}
		System.out.println();
	}
	
	private static Conductor crearConductor(Scanner sc) {
		System.out.print("Introduce el nombre del conductor: ");
		String name = sc.nextLine();
		System.out.print("Introduce el dni: ");
		String dni = sc.nextLine();
		System.out.print("Nº de muestras a guardar del conductor: ");
		int numMuestras = Integer.parseInt(sc.nextLine());

		return new Conductor(name, dni, numMuestras);
	}
	
	
	
	//2. Introducir una muestra
	public static void addMuestra(Scanner sc, Conductor[] arrayConductores) {
		int posicion;
		if (Conductor.getNumCond() > 0) {
			System.out.print("Nº de conductor al que pertenece la muestra (1-" +arrayConductores.length +"): ");
			posicion = Integer.parseInt(sc.nextLine());
			
			if (posicion<=arrayConductores.length && arrayConductores[posicion - 1] != null) {
				// este orden hace que se evalue 1ero la 1era clausula, seria como un if anidado
				if(arrayConductores[posicion - 1].cabeMuestra()) {
					Muestra muestra = crearMuestra(sc);
					arrayConductores[posicion - 1].ingresarMuestra(muestra);
					// no pido datos de muestra si no cabe
				}
				else
					System.out.println("No se admiten mas muestras para ese conductor");
			} 
			else
				System.out.println("El conductor no existe");
		} 
		else
			System.out.println("No hay conductores dados de alta");
		
		System.out.println();
	}
	
	private static Muestra crearMuestra(Scanner sc) {
		Muestra muestra = new Muestra();

		System.out.println("Introduce los datos de la muestra");

		System.out.print("Fecha: ");
		muestra.setFecha(sc.nextLine());
		System.out.print("Hora: ");
		muestra.setHora(sc.nextLine());

		do {
			System.out.print("Codigo del puesto de control preventivo: ");
			muestra.setCodigo(sc.nextLine());
		} while (muestra.getCodigo() == null);

		System.out.print("Matricula del vehiculo: ");
		muestra.setMatricula(sc.nextLine());

		do {
			System.out.print("Tasa de alcohol: ");
			muestra.setPorcentaje(Float.parseFloat(sc.nextLine()));
		} while (muestra.getPorcentaje() == -1);

		return muestra;
	}
	
	
	
	//3. Mostrar los datos de un conductor
	public static void mostrarConductor(Scanner sc, Conductor[] arrayConductores) {
		int posicion;
		if (Conductor.getNumCond()>0) {
			
			System.out.print("Nº conductor elegido (1-" +arrayConductores.length +"): ");
			posicion = Integer.parseInt(sc.nextLine());
			
			if (posicion<=arrayConductores.length && arrayConductores[posicion - 1] != null) {
				// este orden hace que se evalue 1ero la 1era clausula, seria como un if anidado
				System.out.println(arrayConductores[posicion - 1]);
				System.out.println();
			} 
			else
				System.out.println("El conductor no existe");
		} 
		else
			System.out.println("No hay conductores dados de alta");
		
		System.out.println();
	}
	
	
	
	//4. Mostrar las muestras de un conductor
	public static void mostrarMuestras(Scanner sc, Conductor[] arrayConductores) {
		int posicion;
		if (Conductor.getNumCond() > 0) {
			
			System.out.print("Nº conductor elegido (1-" +arrayConductores.length +"): ");
			posicion = Integer.parseInt(sc.nextLine());
			
			if (posicion<=arrayConductores.length && arrayConductores[posicion - 1] != null) {
				// este orden hace que se evalue 1ero la 1era clausula, seria como un if anidado
				System.out.println(arrayConductores[posicion - 1].escribirArrayMuestras());
				System.out.println();
			} 
			else
				System.out.println("El conductor no existe");
		} 
		else
			System.out.println("No hay conductores dados de alta");
		
		System.out.println();
	}
	
	
	
	//5. Mostrar los datos de todos los conductores
	public static void mostrarConductores(Conductor[] arrayConductores) {
		
		if (Conductor.getNumCond() > 0) {
			System.out.println("Conductores: ");
			for (int i=0; i < Conductor.getNumCond(); i++) {
				System.out.println((i+1) +". " +arrayConductores[i]);
			}
		} 
		else
			System.out.println("No hay conductores dados de alta.");
	}
	
	
	//6. Salir
}
