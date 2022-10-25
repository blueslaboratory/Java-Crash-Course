/*

Se trata de simular el juego para adivinar un numero. Se crearan varios hilos, 
los hilos son los jugadores que tienen que adivinar el numero. Habra un arbitro 
que generara el numero a adivinar, comprobara la jugada del jugador y averiguara 
a que jugador le toca jugar. El numero tiene que estar comprendido entre 1 y 10, 
usa la siguiente formula para generar el numero: 

1 + (int) (1O*Math.random()); 

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


// ARBITRO NO ES THREAD
public class Ej001_Arbitro{


	// se podria usar un COUNTER para incrementar los ids de forma automatica
	private int nTotalJugadores, turno, numAdivinar;
	static boolean FINISH = false;

	public Ej001_Arbitro(int nTotalJugadores) {
	
		super ();
		this.numAdivinar = 1 + (int)(10*Math.random());
		this.nTotalJugadores = nTotalJugadores;
		this.turno = 1;
	} 
	
	
	
	public int getnTotalJugadores() {
		return nTotalJugadores;
	}
	public void setnTotalJugadores(int nTotalJugadores) {
		this.nTotalJugadores = nTotalJugadores;
	}


	public int getTurno() {
		return turno;
	}
	public void setTurno(int turno) {
		this.turno = turno;
	}

	
	public int getNumAdivinar() {
		return numAdivinar;
	}
	public void setNumAdivinar(int numAdivinar) {
		this.numAdivinar = numAdivinar;
	}
	
	
	public boolean isAcabado() {
		return FINISH;
	}
	public void setAcabado(boolean Acabado) {
		FINISH = Acabado;
	}

	

	// sincronizamos el metodo mejor
	// el arbitro sincroniza todos los jugadores, por eso tiene que estar aqui
	public synchronized void jugadaMaestra(int jugada, int id) {
		
		System.out.println("Jugador" +id + " dice: " +jugada);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// comprobar si ha acertado
		if (jugada!=numAdivinar) {
			System.out.println("\tSigue intentandolo jugador" +turno);
			turno++;
			if(turno>nTotalJugadores) {
				turno=1;
			}
			System.out.println("\tSiguiente jugador: jugador" +turno);
			
		}
		else {
			FINISH = true;
			System.out.println("\tEl jugador" +id +" ha adivinado el numero");
			System.out.println("***WINNER: PLAYER" +id +"***");
			System.out.println("Fin de la partida");
		}

		
	}
	
	
}