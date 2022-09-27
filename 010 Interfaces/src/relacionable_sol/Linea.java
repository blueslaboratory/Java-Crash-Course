package relacionable_sol;

//import pRelacionable.Relacionable;

// Se puede mejorar haciendo que tenga como atributos 2 puntos.
public class Linea implements Relacionable {

	private double x1;
	private double y1;
	private double x2;
	private double y2;

//////////////////////////////////////////////////////////////////////////////
//																			//
//        Implementacion de los 3 metodos de la interface                   //
//  																		//
//////////////////////////////////////////////////////////////////////////////

	@Override
	public boolean esMayorQue(Object a) {
		if (a == null) {
			return false;
		} else if (!(a instanceof Linea)) {
			return false;
		}
		double lon = ((Linea) a).longitud();
		return longitud() > lon;
	}

	@Override
	public boolean esMenorQue(Object a) {
		if (a == null) {
			return false;
		} else if (!(a instanceof Linea)) {
			return false;
		}
		double lon = ((Linea) a).longitud();
		return longitud() < lon;
	}

	@Override
	public boolean esIgualQue(Object a) {
		if (a == null) {
			return false;
		} else if (!(a instanceof Linea)) {
			return false;
		}
		double lon = ((Linea) a).longitud();
		return longitud() == lon;
	}
	
	
	//CONSTRUCTOR 
	public Linea(double x1, double y1, double x2, double y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	public double longitud() {
		double l = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		return l;
	}

	//Sobreescritura del metodo toString heredeado de Object
	@Override
	public String toString() {
		return "\nCoordenadas inicio linea: " + x1 + ", " + y1 
				+ "\nCoordenadas final linea: " + x2 + ", " + y2
				+ "\nLongitud: " + longitud();
	}
}