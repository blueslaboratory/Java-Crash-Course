package ejemplos025_ordenArrayListJug4;

import java.util.Comparator;

public class OrdenarJugadorNombre implements Comparator<Jugador> { // implementamos la interfaz
	@Override
	public int compare(Jugador o1, Jugador o2) {
		return o1.getNombre().compareTo(o2.getNombre());
		// Devuelve un entero positivo si el nombre de o1 es mayor que el nombre de o2
		// Asi ordenariamos alfabeticamente

	}
}
