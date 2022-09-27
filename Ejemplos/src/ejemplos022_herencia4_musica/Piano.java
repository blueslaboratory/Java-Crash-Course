package ejemplos022_herencia4_musica;

class Piano extends Instrumento {
	public void tocar() {
		System.out.println("Piano.tocar()");
	}

	public String tipo() {
		return "Piano";
	}

    //solo hereda afinar(), el resto de metodos los reescribe
}