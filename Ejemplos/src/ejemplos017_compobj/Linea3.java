package ejemplos017_compobj;

public class Linea3 {
	private Punto p1, p2;

	public Linea3() {}
	
	public Linea3(Punto p1, Punto p2) {
		this.p1 = p1;
		this.p2 = p2;
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
	}
	
	public boolean esLineaParalelaEjes() {
		if ((p1.getX() == p2.getX()) || (p1.getY() == p2.getY())) return true;
		else return false;
	}
	
	// Esta ya me sobra, no tiene sentido hacerlo asi
	/*
	public boolean esLineaParalelaEjes() {
		if ((l.getP1().getX() == l.getP2().getX()) || (l.getP1().getY() == l.getP2().getY())) return true;
		else return false;
	}
	*/
	
	public String toString() {
	      return p1 + ", " + p2;
	      //cuando alguien llame al toString de linea 
	      //va a llamar al toString de punto
	}
	
}
