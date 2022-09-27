//4.- Crea una clase Punto que modele un punto en un espacio bidimensional. 
//Tendr� dos atributos, x e y, que guardan las coordenadas. Habr� un constructor 
//sin par�metros que crea un punto en (0, 0) y otro al que se le pueden pasar 
//las coordenadas del punto. Tambi�n habr� m�todos para obtener las coordenadas 
//y para imprimir el punto con el formato (x,y).

package clases1;

public class Ej004PuntoMain {
	public static void main(String[] args) {
		
		Ej004Punto p = new Ej004Punto();
		
		Ej004Punto p1;
		Ej004Punto p2;
		
		p1 = new Ej004Punto();
		p2 = new Ej004Punto(3, 4);
		
		
		p.setX(1);
		p.setY(1);
		
		
		p.imprimirPunto();		
		System.out.println(p.toString());
		
		//Ejecuta el metodo toString() automaticamente sin tener que 
		//llamar al metodo:
		System.out.println(p);
		System.out.println(p1);
		System.out.println(p2);
	}
}
