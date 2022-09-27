package ejemplos022_herencia2_poli2;

public class Poligono extends Figura {
	// Para tener el constructor por defecto, si he escrito el constructor
	// con par�metros, necesito el constructor por defecto de Pol�gono
	public Poligono() {
		System.out.println("Poligono()");
	}

	public Poligono(String str) {
		super(str); // Llama al constructor del padre: public Figura(String str) {
		System.out.println("Poligono(" + str + ")");
	}

	public void Dibujar() {
		System.out.println("Dibujo Poligono");
	}
}
