package ejemplos023_abstractas3_poli;

//Clase Triangulo
public class Triangulo extends Poligono {

	private double lado1;
	private double lado2;
	private double lado3;

	public Triangulo() {
		super(3);
	}

	public Triangulo(double lado1, double lado2, double lado3) {
		super(3);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	public double area() {
		double Sp = (lado1 + lado2 + lado3) / 2;
		return Math.sqrt(Sp * (Sp - lado1) * (Sp - lado2) * (Sp - lado3));
	}
	
	@Override
	public String toString() {
		return "Triangulo [lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + ", toString()="
				+ super.toString() + "]";
	}// Este lo he generado con Eclipse
}
