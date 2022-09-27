package ejemplos022_herencia2_poli2;

public class Triangulo extends Poligono {
	// Para tener el constructor por defecto, si he escrito el constructor
	// con parametros, necesito el constructor por defecto de Poligono
	// o alguno por defecto en las superclases
	/*
	 * public Triangulo (){ System.out.println("Triangulo()"); }
	 */

	public Triangulo(String str) {
		// Si no invoco el constructor con parametro (super(str);), llamaria al
		// constructor sin parametros

		// super();//Probar con y sin esta sentencia, vemos que no cambia nada, es lo
		// que se hace por defecto
		// eso s�, hay que comentar la llamada al constructor con parametros de abajo

		/*
		 * Figura() Poligono() Triangulo(Hola) Dibujo Poligono
		 */

		super(str);// Probar con y sin esta sentencia, si no llamo a ning�n constructor se invoca
					// el de por defecto

		/*
		 * Figura(Hola) Poligono(Hola) Triangulo(Hola) Dibujo Poligono
		 */
		System.out.println("Triangulo(" + str + ")");
	}
}
