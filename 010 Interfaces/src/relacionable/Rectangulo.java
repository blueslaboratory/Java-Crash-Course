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



public class Rectangulo implements Relacionable{

	Punto p1, p2, p3, p4;
	
	@Override
	public boolean esMayor(Object b) throws NoEsRectangulo {
		// TODO Auto-generated method stub
		boolean flag = false; 
		if(b instanceof Rectangulo) {
			if(this.area()>((Rectangulo) b).area())
				flag = true;
			else
				flag = false;
		}
		else {
			System.out.println("No se pueden comparar");
			throw new NoEsRectangulo("Los objetos no coinciden");
		}
		return flag;
	}

	@Override
	public boolean esMenor(Object b) throws NoEsRectangulo {
		// TODO Auto-generated method stub
		boolean flag = false; 
		if(b instanceof Rectangulo) {
			if(this.area()<((Rectangulo) b).area())
				flag = true;
			else
				flag = false;
		}
		else {
			System.out.println("No se pueden comparar");
			throw new NoEsRectangulo("Los objetos no coinciden");
		}
		return flag;
	}

	@Override
	public boolean esIgual(Object b) throws NoEsRectangulo {
		// TODO Auto-generated method stub
		boolean flag = false; 
		if(b instanceof Rectangulo) {
			if(this.area() == ((Rectangulo) b).area())
				flag = true;
			else
				flag = false;
		}
		else {
			System.out.println("No se pueden comparar");
			throw new NoEsRectangulo("Los objetos no coinciden");
		}
		return flag;
	}

	
	

	//COMPROBAR ROMBOIDE-RECTANGULO
	public boolean comprobar() {
		boolean flag = false;
		if ((Math.abs(p1.getX() - p3.getX())) == Math.abs((p2.getX() - p4.getX())) &&
			(Math.abs(p1.getY() - p3.getY())) == Math.abs((p2.getY() - p4.getY()))) 
			flag = true;
		
		return flag;
	}
	

	//AREA
	public double area() {
		//return p1.distancia(p2)*p3.distancia(p4);
		return base()*altura();
	}
	
	public double base() {
		return p1.distancia(p2);
	}
	
	public double altura() {
		return p3.distancia(p4);
	}
	
	
	//COPIA DEL OBJETO
	public Rectangulo copia() {
		Punto pc1 = new Punto(p1.getX(),p1.getY());
		Punto pc2 = new Punto(p2.getX(),p2.getY());
		Punto pc3 = new Punto(p3.getX(),p3.getY());
		Punto pc4 = new Punto(p4.getX(),p4.getY());
		return new Rectangulo(pc1, pc2, pc3, pc4);
	}
	public Rectangulo copia2() {
		Rectangulo tmp = new Rectangulo(p1.copia(), p2.copia(), p3.copia(), p4.copia());
		return tmp;
	}
	
	
	//CONSTRUCTORES
	public Rectangulo() {}
	public Rectangulo(Punto p1, Punto p2, Punto p3, Punto p4) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
	}
	public Rectangulo(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		this.p1 = new Punto(x1, y1);
		this.p2 = new Punto(x2, y2);
		this.p3 = new Punto(x3, y3);
		this.p4 = new Punto(x4, y4);
	}
	
	
	//SETTERS
	public void setP1(Punto p1) {
		this.p1 = p1;
	}
	public void setP2(Punto p2) {
		this.p2 = p2;
	}
	public void setP3(Punto p3) {
		this.p3 = p3;
	}
	public void setP4(Punto p4) {
		this.p4 = p4;
	}
	
	
	//GETTERS
	public Punto getP1() {
		return p1;
	}
	public Punto getP2() {
		return p2;
	}
	public Punto getP3() {
		return p3;
	}
	public Punto getP4() {
		return p4;
	}
	
	
	@Override
	public String toString() {
		return "Rectangulo [p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + ", p4=" + p4 + ", area()=" + area() +", rectangulo: " +comprobar() + "]";
	}
}
