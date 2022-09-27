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

public class Punto {

	private int x;
	private int y;

	public Punto copia() {
		Punto tmp = new Punto(x, y);
		return tmp;
	}

	public double distancia(Punto p) {
		return Math.sqrt((p.x - this.x) * (p.x - this.x) + (p.y - this.y) * (p.y - this.y));
	}

	// CONSTRUCTORES
	public Punto() {
	}
	public Punto(int _x, int _y) {
		x = _x;
		y = _y;
	}

	// GETTERS
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}

	// SETTERS
	public void setX(int _x) {
		x = _x;
	}
	public void setY(int _y) {
		y = _y;
	}

	// toString
	public String toString() {
		return ("(" + x + "," + y + ")");
	}

}