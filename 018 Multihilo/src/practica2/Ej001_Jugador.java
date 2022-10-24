/*

Se trata de simular el juego para adivinar un numero. Se crearan varios hilos, 
los hilos son los jugadores que tienen que adivinar el numero. Habra un arbitro 
que generara el numero a adivinar, comprobara la jugada del jugador y averiguara 
a que jugador le toca jugar. El numero tiene que estar comprendido entre 1 y 10, 
usa la siguiente formula para generar el numero: 

1 + (int) (10*Math.random()); 

Se definen 3 clases: 

- arbitro: Contiene el numero a adivinar, el turno y muestra el resultado. 
Se definen los siguientes atributos: el numero total de jugadores, el turno, 
el numero a adivinar y si el juego acabo o no. En el constructor se recibe el 
numero de jugadores que participan y se inicializan el numero a adivinar y el 
turno. Tiene varios metodos: uno que devuelve el turno, otro que indica si el 
juego se acabo o no y el tercer metodo que comprueba la jugada del jugador y 
averigua a quien le toca a continuacion, este metodo recibira el identificador 
de jugador y el numero que ha jugado; debera definirse como synchronized, 
asi cuando un jugador esta haciendo la jugada, ningun otro podra interferir. 
En este metodo se indicara cual es el siguiente turno y si el juego ha finalizado 
porque algun jugador ha acertado el numero. 

- Jugador. Extiende Thread. Su constructor recibe un identificador de jugador y el 
arbitro, todos los hilos comparten el arbitro. El jugador dentro del metodo run 
comprobara si es su turno, en ese caso generara un numero aleatorio entre 1 y 10 y 
creara la jugada usando el metodo correspondiente del arbitro. Este proceso Se 
repetira hasta que el juego se acabe. 

- Main: Esta clase inicializa el arbitro indicandole el numero de jugadores y 
lanza los hilos de los jugadores, asignando un identificador a cada hilo y 
enviandoles el objeto arbitro que tienen que compartir.
 
Ejemplo de salida al ejecutar el programa: 

NuMERO A ADIVINAR 

Jugador1 dice: 9 
	Le toca a Jug2
Jugador2 dice: 9 
	Le toca a Jug3
Jugador3 dice: 10 
	Le toca a Jug1 
Jugador1 dice: 4 
	Le toca a Jug2 
Jugador2 dice: 7
	Le toca a Jug3
Jugador3 dice: 7 
	Le toca a Jug1
Jugador1 dice: 6 
	Le toca a Jug2
Jugador2 dice: 3 	
Jugador 2 gana, adivino el numero! ! ! 

*/

package practica2;

/*
 * copia:
- Jugador. Extiende Thread. Su constructor recibe un identificador de jugador y el 
arbitro, todos los hilos comparten el arbitro. El jugador dentro del metodo run 
comprobara si es su turno, en ese caso generara un numero aleatorio entre 1 y 10 y 
creara la jugada usando el metodo correspondiente del arbitro. Este proceso Se 
repetira hasta que el juego se acabe.
*/

public class Ej001_Jugador extends Thread{


	// se podria usar un COUNTER para incrementar los ids de forma automatica
	private static int COUNTER = 0;
	private int id;
	private Ej001_Arbitro arbitro;
	

	public Ej001_Jugador(int id, Ej001_Arbitro arbitro) {
	
		super ();
		this.id = id;
		this.arbitro = arbitro;
	} 
		
	public void jugadaMaestra() {
		int jugada = 1 + (int)(10*Math.random()); 
		try {
			System.out.println("Jugador" +this.id +" dice: " +jugada);
			// esto al parar los hilos daria un problema: una excepcion
			// es mejor hacer un extends, 
			// en java no hay multiherencia
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace () ;
		}														
	}
	
	@Override
	public void run() {
		this.jugadaMaestra();
	}

	public static void main(String[] args) {
		Ej001_Arbitro arbitro1 = new Ej001_Arbitro(); 
		Ej001_Jugador jugador1 = new Ej001_Jugador(0, arbitro1);
		
		jugador1.start(); // llama al run
	}
}