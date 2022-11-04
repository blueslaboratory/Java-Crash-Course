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

public class Isla {

	private int totalNaufragos;
	// en la isla solo caben 2 balsas a la vez, pero el sema:
	// se declara en el main y se pasa a cada barca
	// Semaphore semaforo = new Semaphore(2); 

	// CONSTRUCTOR
	public Isla() {
		this.totalNaufragos = Libreria.random(800, 1000);
	}

	// GETTERS Y SETTERS: ALT + SHIFT + S
	//public int getTotalNaufragos() {
	public synchronized int getTotalNaufragos() {
		//semaforo.acquire();
		//Thread.sleep(1000*3);
		//semaforo.release();
		return totalNaufragos;
	}

	//public void setTotalNaufragos(int totalNaufragos)
	public synchronized void setTotalNaufragos(int totalNaufragos) {
		this.totalNaufragos = totalNaufragos;
	}
	

}
