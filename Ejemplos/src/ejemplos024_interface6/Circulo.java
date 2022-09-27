package ejemplos024_interface6;

public class Circulo implements Figura {
	private double radio; // radio del Circulo
	private Punto centro;

	// constructor sin argumentos; el valor predeterminado de radio es 0.0
	public Circulo() {
		// la llamada implícita al constructor de Punto ocurre aquí
	}

	// constructor
	public Circulo(int x, int y, double valorRadio) {
		centro = new Punto(x, y); // llamar al constructor de Punto
		radio = valorRadio;
	}

	// constructor
	public Circulo(Punto p, double valorRadio) {
		centro = p; // llamar al constructor de Punto
		radio = valorRadio;
	}

	// establecer el radio
	public void establecerRadio(double valorRadio) {
		radio = (valorRadio < 0.0 ? 0.0 : valorRadio);
	}

	// devolver el radio
	public double obtenerRadio() {
		return radio;
	}

	// calcular y devolver el diámetro
	public double obtenerDiametro() {
		return 2 * radio;
	}

	// calcular y devolver la long de la circunferencia
	public double obtenerLongCircunferencia() {
		return Math.PI * obtenerDiametro();
	}

	// sobreescribe obtenerArea para devolver área del Circulo
	public double obtenerArea() {
		// return Math.PI * obtenerRadio() * obtenerRadio();
		return Math.PI * Math.pow(radio, 2);
	}

	// desarrolla el método del interfaz obtenerVolumen
	public double obtenerVolumen() {
		return 0.0;
	}

	// Sobreescribe obtenerNombre para devolver "Circulo"
	public String obtenerNombre() {
		return "Circulo";
	}

	// sobrescribir toString para devolver la representación String de Circulo
	public String toString() {
		return "Centro = " + centro + "; Radio = " + radio;
	}

} // fin de la clase Circulo