package ejemplos024_interface4;

//las interfaces no se heredan, para utilizarlas, hay que implementarlas
public class Globo extends NaveAerea implements Conducible {
	private int volumenGas;

	public void setVolumenGas(int volumenGas) {
		this.volumenGas = volumenGas;
	}

	public int getVolumenGas() {
		return this.volumenGas;
	}

	public void girarDerecha(int grados) {
		if (getDireccion() == 'N' && grados == MAXIMO_GIRO)
			setDireccion('E');
	}

	public void girarIzquierda(int grados) {
		if (getDireccion() == 'N' && grados == MAXIMO_GIRO)
			setDireccion('O');
	}
}
