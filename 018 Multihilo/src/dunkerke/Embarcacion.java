// HACER/VER PRIMERO EL DE NAUFRAGO

package dunkerke;

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
	
	
	// CONSTRUCTOR
	public Embarcacion(String nombreEmbarcacion, int min, int max, 
					   Playa dunkerquePlaya, RoyalNavy royalNavy, 
					   Semaphore semaforoRescate, Semaphore semaforoDesembarco) {
		super();
		
		this.semaforoRescate = semaforoRescate;
		this.semaforoDesembarco = semaforoDesembarco;
		
		this.nombreEmbarcacion = nombreEmbarcacion; // LANCHAS o BOTES SALVAVIDAS
		// this.capacidadEmbarcacion = Libreria.random(min, max);
		this.capacidadEmbarcacion = min;
		
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



	// RUN
	public void run() {
		try {

			while (dunkerquePlaya.getSoldadosAliadosLuchando() > 0 && Libreria.COUNTER) {
				rescate();
				desembarco();
			}

		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}


	
	// RESCATANDO
	public void rescate() throws InterruptedException {

		semaforoRescate.acquire();
		
		/*
		if(nombreEmbarcacion.toUpperCase().equalsIgnoreCase("LANCHAS"))
			capacidadEmbarcacion = Libreria.random(500, 1000);
		else if(nombreEmbarcacion.toUpperCase().equalsIgnoreCase("BOTES SALVAVIDAS"))
			capacidadEmbarcacion = Libreria.random(1500, 2000);
		*/
		
		// Si quedan naufragos: rescatamos
		if (dunkerquePlaya.getSoldadosAliadosLuchando() > 0) {
			
			// 1hora = 1000ms
			// rescatar es media hora
			Thread.sleep(500);
			
			int rescatar = dunkerquePlaya.getSoldadosAliadosLuchando() - capacidadEmbarcacion;

			// Quitando los negativos del final
			if (rescatar < 0 && dunkerquePlaya.getSoldadosAliadosLuchando() > 0) {
				rescatar = dunkerquePlaya.getSoldadosAliadosLuchando();
				System.out.println();
				System.out.println("Los ultimos soldados por rescatar: " + rescatar);
				dunkerquePlaya.setSoldadosAliadosLuchando(0);
				System.out.println("** Rescatados: " + rescatar + " en " + nombreEmbarcacion + " **");
				rescatados += rescatar;
				
				// Se han rescatado a los ultimos soldados
				Libreria.COUNTER = false;
			} else {
				dunkerquePlaya.setSoldadosAliadosLuchando(rescatar);
				//System.out.println("** Rescatados: " + capacidadEmbarcacion + " en la barca " + this.getName() + " **");
				System.out.println("1 - Han embarcado " +capacidadEmbarcacion +" soldados de la playa en " +nombreEmbarcacion);
				rescatados += capacidadEmbarcacion;
			}

			System.out.println("2 - Quedan: " + dunkerquePlaya.getSoldadosAliadosLuchando() + " soldados en la playa");
			System.out.println("    -> Rescatados en " + nombreEmbarcacion + ": " + rescatados);

		}

		semaforoRescate.release();

	}
	
	
	
	// DESEMBARCANDO
	public void desembarco() throws InterruptedException {

		semaforoDesembarco.acquire();
		
		
		// 1hora = 1000ms
		// desembarcar es media hora
		Thread.sleep(500);
		
		desembarcados = royalNavy.getSoldadosAliadosRescatados();
		desembarcados += capacidadEmbarcacion;
		royalNavy.setSoldadosAliadosRescatados(desembarcados);
		
		System.out.println("3 - Han desembarcado en los barcos de alta mar " +capacidadEmbarcacion + " soldados desde " +nombreEmbarcacion);
		System.out.println("4 - Han embarcado " +royalNavy.getSoldadosAliadosRescatados() +" soldados en total");
		
		
		semaforoDesembarco.release();
	}

	
	
	@Override
	public String toString() {
		return "\tEmbarcacion: " + nombreEmbarcacion + "\n\tCapacidad: " + capacidadEmbarcacion;
	}

}