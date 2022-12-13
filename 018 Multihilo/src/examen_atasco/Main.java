/*

En una carretera de varios carriles se ha producido un accidente, de forma que para un
tramo ha quedado habilitado un unico carril.
El tramo de un unico carril cuesta pasarlo 30 segundos (en nuestro programa 500
milisegundos) y se considera que la carretera esta atascada cuando se llega a 100º coches
parados, obligando a desviar el trafico por otra carretera, cosa que pasa rapidamente.
Esta situacion esta representada en el proyecto “EXAMEN_Ej_Multihilo_atasco”.
Si se colocaran mejor los coches accidentados, de forma que se habilitaran 2 carriles para
pasar el tramo donde estan los coches accidentados, la carretera no se atascaria, es cierto?
Haz los cambios necesarios para comprobarlo.

*/

package examen_atasco;


import java.util.concurrent.Semaphore;

public class Main {

	public static void main(String[] args){
		
		// agregamos el semaforo con 2 carriles
		Semaphore s = new Semaphore(2);
		
		
		int j = 9999; // numero de hilos
		
		PuntoAtasco mipuntoatasco = new PuntoAtasco(s); // le pasamos el semaforo al objeto
		Contador contador = new Contador(mipuntoatasco);
		Coche coche[] = new Coche[j];
		

		contador.start();
		// Creamos objetos en cada posicion
		for (int i = 0; i < j; i++) {
			coche[i] = new Coche(mipuntoatasco);
			coche[i].start();
			// System.out.println("Entrando coche "+i+ " en el atasco");
			try {
				int numero = (int) (Math.random() * (400 - 200) + 200);
				Thread.sleep(numero);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (!contador.contadorMarcha) {
				break;
			}
		}
	}
}
