package ejemplos037_multihilos2;

import java.util.concurrent.Semaphore;

public class SemaforoBasico implements Runnable{
	
	// Con synchronized puedes decir que entra 1 solo hilo, 
	// Con semaforos puedes elegir el numero de hilos que entra, 
	// pueden entrar 10 hilos por ejemplo
	
	// este semaforo permite 3 hilos a la cez
	Semaphore semaforo = new Semaphore(3);

	
	@Override
	public void run() {
		
		try{
			semaforo.acquire();
			
			System.out.println("Paso 1 - " +this.toString());
			Thread.sleep(1000);
			System.out.println("Paso 2");
			Thread.sleep(1000);
			System.out.println("Paso 3");
			Thread.sleep(1000);
			
			semaforo.release();
			
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	public static void main (String args[]) {
		
		SemaforoBasico sb = new SemaforoBasico();
		
		// este for crea 5 hilos
		for(int i=0; i<5; i++ ) {
			new Thread(sb).start();
		}
	}
}
