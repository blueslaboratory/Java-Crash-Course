package ejemplos023_abstractas2_musica;

//final class Guitarra extends Instrumento {
//si quieres que alguien no siga desarrollando tu clase, la declaras como FINAL
public class Guitarra extends Instrumento {
	public void tocar() {
		System.out.println("Guitarra.tocar()");
	}

	public String tipo() {
		return "Guitarra";
	}

	public void afinar() {
		System.out.println("Guitarra.afinar()");
	}
	// Si hago Guitarra abstracta puedo quitar afinar pero no la puedo instanciar
}
