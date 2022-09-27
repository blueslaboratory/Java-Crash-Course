package accesoBBDD_Ej004TiendaEnumSol;

public enum IVA {
	FRANJA1(0.08), FRANJA2(0.10), FRANJA3(0.12), FRANJA4(0.14);
	
	private final double vIva; 
	
	IVA (double vIva){
		this.vIva = vIva;
	}
	
	public double valor() {
		return vIva;
	}
}
