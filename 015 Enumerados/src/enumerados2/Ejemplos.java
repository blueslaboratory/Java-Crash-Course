package enumerados2;
public class Ejemplos {

	public static void main(String[] args) {
/*
		//Instancia de un enum de la clase Demarcacion.
		Demarcacion delantero = Demarcacion.DELANTERO;

		//Devuelve un String con el nombre del enumerado (DELANTERO).
		delantero.name();
		//Devuelve un String con el nombre del enumerado (DELANTERO).
		delantero.toString();
		//Devuelve un entero con la posicion del enum segun esta declarada (3).
		delantero.ordinal();

		//Compara el enum que invoca el metodo con el enum parametro, segun el orden en el que estan declarados los enum.
		//delantero.compareTo(Enum otro);
		//Devuelve un array que contiene todos los enum.
		Demarcacion.values();
		//Devuelve el enumerado que corresponde con la cadena pasada por  parametro
		System.out.println(Demarcacion.valueOf("DELANTERO"));
*/
		
		
		//Demarcacion, ejemplo para probar:
		System.out.println("Demarcacion, ejemplo para probar:");
		
		Demarcacion delantero = Demarcacion.DELANTERO;
		Demarcacion defensa = Demarcacion.DEFENSA;

		// Devuelve un String con el nombre de la constante
		System.out.println("delantero.name()= " + delantero.name());
		System.out.println("defensa.toString()= " + defensa.toString());

		// Devuelve un entero con la posicion de la constante segun esta declarada.
		System.out.println("delantero.ordinal()= " + delantero.ordinal());

		// Compara el enum con el parametro segun el orden en el que estan // declaradas
		// las constantes.
		System.out.println("delantero.compareTo(portero)= " + delantero.compareTo(defensa));
		System.out.println("delantero.compareTo(delantero)= " + delantero.compareTo(delantero));

		// Recorre todas las constantes de la enumeracion
		for (Demarcacion d : Demarcacion.values()) {
			System.out.print(d.toString() + " - ");
		}
		System.out.println();
		
		
		
		// Equipo, ejemplo para probar:
		System.out.println("\nEquipo, ejemplo para probar:");
		
		// Instanciamos el enumerado
		Equipo villareal = Equipo.VILLAREAL;

		// Devuelve un String con el nombre de la constante
		System.out.println("villareal.name()= "+villareal.name());

		// Devuelve el contenido de los atributos
		System.out.println("villareal.getNombreClub()= " +villareal.getNombreClub());
		System.out.println("villareal.getPuestoLiga()= " +villareal.getPuestoLiga());
	}
}