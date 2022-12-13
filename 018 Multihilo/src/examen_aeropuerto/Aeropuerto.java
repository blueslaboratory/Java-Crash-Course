package examen_aeropuerto;

public class Aeropuerto {
	
	private Boolean pistalibre = true;
	private int ultimoAvion = -1;
	
	// CONSTRUCTOR
	public Aeropuerto() {}
	
	public synchronized Boolean getPistaLibre() {
		if(pistalibre) {
			pistalibre= false;
			return true;			
		} else {
			return false;
		}
	}
	
	public synchronized void setultimoAvion(int ultimoAvion) {
		// Si me pasan el ultimo avion, lo guardo y libero la pista
		this.ultimoAvion = ultimoAvion;
		pistalibre= true;		
	}
	
	public int getultimoAvion() {
		return this.ultimoAvion;
	}
	
}