package ejemplos023_abstractas2_musica;

// Un tipo de Guitarra 
public class Ukelele extends Guitarra {
	public void tocar() {
		System.out.println("Ukelele.tocar()");
	}

	public String tipo() {
		return "Ukelele";
	}
}
