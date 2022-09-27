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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;


public class Garaje {
	private ArrayList<Vehiculo> garaje;
	
	//OTROS METODOS
	public void add(Vehiculo v) {
		garaje.add(v);
	}
	public Vehiculo getVehiculo(int index) {
		return garaje.get(index);
	}
	
	//3. Introducir un remolque a cada camion
	public void ponerRemolques(Scanner sc) {
		int peso;
		Remolque r;
		
		for(int i=0; i<garaje.size(); i++) {
			if(garaje.get(i) instanceof Camion) {
				System.out.println(garaje.get(i).toString());
				System.out.print("Peso del remolque: ");
				peso = Integer.parseInt(sc.nextLine());
				
				/*
				((Camion) garaje.get(i)).ponRemolque(new Remolque(peso));
				System.out.println("Se ha puesto un remolque de " +((Camion) garaje.get(i)).getR().getPeso() +" kg");
				*/
				
				Camion c = (Camion) garaje.get(i);
				r = new Remolque(peso);
				c.ponRemolque(r);
				System.out.println("Se ha puesto un remolque de " +c.getR().getPeso() +" kg");
				System.out.println();
			}
		}
	}
	
	//4. Mostrar informacion de todos los vehiculos por pantalla
	public void printGaraje() {
		
		Comparator<Vehiculo> porMatricula = new OrdenarMatricula();
        Collections.sort(garaje, porMatricula); 
        //Necesitamos reescribir compare para esto
        
		Iterator<Vehiculo> it = garaje.iterator();
		int cont = 1;
				
		
		System.out.println();
		System.out.println("*******************************************");
		System.out.println("VEHICULOS EN EL GARAJE");
		
		while(it.hasNext()) {
			System.out.print(cont + " ");
			System.out.println(it.next());
			System.out.println();
			cont++;
		}
	}

	//5. Borrar todos los camiones que tengan un remolque > 1000kg
	public void borrarCamionesRemolque() {
		Iterator<Vehiculo> it = garaje.iterator();
		
		while(it.hasNext()) {
			Vehiculo v = it.next();
			if (v instanceof Camion && ((Camion) v).getR()!=null) {
				if((((Camion) v).getR().getPeso()) > 1000) {
					it.remove();
				}
			}
		}
		
		System.out.println("Camiones con remolque > 1000kg borrados");
	}
	
	//acelerar
	public void acelerar(Scanner sc) throws DemasiadoRapidoException {
		double velocidad;
		int opcion;
		
		printGaraje();
		
		System.out.print("Numero del vehiculo a acelerar: ");
		opcion = Integer.parseInt(sc.nextLine())-1;
		
		System.out.print("Acelerar (km/h): ");
		velocidad = Double.parseDouble(sc.nextLine());
		garaje.get(opcion).acelerar(velocidad);
		System.out.println();
		
		System.out.println(garaje.get(opcion));
		System.out.println();
	}
	
	
	//CONSTRUCTOR
	public Garaje() {
		garaje = new ArrayList<Vehiculo>();
	}
	
	
	//GETTERS AND SETTERS
	public ArrayList<Vehiculo> getGaraje() {
		return garaje;
	}
	public void setGaraje(ArrayList<Vehiculo> garaje) {
		this.garaje = garaje;
	}
}
