package ejemplos037_multihilos;

public class Raton4Join implements Runnable {
	
	private String nombre;
	private int tiempoAlimentacion;
	
	// CONSTRUCTOR 
	public Raton4Join(String nombre, int tiempoAlimentacion) {
		super();
		this.nombre = nombre;
		this.tiempoAlimentacion = tiempoAlimentacion;
	}
	
	// GETTERS Y SETTERS: ALT + SHIFT + S
	public int getTiempoAlimentacion() {
		return tiempoAlimentacion;
	}
	
	// OTROS METODOS
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

		Raton4Join fievel = new Raton4Join("Fievel", 4);
		Raton4Join jerry = new Raton4Join("Jerry", 5);
		Raton4Join pinky = new Raton4Join("Pinky", 3);
		Raton4Join mickey = new Raton4Join("Mickey", 6);

		// 1a forma de iniciar un thread
		new Thread(fievel).start();
		new Thread(jerry).start();

		// 2a forma de iniciar un thread
		Thread tpinky = new Thread(pinky);
		tpinky.start();

		
		try {
			System.out.println("\n*** estoy en el join de pinky ***");
			
			for(int i=0; i<pinky.getTiempoAlimentacion(); i++) {
				Thread.sleep(950);
				System.out.println("esperando... t=" +i +"s");
			}
			
			tpinky.join(); 
			// el join es para ordenar hilos
			// mientras el hilo de pinky este en la cpu
			// no me saques la parte de abajo del join
			// pinky tarda 3s en alimentarse
			
			System.out.println("*** estoy fuera del join de pinky ***");
			System.out.println();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		
		new Thread(mickey).start();
		
		
		// dormir hasta el final del programa
		try {
			Thread.sleep(6500);	// 6000(mickey)
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("FINAL DE PROGRAMA");
	}

}