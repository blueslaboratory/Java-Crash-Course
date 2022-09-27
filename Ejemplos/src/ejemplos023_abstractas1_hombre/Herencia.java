package ejemplos023_abstractas1_hombre;


/**
 * Ejemplo de herencias y clases abstractas
 */
public class Herencia {
	
	public static void main(String args[]) {
		Hombre h = new Hombre();
		Anciano a = new Anciano();
		// La clase Persona no se puede instanciar, ya que es abstracta.
		// solo hacemos un casting de anciano a persona
		Persona p = (Persona) a;
		p = a;	//no hace falta hacer el casting
		
		System.out.println("Edad del Anciano: " + a.obtEdad());
		System.out.println("Edad del hombre: " + h.obtEdad());
		System.out.println("Edad de la persona (anciano): " + p.obtEdad());
		System.out.println(p.getClass() +"\n" +a.getClass());
		System.out.println();

		System.out.println("Genero del anciano: " + a.obtGenero());
		System.out.println("Genero del hombre: " + h.obtGenero());
		System.out.println("Genero de la persona (anciano): " + p.obtGenero());
		System.out.println();
		
		System.out.println("Clase del anciano: " + a.obtClase());
		System.out.println("Clase del hombre: " + h.obtClase());
		System.out.println("Clase de la persona (anciano): " + p.obtClase());
	}
}
