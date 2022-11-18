package ejemplos037_multihilos;

public class Raton2Runnable implements Runnable {

	private String nombre;
	private int tiempoAlimentacion;

	public Raton2Runnable(String nombre, int tiempoAlimentacion) {

		super();
		this.nombre = nombre;
		this.tiempoAlimentacion = tiempoAlimentacion;
	}

	public void comer() {
		try {
			System.out.printf("El raton " + this.nombre + " ha comenzado a alimentarse%n", nombre);
			Thread.sleep(tiempoAlimentacion * 1000);
			System.out.printf("El raton " + this.nombre + " ha terminado de alimentarse%n", nombre);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		this.comer();
	}

	public static void main(String[] args) {

		Raton2Runnable fievel = new Raton2Runnable("Fievel", 4);
		Raton2Runnable jerry = new Raton2Runnable("Jerry", 5);
		Raton2Runnable pinky = new Raton2Runnable("Pinky", 3);
		Raton2Runnable mickey = new Raton2Runnable("Mickey", 6);

		
		// Los iniciamos de forma simultanea, siempre llamando a start() y no a run()
		// El tiempo total del proceso sera, aproximadamente, 
		// el tiempo del proceso mas lento (6 segundos)
		new Thread(fievel).start();
		new Thread(jerry).start();
		new Thread(pinky).start();
		new Thread(mickey).start();
	}

}

