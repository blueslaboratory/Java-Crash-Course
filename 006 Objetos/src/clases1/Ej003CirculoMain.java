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

