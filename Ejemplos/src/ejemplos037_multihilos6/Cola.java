package ejemplos037_multihilos6;

public class Cola {
	
	private int numero;
	// inicialmente cola vacia:
	private boolean disponible = false;

	
	public int get() {
		
		// si hay un numero en la cola
		if (disponible) { 
			// se pone cola vacia
			disponible = false; 
			// se devuelve
			return numero; 
		}
		
		// no hay numero disponible, cola vacia
		return -99; 
	}

	
	public void put(int valor) {
		// coloca valor en la cola
		numero = valor;
		// disponible para consumir, cola llena
		disponible = true; 

	}
}