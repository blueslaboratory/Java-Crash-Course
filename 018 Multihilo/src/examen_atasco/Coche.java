package examen_atasco;

public class Coche extends Thread{
	
	PuntoAtasco mipuntoatasco;
	
	public Coche(PuntoAtasco mipuntoatasco) {
		this.mipuntoatasco = mipuntoatasco;		
	    // Incrementamos en 1 el numero de coches en el atasco
		this.mipuntoatasco.AnadeCocheAtasco();
	}

	// Los coches esperan su turno para pasar el punto de atasco
	public void run() {
		this.mipuntoatasco.pasarAtasco();	
	}
	
}