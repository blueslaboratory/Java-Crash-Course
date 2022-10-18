package ejemplos037_multihilo;

public class RatonGrupos extends Thread {

	private String nombre;
	private int tiempoAlimentacion;

	public RatonGrupos(String nombre, int tiempoAlimentacion) {

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
		System.out.println("\nInformacion del hilo: " + Thread.currentThread().toString());
		this.comer();
	}

	public static void main(String[] args) {

		ThreadGroup grupo = new ThreadGroup("Grupo de hilos");

		RatonGrupos fievel = new RatonGrupos("Fievel", 4);
		Thread t1 = new Thread(grupo, fievel);
		
		RatonGrupos jerry = new RatonGrupos("Jerry", 5);
		
		RatonGrupos pinky = new RatonGrupos("Pinky", 3);
		Thread t3 = new Thread(grupo, pinky);
		
		RatonGrupos mickey = new RatonGrupos("Mickey", 6);

		t1.start();
		jerry.start();
		t3.start();
		mickey.start();
	}

}
