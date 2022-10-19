package ejemplos025_ordenArrayListJug1;

import java.util.ArrayList;
import java.util.Collections;

public class Programa {

	public static void main(String arg[]) {

		ArrayList<Jugador> listaJugadores = new ArrayList<Jugador>();

		listaJugadores.add(new Jugador("Mario", 22, 187));

		listaJugadores.add(new Jugador("Pepe", 52, 173));

		listaJugadores.add(new Jugador("Manuel", 27, 158));

		listaJugadores.add(new Jugador("David", 25, 164));

		listaJugadores.add(new Jugador("Alberto", 80, 184));

		Collections.sort(listaJugadores); // Ejemplo uso ordenacion natural

		System.out.println("Jugadores Ordenados por orden natural: \n" + listaJugadores);

	}

}
