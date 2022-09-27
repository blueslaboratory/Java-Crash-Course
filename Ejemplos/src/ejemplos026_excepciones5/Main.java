package ejemplos026_excepciones5;

public class Main {

	public static void main(String[] args) {
		
		Animal a = null;		
		a = new Animal("algo");

		if (a != null)
			System.out.println("Se ha creado, nombre " +a.getNombre());
		else
			System.out.println("No se ha creado");
		
		
		Animal b = new Animal("algo");
		if (b != null)
			System.out.println("Se ha creado, nombre " +a.getNombre());
		else
			System.out.println("No se ha creado");
		
	}

}