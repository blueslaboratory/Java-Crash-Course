/*
Construye una interfaz llamada Relacionable que incluya los 
siguientes metodos:

// Devuelve verdadero si a es mayor que b
boolean esMayor(Object b);
// Devuelve verdadero si a es menor que b
boolean esMenor(Object b);
// Devuelve verdadero si a es igual que b
boolean esIgual(Object b);
Crea 3 clases:
	Fraccion
	Linea //comparas longitud
	Rectangulo //comparas el area

que implementen el interfaz Relacionable.
Crea un programa que instancie cada una de las clases y aplique 
sus metodos para probarlos.
*/

package relacionable;

public class Fraccion implements Relacionable {
	private double num, den;
	
	//METODOS INTERFAZ
	@Override
	public boolean esMayor(Object b) throws NoEsFraccion{
		// TODO Auto-generated method stub
		boolean flag = false;
		if(b instanceof Fraccion) {
			if((this.num/this.den)>(((Fraccion) b).getNum()/((Fraccion) b).getDen()))
				flag = true;
			else
				flag = false;
		}
		else {
			System.out.println("No se pueden comparar");
			throw new NoEsFraccion("Los objetos no coinciden");
		}
		return flag;
	}

	@Override
	public boolean esMenor(Object b) throws NoEsFraccion{
		// TODO Auto-generated method stub
		boolean flag = false;
		if(b instanceof Fraccion) {
			if((this.num/this.den)<(((Fraccion) b).getNum()/((Fraccion) b).getDen()))
				flag = true;
			else
				flag = false;
		}
		else {
			System.out.println("No se pueden comparar");
			throw new NoEsFraccion("Los objetos no coinciden");
		}
		return flag;
	}

	@Override
	public boolean esIgual(Object b) throws NoEsFraccion {
		// TODO Auto-generated method stub
		boolean flag = false;
		if(b instanceof Fraccion) {
			if((this.num/this.den)==(((Fraccion) b).getNum()/((Fraccion) b).getDen()))
				flag = true;
			else
				flag = false;
		}
		else {
			System.out.println("No se pueden comparar");
			throw new NoEsFraccion("Los objetos no coinciden");
		}
		return flag;
	}

	
	
	//ALT + SHIFT + S
	//CONSTRUCTORES
	public Fraccion() {}
	public Fraccion(int num, int den) {
		this.num = num;
		this.den = den;
	}
	
	
	//GETTERS AND SETTERS
	public double getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public double getDen() {
		return den;
	}
	public void setDen(int den) {
		this.den = den;
	}

	
	//TOSTRING
	@Override
	public String toString() {
		return num +"/" +den;
	}
}
