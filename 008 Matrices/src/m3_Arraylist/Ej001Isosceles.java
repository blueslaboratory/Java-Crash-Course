/*
1.- Haz una clase para trabajar con triangulos isosceles 
(2 lados iguales). Dicha clase tendra como atributos la base 
y la altura que seran privados. Tambien tendra como minimo 
un constructor y dos metodos para calcular el area y el 
perimetro de un triangulo, y todos aquellos metodos que sean 
necesarios para el buen funcionamiento del programa.
 
Formula a aplicar:

perimetro = 2 * lado + base, siendo lado la medida del lado repetido
lado^2 = (base/2)^2 + altura^2
lado = Raiz Cuadrada((base/2)^2 + altura^2)

Crea una clase Principal que cree un Array/ArrayList de 
triangulos en el que se realicen las siguientes operaciones: 

1. Anadir un triangulo. 
2. Calcular e imprimir el triangulo con el area mas grande. 
3. Calcular e imprimir el triangulo con el perimetro mas pequeno. 
4. Imprimir la altura, la base, el area y el perimetro de un triangulo en concreto. 
5. Imprimir la altura, la base, el area y el perimetro de todos los triangulos.

*/

package m3_Arraylist;

public class Ej001Isosceles {
	
	private double base, altura;
	private int nTriangulo;
	private static int contTriangulo = 0;
	
	
	//OTROS METODOS
	public double area() {
		return base*altura/2;
	}
	
	public double perimetro() {
		return 2*lado()+base;
	}
	
	public double lado() {
		return Math.sqrt((Math.pow(base/2, 2)+ Math.pow(altura, 2)));
	}
	
	
	//ALT+SHIFT+S
	//CONSTRUCTORES
	public Ej001Isosceles() {
		nTriangulo = ++contTriangulo;
		//contTriangulo++;
	}
	public Ej001Isosceles(double base, double altura) {
		nTriangulo = ++contTriangulo;
		//contTriangulo++;
		this.base = base;
		this.altura = altura;
	}
	
	
	//GETTERS
	public double getBase() {
		return base;
	}
	public double getAltura() {
		return altura;
	}
	public int getnTriangulo() {
		return nTriangulo;
	}
	public static int getContTriangulo() {
		return contTriangulo;
	}
	
	
	//SETTERS
	public void setBase(double base) {
		this.base = base;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public void setnTriangulo(int nTriangulo) {
		this.nTriangulo = nTriangulo;
	}
	public static void setContTriangulo(int contTriangulo) {
		Ej001Isosceles.contTriangulo = contTriangulo;
	}
	
	
	@Override
	public String toString() {
		return "\nTriangulo " +nTriangulo 
			  +"\nBase: " +base 
			  +"\nAltura: " +altura
			  +"\nLado: " +lado()
			  +"\nPerimetro: " +perimetro()
			  +"\nArea: " +area();
	};	
}
