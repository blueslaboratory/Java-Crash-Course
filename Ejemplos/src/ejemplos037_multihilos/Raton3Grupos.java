package ejemplos037_multihilos;

public class Raton3Grupos extends Thread {

	private String nombre;
	private int tiempoAlimentacion;

	public Raton3Grupos(String nombre, int tiempoAlimentacion) {

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
		System.out.println("\nInformacion del hilo: " + Thread.currentThread().toString() + "-" +this.nombre);
		this.comer();
	}

	public static void main(String[] args) {

		ThreadGroup grupo = new ThreadGroup("Grupo de hilos");

		
		Raton3Grupos fievel = new Raton3Grupos("Fievel", 4);
		Thread t1 = new Thread(grupo, fievel);
		Raton3Grupos pinky = new Raton3Grupos("Pinky", 3);
		Thread t3 = new Thread(grupo, pinky);
		
		
		Raton3Grupos jerry = new Raton3Grupos("Jerry", 5);
		Raton3Grupos mickey = new Raton3Grupos("Mickey", 6);

		
		t1.start();
		t3.start();
		
		
		jerry.start();
		mickey.start();
	}

}
