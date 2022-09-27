package ejemplos023_abstractas1_hombre;

/**
 * Ejemplo de herencias y clases abstractas
 */
public class Hombre extends Persona {
	private int edad = 40;
	private static String genero = "masculino";
	/*
	 * No hace falta definir el metodo clase(), porque ya esta definido en la clase
	 * padre. Lo tendr�amos que definir si queremos devolver algo distinto a lo que
	 * devuelve all�
	 */

	@Override
	public String obtGenero() {
		return genero;
	}

	@Override
	public void setGenero(String _genero) {
		genero = _genero;
	}

	@Override
	public int obtEdad() {
		return edad;
	}

	@Override
	public void setEdad(int edad) {
		this.edad = edad;
	}

}
