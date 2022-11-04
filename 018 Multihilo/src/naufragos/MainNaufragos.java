/*

Ejercicio 1 - Naufragos
En una isla hay unos naufragos. Su numero al detalle no se conoce, 
pero estan entre 800 y 1.000.

Tenemos 3 barcas con las que rescatarlos. Una barca tiene capacidad variable entre 20 y
40 pasajeros, otra entre 30 y 50 y la ultima entre 60 y 40.

Queremos organizar el rescate, pero la playa a la que podemos llegar con las balsas es
pequena y solo caben 2 balsas a la vez.

En cada iteracion de rescate tardamos media hora (3*100 milisegundos)
Haremos un informe del rescate, viendo el tiempo tardado y cuantos naufragos ha
rescatado cada balsa.

Todas las balsas deben participar en el rescate.

*/


package naufragos;

import java.util.concurrent.Semaphore;

public class MainNaufragos {

	public static void main(String[] args) {
		
		// en la isla solo caben 2 balsas a la vez
		// SIEMPRE: CREAR EL SEMAFORO EN EL MAIN
		Semaphore semaforo = new Semaphore(2); 

		
		Isla madagascar = new Isla();
		
		Barca b0 = new Barca("0", 20, 40, madagascar, semaforo);
		Barca b1 = new Barca("1", 30, 50, madagascar, semaforo);
		Barca b2 = new Barca("2", 40, 60, madagascar, semaforo);
		
		
		// UTILIZAR START Y NO RUN
		System.out.println("CONDICIONES INICIALES EN LA ISLA");
		System.out.println("\tHay " +madagascar.getTotalNaufragos() + " naufragos");
		System.out.println();
		
		System.out.println("BARCAS");
		System.out.println(b0);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println();
		
		System.out.println("COMIENZA OPERACION RESCATE");
		System.out.println();
		b0.start();
		b1.start();
		b2.start();
		
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println();
		System.out.println("RESCATADOS");
		System.out.println("\tBarca 0: " +b0.getRescatados());
		System.out.println("\tBarca 1: " +b1.getRescatados());
		System.out.println("\tBarca 2: " +b2.getRescatados());
		
		System.out.println();
		System.out.println("TOTAL: " +(b0.getRescatados()+b1.getRescatados()+b2.getRescatados()));
	}

}
