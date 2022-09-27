//4.- Crea una clase Punto que modele un punto en un espacio bidimensional. 
//Tendr� dos atributos, x e y, que guardan las coordenadas. Habr� un constructor 
//sin par�metros que crea un punto en (0, 0) y otro al que se le pueden pasar 
//las coordenadas del punto. Tambi�n habr� m�todos para obtener las coordenadas 
//y para imprimir el punto con el formato (x,y).

package clases1;

public class Ej004Punto {
	double x,y;
	
	
	//CONSTRUCTOR 1
	public Ej004Punto() {
		this.x = 0;
		this.y = 0;
	}
	//CONSTRUCTOR 2
	public Ej004Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	
	//SET IT: ALT + SHIFT + S
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	
	//GET IT: ALT + SHIFT + S
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	
	
	//IMPRIMIR
	public void imprimirPunto() {
		System.out.println("(" +x +"," +y +")");
	}
	//toString
	public String toString() {
		return "(" +x +"," +y +")";
	}
}
