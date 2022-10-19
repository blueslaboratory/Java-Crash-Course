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
/*
De vehiculos tenemos como hijos: camion y coche
Como objeto de camion: Remolque
*/

package ejerciciorepaso;

public class Vehiculo {
	private String matricula;
	private double velocidad;
	
	
	//OTROS METODOS
	public void acelerar(double velocidad) throws DemasiadoRapidoException {
		this.velocidad = velocidad;
		System.out.println("El vehiculo ha acelarado: " +this.velocidad +"km/h");
	}
	
	
	//ALT + SHIFT + S
	//CONSTRUCTORES
	public Vehiculo() {
		this.velocidad = 0;
	}
	public Vehiculo(String matricula) {
		this.matricula = matricula;
		this.velocidad = 0;
	}
	public Vehiculo(Vehiculo vehi) {
		matricula = vehi.getMatricula();
		velocidad = vehi.getV();
	}
	
	//GETTERS
	public String getMatricula() {
		return matricula;
	}
	public double getV() {
		return velocidad;
	}
	
	
	//SETTERS
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public void setV(double v) {
		this.velocidad = v;
	}
	
	
	//TOSTRING
	@Override
	public String toString() {
		return "Vehiculo "
				+ "\nMatricula: " + matricula 
				+ "\nVelocidad (km/h): " + velocidad;
	}
}
