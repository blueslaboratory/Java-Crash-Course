package ejemplos024_interface2;

public class Cuadrado implements Figura {
	int lado;
	
	// Constructor
	public Cuadrado (int ladoParametro) {
		lado = ladoParametro;
	}
	
	// Implementacion del metodo de la interfaz
	public int area(){
		 return lado*lado;
	}
}


