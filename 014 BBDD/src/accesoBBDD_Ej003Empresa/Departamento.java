package accesoBBDD_Ej003Empresa;

public class Departamento {
	int n;
	String nom, loc;
	
	//ALT + SHIFT + S
	public Departamento() {}
	public Departamento(int n, String nom, String loc) {
		this.n = n;
		this.nom = nom;
		this.loc = loc;
	}
	
	
	//GETTERS
	public int getN() {
		return n;
	}
	public String getNom() {
		return nom;
	}
	public String getLoc() {
		return loc;
	}
	
	
	//SETTERS
	public void setN(int n) {
		this.n = n;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "\nDepartamento " + n 
				+ "\n\tNombre: " + nom 
				+ "\n\tLocalizacion: " + loc;
	}
}
