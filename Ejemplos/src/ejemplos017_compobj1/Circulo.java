package ejemplos017_compobj1;

public class Circulo {
	
	double radio;
	Punto centro;
	
	
	//AREA
	public double area() {
		return Math.PI*Math.pow(this.radio, 2);
	}
	
	//COPIA DEL OBJETO
	public Circulo copia() {
		Punto centro2 = new Punto(centro.getX(),centro.getY());
		return new Circulo(centro2, radio);
	}
	public Circulo copia2() {
		Circulo tmp = new Circulo(centro.copia(), radio);
		return tmp;
	}
	
	//CONSTRUCTORES
	public Circulo() {}
	public Circulo(Punto centro, double radio) {
		this.centro = centro;
		this.radio = radio;
	}
	public Circulo(int x1, int y1) {
		this.centro = new Punto(x1, y1);
	}
	
	
	//SETTERS
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public void setCentro(Punto centro) {
		this.centro = centro;
	}
	
	//GETTERS
	public double getRadio() {
		return radio;
	}
	public Punto getCentro() {
		return centro;
	}
	
	
	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", centro=" + centro + ", area()=" + area() + "]";
	}
}
