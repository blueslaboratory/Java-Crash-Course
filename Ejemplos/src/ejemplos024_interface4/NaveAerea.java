package ejemplos024_interface4;

public class NaveAerea {
	protected char direccion;
	protected int altura;

	public void setDireccion(char direccion) {
		this.direccion = direccion;
	}

	public char getDireccion() {
		return this.direccion;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getAltura() {
		return this.altura;
	}
}