package ejemplos037_multihilo;

public class RatonHilosVerInfo extends Thread {

	private String nombre;
	private int tiempoAlimentacion;

	public RatonHilosVerInfo(String nombre, int tiempoAlimentacion) {
		super();
		this.nombre = nombre;
		this.tiempoAlimentacion = tiempoAlimentacion;
	}

	public void comer() {
		try {
			System.out.printf("El raton " + this.nombre + " ha comenzado a alimentarse%n", nombre);
			this.sleep(tiempoAlimentacion * 1000);
			System.out.printf("El raton " + this.nombre + " ha terminado de alimentarse%n", nombre);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		System.out.println("Dentro del Hilo  : " + Thread.currentThread().getName() 
				+ "\n\tPrioridad    : "+ Thread.currentThread().getPriority() 
				+ "\n\tID           : " + Thread.currentThread().getId()
				+ "\n\tHilos activos: " + Thread.currentThread().activeCount());
		this.comer();

	}

	public static void main(String[] args) {
		RatonHilosVerInfo fievel = new RatonHilosVerInfo("Fievel", 4);
		RatonHilosVerInfo jerry = new RatonHilosVerInfo("Jerry", 5);
		RatonHilosVerInfo pinky = new RatonHilosVerInfo("Pinky", 3);
		RatonHilosVerInfo mickey = new RatonHilosVerInfo("Mickey", 6);

		fievel.start();
		jerry.start();
		pinky.start();
		mickey.start();
	}

}
