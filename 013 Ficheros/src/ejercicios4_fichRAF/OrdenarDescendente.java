package ejercicios4_fichRAF;

import java.util.Comparator;

public class OrdenarDescendente implements Comparator<Double> {
	@Override
	public int compare(Double o1, Double o2) {
		return o2.compareTo(o1);
		// Devuelve un entero positivo si la o2 es mayor o1
		// Asi ordenariamos descendemente
	}
}
