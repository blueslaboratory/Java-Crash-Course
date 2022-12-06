/*
En una mesa hay procesos que simulan el comportamiento de unos
filosofos que intentan comer de un plato. Cada filosofo tiene un cubierto a
su izquierda y uno a su derecha y para poder comer tiene que conseguir
los dos. Si lo consigue, mostrara un mensaje en pantalla que indique
«Filosofo numero X comiendo».

Despues de comer, soltara los cubiertos y esperara al azar un tiempo
entre 1000 y 5000 milisegundos, indicando por pantalla 
«El filosofo numero X esta pensando».

En general todos los objetos de la clase Filosofo estan en un bucle infinito
dedicandose a comer y a pensar.

Simular este problema en un programa que muestre el progreso de todos
sin caer en problemas de sincronizacion ni de inanicion.

Ten en cuenta que:
- Se necesitan dos tenedores para comer.
- Dos filosofos vecinos no pueden comer a la vez.
- No pueden comer mas de dos filosofos pueden comer a la vez.

P.S. Para ver por que hay 5 palillos libres al ppio dibujar a 
los filosofos y sus palillos en la mesa, al ppio todos los
palillos estan libres

Dibujo:
          | filo | 
       filo      filo 
        |          | 
       filo      filo
              |
*/

package filosofos;

public class Main {
	
	private static final int N_FILOSOFOS = 5;

	public static void main(String[] args) {

		Monitor monitor = new Monitor(N_FILOSOFOS);
		Thread hilos[] = new Thread[N_FILOSOFOS];
		Filosofo filosofos[]  = new Filosofo[N_FILOSOFOS];

		
		for (int i=0; i<N_FILOSOFOS; i++) {
			// hay que controlar que el 1º filosofo tiene 
			// el ultimo y el 1º palillo: si i==0 dame N_FILOSOFOS-1 (4) y sino dame i-1
			// combinaciones: (0,4) (1,0) (2,1) (3,2) (4,3)
			filosofos[i] = new Filosofo(monitor, i, (i==0)? (N_FILOSOFOS-1):(i-1)); 
			hilos[i] = new Thread(filosofos[i]);
			hilos[i].start();	
		}
	}
}
