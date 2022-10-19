package ejemplos023_abstractas1_hombre;

/**
 * Ejemplo de herencias y clases abstractas
 */
public class Anciano extends Hombre {
	/*
	 * No hace falta definir ningun metodo, solo aquellos en los que queramos
	 * devolver cosas distintas. En este caso, la edad
	 */
	private static int edad = 75;
	/*
	 * No hace falta definir el metodo clase(), porque ya esta definido en la clase
	 * padre. Lo tendr�amos que definir si queremos devolver algo distinto a lo que
	 * devuelve all�
	 */

	/**
	 * Devuelve la edad de la persona (este metodo si hay que definirlo porque es
	 * sobre un atributo de la clase padre)
	 */
	public int obtEdad() {

		return edad;
	}
}
