package ejemplos024_interface3;
class InstrumentoViento implements InstrumentoMusical {

	public void tocar() {
		System.out.println("Tocando instrumento de viento");
	}

	public void afinar() {
		System.out.println("Afinando instrumento de viento");
	}

	public String tipoInstrumento() {
		return "Descripcion: Instrumento de viento";
	}

}
