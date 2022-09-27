package ejemplos017_compobj;

public class Linea2 {
	private Punto p1, p2; //esto es composicion

	public Linea2() {}
	
	public Linea2(Punto p1, Punto p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	
	public Linea2(int x1, int y1, int x2, int y2) {
		this.p1 = new Punto(x1, y1);
		this.p2 = new Punto(x2, y2);
	}
	
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
	
	public double longitud() {		 		
		 return p1.distancia(p2);
		 //return p2.distancia(p1);
	}
	
		
	public String toString() {
	      return p1 + ", " + p2;
	      //cuando alguien llame al toString de linea 
	      //va a llamar al toString de punto
	}
	
}
