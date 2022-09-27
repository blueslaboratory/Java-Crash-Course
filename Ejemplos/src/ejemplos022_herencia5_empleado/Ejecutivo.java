package ejemplos022_herencia5_empleado;

public class Ejecutivo extends Empleado {
	protected int presupuesto;

	// Comentamos los constructores vac�os a ver qu� pasa
	// public Ejecutivo() {}

	void asignarPresupuesto(int p) {
		presupuesto = p;
	}

	public String toString() {
		String s = super.toString(); //super -> string de la clase superior, de empleado
		s = s + "\n" + " Presupuesto: " + presupuesto;
		return s;
	}
}