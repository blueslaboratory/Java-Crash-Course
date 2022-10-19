package enumerados2;

public class Futbolista {

	private int dorsal;
	private String Nombre;
	private Demarcacion demarcacion;
	private Equipo equipo;

	
	public Futbolista() {}
	public Futbolista(String nombre, int dorsal, Demarcacion demarcacion, Equipo equipo) {
		this.dorsal = dorsal;
		Nombre = nombre;
		this.demarcacion = demarcacion;
		this.equipo = equipo;
	}

	
	// Metodos getter y setter: ALT + SHIFT + S
	// Getter
	public int getDorsal() {
		return dorsal;
	}
	public String getNombre() {
		return Nombre;
	}
	public Demarcacion getDemarcacion() {
		return demarcacion;
	}
	public Equipo getEquipo() {
		return equipo;
	}
	
	//Setter
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public void setDemarcacion(Demarcacion demarcacion) {
		this.demarcacion = demarcacion;
	}
	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	
	@Override
	public String toString() {
		return this.dorsal + " - " 
				+ this.Nombre + " - " 
				+ this.demarcacion.name() + " - "
				+ this.equipo.getNombreClub();
	}
}