package ejemplos017_compobj;

import ejemplos017_compobj.Linea3;
import ejemplos017_compobj.Punto;

public class PruebasApp3 {
	
// Movemos los metodos esLineaParalelaEjes a la clase Linea3
// que es mas logico, pues es una propiedad de la linea
	
	public static void main(String[] args) {
		Linea3 l1, l2, l3;
		Punto punto1, punto2;
		
		punto1 = new Punto(1, 10);
		punto2 = new Punto(1, 20);
		l1 = new Linea3(punto1, punto2);
		System.out.println(l1);
		System.out.println("Longitud " + l1.longitud());
		
		//if (esLineaParalelaEjes(punto1, punto2))
		if (l1.esLineaParalelaEjes())
			System.out.println("Es una linea paralela a un eje");
		else 
			System.out.println("No es una linea paralela a un eje");
		
		punto1 = new Punto(1, 1);
		punto2 = new Punto(2, 2);
		l2 = new Linea3(punto1, punto2);
		System.out.println(l2);
		System.out.println("Longitud " + l2.longitud());
		
		//if (esLineaParalelaEjes(punto1, punto2))
		if (l2.esLineaParalelaEjes())
			System.out.println("Es una linea paralela a un eje");
		else 
			System.out.println("No es una linea paralela a un eje");
		
		// Probamos el segundo metodo:	
		punto1 = new Punto(10, -1);
		punto2 = new Punto(-2, 20);
		l3 = new Linea3(punto1, punto2);
		System.out.println(l3);
		
		System.out.println("Longitud " + l3.longitud());
		//if (esLineaParalelaEjes(l3))
		if (l3.esLineaParalelaEjes())
			System.out.println("Es una linea paralela a un eje");
		else 
			System.out.println("No es una linea paralela a un eje");
	}
	
	

}
