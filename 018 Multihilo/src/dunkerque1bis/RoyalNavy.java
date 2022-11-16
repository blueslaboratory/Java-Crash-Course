package dunkerque1bis;

public class RoyalNavy {

	private int soldadosAliadosRescatados;
	// en la playa solo cabe 1 embarcacion cada vez, pero el semaforo
	// se declara en el main y se pasa a cada embarcacion
	// Semaphore semaforo = new Semaphore(1);

	
	// CONSTRUCTOR
	public RoyalNavy() {
		this.soldadosAliadosRescatados = 0;
	}

	
	// GETTERS Y SETTERS: ALT + SHIFT + S
	public synchronized int getSoldadosAliadosRescatados() {
		return soldadosAliadosRescatados;
	}

	// La suma se debe de hacer aqui de forma sincronizada
	public synchronized void setSoldadosAliadosRescatados(int soldadosAliados) {
		this.soldadosAliadosRescatados += soldadosAliados;
	}
}
