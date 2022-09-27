package ejemplos025_ordenArrayList4;

public class MainClass {
	public static void main(String arg[]) {
		Persona p1 = new Persona(74999999, 35);
		Persona p2 = new Persona(72759474, 30);

		if (p1.compareTo(p2) < 0) {
			System.out.println("La persona p1: es menor.");
		} else if (p1.compareTo(p2) > 0) {
			System.out.println("La persona p1: es mayor.");
		} else {
			System.out.println("La persona p1 es igual a la persona p2");
		}
	}
}
