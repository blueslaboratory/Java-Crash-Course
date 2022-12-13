package examen_atasco;

public class Contador extends Thread{
	
	PuntoAtasco mipuntoatasco;
	Boolean contadorMarcha = true;
	
	public  Contador(PuntoAtasco mipuntoatasco) {
		this.mipuntoatasco = mipuntoatasco;		
	}
		
	public void contador() {
		try {
			int i = 0;
			while(contadorMarcha) {
				System.out.printf(i +" %n");
				this.sleep(1000);
				i++;
				if(i%5==0) {
					System.out.println("Numero de coches en el atasco: " + this.mipuntoatasco.getCochesAtascados());					
				}
				if(this.mipuntoatasco.getCochesAtascados()>=100) {
					System.out.println("Carretera colapsada. Hay que cerrarla. ");
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
