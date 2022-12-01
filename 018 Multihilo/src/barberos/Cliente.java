package barberos;

public class Cliente implements Runnable {
	
	Monitor gc;

	
	// CONSTRUCTOR
	public Cliente(Monitor gc) {
		this.gc = gc;
	}

	
	public void run() {
		// Los clientes no esperan a que hayan sillas libres. 
		// Sino hay sillas libres se van...
		gc.getSillaLibre();
	}
}