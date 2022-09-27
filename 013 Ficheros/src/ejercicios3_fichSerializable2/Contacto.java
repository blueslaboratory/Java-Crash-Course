/*
Escribe un programa que permita almacenar en un fichero serializable 
una agenda telefonica. Cada registro de la agenda debera contener los 
siguientes datos: Nombre, Apellidos, Nº de Telefono, E-mail. 

El programa debera permitir las siguientes operaciones, mediante un menu:

a) Leer los datos de un nuevo registro (dar de alta), almacenandolo en el fichero. 
b) Buscar una persona de la agenda leyendo de teclado su nombre y apellidos. 
Se visualizaran los datos de la persona. 
c) Modificar el telefono y/o e_mail de una persona que se pedira por teclado 
(por su nombre y apellido). 
d) Eliminar una persona de la agenda telefonica dando su nombre y apellidos. 
Todas las personas que se eliminen del fichero binario, se guardaran en un 
fichero de texto, llamado Eliminados.txt, en el que se guardara un registro 
por linea. 
e) Ordenar el fichero alfabeticamente por nombre y apellido
f) Mostrar el contenido del fichero
g) Finalmente, cuando se salga del menu, se escribira en consola el contenido 
del fichero de texto Eliminados.txt.

*/


package ejercicios3_fichSerializable2;

public class Contacto implements java.io.Serializable {
	// ojo que tiene que tener el implements java.io.Serializable
	// si no salta una excepcion: java.io.NotSerializableException
	
	// https://stackoverflow.com/questions/285793/what-is-a-serialversionuid-and-why-should-i-use-it
	private static final long serialVersionUID = 1L;
	private String nombre, apellido, telefono, email;

	
	//ALT+SHIFT+S
	//CONSTRUCTORES
	public Contacto() {}
	public Contacto(String nombre, String apellido, String telefono, String email) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.email = email;
	}
	
	
	//GETTERS
	public String getNombre() {
		return nombre;
	}	
	public String getApellido() {
		return apellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public String getEmail() {
		return email;
	}
	
	
	//SETTERS
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	//TOSTRING
	@Override
	public String toString() {
		return "Contacto "
				+ "\n\tNombre: " + nombre 
				+ "\n\tApellido: " + apellido 
				+ "\n\tTelefono: " + telefono 
				+ "\n\tEmail: " + email;
	}
		
}