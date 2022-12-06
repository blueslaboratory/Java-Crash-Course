/* 
 * Como pasarle parametros al main en el array args
 * Le damos a run y despues en la barra de herramientas:
 * Project -> Properties -> Run/Debug settings -> Ej003PuntoMain -> edit -> arguments -> 1 5
 * 
 */

package m3_Arraylist_Ej003paqPunto;

public class Ej003PuntoMain {
	public static void main(String args[]) {
		if (args.length != 2) {
			System.out.println("El numero de parametros debe ser 2");		
		}
		else {
			Ej003Punto p0 = new Ej003Punto(Double.parseDouble(args[0]), Double.parseDouble(args[1]) );
			Ej003Punto p1 = new Ej003Punto(3, -15);
			Ej003Punto pArray[] = {new Ej003Punto(1, 7),
								   new Ej003Punto(15, 15),
								   new Ej003Punto(30, 40),
								   new Ej003Punto(1, 5)};
			
			
			System.out.println(p0);
			System.out.println(p1);
			System.out.println();
			
			System.out.println("Distancia al origen de p0: " +p0.distanciaAlOrigen());
			System.out.println("Distancia entre p0 y p1: " +p0.calcularDistancia(p1));
			System.out.println();
			
			System.out.println("Cuadrante p0: " +p0.calcularCuadrante());
			System.out.println("Cuadrante p1: " +p1.calcularCuadrante());
			System.out.println();
			
			System.out.println("Punto mas cercano a p0: " +p0.calcularMasCercano(pArray));
			System.out.println();
		}
	}
}
