package accesoBBDD_Ej004TiendaEnum;

public enum Iva {
	//Las clases
	ALTO(0.14), 
	MEDIOALTO(0.12), 
	MEDIOBAJO(0.1), 
	BAJO(0.08);
	
	private double i;
	
	//Constructor
	Iva(double i) {
		this.i = i;
	}

	//Getters
	public double getI() {
		return i;
	}
	
	
}
