/*
En una mesa hay procesos que simulan el comportamiento de unos
filosofos que intentan comer de un plato. Cada filosofo tiene un cubierto a
su izquierda y uno a su derecha y para poder comer tiene que conseguir
los dos. Si lo consigue, mostrara un mensaje en pantalla que indique
«Filosofo numero comiendo».

Despues de comer, soltara los cubiertos y esperara al azar un tiempo
entre 1000 y 5000 milisegundos, indicando por pantalla «El filosofo
numero esta pensando».

En general todos los objetos de la clase Filosofo esta en un bucle infinito
dedicandose a comer y a pensar.

Simular este problema en un programa que muestre el progreso de todos
sin caer en problemas de sincronizacion ni de inanicion.


Ten en cuenta que:
- Se necesitan dos tenedores para comer.
- Dos filosofos vecinos no pueden comer a la vez.
- No pueden comer mas de dos filosofos pueden comer a la vez.
*/

package cena_filosofos;

public class Main {
	
	private static final int N_FILOSOFOS = 5;

	public static void main(String[] args) {

		Monitor monitor;
		Thread hilos[];
		Filosofo filosofos[];

		monitor = new Monitor(N_FILOSOFOS);
		filosofos = new Filosofo[N_FILOSOFOS];
		hilos = new Thread[N_FILOSOFOS];

		for (int i=0; i<N_FILOSOFOS; i++) {
			
			filosofos[i] = new Filosofo(monitor, i, (i==0)? 4:i-1); // si i==0 dame 4 y sino dame i-1
			hilos[i] = new Thread(filosofos[i]);
			hilos[i].start();
			
		}
	}
}
