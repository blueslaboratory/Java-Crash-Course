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


package excepciones_Ej007DGTSolMod;

// Mas adelante haremos el ejercicio con clase que agrupe los conductores y con excepciones
// Poner una clase para que tengamos los conductores y sus metodos
import java.util.Scanner;

public class MainDGT {

	public static final int MAX_OP = 6;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menuOp;
		System.out.print("Introduce la cantidad de conductores: ");
		int cantidadConductores = Integer.parseInt(sc.nextLine());
		int posicion;

		Conductor[] arrayConductores = new Conductor[cantidadConductores];
		System.out.println(arrayConductores.length==cantidadConductores);
		
		do {
			menuOp = menu(sc);

			switch (menuOp) {
			case 1:
				Lector.addConductor(sc, arrayConductores);
				break;
			case 2:
				Lector.addMuestra(sc, arrayConductores);
				break;
			case 3:
				Lector.mostrarConductor(sc, arrayConductores);
				break;
			case 4:
				Lector.mostrarMuestras(sc, arrayConductores);
				break;
			case 5:
				Lector.mostrarConductores(arrayConductores);
				break;
			default:
				System.out.println("Fin del programa");
				break;
			}

		} while (menuOp != MAX_OP);

		sc.close();
	}

	

	private static int menu(Scanner sc) {
		int menuOp;

		System.out.println("1. Introducir un nuevo conductor");
		System.out.println("2. Introducir una muestra");
		System.out.println("3. Mostrar los datos de un conductor");
		System.out.println("4. Mostrar las muestras de un conductor");
		System.out.println("5. Mostrar los datos de todos los conductores");
		System.out.println("6. Salir");

		do {
			System.out.print("Elige una opcion: ");
			menuOp = Integer.parseInt(sc.nextLine());
		} while (menuOp < 1 || menuOp > MAX_OP);
		System.out.println();
		
		return menuOp;
	}

}