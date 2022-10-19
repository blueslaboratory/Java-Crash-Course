package ejemplos023_abstractas3_poli;

import java.util.ArrayList;
import java.util.Iterator;

/*
import figuras.Poligono;
import figuras.Rectangulo;
import figuras.Triangulo;
*/
public class FigurasMain {
	public static void main(String args[]) {

		Triangulo t = new Triangulo(3.25, 4.55, 2.71);
		System.out.printf("�rea del tri�ngulo: %.2f %n", t.area());
		//printf no cae en el examen
		Rectangulo r = new Rectangulo(5.70, 2.29);
		System.out.printf("�rea del rect�ngulo: %.2f %n", r.area());

		Poligono p;
		// Triangulo tr = new Triangulo(3.25, 4.55, 2.71);
		p = t;
		p.area(); // Imprime el �rea de un tri�ngulo

		Poligono po = new Triangulo(3.25, 4.55, 2.71); // upcasting
		Triangulo tri;
		tri = (Triangulo) po; // downcasting
		//tri = (Rectangulo) po;	//error 
		
		System.out.printf("�rea del pol�gono: %.2f %n", tri.area());
		System.out.printf("�rea del pol�gono: %.2f %n", p.area());
		
		
		//ITERATOR Y ARRAYLIST CAEN SEGURO
		ArrayList <Poligono> poligonos = new ArrayList <Poligono>();
		
		poligonos.add(t);
		poligonos.add(r);
		poligonos.add(p);
		
		Iterator<Poligono> it = poligonos.iterator();
		while(it.hasNext()) {
			Poligono poli = it.next();
			System.out.println(poli.area());
		}
	}
}
