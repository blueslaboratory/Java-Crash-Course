package barberos;

public class Monitor {
	
	boolean[] sillasLibres;
	boolean[] clienteEstaAtendido;

	
	
	// CONSTRUCTOR
	public Monitor(int numSillas) {
		sillasLibres = new boolean[numSillas];
		clienteEstaAtendido = new boolean[numSillas];

		for (int i = 0; i < numSillas; i++) {
			sillasLibres[i] = true;
			clienteEstaAtendido[i] = false;
		}
	}

	
	
	// GETTERS & SETTERS
	public synchronized int getSillaLibre() {
		int sillaLibre = -1;
		for (int i = 0; i < sillasLibres.length; i++) {
			if (sillasLibres[i]) {
				sillasLibres[i] = false;
				System.out.println("SILLA "+i +": cliente sentado en silla");
				sillaLibre = i;
				i = sillasLibres.length;
			}
		}
		return sillaLibre;
	}

	
	
	// OTROS METODOS
	public synchronized int atenderAlgunCliente() {
		int atenderCliente = -1;
		for (int i = 0; i < sillasLibres.length; i++) {
			if (!clienteEstaAtendido[i]) {
				clienteEstaAtendido[i] = true;
				System.out.println("SILLA "+i +": afeitando cliente");
				atenderCliente = i;
				i = sillasLibres.length;
			}
		}
		return atenderCliente;
	}
	
	public synchronized void liberarSilla(int i) {
		sillasLibres[i] = true;
		clienteEstaAtendido[i] = false;
		System.out.println("SILLA "+i +": se marcha el cliente de la silla");
	}
}
