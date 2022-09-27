/**
 * Lo mismo que el circulo pero con un rectangulo. Clase rectangulo con 
 * 4 puntos como atributos del rectangulo empezando por la 
 * esquina inf izq, inf dcha, sup izq, sup dcha. Clase con el constructor, 
 * el toString, getters, setters, comprobar si es un rectanculo 
 * (base y altura diferentes)
 */


package composicion1;

public class Ej001Rectangulo {

	Ej001Punto p1, p2, p3, p4;
	

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
	public Ej001Rectangulo copia() {
		Ej001Punto pc1 = new Ej001Punto(p1.getX(),p1.getY());
		Ej001Punto pc2 = new Ej001Punto(p2.getX(),p2.getY());
		Ej001Punto pc3 = new Ej001Punto(p3.getX(),p3.getY());
		Ej001Punto pc4 = new Ej001Punto(p4.getX(),p4.getY());
		return new Ej001Rectangulo(pc1, pc2, pc3, pc4);
	}
	public Ej001Rectangulo copia2() {
		Ej001Rectangulo tmp = new Ej001Rectangulo(p1.copia(), p2.copia(), p3.copia(), p4.copia());
		return tmp;
	}
	
	
	//CONSTRUCTORES
	public Ej001Rectangulo() {}
	public Ej001Rectangulo(Ej001Punto p1, Ej001Punto p2, Ej001Punto p3, Ej001Punto p4) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
	}
	public Ej001Rectangulo(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		this.p1 = new Ej001Punto(x1, y1);
		this.p2 = new Ej001Punto(x2, y2);
		this.p3 = new Ej001Punto(x3, y3);
		this.p4 = new Ej001Punto(x4, y4);
	}
	
	
	//SETTERS
	public void setP1(Ej001Punto p1) {
		this.p1 = p1;
	}
	public void setP2(Ej001Punto p2) {
		this.p2 = p2;
	}
	public void setP3(Ej001Punto p3) {
		this.p3 = p3;
	}
	public void setP4(Ej001Punto p4) {
		this.p4 = p4;
	}
	
	
	//GETTERS
	public Ej001Punto getP1() {
		return p1;
	}
	public Ej001Punto getP2() {
		return p2;
	}
	public Ej001Punto getP3() {
		return p3;
	}
	public Ej001Punto getP4() {
		return p4;
	}
	
	
	@Override
	public String toString() {
		return "Rectangulo [p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + ", p4=" + p4 + ", area()=" + area() +", rectangulo: " +comprobar() + "]";
	}


}
