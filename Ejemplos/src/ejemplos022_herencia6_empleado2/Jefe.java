package ejemplos022_herencia6_empleado2;

public class Jefe extends Empleado{
	String nombreDept;
	
	
	//CONSTRUCTORES
	public Jefe() {
		// super(); lo hace implicitamente
	}
	public Jefe(String n, int s) { 
		//n: nombre ; s: salario
		super(n, s);
	}
	public Jefe(String n, int s, String nombreDept) {
		super(n, s); // Esta instruccion siempre va la primera
		this.nombreDept = nombreDept;
	}

	
	//GETTER
	public String getNombreDept() {
		return nombreDept;
	}
	
	//SETTER
	public void setNombreDept(String nombreDept) {
		this.nombreDept = nombreDept;
	}
	
	
	//toString
	public String toString() {
		String s = super.toString();
		s = s + "\n" + " Nombre Departamento: " +nombreDept;

		return s;
	}
}
