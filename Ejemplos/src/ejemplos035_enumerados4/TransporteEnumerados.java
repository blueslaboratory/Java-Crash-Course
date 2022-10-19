package ejemplos035_enumerados4;

//Uso de un constructor, una variable de instancia y un metodo.
enum Transporte {

	COCHE(60), CAMION(50), AVION(600), TREN(70), BARCO(20);

	private int velocidad; // velocidad tipica de cada transporte

	// Anadir un constructor
	Transporte(int s) {
		velocidad = s;
	}

	// Anadir un metodo
	int getVelocidad() {
		return velocidad;
	}
}

class TransporteEnumerados {
	public static void main(String[] args) {
		Transporte tp;

		// Mostrar la velocidad de un avion
		System.out.println("La velocidad tipica para un avion es: " 
						 + Transporte.AVION.getVelocidad() + " millas por hora.\n");

		// Mostrar todas las velocidades y transportes
		System.out.println("Todas las velocidades de transporte: ");

		for (Transporte t : Transporte.values())
			System.out.println(t + ": velocidad tipica es " 
						+ t.getVelocidad() + " millas por hora.");
	}
}