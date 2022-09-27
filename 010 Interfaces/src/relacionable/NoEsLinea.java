/*
Construye una interfaz llamada Relacionable que incluya los 
siguientes metodos:

// Devuelve verdadero si a es mayor que b
boolean esMayor(Object b);
// Devuelve verdadero si a es menor que b
boolean esMenor(Object b);
// Devuelve verdadero si a es igual que b
boolean esIgual(Object b);
Crea 3 clases:
	Fraccion
	Linea //comparas longitud
	Rectangulo //comparas el area

que implementen el interfaz Relacionable.
Crea un programa que instancie cada una de las clases y aplique 
sus metodos para probarlos.
*/
package relacionable;

public class NoEsLinea extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoEsLinea(String message) {
		super(message);
	}
}