/*

Ejercicio 1 - Naufragos
En una isla hay unos naufragos. Su numero al detalle no se conoce, 
pero estan entre 800 y 1.000.

Tenemos 3 barcas con las que rescatarlos. Una barca tiene capacidad variable entre 20 y
40 pasajeros, otra entre 30 y 50 y la ultima entre 60 y 40.

Queremos organizar el rescate, pero la playa a la que podemos llegar con las balsas es
pequena y solo caben 2 balsas a la vez.

En cada iteracion de rescate tardamos media hora (3*1000 milisegundos)
Haremos un informe del rescate, viendo el tiempo tardado y cuantos naufragos ha
rescatado cada balsa.

Todas las balsas deben participar en el rescate.

*/

package naufragos;

import java.util.concurrent.Semaphore;

public class Barca extends Thread {

	private String nombreBarca;
	private int capacidadBarca;
	private Isla islaPerdision;
	private int rescatados = 0;
	Semaphore semaforo;
	// El semaforo se pone donde se tiene que controlar el permiso de los que entran
	
	// CONSTRUCTOR
	public Barca(String nombreBarca, int min, int max, Isla islaPerdision, Semaphore semaforo) {
		super();
		this.nombreBarca = nombreBarca;
		//this.capacidadBarca = Libreria.random(min, max);
		this.capacidadBarca = min;
		this.islaPerdision = islaPerdision;
		this.semaforo = semaforo;
	}
	
	
	// SETTERS Y GETTER
	public int getRescatados() {
		return rescatados;
	}
	
	public void setRescatados(int rescatados) {
		this.rescatados = rescatados;
	}
	
	
	// RUN
	public void run() {
		try {
			
			while(islaPerdision.getTotalNaufragos()>0) {
				rescate();
			}
			
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	

	// RESCATANDO
	public void rescate() throws InterruptedException {
		
		semaforo.acquire();
		
		// Si quedan naufragos: rescatamos
		if(islaPerdision.getTotalNaufragos()>0) {
					
			int rescatar = islaPerdision.getTotalNaufragos() - capacidadBarca;
			
			// Quitando los negativos del final		
			if(rescatar<0 && islaPerdision.getTotalNaufragos()>0) {
				rescatar = islaPerdision.getTotalNaufragos();
				System.out.println();
				System.out.println("Los ultimos naufragos por rescatar: " + rescatar);
				islaPerdision.setTotalNaufragos(0);
				System.out.println("** Rescatados: " +rescatar +" en la barca " +this.getName() +" **");
				rescatados += rescatar;
			}
			else {
				islaPerdision.setTotalNaufragos(rescatar);
				System.out.println("** Rescatados: " +capacidadBarca +" en la barca " +this.getName() +" **");
				rescatados += capacidadBarca;
			}
	
			
			System.out.println("    -> Quedan: " +islaPerdision.getTotalNaufragos() +" naufragos");
			System.out.println("    -> Rescatados barca " +nombreBarca  +": " +rescatados);
			
			Thread.sleep(300);
		}
		
		semaforo.release();
		
	}


	@Override
	public String toString() {
		return "\tBarca: " + nombreBarca 
			  +"\n\tCapacidad: " +capacidadBarca;
	}
	
	
}