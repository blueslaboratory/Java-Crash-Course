package ejemplos023_abstractas2_musica;

public class Piano extends Instrumento {
	public void tocar() {
		System.out.println("Piano.tocar()");
	}

	public String tipo() {
		return "Piano";
	}

	public void afinar() {
		System.out.println("Piano.afinar()");
	}
	// Si hago Piano abstracta puedo quitar afinar pero no la puedo instanciar
}