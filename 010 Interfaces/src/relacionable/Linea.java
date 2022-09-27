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

public class Linea implements Relacionable {
	private Punto p1, p2;
	
	//METODOS INTERFAZ
	@Override
	public boolean esMayor(Object b) throws NoEsLinea {
		// TODO Auto-generated method stub
		boolean flag = false; 
		if(b instanceof Linea) {
			if(this.longitud()>((Linea) b).longitud())
				flag = true;
			else
				flag = false;
		}
		else {
			System.out.println("No se pueden comparar");
			throw new NoEsLinea("Los objetos no coinciden");
		}
		return flag;
	}

	@Override
	public boolean esMenor(Object b) throws NoEsLinea {
		// TODO Auto-generated method stub
		boolean flag = false; 
		if(b instanceof Linea) {
			if(this.longitud()<((Linea) b).longitud())
				flag = true;
			else
				flag = false;
		}
		else {
			System.out.println("No se pueden comparar");
			throw new NoEsLinea("Los objetos no coinciden");
		}
		return flag;
	}

	@Override
	public boolean esIgual(Object b) throws NoEsLinea {
		// TODO Auto-generated method stub
		boolean flag = false; 
		if(b instanceof Linea) {
			if(this.longitud()==((Linea) b).longitud())
				flag = true;
			else
				flag = false;
		}
		else {
			System.out.println("No se pueden comparar");
			throw new NoEsLinea("Los objetos no coinciden");
		}
		return flag;
	}
	
	
	//OTROS METODOS
	public double longitud() {
		//return Math.sqrt((Math.pow(p1.getX()-p2.getX(), 2) - Math.pow(p1.getY()-p2.getY(), 2)));
		return p1.distancia(p2);
	}

	
	
	//ALT+SHIFT+S
	//CONSTRUCTORES
	public Linea() {}
	public Linea(Punto p1, Punto p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	public Linea(int x1, int y1, int x2, int y2) {
		this.p1 = new Punto(x1, y1);
		this.p2 = new Punto(x2, y2);
	}
	
	
	//GETTERS AND SETTERS
	public Punto getP1() {
		return p1;
	}
	public void setP1(Punto p1) {
		this.p1 = p1;
	}

	public Punto getP2() {
		return p2;
	}
	public void setP2(Punto p2) {
		this.p2 = p2;
	}
	
	
	//TOSTRING
	@Override
	public String toString() {
		return "Linea: "
				+ p1.toString() +"--->"
				+ p2.toString()
				+ "\nLongitud: " +longitud();
	}

	
}