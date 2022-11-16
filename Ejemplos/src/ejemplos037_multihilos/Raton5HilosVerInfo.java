package ejemplos037_multihilos;

public class Raton5HilosVerInfo extends Thread {

	private String nombre;
	private int tiempoAlimentacion;

	public Raton5HilosVerInfo(String nombre, int tiempoAlimentacion) {
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
					     + "\n\tPrioridad    : " + Thread.currentThread().getPriority() 
					     + "\n\tID           : " + Thread.currentThread().getId()
					     + "\n\tHilos activos: " + Thread.currentThread().activeCount());
		this.comer();

	}

	public static void main(String[] args) {
		Raton5HilosVerInfo fievel = new Raton5HilosVerInfo("Fievel", 4);
		Raton5HilosVerInfo jerry = new Raton5HilosVerInfo("Jerry", 5);
		Raton5HilosVerInfo pinky = new Raton5HilosVerInfo("Pinky", 3);
		Raton5HilosVerInfo mickey = new Raton5HilosVerInfo("Mickey", 6);

		fievel.start();
		jerry.start();
		pinky.start();
		mickey.start();
	}

}
