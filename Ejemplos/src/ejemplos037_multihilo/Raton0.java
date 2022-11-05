package ejemplos037_multihilo;

public class Raton0 {

	private String nombre;
	private int tiempoAlimentacion;

	public Raton0(String nombre, int tiempoAlimentacion) {

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

	public static void main(String[] args) {
		
		Raton0 fievel = new Raton0("Fievel", 4);
		Raton0 jerry = new Raton0("Jerry", 5);
		Raton0 pinky = new Raton0("Pinky", 3);
		Raton0 mickey = new Raton0("Mickey", 6);

		fievel.comer();
		jerry.comer();
		pinky.comer();
		mickey.comer();
	}

}
