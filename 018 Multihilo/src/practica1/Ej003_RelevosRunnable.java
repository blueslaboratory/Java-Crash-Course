/*
Crea una clase java con un metodo que simule que un corredor esta corriendo 100 metros.
La velocidad con la que corre 10 metros sera un numero aleatorio entre 950 y 1.050
milisegundos.
El metodo nos indicara cuando un corredor empieza el relevo y cuando lo acaba, ademas
de al equipo al que pertenece.
Un corredor no puede empezar a correr hasta que le hayan pasado el relevo (ha acabado el
corredor anterior). 

Como podemos controlar que un hilo no empiece hasta haber acabado
el anterior? “join”
*/

package practica1;

public class Ej003_RelevosRunnable implements Runnable{

	private String nombre;
	private int vCorrer;
	//private int tiempoTotal = 0;

	public Ej003_RelevosRunnable(String nombre, int vCorrer) {
		super ();
		this.nombre = nombre;
		this.vCorrer = vCorrer;
	} 
		
	public int cienMetros() {
		// tMarathon(horas)
		int tCienMetros = 10*this.vCorrer;
		
		try {
			System.out.println(this.nombre +" comienza su relevo a " +(float)tCienMetros/1000 +"m/s");
			Thread.sleep(tCienMetros);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(this.nombre +" ha acabado su relevo - ha tardado " +(float)tCienMetros/1000+" segundos");
		
		return tCienMetros;												
	}
	
	
	@Override
	public void run() {
		this.cienMetros(); 
	}

	public static int aleatorio() {
		// En general, para conseguir un numero entero entre [N, M]
		// con N < M y ambos incluidos, debemos usar esta formula:
		// int valorEntero = Math.floor(Math.random()*(M-N+1)+N);
		// Valor entre M y N, ambos incluidos.

		return (int) Math.floor(Math.random() * (1050 - 950 + 1) + 950); 
	}
	
	public static void relevo(Thread t) {
		
		t.start();
		
		try {
			// el join es para ordenar hilos
			// mientras el hilo de este en la cpu
			// no me saques la parte de abajo del join
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Ej003_RelevosRunnable Pepe = new Ej003_RelevosRunnable("Pepe", aleatorio());
		Ej003_RelevosRunnable Maria = new Ej003_RelevosRunnable("Maria", aleatorio());
		Ej003_RelevosRunnable Juan = new Ej003_RelevosRunnable("Juan", aleatorio());
		Ej003_RelevosRunnable Marta = new Ej003_RelevosRunnable("Marta", aleatorio());
		
		Thread t1 = new Thread(Pepe);
		Thread t2 = new Thread(Maria);
		Thread t3 = new Thread(Juan);
		Thread t4 = new Thread(Marta);
		
		relevo(t1);
		relevo(t2);
		relevo(t3);
		relevo(t4);
	}
	
}