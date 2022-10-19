package ejemplos021_sobrecarga;

public class Usuario {
	String nombre;
	int edad;
	String direccion;

	//El constructor esta sobrecargado
	public Usuario() {
		nombre = null;
		edad = 0;
		direccion = null;
	}

	public Usuario(String nombre, int edad, String direccion) {
		this.nombre = nombre;
		this.edad = edad;
		this.direccion = direccion;
	}

	public Usuario(Usuario usr) {
		nombre = usr.getNombre();
		edad = usr.getEdad();
		direccion = usr.getDireccion();
	}

	public void setNombre(String n) {
		nombre = n;
	}

	public String getNombre() {
		return nombre;
	}

	//El metodo setEdad() esta sobrecargado
	public void setEdad(int e) {
		edad = e;
	}

	public void setEdad(double e) {
		edad = (int) e;
	}

	public int getEdad() {
		return edad;
	}

	public void setDireccion(String d) {
		direccion = d;
	}

	public String getDireccion() {
		return direccion;
	}
	//Anadir un metodo para imprimir un usuario para eliminarlo del main
}
