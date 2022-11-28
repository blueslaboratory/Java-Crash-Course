package cena_filosofos;

import java.util.concurrent.ThreadLocalRandom;

public class Filosofo implements Runnable {
	
	Monitor monitor;
	int posPalilloIzquierdo, posPalilloDerecho;

	
	// CONSTRUCTOR
	public Filosofo(Monitor gestorPalillos, int palilloIzquierdo, int palilloDerecho) {
		this.monitor = gestorPalillos;
		this.posPalilloDerecho = palilloDerecho;
		this.posPalilloIzquierdo = palilloIzquierdo;
	}

	
	public void run() {
		boolean palillosCogidos;
		while (true) {
			
			// Comprobamos si podemos coger los palillos
			palillosCogidos = this.monitor.intentarCogerPalillos(posPalilloIzquierdo, posPalilloDerecho);
			
			if (palillosCogidos) {
				// Nos damos un atracon de comer
				comer();
				// Liberamos los palillos
				this.monitor.liberarPalillos(posPalilloIzquierdo, posPalilloDerecho);
				// Despues de un buen banquete, nos echamos una siesta
				dormir();
			}
		}
	}

		
	private void comer() {
		System.out.println("Filosofo " + Thread.currentThread().getName() + " comiendo");
		esperarTiempoAzar();
	}
	
	
	private void esperarTiempoAzar() {
		// Aunque aparezca la palabra Thread, nos permite generar un numero aleatorio en
		// un rango determinado
		int milisegundosAlAzar = ThreadLocalRandom.current().nextInt(1000, 5000+1);
		
		try {
			Thread.sleep(milisegundosAlAzar);
		} catch (InterruptedException ex) {
			System.out.println("Fallo la espera");
		}
	}
	
	
	private void dormir() {
		System.out.println("Filosofo " + Thread.currentThread().getName() + " zzZZZZZ");
		esperarTiempoAzar();
	}
}