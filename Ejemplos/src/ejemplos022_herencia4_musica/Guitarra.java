package ejemplos022_herencia4_musica;

class Guitarra extends Instrumento {

	public void tocar() {
		System.out.println("Guitarra.tocar()");
	}

	public String tipo() {
		return "Guitarra";
	}

	// solo hereda afinar(), el resto de metodos los reescribe
}
