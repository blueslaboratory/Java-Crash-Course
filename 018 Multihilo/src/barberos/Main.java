/*
Problema: barberos
En una peluqueria hay barberos y sillas para los clientes (siempre hay
mas sillas que clientes). Sin embargo, en esta peluqueria no siempre hay
trabajo por lo que los barberos duermen cuando no hay clientes a los que
afeitar. Un cliente puede llegar a la barberia y encontrar alguna silla libre,
en cuyo caso, el cliente se sienta y esperara que algun barbero le afeite.
Puede ocurrir que el cliente llegue y no haya sillas libres, en cuyo caso se
marcha. Simular el comportamiento de la barberia mediante un programa
teniendo en cuenta que:

- Se generan clientes continuamente, algunos encuentran silla y
otros no. Los que no consigan silla desaparecen (terminan su
ejecucion)

- Puede haber mas sillas que barberos y al reves (poner constantes
para poder cambiar facilmente entre ejecuciones)

- Se recuerda que no debe haber inanicion, es decir ningun cliente
deberia quedarse en una silla esperando un tiempo infinito.
*/

package barberos;

import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		
		int MAX_BARBEROS 	= 2;
		int MAX_SILLAS 		= MAX_BARBEROS + 1;
		int MAX_CLIENTES 	= MAX_BARBEROS * 10;
		int MAX_ESPERA_SEGS = 3;

		Monitor monitor = new Monitor(MAX_SILLAS);
		Thread[] tBarberos = new Thread[MAX_BARBEROS];
		Random generadorAleatorios = new Random();
		
		
		// Creando los hilos barberos
		for (int i=0; i<MAX_BARBEROS; i++) {
			
			Barbero b = new Barbero(monitor, "Barbero " + i);
			Thread tBarbero = new Thread(b);
			
			tBarberos[i] = tBarbero;
			tBarbero.start();
		}

		
		// Creando los hilos clientes
		for (int i=0; i<MAX_CLIENTES; i++) {
			
			Cliente c = new Cliente(monitor);
			Thread tCliente = new Thread(c);
			
			tCliente.start();
			int tiempo = generadorAleatorios.nextInt(3)*1000;
			
			try {
				Thread.sleep(tiempo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}