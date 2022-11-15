// HACER/VER PRIMERO EL DE NAUFRAGO

package dunkerque3;

import java.util.concurrent.Semaphore;

public class Embarcacion extends Thread {

	// El semaforo se pone donde se tiene que controlar el permiso de los que entran
	Semaphore semaforoRescate;
	Semaphore semaforoDesembarco;
	
	private String nombreEmbarcacion;
	private int capacidadEmbarcacion;
	private Playa dunkerquePlaya;
	private RoyalNavy royalNavy;
	private int rescatados = 0;
	private int desembarcados = 0;
	private int desembarcadosEmbarcacion = 0;
	
	
	// CONSTRUCTOR
	public Embarcacion(String nombreEmbarcacion, int min, int max, 
					   Playa dunkerquePlaya, RoyalNavy royalNavy, 
					   Semaphore semaforoRescate, Semaphore semaforoDesembarco) {
		super();
		
		this.semaforoRescate = semaforoRescate;
		this.semaforoDesembarco = semaforoDesembarco;
		
		this.nombreEmbarcacion = nombreEmbarcacion; // LANCHAS o BOTES SALVAVIDAS
		this.capacidadEmbarcacion = Libreria.random(min, max);
		//this.capacidadEmbarcacion = max;
		
		this.dunkerquePlaya = dunkerquePlaya;
		this.royalNavy = royalNavy;
		
	}
	
	
	
	// SETTERS Y GETTER: ALT + SHIFT + S
	// Playa Dunkerque
	public Playa getDunkerquePlaya() {
		return dunkerquePlaya;
	}
	public void setDunkerquePlaya(Playa dunkerquePlaya) {
		this.dunkerquePlaya = dunkerquePlaya;
	}
	
	// Rescatados
	public int getRescatados() {
		return rescatados;
	}
	public void setRescatados(int rescatados) {
		this.rescatados = rescatados;
	}
	
	// Royal Navy
	public RoyalNavy getRoyalNavy() {
		return royalNavy;
	}
	public void setRoyalNavy(RoyalNavy royalNavy) {
		this.royalNavy = royalNavy;
	}
	
	// Desembarcados
	public int getDesembarcados() {
		return desembarcados;
	}
	public void setDesembarcados(int desembarcados) {
		this.desembarcados = desembarcados;
	}

	// DesembarcadosEmbarcacion
	public int getDesembarcadosEmbarcacion() {
		return desembarcadosEmbarcacion;
	}
	public void setDesembarcadosEmbarcacion(int desembarcadosEmbarcacion) {
		this.desembarcadosEmbarcacion = desembarcadosEmbarcacion;
	}
	
	
	
