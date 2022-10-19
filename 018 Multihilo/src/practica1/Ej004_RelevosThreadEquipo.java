/*
Utilizando la clase anterior, o una copia ya que posiblemente necesites hacerle alguna
modificación, haz un proyecto y anade otra clase con la que los equipos de España y
EEUU van a hacer una carrera de relevos:
*/

package practica1;

public class Ej004_RelevosThreadEquipo extends Thread{

	private String pais;
	private float tiempoTotal = 0;
	
	private Ej004_RelevosThread r1; 
	private Ej004_RelevosThread r2; 
	private Ej004_RelevosThread r3; 
	private Ej004_RelevosThread r4;

	public Ej004_RelevosThreadEquipo(String pais, Ej004_RelevosThread r1, 
												  Ej004_RelevosThread r2,
												  Ej004_RelevosThread r3,
												  Ej004_RelevosThread r4) {
		super ();
		this.pais = pais;
		this.r1 = r1;
		this.r2 = r2;
		this.r3 = r3;
		this.r4 = r4;
	} 
		
	public void relevos() {
		
		try {
			// el join es para ordenar hilos
			// mientras el hilo de este en la cpu
			// no me saques la parte de abajo del join
			
			this.r1.start();
			this.r1.join();
			this.tiempoTotal += (float)r1.getvCorrer()*10/1000;
			
			this.r2.start();
			this.r2.join();
			this.tiempoTotal += (float)r2.getvCorrer()*10/1000;
			
			this.r3.start();
			this.r3.join();
			this.tiempoTotal += (float)r3.getvCorrer()*10/1000;
			
			this.r4.start();
			this.r4.join();
			this.tiempoTotal += (float)r4.getvCorrer()*10/1000;
			

			System.out.println("*** " +this.pais +" - Tiempo total: " +this.tiempoTotal +" ***");

		} catch (InterruptedException e) {
			e.printStackTrace();
		}											
	}
	
	
	@Override
	public void run() {
		this.relevos(); 
	}

	public static int aleatorio() {
		// En general, para conseguir un numero entero entre [N, M]
		// con N < M y ambos incluidos, debemos usar esta formula:
		// int valorEntero = Math.floor(Math.random()*(M-N+1)+N);
		// Valor entre M y N, ambos incluidos.

		return (int) Math.floor(Math.random() * (1050 - 950 + 1) + 950); 
	}
	
	
	public static void main(String[] args) {
		
		// Equipo Spain
		Ej004_RelevosThread Pepe = new Ej004_RelevosThread("Spain", "Pepe", aleatorio());
		Ej004_RelevosThread Maria = new Ej004_RelevosThread("Spain", "Maria", aleatorio());
		Ej004_RelevosThread Juan = new Ej004_RelevosThread("Spain", "Juan", aleatorio());
		Ej004_RelevosThread Marta = new Ej004_RelevosThread("Spain", "Marta", aleatorio());
		
		Ej004_RelevosThreadEquipo spain = new Ej004_RelevosThreadEquipo("Spain", Pepe, Maria, Juan, Marta);
		
		
		// Equipo EEUU
		Ej004_RelevosThread John = new Ej004_RelevosThread("EEUU", "John", aleatorio());
		Ej004_RelevosThread Kim = new Ej004_RelevosThread("EEUU", "Kim", aleatorio());
		Ej004_RelevosThread Mike = new Ej004_RelevosThread("EEUU", "Mike", aleatorio());
		Ej004_RelevosThread Sarah = new Ej004_RelevosThread("EEUU", "Sarah", aleatorio());

		Ej004_RelevosThreadEquipo eeuu = new Ej004_RelevosThreadEquipo("EEUU", John, Kim, Mike, Sarah);
		
		
		// Empieza la carrera
		spain.start();
		eeuu.start();
	}
}
