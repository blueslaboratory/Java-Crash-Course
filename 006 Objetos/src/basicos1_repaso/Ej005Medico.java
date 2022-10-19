//Ejercicio 5.- Se pide definir una clase Medico (que representa a un médico de un 
//hospital) con los siguientes atributos de clase: nombre (String), apellidos 
//(String), edad (int), casado (boolean), numeroDocumentoIdentidad (String), 
//especialidad (String). Definir un constructor que permita asignar valores de defecto 
//a los atributos y los métodos para poder establecer y obtener los valores de los 
//atributos. En cada método, incluye una instrucción para que se muestre por consola 
//un mensaje informando del cambio. Por ejemplo si cambia la especialidad del médico, 
//debe aparecer un mensaje que diga: 
//"Ha cambiado la especialidad del médico de nombre … . La nueva especialidad es: …".


//Ejercicio 6.-
//Dada la clase Medico del ejercicio anterior, añade un método de nombre 
//"calculoParaMultiploEdad" que no recibe parámetros y que permita determinar 
//cuántos años faltan para que la edad del médico sea múltiplo de 5 y mostrar 
//un mensaje informativo por pantalla. Por ejemplo si el médico tiene 22 años 
//deberá en primer lugar obtener el resto de la división de 22 entre 5, que 
//es 2. Ahora obtendrá los años que faltan para que el médico tenga una edad 
//múltiplo de 5, que serán 5-2 = 3 años. A continuación deberá mostrar un 
//mensaje por consola del tipo: "El médico de nombre … con especialidad … "
//+ "tendrá una edad múltiplo de 5 dentro de … años".


package basicos1_repaso;

public class Ej005Medico {
	private String nombre, apellidos, DNI, especialidad;
	private int edad;
	private boolean casado;	
	
	//EJ6
	public int calculoParaMultiploEdad(){
		int resto = edad%5;
		int faltan = 5-resto;
		return faltan;
	}
	
	
	//CONSTRUCTOR DE MEDICO
	public Ej005Medico(String nombre, String apellidos, String DNI, 
				  	   String especialidad, int edad, boolean casado) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.DNI = DNI;
		this.especialidad = especialidad;
		this.edad = edad;
		this.casado = casado;
	}
	
	public Ej005Medico() {}
	//me permite tener el constructor en el main por defecto de:
	//Medico medico1 = new Medico();
	
	
	//MENSAJE DE CAMBIO
	public void mensaje(String valor, String cambio) {
		System.out.println("El valor " +valor +" ha cambiado a " +cambio);
	}

	
	//PARA VER PUEDO VERLOS DESDE LA PROPIA CLASE MEDICO
	//(todo esto esta dentro de la clase medico)
	//SET IT
	//Para crearlos automaticamente ALT + SHIFT + S
	
	public void setNombre(String nombre) {
		mensaje(this.nombre, nombre);
		this.nombre = nombre;
	}
	public void setApellidos(String apellidos) {
		mensaje(this.apellidos, apellidos);
		this.apellidos = apellidos;
	}
	public void setDNI(String dNI) {
		mensaje(DNI, dNI);
		DNI = dNI;
	}
	public void setEspecialidad(String especialidad) {
		mensaje(this.especialidad, especialidad);
		this.especialidad = especialidad;		
	}
	public void setEdad(int edad) {
		//casting a string:
		mensaje(String.valueOf(this.edad), String.valueOf(edad));
		//System.out.println("Ha cambiado la edad de " +this.edad +" a " +edad);
		this.edad = edad;
	}
	public void setCasado(boolean casado) {
		//casting a string:
		mensaje(String.valueOf(this.casado), String.valueOf(casado));
		//System.out.println("Ha cambiado el estado de casado de" +this.casado +" a " +casado);
		this.casado = casado;
	}


	
	//GET IT
	//Para crearlos automaticamente ALT + SHIFT + S

	public String getNombre() {
		return nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public String getDNI() {
		return DNI;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public int getEdad() {
		return edad;
	}
	public boolean isCasado() {
		return casado;
	}
	
	
	//toString
	public String toString() {
		return 	 "\n Nombre: " +nombre
				+"\n Apellidos: " +apellidos
				+"\n DNI: " +DNI
				+"\n Especialidad: " +especialidad
				+"\n Edad: " +edad
				+"\n Casado: " +(casado ? "Si" : "No");
	}

}