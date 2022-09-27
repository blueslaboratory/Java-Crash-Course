package ejemplos028_genericas3;
public class Golosina {

	private String nombre;

	//CONSTRUCTOR
	public Golosina(String nombre) {
		this.nombre = nombre;
	}
	
	//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//TOSTRING
	@Override
	public String toString() {
		return "Golosina [nombre=" + nombre + "]";
	}
}