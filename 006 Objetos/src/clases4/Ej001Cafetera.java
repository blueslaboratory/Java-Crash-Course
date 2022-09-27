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

public class Ej001Cafetera {
	private int capacidadMaxima;
	private int cantidadActual;
	private int nCafetera = 0;
	private static int contCafeteras = 0;
	
	
	//METODOS
	//llenarCafetera
	public void llenarCafetera() {
		System.out.println("Llenando la cafetera...");
		cantidadActual = capacidadMaxima;
	}
	
	
	//servirTaza
	public void servirTaza(int taza){
		System.out.println("Sirviendo una taza de " +taza +" c.c. de cafe...");
		
		if(cantidadActual>taza) 
			cantidadActual -= taza;
		
		else if(cantidadActual>0){
			System.out.println("Sirviendo lo que queda... " +"(" +cantidadActual +" c.c.)");
			cantidadActual = 0;
		}
		
		else
			System.out.println("Lo siento, pero no queda nada de cafe.");
			
	}
	
	
	//vaciarCafetera
	public void vaciarCafetera() {
		System.out.println("Vaciando la cafetera...");
		cantidadActual = 0;
	}

	
	//agregarCafetera
	public void agregarCafetera(int agregar) {
		
		if((agregar+cantidadActual)>capacidadMaxima) {
			System.out.println("Agregando " +(capacidadMaxima-cantidadActual) +" c.c. de cafe...");
			cantidadActual = capacidadMaxima;
		}
			
		else {
			System.out.println("Agregando " +agregar +" c.c. de cafe...");
			cantidadActual += agregar;
		}
	}
	
	
	//ALT+SHIF+S
	//CONSTRUCTORES
	public Ej001Cafetera() {
		nCafetera = contCafeteras;
		contCafeteras++;
		
		capacidadMaxima = 1000;
		cantidadActual = 0;
	}
	public Ej001Cafetera(int capacidadMaxima) {
		nCafetera = contCafeteras;
		contCafeteras++;
		
		this.capacidadMaxima = capacidadMaxima;
		cantidadActual = capacidadMaxima;
	}
	public Ej001Cafetera(int capacidadMaxima, int cantidadActual) {
		nCafetera = contCafeteras;
		contCafeteras++;
		
		this.capacidadMaxima = capacidadMaxima;
		
		if(cantidadActual>capacidadMaxima)
			this.cantidadActual = capacidadMaxima;
		else
			this.cantidadActual = cantidadActual;
	}

	
	//GETTERS
	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}
	public int getCantidadActual() {
		return cantidadActual;
	}

	
	//SETTERS
	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}
	public void setCantidadActual(int cantidadActual) {
		this.cantidadActual = cantidadActual;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "C" +nCafetera +" Capacidad Maxima = " +capacidadMaxima +"  "
			  +"Cantidad actual = " +cantidadActual
			  +"\n***************************************";
	}
}
