package m3_Arraylist_Ej003paqTriangulo;
import m3_arraylist_Ej003paqPunto.*;

public class Ej003Triangulo {
	private Ej003Punto p1, p2, p3;
	private int nTri;
	private static int contTri = 0;
	
	//OTROSMETODOS
	//LONGITUD DE LOS LADOS
	public double[] calcularLongitudLados() {
		double lados[] = {p1.calcularDistancia(p2), 
		        		  p2.calcularDistancia(p3),
		        		  p3.calcularDistancia(p1)};
		
		return lados;
	}
	
	//ALT+SHIFT+S
	//CONSTRUCTORES
	public Ej003Triangulo() {
		nTri = contTri;
		contTri++;
	}
	public Ej003Triangulo(Ej003Punto p1, Ej003Punto p2, Ej003Punto p3) {
		nTri = contTri;
		contTri++;
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	
	//GETTER
	public Ej003Punto getP1() {
		return p1;
	}
	public Ej003Punto getP2() {
		return p2;
	}
	public Ej003Punto getP3() {
		return p3;
	}
	public int getnTri() {
		return nTri;
	}
	public static int getContTri() {
		return contTri;
	}
	
	//SETTER
	public void setP1(Ej003Punto p1) {
		this.p1 = p1;
	}
	public void setP2(Ej003Punto p2) {
		this.p2 = p2;
	}
	public void setP3(Ej003Punto p3) {
		this.p3 = p3;
	}
	public void setnTri(int nTri) {
		this.nTri = nTri;
	}
	public static void setContTri(int contTri) {
		Ej003Triangulo.contTri = contTri;
	}
	
	//TOSTRING
	@Override
	public String toString() {
		return "\nTriangulo " +nTri 
			  +"\nV1: " +p1 
			  +"\nV2: " +p2 
			  +"\nV3: " +p3;
	}
}