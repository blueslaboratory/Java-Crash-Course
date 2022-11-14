package practica1;

// Solucion Julio: UT3 - Programacion multihilo II.pptx - pg 14

class Relevo {
	
	// CONSTRUCTOR
	public Relevo() {
		
	}

	// synchronized para no utilizar join
	public synchronized void carrera(String corredor, String equipo) {
		try {
			
			Integer numero = (int) (Math.random()*(1050-950+1)+950);
			System.out.printf(equipo + ": " + corredor + " comienza su relevo%n");
			
			/*
			for (int i=0; i<10; i++) {
				Thread.sleep(numero);
			}
			*/
			// idem a hacer
			Thread.sleep(numero*10);
			
			Float tiempo = numero.floatValue()/100;
			System.out.printf(equipo + ": " + corredor + " ha acabado su relevo - " + "Ha tardado: " + tiempo + " segundos%n");
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}



public class Ej004_RelevosThreadSynchronized extends Thread {

	private String equipo;
	private String corredor;
	private Relevo mirelevo;

	// CONSTRUCTOR
	public Ej004_RelevosThreadSynchronized(String corredor, String Equipo, Relevo mirelevo) {
		super();
		this.equipo = Equipo;
		this.corredor = corredor;
		this.mirelevo = mirelevo;
	}

	@Override
	public void run() {
		mirelevo.carrera(corredor, equipo);
	}

	public static void main(String[] args) {

		Relevo mirelevo = new Relevo();
		Ej004_RelevosThreadSynchronized hilo[] = new Ej004_RelevosThreadSynchronized[4];

		String equipo[] = { "Pepe", "Maria", "Juan", "Marta" };

		// Creamos objetos en cada posicion
		for (int i=0; i<equipo.length; i++) {
			hilo[i] = new Ej004_RelevosThreadSynchronized(equipo[i], "España", mirelevo);
			hilo[i].start();
//			try {
//				hilo[i].join();
//			   } catch (InterruptedException e) { }
		}

		//System.out.println("FINAL DE PROGRAMA");
	}

}
