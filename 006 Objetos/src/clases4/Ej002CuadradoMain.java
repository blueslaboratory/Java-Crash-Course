/*
2.-  Implementa una clase en Java que permita representar cuadrados. 
Cada objeto Cuadrado vendra representado por sus cuatro vertices, 
que seran los atributos de la clase. Ademas de los metodos para modificar 
y devolver los valores de los vertices, se piden los siguientes metodos:

Cada cuadrado tendra un metodo (dibujar) para representarse por medio de 
asteriscos. Por ejemplo, el cuadrado con vertices (0, 0) (0, 10) (10, 10) 
y (10, 0) se representaria:

* * * * * * * * * * 
*                 * 
*                 * 
*                 * 
*                 * 
*                 * 
*                 * 
*                 * 
*                 * 
* * * * * * * * * * 



Tambien queremos un metodo (dibRellenando) que represente el cuadrado 
relleno de asteriscos.
* * * * * * * * * * 
* * * * * * * * * * 
* * * * * * * * * * 
* * * * * * * * * * 
* * * * * * * * * * 
* * * * * * * * * * 
* * * * * * * * * * 
* * * * * * * * * * 
* * * * * * * * * * 
* * * * * * * * * * 




Otro metodo (dibujarVertices) para escribir los 4 vertices del cuadrado 
de la forma siguiente para el ejemplo anterior:
(0, 10)                    (10, 10)
                    
                    
                    
                    
                    
                    
                    
                    
(0, 0)                    (10, 0)


Un metodo (esCuadrado) que devuelva true si se trata de los vertices 
de un cuadrado y false si no lo es.

La distancia entre dos puntos P1: (x1, y1) y P2: (x2, y2) viene dada 
por la formula:

D = SQROOT((X1-X2)^2+(Y1-Y2)^2) 

Cada cuadrado tendra un metodo (lado) que devuelve el valor del lado 
del cuadrado creado.

Escribe un metodo (compara) en la clase Cuadrado para poder comparar 
el area de dos cuadrados. Este metodo recibe un cuadrado y lo compara 
con el cuadrado que invoca el metodo, actuando igual que el metodo 
compare de la clase String.

Implementa luego una clase de prueba que permita crear objetos de la 
clase Cuadrado y probar todos sus metodos.

Otro ejemplo:

...


Observa que para dibujar los cuadrados vamos a ignorar la distancia al 
eje de las x y de las y, los pintamos siempre desde el punto P1(x1, y1), 
teniendo unicamente en cuenta la longitud del lado.
*/

package clases4;

public class Ej002CuadradoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ej002Cuadrado c1 = new Ej002Cuadrado(0,0,0,10,10,10,10,0);
		Ej002Cuadrado c2 = new Ej002Cuadrado(1,0,1,5,6,5,6,0);
		
		System.out.println("\n" +c1);
		System.out.println("Es cuadrado: " +c1.esCuadrado());
		System.out.println("Lado: " +c1.lado());
		System.out.println("Compara: " +c1.compara(c2));
		System.out.println("\nDibujar c1: ");
		c1.dibujar();
		System.out.println("\nDibujar rellenando c1: ");
		c1.dibRellenando();
		System.out.println("\nDibujar vertices c1: ");
		c1.dibujarVertices();
		
		System.out.println("\n" +c2);
		System.out.println("Es cuadrado: " +c2.esCuadrado());
		System.out.println("Lado: " +c2.lado());
		System.out.println("Compara: " +c2.compara(c1));
		System.out.println("\nDibujar c2: ");
		c2.dibujar();
		System.out.println("\nDibujar rellenando c2: ");
		c2.dibRellenando();
		System.out.println("\nDibujar vertices c2: ");
		c2.dibujarVertices();
	}

}
