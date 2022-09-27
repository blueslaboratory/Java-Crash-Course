/*
1.- Desarrolla una clase Cafetera con atributos:
capacidadMaxima (la cantidad maxima de cafe que puede contener la cafetera)
cantidadActual (la cantidad actual de cafe que hay en la cafetera)
Implementa, al menos, los siguientes metodos:
    • Constructor predeterminado: establece la 
      capacidad maxima en 1000 (c.c.) y la actual en cero (cafetera vacia).
    • Constructor con la capacidad maxima de la cafetera; inicializa la 
      cantidad actual de cafe igual a la capacidad maxima.
    • Constructor con la capacidad maxima y la cantidad actual. Si la 
      cantidad actual es mayor que la capacidad maxima de la cafetera, la 
      ajustara al maximo.
    • Accedentes y mutadores (getter y setter).
    • llenarCafetera(): hace que la cantidad actual sea igual a la 
      capacidad maxima. 
    • servirTaza(int): simula la accion de servir una taza con la capacidad 
      indicada por parametro. Si la cantidad actual de cafe en la cafetera 
      “no llega” para llenar la taza, se sirve lo que quede.
    • vaciarCafetera(): pone la cantidad de cafe actual en cero. 
    • agregarCafetera(int): añade a la cafetera la cantidad de cafe indicada 
      en el parametro. Si esa cantidad excede el maximo, ajusta al maximo.

Escribe el codigo en el programa principal para probar lo siguiente:

Capacidad maxima = 1000   Cantidad actual = 0
Agregamos 20 c.c. de cafe...
Capacidad maxima = 1000   Cantidad actual = 20
*********************************
Llenamos la cafetera...
Capacidad maxima = 1000   Cantidad actual = 1000
*********************************
Servimos una taza de 500 c.c....
Todavia quedan 500 c.c.
Capacidad maxima = 1000   Cantidad actual = 500
*********************************
Servimos una taza de 600 c.c....
Se sirve todo lo que quedaba (500 c.c.)
Capacidad maxima = 1000   Cantidad actual = 0
*********************************
Servimos una taza de 200 c.c....
Lo siento, pero no queda nada de cafe.
Capacidad maxima = 1000   Cantidad actual = 0
*********************************
Llenamos la cafetera con 700 c.c....
Capacidad maxima = 1000   Cantidad actual = 700
*********************************
Llenamos la cafetera con 400 c.c....
Capacidad maxima = 1000   Cantidad actual = 1000
*/

package clases4;

public class Ej001CafeteraMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ej001Cafetera cafetera0 = new Ej001Cafetera();
		Ej001Cafetera cafetera1 = new Ej001Cafetera(2500);
		Ej001Cafetera cafetera2 = new Ej001Cafetera(2500, 5000);
		
		System.out.println(cafetera0);
		System.out.println(cafetera1);
		System.out.println(cafetera2);
		
		
		cafetera0.agregarCafetera(20);
		System.out.println(cafetera0);
		
		cafetera0.llenarCafetera();
		System.out.println(cafetera0);
		
		cafetera0.servirTaza(500);
		System.out.println(cafetera0);
		
		cafetera0.servirTaza(600);
		System.out.println(cafetera0);
		
		cafetera0.servirTaza(200);
		System.out.println(cafetera0);
		
		cafetera0.agregarCafetera(700);
		System.out.println(cafetera0);
		
		
		
		cafetera0.vaciarCafetera();
		System.out.println(cafetera0);
	}

}
