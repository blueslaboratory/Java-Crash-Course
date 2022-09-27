package relacionable_sol;

//import pRelacionable.Relacionable;

public class Rectangulo implements Relacionable {
	private double l1;
	private double l2;
	
	//////////////////////////////////////////////////////////////////////////////
	// 																			//
	// Implementacion de los 3 metodos de la interface 							//
	// 																			//
	//////////////////////////////////////////////////////////////////////////////

	@Override
	public boolean esMayorQue(Object a) {
		double area1;
		/*
		 * if (a == null) { return false; } else if (!(a instanceof Rectangulo)) {
		 * return false; }
		 */
		try {
			area1 = ((Rectangulo) a).area();
			return area() > area1;
		} catch (ClassCastException e) {
			// System.out.println(e.getMessage());
			System.out.println("Solo puede comparar con rectangulo");
		}

		return false;
	}

	@Override
	public boolean esMenorQue(Object a) {
		if (a == null) {
			return false;
		} else if (!(a instanceof Rectangulo)) {
			return false;
		}
		double area1 = ((Rectangulo) a).area();
		return area() < area1;
	}

	@Override
	public boolean esIgualQue(Object a) {
		if (a == null) {
			return false;
		} else if (!(a instanceof Rectangulo)) {
			return false;
		}
		double area1 = ((Rectangulo) a).area();
		return area() == area1;
	}
	
	
	//COSNTRUCTOR
	public Rectangulo(double l1, double l2) {
		this.l1 = l1;
		this.l2 = l2;
	}

	public double area() {
		double a = l1 * l2;
		return a;
	}

	// Sobreescritura del metodo toString heredeado de Object
	@Override
	public String toString() {
		return "\nLado menor: " + l1 
				+ "\nLado mayor: " + l2 
				+ "\nArea: " + area();
	}
}