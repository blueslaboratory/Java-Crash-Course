package ejemplos024_interface3;
class InstrumentoCuerda implements InstrumentoMusical {

	public void tocar() {
		System.out.println("Tocando instrumento de cuerda");
	}

	public void afinar() {
		System.out.println("Afinando instrumento de cuerda");
	}

	public String tipoInstrumento() {
		return "Descripcion: Instrumento de cuerda";
	}
}