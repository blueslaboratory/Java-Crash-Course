package ejemplos025_ordenArrayList4;

public class Persona implements Comparable<Persona> { // implementamos la interfaz
	public int dni, edad;

	public Persona(int d, int e) {
		this.dni = d;
		this.edad = e;
	}

	// Para poder sobreescribir compareTo hay que 
	// implementar Comparable en esta clase
	// (para reescribir un metodo es "implements" no "extends")
	// Lo malo es que solo puede haber 1 compareTo en la clase,
	// para implementar otros metodos de ordenacion seria con un 
	// implements Comparator<Persona>
	
	
	@Override
	public int compareTo(Persona o) {
		//return (new Integer(this.dni).compareTo(new Integer(o.dni)));
		return (Integer.valueOf(this.dni).compareTo(Integer.valueOf(o.dni)));
		//return ((this.dni).compareTo(o.dni));
	}
	// Puedes utilizar numeros como abajo y ya esta:
	
	
	
	
//	@Override
//	public int compareTo(Persona o) {
//		if (this.dni > o.dni)
//			return 1;
//		else if (this.dni < o.dni)
//			return -1;
//		else
//			return 0;
//	}
	
	
	
	
//	// Otra forma de ordenar descendentemente, sin usar reverseOrder
//	// es dar la vuelta a nuestra comparacion:
//	@Override
//	public int compareTo(Persona o) {
//		return (new Integer(o.dni).compareTo(new Integer(this.dni)));
//	}
	
	
	
	
	// Ahora ordenamos ascendentemente por edad y ascendentemente por dni
//	@Override
//	public int compareTo(Persona o) {
//		if (this.edad > o.edad)
//			return 1;
//		else if (this.edad < o.edad)
//			return -1;
//		else if (this.dni > o.dni) 
//			return 1;
//		else if (this.dni< o.dni)
//			return -1;
//		else
//			return 0;
//	}
	
	
	
	
//	@Override
//	public int compareTo(Persona o) {
//		if (this.edad > o.edad)
//			return 1;
//		else if (this.edad < o.edad)
//			return -1;
//		else 
//			return (new Integer(this.dni).compareTo(new Integer(o.dni)));
//	}
	
	
	
	
// Ahora ordenamos descendentemente por edad y ascendentemente por dni
	
//	@Override
//	public int compareTo(Persona o) {
//		if (this.edad < o.edad)
//			return 1;
//		else if (this.edad > o.edad)
//			return -1;
//		else 
//			return (new Integer(this.dni).compareTo(new Integer(o.dni))); //ASCEND
//	}	
	
	
	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", edad=" + edad + "]";
	}

}
