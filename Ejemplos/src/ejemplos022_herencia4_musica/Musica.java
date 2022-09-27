package ejemplos022_herencia4_musica;

// Ejemplo de implementacion de herencia
public class Musica {
	public static final int NUM_INST = 5;

	public static void devolverTipo(Instrumento i) {
		System.out.println("tipo devuelto " + i.tipo());
	}

	public static void tocarYAfinar(Instrumento[] inst) {
		// No importa el tipo de Instrumento,
		// seguiria funcionando debido a Polimorfismo:
		for (int i = 0; i < inst.length; i++) {
			inst[i].tocar(); // Saldran todas, pues tocar lo tienen todas implementado
			inst[i].afinar(); // Solo saldra Guzla, que es la unica que tiene este metodo implementado
		}

	}

	public static void obtTipos(Instrumento[] inst) {

		for (int i = 0; i < inst.length; i++)
			devolverTipo(inst[i]);
	}

	public static void main(String[] args) {
		Instrumento orquesta[] = new Instrumento[NUM_INST];
		int i = 0;

		orquesta[i++] = new Guitarra();
		orquesta[i++] = new Piano();
		orquesta[i++] = new Saxofon();
		orquesta[i++] = new Guzla();
		orquesta[i++] = new Ukelele();
		
		System.out.println("Tocar y afinar: ");
		tocarYAfinar(orquesta);

		System.out.println();
		System.out.println("Obtener tipos: ");
		obtTipos(orquesta);
		// Guzla no tiene tipo() por lo que mostrar� guitarra, el tipo de su padre
		
		System.out.println();
		System.out.println("instanceof: ");
		// instanceof me devuelve la clase de cada uno
		for (i = 0; i < NUM_INST; i++)
			//if el 1er operador es una instancia del 2do
			if (orquesta[i] instanceof Piano) 
				System.out.println("Piano ");
			else if (orquesta[i] instanceof Saxofon)
				System.out.println("Saxofon ");
			else if (orquesta[i] instanceof Guzla)
				System.out.println("Guzla ");
			else if (orquesta[i] instanceof Ukelele)
				System.out.println("Ukelele ");
			else if (orquesta[i] instanceof Guitarra)
				System.out.println("Guitarra ");

		
		System.out.println();
		System.out.println("getClass()");
		//Devolviendo el nombre de la clase
		orquesta[0].getClass();
		
		for(i=0; i<NUM_INST; i++) {
			System.out.println(orquesta[i].getClass());
		}
	}
}
