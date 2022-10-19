package relacionable_sol;
//import pRelacionable.Relacionable;

public class Fraccion implements Relacionable {
	private int num;
	private int den;

	
//////////////////////////////////////////////////////////////////////////////
//																			//
//			Implementacion de los 3 metodos de la interface             	//
//																			//
//////////////////////////////////////////////////////////////////////////////

	@Override
	public boolean esMayorQue(Object a) {
		if (a == null) {
			return false;
		} else if (!(a instanceof Fraccion)) {
			return false;
		}
		Fraccion f = (Fraccion) a;
		this.simplificar();
		f.simplificar();
		if ((num / (double) den) < (f.num / (double) f.den)) {
			return false;
		}
		return true;
	}

	@Override
	public boolean esMenorQue(Object a) {
		if (a == null) {
			return false;
		} else if (!(a instanceof Fraccion)) {
			return false;
		}
		Fraccion f = (Fraccion) a;
		this.simplificar();
		f.simplificar();
		if ((num / (double) den) > (f.num / (double) f.den)) {
			return false;
		}
		return true;
	}

	@Override
	public boolean esIgualQue(Object a) {
		if (a == null) {
			return false;
		}
		if (!(a instanceof Fraccion)) {
			return false;
		}
		Fraccion f = (Fraccion) a;
		this.simplificar();
		f.simplificar();
		if (num != f.num) {
			return false;
		}
		if (den != f.den) {
			return false;
		}
		return true;
	}
	
	//OTROS METODOS	
	// sumar fracciones
	public Fraccion sumar(Fraccion f) {
		Fraccion aux = new Fraccion();
		aux.num = num * f.den + den * f.num;
		aux.den = den * f.den;
		aux.simplificar(); // se simplifica antes de devolverla
		return aux;
	}

	// restar fracciones
	public Fraccion restar(Fraccion f) {
		Fraccion aux = new Fraccion();
		aux.num = num * f.den - den * f.num;
		aux.den = den * f.den;
		aux.simplificar(); // se simplifica antes de devolverla
		return aux;
	}

	// multiplicar fracciones
	public Fraccion multiplicar(Fraccion f) {
		Fraccion aux = new Fraccion();
		aux.num = num * f.num;
		aux.den = den * f.den;
		aux.simplificar(); // se simplifica antes de devolverla
		return aux;
	}

	// dividir fracciones
	public Fraccion dividir(Fraccion f) {
		Fraccion aux = new Fraccion();
		aux.num = num * f.den;
		aux.den = den * f.num;
		aux.simplificar(); // se simplifica antes de devolverla
		return aux;
	}

	// Calculo del maximo comun divisor por el algoritmo de Euclides
	private int mcd() {
		int u = Math.abs(num); // valor absoluto del numerador
		int v = Math.abs(den); // valor absoluto del denominador
		if (v == 0) {
			return u;
		}
		int r;
		while (v != 0) {
			r = u % v;
			u = v;
			v = r;
		}
		return u;
	}

	private void simplificar() {
		int n = mcd(); // se calcula el mcd de la fraccion
		num = num / n;
		den = den / n;
	}
	
	
	//CONSTRUCTORES
	public Fraccion() {
		this.num = 0;
		this.den = 1;
	}
	public Fraccion(int num, int den) {
		this.num = num;
		this.den = den;
		simplificar();
	}
	public Fraccion(int num) {
		this.num = num;
		this.den = 1;
	}

	//SETTERS
	public void setDen(int den) {
		this.den = den;
		this.simplificar();
	}
	public void setNum(int num) {
		this.num = num;
		this.simplificar();
	}

	//GETTERS
	public int getDen() {
		return den;
	}
	public int getNum() {
		return num;
	}


	// Sobreescritura del metodo toString heredado de Object
	@Override
	public String toString() {
		simplificar();
		return num + "/" + den;
	}

}
