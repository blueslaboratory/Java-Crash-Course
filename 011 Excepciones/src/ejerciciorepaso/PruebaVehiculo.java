/*
1. Se quiere implementar un simulador de vehiculos. Existen dos clases de Vehiculos: 
 Coche y Camion.
a. De todos los Vehiculos queremos almacenar la matricula y la velocidad. En el momento
de crearlos, la matricula se recibe como parametro y la velocidad se pone a 0. En su
correspondiente metodo toString() se devolvera la matricula y la velocidad. Ademas se
puede acelerar pasando como parametro la cantidad en km/h que se tiene que acelerar.
b. Los coches tienen ademas un atributo para el numero de puertas que se recibe tambien
como parametro a la hora de crearlo. Y contiene un metodo que devuelve el numero de
puertas.
c. Los camiones tienen un atributo del tipo de Remolque que se inicializa a null en el
momento de crear el camion para indicar que aun no tiene remolque. Definimos en la
clase dos metodos, ponRemolque que recibe un Remolque por parametro y otro
quitaRemolque que pone el atributo a null. Cuando se muestre la informacion que lleve
remolque, ademas de matricula y velocidad debe aparecer informacion del remolque.
d. En la clase Camion hay que sobrescribir el metodo de acelerar, de forma que si el
camion lleva remolque y la velocidad supera los 100 km/h debe levantarse una
excepcion del tipo DemasiadoRapidoExcepcion.
e. Hay que implementar la clase Remolque que tiene un atributo de tipo entero que es el
peso del remolque y su valor se le asigna a la hora de crear el Remolque. Tendra su
metodo toString() como todas las demas clases.
f. Se implementara la clase DemasiadoRapidoExcepcion.
g. Crearemos la clase PruebaVehiculo con un metodo main donde se tenga un menu con
las siguientes operaciones (utiliza un ArrayList para guardar los vehiculos que se creen
desde el menu):
1.- Anadir coche
2.- Anadir camion
3.- Anadir un remolque (de peso en kg el que indique el usuario) a todos
los camiones
4.- Muestre la informacion de todos los vehiculos por pantalla.
5.- Borre todos los camiones que tengan un remolque de mas de 1000 kg
6.- Salir
Para practicar ordenacion con interfaces de Java, prueba a mostrar los vehiculos
ordenados por todos los criterios que se te ocurran.
*/

package ejerciciorepaso;

import java.util.Scanner;



public class PruebaVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Garaje garaje = new Garaje();
		Scanner sc = new Scanner(System.in);
		int opcion;
		char respuesta;
		
		
		do {
			opcion = menu(sc);
			switch (opcion) {
			case 1:
				garaje.add(Lector.crearCoche(sc));
				break;
			case 2:
				garaje.add(Lector.crearCamion(sc));
				break;
			case 3:
				garaje.ponerRemolques(sc);
				break;
			case 4:
				garaje.printGaraje();
				break;
			case 5:
				garaje.borrarCamionesRemolque();
				break;
			case 6:
				break;
			default:
				System.out.println("Introduzca una opcion valida (1-6)");
				break;
			}
		} while(opcion!=6);
		
		
		//ACELERAR		
		
		
		do {
			System.out.print("Acelerar (s/n): ");
			respuesta = sc.nextLine().charAt(0);
			
			if(respuesta =='s') {
				System.out.println();
				try {
					garaje.acelerar(sc);
				} catch (DemasiadoRapidoException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(); 
			
		} while(respuesta == 's');
		
	}
	
	public static int menu(Scanner sc) {
		int opcion;
		System.out.println();
		System.out.println("*******************************************");
		System.out.println("MENU");
		System.out.println("\t1. Introducir un coche");
		System.out.println("\t2. Introducir un camion");
		System.out.println("\t3. Introducir un remolque a cada camion");
		System.out.println("\t4. Mostrar informacion de todos los vehiculos por pantalla");
		System.out.println("\t5. Borrar todos los camiones que tengan un remolque > 1000kg");
		System.out.println("\t6. Salir");
		System.out.print("\nElija opcion: ");
				
		opcion = Integer.parseInt(sc.nextLine());
		System.out.println();
		
		return opcion;
	}
	
}
