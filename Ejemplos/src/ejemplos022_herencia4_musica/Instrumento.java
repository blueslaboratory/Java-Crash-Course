package ejemplos022_herencia4_musica;

public class Instrumento {

	public void tocar() {
		System.out.println("Instrumento.tocar()");
	}

	public String tipo() {
		return "Instrumento";
	}

	public void afinar() {}
}