package ejemplos023_abstractas2_musica;

public class Saxofon extends Instrumento {
	public void tocar() {
		System.out.println("Saxofon.tocar()");
	}

	public String tipo() {
		return "Saxofon";
	}

	public void afinar() {
		System.out.println("Saxofon.afinar()");
	}
	// Si hago Piano abstracta puedo quitar afinar pero no la puedo instanciar
}