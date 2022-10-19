//3.- Crea  una clase que represente a un círculo. Debe tener tres atributos, 
//las coordenadas x e y de su centro y su radio.
//Tendrá tres constructores:
//sin parámetros (el centro será 0,0 y el radio 1), 
//pasándole sólo el radio (el centro será 0,0) y 
//pasándole el radio y las coordenadas X e Y.
//
//También tendrá tres métodos uno que calcule el área, otro que calcule la longitud 
//y otro que escriba los resultados.
//
//Después, haz una clase principal en la que se creen 3 objetos círculos y se 
//prueben los métodos.


package clases1;


public class Ej003CirculoMain {
	public static void main(String[] args) {
		
		Ej003Circulo c1 = new Ej003Circulo();
		Ej003Circulo c2 = new Ej003Circulo(3);
		Ej003Circulo c3 = new Ej003Circulo(3, 3, 8);
		
		//c1.Circulo1();
		c1.escribir();
		
		//c2.Circulo2(3);
		c2.escribir();
		
		//c3.Circulo3(3, 3, 8);
		c3.escribir();
	}
}

