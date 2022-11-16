package cena_filosofos;

public class Monitor {
	boolean palilloLibre[];

	// CONSTRUCTOR
	// para ver porque hay 5 palillos libres al ppio dibujar a 
	// los filosofos y sus palillos en la mesa, al ppio todos los
	// palillos estan libres
	public Monitor(int numPalillos) {
		palilloLibre = new boolean[numPalillos];

		for (int i=0; i<numPalillos; i++) {
			palilloLibre[i] = true;
		}
	}

	public synchronized boolean intentarCogerPalillos(int pos1, int pos2) {
		boolean losCoge = (palilloLibre[pos1]) && (palilloLibre[pos2]);
		// Vemos si podemos coger ambos tenedores, estan libres?
		if (losCoge) {
			palilloLibre[pos1] = false;
			palilloLibre[pos2] = false;
		}
		return losCoge;
	}

	public void liberarPalillos(int pos1, int pos2) {
		palilloLibre[pos1] = true;
		palilloLibre[pos2] = true;
	}
}
