package ejemplos023_abstractas3_poli;

public abstract class Poligono {

	private int numLados;

	public Poligono() {
	}

	public Poligono(int numLados) {
		this.numLados = numLados;
	}

	public int getNumLados() {
		return numLados;
	}

	public void setNumLados(int numLados) {
		this.numLados = numLados;
	}

	// Declaraci�n del m�todo abstracto area()
	public abstract double area();

	@Override
	public String toString() {
		return "Poligono [numLados=" + numLados + "]";
	}

}
