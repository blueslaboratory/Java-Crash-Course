package ejemplos022_herencia4_musica;

class Saxofon extends Instrumento {
	public void tocar() {
		System.out.println("Saxofon.tocar()");
	}

	public String tipo() {
		return "Saxofon";
	}

    //solo hereda afinar(), el resto de metodos los reescribe
}