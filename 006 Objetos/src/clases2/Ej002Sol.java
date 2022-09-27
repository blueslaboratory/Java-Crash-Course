package clases2;

/**
 * Clase Empleado
 *
 * Contiene informacion de cada empleado
 *
 */
 public class Ej002Sol {
	//Atributos
	private String nombre;
	private String apellido;
	private int edad;
	private double salario;
	
	
	/**
	* Suma un plus al salario del empleado si el empleado tiene mas de 40 annos
	* @param sueldoPlus
	*/
	public boolean plus (double sueldoPlus){
		boolean aumento=false;
            if (edad>40){
            	salario+=sueldoPlus;
            	aumento=true;
            }
            return aumento;
	}	
	
	
	//Constructores
    //Constructor por defecto
	public Ej002Sol(){
		/*this.nombre="";
		this.apellido="";
		this.edad=0;
		this.salario=0;*/
	}
    //Constructor con 4 parametros
	public Ej002Sol(String nombre, String apellido, int edad, double salario){
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
		this.salario=salario;
	}

	
	//Metodos setter
	public void putNombre(String nombre){
		this.nombre = nombre;
	}
	public void putApellido(String apellido){
		this.apellido = apellido;
	}
	public void putEdad(int edad){
		this.edad = edad;
	}
	public void putSalario(double salario){
		this.salario = salario;
	}
	
	
	//Metodos getter
	public String getNombre(){
		return nombre;
	}
	public String getApellido(){
		return apellido;
	}
	public int getEdad(){
		return edad;
	}
	public double getSalario(){
		return salario;
	}
	
	
	public String toString(){
		return "Nombre " + nombre + " Apellido " + apellido + " Edad " + edad + " Salario " + salario;
	}
}