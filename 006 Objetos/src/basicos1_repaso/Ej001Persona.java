//Ejercicio 1.- Define una clase Persona considerando los siguientes 
//atributos de clase: nombre (String), apellidos (String), edad (int), 
//casado (boolean), numeroDocumentoIdentidad (String). 
//Define un constructor y los metodos para poder establecer y obtener 
//los valores de los atributos.


package basicos1_repaso;

public class Ej001Persona {
	//Los definimos como private, por lo que solo podemos acceder a ellos 
	//desde la clase donde nos encontramos y no desde los objetos que 
	//creamos a partir de esta clase "plantilla" desde otras clases,
	//a no ser que declaremos metodos public dentro de esta clase que nos
	//lo permitan
	
	//String es una clase
	private String nombre = new String();
	private String apellido;
	private String DNI;
	private int edad;
	private boolean casado;
	
	
	//CONSTRUCTORES DE PERSONA
	public Ej001Persona() {}
	public Ej001Persona(String nombre, String apellido, String DNI, int edad, boolean casado) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.DNI = DNI;
		this.edad = edad;
		this.casado = casado;
	}
	
	
	//SETS
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setDNI(String DNI) {
		this.DNI = DNI;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setCasado(boolean casado) {
		this.casado = casado;
	}
	
	
	//GETS
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public String getDNI() {
		return DNI;
	}
	public int getEdad() {
		return edad;
	}
	public boolean isCasado() {
		return casado;
	}
	
	
//	WARNING: Multiple markers at this line
	//	- overrides java.lang.Object.
	//	 toString
	//	- This method must return a result 
	//	 of type String
	//	Sobreescribiendo
	public String toString(){
		return "\n" +nombre
			  +"\n" +apellido
			  +"\n" +DNI
			  +"\n" +edad
			  +"\n" +casado;
	}
	
}


