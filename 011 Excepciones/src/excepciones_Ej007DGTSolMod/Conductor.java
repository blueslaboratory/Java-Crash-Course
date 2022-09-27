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

public class Conductor {
	private String nombre, dni;
	private Muestra arr[];
	private static int numCond = 0;
	private int contMuestras = 0;

	
	//OTROS METODOS
	public boolean cabeMuestra() {
		if (arr.length > contMuestras) {
			return true;
		}
		
		return false;
	}
	public int ingresarMuestra(Muestra _muestra) {
		if (arr.length > contMuestras) {
			arr[contMuestras] = _muestra;
			contMuestras++;
			return 1;
		}
		
		return -1;
	}
	public String escribirArrayMuestras() {
		String muestras = "";

		for (int i=0; i<contMuestras; i++) {
			muestras += "\n" + arr[i];
		}
		muestras += "\n";
		return muestras;
	}
	
	
	//ALT+SHIFT+S
	//CONSTRUCTORES
	public Conductor() {
		numCond++;
	}
	public Conductor(String _nombre, String _dni, int tam) {
		nombre = _nombre;
		dni = _dni;
		arr = new Muestra[tam];
		numCond++;
	}

	
	//SETTERS
	public void setNombre(String _nombre) {
		nombre = _nombre;
	}
	public void setDni(String _dni) {
		dni = _dni;
	}
	public void setArr(int size) {
		// Por si utilizo el constructor por defecto
		arr = new Muestra[size];
	}

	
	//GETTERS
	public String getNombre() {
		return nombre;
	}
	public String getDni() {
		return dni;
	}
	public Muestra[] getArrayMuestras() {
		return arr;
	}
	public static int getNumCond() {
		return numCond;
	}

	
	@Override
	public String toString() {
		// Aqui podriamos hacer un mensaje distinto si no hubiera muestras.
		return "Nombre: " + nombre 
				+ ", DNI: " + dni 
				+ ", muestras obtenidas:" + escribirArrayMuestras();
	}
	public String toStringSinMuestras() {
		return "Nombre: " + nombre 
				+ ", DNI: " + dni;
	}

}