package ejemplos022_herencia6_empleado2;

public class Ejecutivo extends Empleado {
	protected int presupuesto;

	public Ejecutivo() {
		// super(); lo hace impl�citamente
	}

	public Ejecutivo(String n, int s) {
		super(n, s);
	}

	public Ejecutivo(String n, int s, int p) {
		super(n, s); // Esta instruccion siempre va la primera
		presupuesto = p;
	}

	public void asignarPresupuesto(int p) {
		presupuesto = p;
	}

	public String toString() {
		String s = super.toString();
		s = s + "\n" + " Presupuesto: " + presupuesto;

		return s;
	}
}
