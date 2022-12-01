/*
Escribe una clase que tenga 3 metodos para simular un IronMan: 
bici (180 km), marathon(42 km) y nadar (4.000 m). 

Luego escribe otro metodo que va enlazando las pruebas.
En la clase tendremos 4 variables: 
- velocidad a la que corres, 
- velocidad en la bici y 
- velocidad nadando, 

Ademas del nombre del participante.
En cada prueba sacaremos por consola cuando un participante 
empieza la prueba y cuando la acaba.
Vamos a suponer que 1 hora son 1000 milisegundos en nuestro programa.

Hay una carrera entre:
- Pedro: corre a 6 km / hora, en bici va a 20 km / hora y nada a 1.000 m / hora
- Juan: corre a 7 km / hora, en bici va a 18 km / hora y nada a 2.000 m / hora
- Vicente: corre a 6 km / hora, en bici va a 30 km / hora y nada a 1.000 m / hora

Todos evidentemente empiezan a competir a la vez. Quien gana? Prueba y documenta
*/


package practica1;

// Con Runable
public class Ej002_ParticipanteRunnable implements Runnable{

	private String nombre;
	private int vCorrer, vBici, vNadar;
	private int tiempoTotal = 0;

	public Ej002_ParticipanteRunnable(String nombre, int vCorrer, int vBici, int vNadar) {
		super();
		this.nombre = nombre;
		this.vCorrer = vCorrer;
		this.vBici = vBici;
		this.vNadar = vNadar;
	} 
		
	public int pruebaMarathon() {
		// tMarathon(horas)
		int tMarathon = 42/this.vCorrer;
		this.tiempoTotal += tMarathon;
		
		try {
			System.out.println(this.nombre +" ha comenzado a correr");
			Thread.sleep(tMarathon * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(this.nombre +" ha acabado la prueba de correr en " +tMarathon +" horas");
		
		return tMarathon;												
	}
	
	public int pruebaBici() {
		// tBici(horas)
		int tBici = 180/this.vBici;
		this.tiempoTotal += tBici;
		
		try {
			System.out.println(this.nombre +" ha comenzado a bicicletear");
			Thread.sleep(tBici * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(this.nombre +" ha acabado la prueba de bici en " +tBici +" horas");
		
		return tBici;												
	}
	
	public int pruebaNadar() {
		// tBici(horas)
		int tNadar = 4/this.vNadar;
		this.tiempoTotal += tNadar;
		
		try {
			System.out.println(this.nombre +" ha comenzado a nadar");
			Thread.sleep(tNadar * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(this.nombre +" ha acabado la prueba de nadar en " +tNadar +" horas");
		
		return tNadar;												
	}
	
	
	@Override
	public void run() {
		this.pruebaMarathon(); 
		this.pruebaBici(); 
		this.pruebaNadar();
		
		System.out.println(this.nombre +" ha acabado el Iron Man en un tiempo de " +this.tiempoTotal +" horas");
	}

	public static void main(String[] args) {
		Ej002_ParticipanteRunnable Pedro = new Ej002_ParticipanteRunnable("Pedro", 6, 20, 1);
		Ej002_ParticipanteRunnable Juan = new Ej002_ParticipanteRunnable("Juan", 7, 18, 2);
		Ej002_ParticipanteRunnable Vicente = new Ej002_ParticipanteRunnable("Vicente", 6, 30, 1);
		
		// llamando al run con un implements runnable
		new Thread(Pedro).start(); 
		new Thread(Juan).start();
		new Thread(Vicente).start();
		
	}
}