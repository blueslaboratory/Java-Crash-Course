package ejemplos037_multihilos7;

public class Cola {
	
	private int numero;
	// inicialmente cola vacia:
	private boolean disponible = false;

	// wait y notify es lo que hace que se esperen
	// hay 3 formas de sincronizar hilos: synchronized, semaforos, wait y notify
	
	
	
	public synchronized int get() {
		// mientras no este disponible: wait
		while (!disponible) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		// visualize valor
		disponible = false;
		notify();
		return numero;
	}

	
	
	public synchronized void put(int valor) {
		// mientras este disponible: wait
		while (disponible) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		numero = valor;
		disponible = true;
		// visualiza valor
		notify();
	}
}
