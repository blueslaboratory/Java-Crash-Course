package examen_aeropuerto;

public class Contador extends Thread{
	
	Boolean contadorMarcha = true;
	public Contador() {}
	
	public void contador() {
		try {
			int i = 0;
			
			while(contadorMarcha) {
				
				System.out.printf(i +" %n");
				this.sleep(1000);
				i++;
				
				if(i==70) {
					contadorMarcha = false;
				}
				
			}
			
		} catch (InterruptedException e) {
			// se lanza esta excepcion cuando interrumpimos el hilo
			// Aqui colocamos el codigo que queremos que se ejecute. 
			// En este caso, irnos
			return;		
		}														
	}
	
	
	@Override
	public void run() {
		this.contador();
	}
}	
