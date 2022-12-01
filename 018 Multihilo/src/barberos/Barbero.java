package barberos;

import java.util.concurrent.ThreadLocalRandom;

public class Barbero implements Runnable {

	private String nombre;
	private Monitor monitor;
	
	
	// CONSTRUCTOR
	public Barbero(Monitor monitor, String nombre) {
		this.nombre = nombre;
		this.monitor = monitor;
	}
	
	
	public void esperarTiempoAzar() {
		
		int milisegundosAlAzar = ThreadLocalRandom.current().nextInt(1000, 5000 + 1);
		
		try {
			Thread.currentThread().sleep(milisegundosAlAzar);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	public void run() {
		int num_silla;
		
		while (true) {
			
			num_silla = monitor.atenderAlgunCliente();
			
			/* Mientras no haya nadie a quien atender, esperamos */
			while (num_silla == -1) {
				esperarTiempoAzar();
				num_silla = monitor.atenderAlgunCliente();
			}
			
			/* Atendemos al cliente que acaba de llegar */
			esperarTiempoAzar();
			
			/* Liberamos la silla tras el afeitado */
			monitor.liberarSilla(num_silla);
		}
	}
}