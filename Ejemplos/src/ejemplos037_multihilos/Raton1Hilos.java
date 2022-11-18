package ejemplos037_multihilos;

// extends Thread hace que se puedan ejecutar de forma simultanea
public class Raton1Hilos extends Thread {

	private String nombre;
	private int tiempoAlimentacion;

	public Raton1Hilos(String nombre, int tiempoAlimentacion) {
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
		Raton1Hilos fievel = new Raton1Hilos("Fievel", 4);
		Raton1Hilos jerry = new Raton1Hilos("Jerry", 5);
		Raton1Hilos pinky = new Raton1Hilos("Pinky", 3);
		Raton1Hilos mickey = new Raton1Hilos("Mickey", 6);

		// Los iniciamos de forma simultanea, siempre llamando a start() y no a run()
		// El tiempo total del proceso sera, aproximadamente, 
		// el tiempo del proceso mas lento (6 segundos)
		System.out.println("Llamandolos con start() es simultaneo");
		fievel.start();
		jerry.start();
		pinky.start();
		mickey.start();
		
		
		
		// Llamandolos con run()
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("\nLlamandolos con run() es secuencial");
		fievel.run();
		jerry.run();
		pinky.run();
		mickey.run();
	}

}
