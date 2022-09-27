package ejemplos017_compobj1;

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