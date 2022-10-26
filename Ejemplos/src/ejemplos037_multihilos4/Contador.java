package ejemplos037_multihilos4;

public class Contador extends Thread {

	Boolean contadorMarcha = true;

	public Contador() {
	}

	public void contador() {
		try {
			int i = 0;
			while (contadorMarcha) {
				System.out.printf(i + " %n");
				this.sleep(1000);
				i++;
			}
		} catch (InterruptedException e) {
			return;
		}
	}

	@Override
	public void run() {
		this.contador();
	}
}
