package ejemplos035_enumerados4;

enum Color {

	// Enums
	ROJO("Rojo", 3), AZUL("Azul", 5);

	// Atributos
	private String nombreColor;
	private int numColor;

	public int contador = 0;

	// Constructor
	// Rojo - 3 - 1
	// Azul - 5 - 1

	Color(String nom, int col) {

		this.nombreColor = nom;
		this.numColor = col;
		this.contador++;

		System.out.println(this.nombreColor + " - " + this.numColor + " - " + this.contador);
	}

	//Getters
	public String getNombreColor() {
		return nombreColor;
	}
	public int getNumColor() {
		return numColor;
	}
	public int getContador() {
		return contador;
	}
	
	
	//Setters, "lo normal es que los enumerados no tengan setters, no se por que deja"
	private void setNombreColor(String nombreColor) {
		this.nombreColor = nombreColor;
	}
	private void setNumColor(int numColor) {
		this.numColor = numColor;
	}
	private void setContador(int contador) {
		this.contador = contador;
	}
	
}