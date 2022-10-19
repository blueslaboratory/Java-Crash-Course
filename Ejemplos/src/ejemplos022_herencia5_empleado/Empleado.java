package ejemplos022_herencia5_empleado;

public class Empleado {
	//con protected puedes acceder desde ejecutivo a estas vars
	protected String nombre;
	protected int numEmpleado, sueldo;

	static private int contador = 0;
	
	
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
	public void aumentarSueldo(int porcentaje) {
		sueldo += (int) (sueldo * porcentaje / 100);
	}

	public String toString() {
		return " Num. empleado " + numEmpleado + "\n" + " Nombre: " + nombre + "\n" + " Sueldo: " + sueldo;
	}
}