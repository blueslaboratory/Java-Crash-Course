//Ejercicio 3.- Define una clase Profesor considerando los siguientes 
//atributos de clase: nombre (String), apellidos (String), edad (int), 
//casado (boolean), especialista (boolean). Define un constructor que 
//reciba los parámetros necesarios para la inicialización y otro 
//constructor que no reciba parámetros. Crea los métodos para poder 
//establecer y obtener los valores de los atributos.



package basicos1;

public class Ej003Profesor {
	//Los definimos como private, por lo que solo podemos acceder a ellos 
	//desde la clase donde nos encontramos y no desde los objetos que 
	//creamos a partir de esta clase "plantilla" desde otras clases,
	//a no ser que declaremos metodos public dentro de esta clase que nos
	//lo permitan
	
	//String es una clase
	private String nombre = new String();
	private String apellidos;
	private int edad;
	private boolean casado;
	private boolean especialista;
	
	
	//CONSTRUCTORES
	public Ej003Profesor() {}
	public Ej003Profesor(String nombre, String apellidos, int edad, boolean casado, boolean especialista) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.casado = casado;
        this.especialista = especialista;
    }
	
	//SETS
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setCasado(boolean casado) {
		this.casado = casado;
	}
	public void setEspecialista(boolean especialista) {
		this.especialista = especialista;
	}
	
	//GETS
	public String getNombre() {
		return nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public boolean isCasado() {
		return casado;
	}
	public boolean isEspecialista() {
		return especialista;
	}
	
	
	//toString
	public String toString() {
		return   "\n Nombre: " +nombre
				+"\n Apellidos: " +apellidos
				+"\n Edad: " +edad
				+"\n Casado: " +casado
				+"\n Especialista: " +especialista;
	}
}


