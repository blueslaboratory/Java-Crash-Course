package ejemplos028_genericas4;
public class Chocolatina {

	private String marca;

	//CONSTRUCTORES
	public Chocolatina(String marca) {
		this.marca = marca;
	}
	
	//SETTERS Y GETTERS
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	//TOSTRING
	@Override
	public String toString() {
		return "Chocolatina [marca=" + marca + "]";
	}
	
}