package ejercicios3_fichSerializable2;

import java.util.Comparator;

public class OrdenarAlfab implements Comparator<Contacto> {
	@Override
	public int compare(Contacto o1, Contacto o2) {
		if (o1.getNombre().compareToIgnoreCase(o2.getNombre())!=0) {
			return o1.getNombre().compareToIgnoreCase(o2.getNombre());
		}
		else
			return o1.getApellido().compareToIgnoreCase(o2.getApellido());
		
		// Devuelve un entero positivo si el nom/ape de o1 es mayor que el nom/ape de o2
		// Asi ordenariamos alfabeticamente

	}

}