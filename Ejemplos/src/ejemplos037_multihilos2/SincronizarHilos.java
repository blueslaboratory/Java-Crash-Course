/*
Crea un programa Java que lance cinco hilos, cada uno incrementara 
una variable contador de tipo entero, compartida por
todos, 5000 veces y luego saldra. Comprobar el resultado final de la 
variable. 

Se obtiene el resultado correcto?
Ahora sincroniza el acceso a dicha variable. Lanza los hilos primero 
mediante la clase Thread y luego mediante el interfaz
Runnable. Comprueba el resultado

La magia de este ejemplo esta en el synchronized del run
*/

package ejemplos037_multihilos2;


//CONTADOR
class Contador4 {
	private int c = 0;

	Contador4(int c) {
		this.c = c;
	}

	public void incrementa() {
	//public synchronized void incrementa() {
		c = c + 1;
	}

	public int getValor() {
		return c;
	}

}


//HILOA
class HiloA4 extends Thread {
	private Contador4 contador;

	public HiloA4(String n, Contador4 c) {
		setName(n);
		contador = c;
	}

	public void run() {
		// synchronized: palabra reservada para que en el metodo 
		// solo entre 1 hilo cada vez, es parecido al join
		
		// synchronized (contador) {
			for (int j = 0; j < 5000; j++) {
				contador.incrementa();
				/*try {
					sleep(100);
				} catch (InterruptedException e) {		}
				*/
			}
			System.out.println(getName() + " contador vale " + contador.getValor());
		// }

	}
}


public class SincronizarHilos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Contador4 cont = new Contador4(0);
		
		HiloA4 h1 = new HiloA4("HiloA1", cont);
		HiloA4 h2 = new HiloA4("HiloA2", cont);
		HiloA4 h3 = new HiloA4("HiloA3", cont);
		HiloA4 h4 = new HiloA4("HiloA4", cont);
		HiloA4 h5 = new HiloA4("HiloA5", cont);
		
		h1.start();
		h2.start();
		h3.start();
		h4.start();
		h5.start();
		
		
		
		// Valor del contador inmediato
		// SIN SYNCHRONIZED: Si entras de forma concurrente los hilos no sabes cuanto se suma
		// porque hay algunos que pueden sumar de forma concurrente y no sabes cuando termina
		// no siempre llega a 25000
		System.out.println("***VALOR*** - contador inmediato: " +cont.getValor());
		
		
		
		
		// isAlive()
		// true if this thread is alive; false otherwise.
		
		// mientras haya algun hilo vivo, duerme 100ms
		do {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while(
		   h1.isAlive() ||
		   h2.isAlive() ||	
		   h3.isAlive() ||
		   h4.isAlive() ||
		   h5.isAlive());
		
		System.out.println("***VALOR*** - contador do while: " +cont.getValor());
		
		
		
		
		// Si es cierto que todos los hilos han muerto, imprime contador
		if (!(h1.isAlive() && 
			  h2.isAlive() &&	
			  h3.isAlive() && 
			  h4.isAlive() &&
			  h5.isAlive())) {
			
			System.out.println("***VALOR*** - contador if: " +cont.getValor());
			
		}	
	}
}
