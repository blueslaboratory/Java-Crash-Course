package ejemplos026_excepciones6;

public class Main {

	public static void main(String[] args) {
		Animal a = null;
		
		try {
			a = new Animal("algo");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}
		
		if (a != null) 
			System.out.println("Se ha creado, nombre " +a.getNombre());
		else 
			System.out.println("No se ha creado");
		System.out.println();
		
		
		
		try {
			a = new Animal("caballo");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}
		
		if (a != null) 
			System.out.println("Se ha creado, nombre " +a.getNombre());
		else 
			System.out.println("No se ha creado");
		System.out.println();
	}

}