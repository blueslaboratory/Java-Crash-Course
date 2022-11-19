package practica1;

public class Ej005_SolBombaProfe extends Thread {

	// Varible de control de si explota la bomba. Empieza en 1,
	// si baja a 0 => bomba desactivada
	// si sube a 2 => explota la bomba
	static Integer bomba = 1;
	private Boolean contador;

	
	//CONSTRUCTOR
	public Ej005_SolBombaProfe(Boolean contador) {
		super();
		this.contador = contador;

	}

	public void contador() {
		try {
			int j = 9;
			for (int i = 0; i < 10; i++) {
				System.out.printf(String.valueOf(j - i) + " %n");
				Thread.sleep(1000);
			}
			System.out.printf("PUUUUUUMMMMMMMMMM%n");
			this.bomba = 2;
		} catch (InterruptedException e) {

		}
	}

	public void artificero() {
		try {
			Integer numero = (int) (Math.random()*(1050-950+1)+950); //(M-N+1)+N
			System.out.printf("El artificiero comienza a desactivar la bomba%n");
			Thread.sleep(numero * 10);
			System.out.printf("El artificiero ha desactivado la bomba%n");
			this.bomba = 0;
		} catch (InterruptedException e) {

		}
	}

	@Override
	public void run() {
		if (this.contador) {
			this.contador();
		} else {
			this.artificero();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Ej005_SolBombaProfe artificiero = new Ej005_SolBombaProfe(false);
		Ej005_SolBombaProfe bomba = new Ej005_SolBombaProfe(true);

		artificiero.start();
		bomba.start();

		try {
			bomba.join();
			artificiero.join();
		} catch (InterruptedException e) {
		}

		switch (Ej005_SolBombaProfe.bomba) {

		case 0:
			// System.out.printf("El artificiero ha desactivado la bomba%n");
			System.out.printf("La bomba ha sido desactivada%n");
		case 2:
			// System.out.printf("PUUUUUUMMMMMMMMMM%n");
			System.out.printf("El artificiero ha muerto%n");
		}

	}

}