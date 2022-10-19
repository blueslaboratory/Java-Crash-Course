package ejemplos022_herencia6_empleado2;

public class Empleado {
	//con protected puedes acceder desde ejecutivo a estos atributos
	//con protected puedes acceder desde clases hijas y desde el mismo paquete
	protected String nombre;
	protected int numEmpleado, sueldo;

	static private int contador = 0;
	
	public void esJefe() {
		if(this instanceof Jefe) {
			Jefe j = (Jefe)this; //Hacemos un casting a Jefe
			System.out.println("Es jefe del departamento " +j.nombreDept);
		}
		else
			System.out.println("No es jefe");
	}
	
	public String tipoEmpleado() {
		if(this instanceof Jefe)
			return "es jefe";
		else if(this instanceof Ejecutivo)
			return "es ejecutivo";
		else if(this instanceof Autonomo)
			return "es autonomo";
		else
			return "es empleado";
	}
	
	public Empleado() {
		numEmpleado = ++contador; //pre-incremento, 1º aumento, 2º asigno
	}

	public Empleado(String nombre, int sueldo) {
		this.nombre = nombre;
		this.sueldo = sueldo;
		numEmpleado = ++contador;
	}
	/*
	 * Otra forma de hacerlos
	public Empleado(String nombre, int sueldo) {
		super();
		this.nombre = nombre;
		this.sueldo = sueldo;
		//numEmpleado = ++contador;
	}
	*/
	protected void aumentarSueldo(int porcentaje) {
		sueldo += (int) (sueldo * porcentaje / 100);
	}

	public String toString() {
		return " Num. empleado " + numEmpleado + "\n" + " Nombre: " + nombre + "\n" + " Sueldo: " + sueldo;
	}
}