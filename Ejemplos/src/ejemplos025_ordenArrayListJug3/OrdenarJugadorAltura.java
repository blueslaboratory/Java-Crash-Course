package ejemplos025_ordenArrayListJug3;

import java.util.Comparator;

public class OrdenarJugadorAltura implements Comparator<Jugador> {
	
	@Override
	public int compare(Jugador o1, Jugador o2) {
		return o1.getAltura() - o2.getAltura();
		// Devuelve un entero positivo si la altura de o1 es mayor que la de o2
		// Asi ordenariamos ascendentemente
		
		// return o2.getAltura() - o1.getAltura();
		// Devuelve un entero positivo si la altura de o1 es menor que la de o2
		// Asi ordenariamos descendemente
	}
}