	// RUN
	public void run() {
		try {

			while (dunkerquePlaya.getSoldadosAliadosLuchando() > 0 && Libreria.COUNTER) {
				rescate();
				desembarco();
			}

		} catch (Exception e) {
			// TODO: handle exception
			//System.exit(0);
			return;
			//e.printStackTrace();
		}
	}


	
	// RESCATANDO
	//public static int SEMAFORO_OK = 0; 
	public void rescate() throws InterruptedException {

		
		semaforoRescate.acquire(); // esto garantiza que solo entran 7 a la vez a rescate()
		//System.out.println(SEMAFORO_OK++); //Thread.sleep(400); --> Thread.sleep(3000);
		
		
		if(nombreEmbarcacion.toUpperCase().equalsIgnoreCase("LANCHAS"))
			capacidadEmbarcacion = Libreria.random(100, 200);
		else if(nombreEmbarcacion.toUpperCase().equalsIgnoreCase("BOTES SALVAVIDAS"))
			capacidadEmbarcacion = Libreria.random(300, 400);
		
		
		// esto garantizaria accesos secuenciales a dunkerquePlaya
		//synchronized (dunkerquePlaya) {
		
			// Si quedan soldados: rescatamos
			if (dunkerquePlaya.getSoldadosAliadosLuchando() > 0 && Libreria.COUNTER) {
				
				// 1hora = 1000ms
				// rescatar 24mins = 400ms
				Thread.sleep(400);
				
				int rescatar = dunkerquePlaya.getSoldadosAliadosLuchando() - capacidadEmbarcacion;
	
				// Quitando los negativos del final (ultimos soldados)
				if (rescatar < 0) {
					rescatar = dunkerquePlaya.getSoldadosAliadosLuchando();
					
					capacidadEmbarcacion = rescatar;
					
					System.out.println();
					System.out.println("Los ultimos soldados por rescatar: " + rescatar);
					dunkerquePlaya.setSoldadosAliadosLuchando(rescatar);
					//EL PROBLEMA ESTA AQUI
					//dunkerquePlaya.setSoldadosAliadosLuchando(rescatar);
					System.out.println("** Rescatados: " + rescatar + " en " + nombreEmbarcacion +" (" +this.getName()+ ")"  + " **");

					System.out.println("---ANTES Variable rescatados " +rescatados +"---");
					rescatados += rescatar;
					System.out.println("---DESPUES Variable rescatados " +rescatados +"---");
					
					
					// Se han rescatado a los ultimos soldados
					//Libreria.COUNTER = false;
				} 
				else if (rescatar > 0){
					// Cambio esto JHB
					dunkerquePlaya.setSoldadosAliadosLuchando(capacidadEmbarcacion);
					//System.out.println("** Rescatados: " + capacidadEmbarcacion + " en la barca " + this.getName() + " **");
					System.out.println("1 - Han embarcado " +capacidadEmbarcacion +" soldados de la playa en " +nombreEmbarcacion);
					rescatados += capacidadEmbarcacion;
					
				}
	
				System.out.println("2 - Quedan: " + dunkerquePlaya.getSoldadosAliadosLuchando() + " soldados en la playa");
				System.out.println("    -> Rescatados en " + nombreEmbarcacion +" (" +this.getName()+ ")" + ": " + rescatados);
	
			}

		//}
		
		semaforoRescate.release();

	}
	
	
	
	// DESEMBARCANDO
	public void desembarco() throws InterruptedException {

		semaforoDesembarco.acquire(); // esto garantiza que solo entran 10 a la vez a desembarco()
			
		// esto garantizaria accesos secuenciales a royalNavy
		//synchronized (royalNavy) {
		
			if (royalNavy.getSoldadosAliadosRescatados() < 400000 && Libreria.COUNTER) {
		
				// 1hora = 1000ms
				// desembarcar es media hora
				Thread.sleep(500);
				
				desembarcados = royalNavy.getSoldadosAliadosRescatados();
				// Cambio esto JHB
				//desembarcados += capacidadEmbarcacion;				
				royalNavy.setSoldadosAliadosRescatados(capacidadEmbarcacion); // suma dentro del set
				
				// counter de embarcados por el tipo de objeto, empieza en 0
				desembarcadosEmbarcacion += capacidadEmbarcacion;
				
				System.out.println("3 - Han desembarcado en los barcos de alta mar " +capacidadEmbarcacion + " soldados desde " +nombreEmbarcacion);
				System.out.println("4 - Han embarcado " +royalNavy.getSoldadosAliadosRescatados() +" soldados en total");
					/*
				if(royalNavy.getSoldadosAliadosRescatados() == 400000 )
					Libreria.COUNTER = false;
					*/
			}
			
			// else if para que de tiempo a que llegue el ultimo hilo, sin esto no entra ese hilo
			/*
			else if (royalNavy.getSoldadosAliadosRescatados() < 400000 && !Libreria.COUNTER) {
				
				royalNavy.setSoldadosAliadosRescatados(capacidadEmbarcacion); // suma dentro del set
				
				// counter de embarcados por el tipo de objeto, empieza en 0
				// desembarcadosEmbarcacion += capacidadEmbarcacion;
				
				System.out.println("3 - Han desembarcado en los barcos de alta mar " +capacidadEmbarcacion + " soldados desde " +nombreEmbarcacion);
				System.out.println("4 - Han embarcado " +royalNavy.getSoldadosAliadosRescatados() +" soldados en total");
			}
			*/
		//}
	
		semaforoDesembarco.release();
	}

	
	
	@Override
	public String toString() {
		return "\tEmbarcacion: " +nombreEmbarcacion  +" (" +this.getName() +")"  +"\n\tCapacidad: " +capacidadEmbarcacion;
	}

}