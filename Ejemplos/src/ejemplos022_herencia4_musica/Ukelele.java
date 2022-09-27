package ejemplos022_herencia4_musica;

// Un tipo de Guitarra 
class Ukelele extends Guitarra {
	public void tocar() {
		System.out.println("Ukelele.tocar()");
	}

	public String tipo() {
		return "Ukelele";
	}
	// solo hereda afinar(), el resto de metodos los reescribe
}
