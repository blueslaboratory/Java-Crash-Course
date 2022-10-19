package ejemplos025_ordenArrayList2;

public class Persona implements Comparable<Persona> { // ojo, implementamos la interfaz
	private String nombre;
	private int edad;

	
	public Persona() {}
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	// Para poder sobeescribir compareTo hay que implementar Comparable en esta clase
	@Override
	public int compareTo(Persona x) {
		// public class Persona implements Comparable<Persona>{
		// Al ser interfaz generica, nos permite especificar que comparamos personas
		// y es valido sobreescribir asi

		// orden alfabetico
		return this.nombre.compareTo(x.nombre);
		// orden alfabetico inverso
		// return x.nombre.compareTo(this.nombre);

		// Devuelve lo que devolveria si estuvieramos comparando por el nombre, elemento
		// a elemento del arrayList en el caso de implementar nosotros el algoritmo
		// de ordenacion con alguno de los metodos vistos
	}

	@Override
	public String toString() {
		return this.getNombre() + "  -  " + this.getEdad();
	}

}