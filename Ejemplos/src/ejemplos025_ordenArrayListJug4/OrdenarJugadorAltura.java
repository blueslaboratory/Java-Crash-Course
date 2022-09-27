package ejemplos025_ordenArrayListJug4;

import java.util.Comparator;

public class OrdenarJugadorAltura implements Comparator<Jugador> { // implementamos la interfaz
	@Override
	public int compare(Jugador o1, Jugador o2) {
		return o1.getAltura() - o2.getAltura();
		// Devuelve un entero positivo si la altura de o1 es mayor que la de o2
		// Asi ordenariamos ascendemente
		
		// return o2.getAltura() - o1.getAltura();
		// Devuelve un entero positivo si la altura de o1 es menor que la de o2
		// Asi ordenariamos descendemente
	}
}
