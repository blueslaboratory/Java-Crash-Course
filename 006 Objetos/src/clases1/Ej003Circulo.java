//3.- Crea  una clase que represente a un c�rculo. Debe tener tres atributos, 
//las coordenadas x e y de su centro y su radio.
//Tendr� tres constructores:
//sin par�metros (el centro ser� 0,0 y el radio 1), 
//pas�ndole s�lo el radio (el centro ser� 0,0) y 
//pas�ndole el radio y las coordenadas X e Y.
//
//Tambi�n tendr� tres m�todos uno que calcule el �rea, otro que calcule la longitud 
//y otro que escriba los resultados.
//
//Despu�s, haz una clase principal en la que se creen 3 objetos c�rculos y se 
//prueben los m�todos.


package clases1;

public class Ej003Circulo {
	private double x,y,r;
	private final double PI = 3.14;
	
	//ESCRIBIR
	public void escribir() {
		System.out.println("Area: " +area());
		System.out.println("Longitud: " +longitud());
	}
	
	
	//AREA
	//NO HACE FALTA PASARLE double r 
	//PORQUE AL LLAMAR A ESTE METODO ESTAMOS DENTRO DEL 
	//OBJETO CIRCULO QUE YA TIENE DEFINIDO r 
	public double area() {
		double area = PI*Math.pow(r, 2);
		return area;
	}
	
	
	//LONGITUD
	//NO HACE FALTA PASARLE double r 
	//PORQUE AL LLAMAR A ESTE METODO ESTAMOS DENTRO DEL 
	//OBJETO CIRCULO QUE YA TIENE DEFINIDO r
	public double longitud() {
		double longitud = 2*PI*r;	
		return longitud;
	}
	
	
	
//	//ESTO NO SON CONSTRUCTORES, SON METODOS APLICABLES A OBJETOS:
//	//CONSTRUCTOR 1
//	public void Circulo1() {
//		this.x = 0;
//		this.y = 0;
//		this.r = 1;
//	}
//	
//	//CONSTRUCTOR 2
//	public void Circulo2(double r) {
//		this.x = 0;
//		this.y = 0;
//		this.r = r;
//	}
//	
//	//CONSTRUCTOR 3
//	public void Circulo3(double x, double y, double r) {
//		this.x = x;
//		this.y = y;
//		this.r = r;
//	}
	
	
	//ESTO SON CONSTRUCTORES
	//CONSTRUCTOR 1
	public Ej003Circulo() {
		this.x = 0;
		this.y = 0;
		this.r = 1;
	}
	//CONSTRUCTOR 2
	public Ej003Circulo(double r) {
		this.x = 0;
		this.y = 0;
		this.r = r;
	}
	//CONSTRUCTOR 3
	public Ej003Circulo(double x, double y, double r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
	
	
	
	//SET IT
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	public void setR(double r) {
		this.r = r;
	}
	
	
	
	//GET IT
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getR() {
		return r;
	}
}
