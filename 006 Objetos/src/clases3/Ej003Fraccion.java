/*
3.- Implementa una clase en Java que represente una fracción 
de números enteros. Implementa asimismo los siguientes métodos 
en la clase Fracción:

-	Suma de dos fracciones, que será una nueva fracción. Resta 
de dos fracciones, similar a la suma. 
-	División de dos fracciones.
-	Multiplicación de dos fracciones.
-	Calculo de la inversa de una fracción (cambiar numerador 
por denominador y viceversa).

Todos los métodos se realizan sobre un objeto Fracción pasándole 
por parámetro la segunda fracción cuando sea necesario.

Intenta simplificar los resultados usando un nuevo método.

*/


//El valor this se refiere al objeto sobre el que ha sido llamado el metodo actual. 

package clases3;

public class Ej003Fraccion {
	private int numerador, denominador;
	
	
	//SUMA
	public Ej003Fraccion suma(Ej003Fraccion f) {
		int numerador, denominador;
		
		numerador = this.numerador  *f.getDenominador() 
				  + this.denominador*f.getNumerador();
		
		denominador = this.denominador*f.getDenominador();
		
		Ej003Fraccion fRes = new Ej003Fraccion(numerador, denominador);
		
		//return new Ej003Fraccion(numerador, denominador);
		return fRes;
	}
	
	
	//RESTA
	public Ej003Fraccion resta(Ej003Fraccion f) {
		int numerador, denominador;
		
		numerador = this.numerador  *f.getDenominador() 
				  - this.denominador*f.getNumerador();
		
		denominador = this.denominador*f.getDenominador();
		
		Ej003Fraccion fRes = new Ej003Fraccion(numerador, denominador);
		
		//return new Ej003Fraccion(numerador, denominador);
		return fRes;
	}
	
	
	//MULTIPLICACION
	public Ej003Fraccion multiplica(Ej003Fraccion f) {
		int numerador, denominador;
		
		numerador = this.numerador*f.getNumerador();
		denominador = this.denominador*f.getDenominador();
		
		Ej003Fraccion fRes = new Ej003Fraccion(numerador, denominador);
		
		//return new Ej003Fraccion(numerador, denominador);
		return fRes;
	}
	
	
	//DIVISION
	public Ej003Fraccion divide(Ej003Fraccion f) {
		int numerador, denominador;
		
		numerador = this.numerador*f.getDenominador();
		denominador = this.denominador*f.getNumerador();
		
		Ej003Fraccion fRes = new Ej003Fraccion(numerador, denominador);
		
		//return new Ej003Fraccion(numerador, denominador);
		return fRes;
	}
	
	
	//INVERSA
	public Ej003Fraccion inversa() {
		int numerador, denominador;
		
		numerador = this.denominador;
		denominador = this.numerador;
		
		Ej003Fraccion fRes = new Ej003Fraccion(numerador, denominador);
		
		//return new Ej003Fraccion(numerador, denominador);
		return fRes;
	}
	
	
	//SIMPLIFICAR
	//no necesitas pasarle: Fraccion f
	public Ej003Fraccion simplificada() {
		int numerador, denominador;
		int n=this.numerador, 
			d=this.denominador,
			aux;
		int r;
		
		//QUEREMOS D>N 
		if (n>d) {
			aux = n;
			n = d;
			d = aux;
		}
		
		while(d!=0 && n!=0) {
			r = d%n;
			d = n;
			n = r;
		}
		
		numerador = this.numerador/d;
		denominador = this.denominador/d;
		
		Ej003Fraccion fRes = new Ej003Fraccion(numerador, denominador);
		
		return fRes;
		//http://www.objetos.unam.mx/matematicas/leccionesMatematicas/01/1_005/index.html
		//https://es.khanacademy.org/computing/computer-science/cryptography/modarithmetic/a/the-euclidean-algorithm
	}
		
	
	//CONSTRUCTORES
	public Ej003Fraccion() {}
	public Ej003Fraccion(int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	
	//SETTERS: ALT + SHIFT +S
	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}
	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	
	//GETTERS: ALT + SHIFT +S
	public int getNumerador() {
		return numerador;
	}
	public int getDenominador() {
		return denominador;
	}
	
	
	//toString
	@Override
	public String toString() {
		return +numerador +"/" +denominador;
	}
}