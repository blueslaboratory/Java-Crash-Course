package ejemplos022_herencia5_empleado;

public class EmpresaApp {

	public static void main(String[] args) {
		// Descomentar y probar:
		Empleado emp = new Empleado("Esteban Comex Plota", 1000);
		System.out.println(emp);
		// emp.asignarPresupuesto(5000); // error, es un metodo del hijo: Ejecutivo
		// si tienes un ejecutivo en un for de empleados para llamar a metodos de
		// ejecutivo habria que hacer un casting
		System.out.println();

		Empleado emp1 = new Empleado("Pepe Gotera", 1200);
		System.out.println(emp1);
		emp1.aumentarSueldo(10);

		System.out.println();

		System.out.println(emp1);

		System.out.println();

		Ejecutivo ejec = new Ejecutivo();

		System.out.println(ejec);

		System.out.println();

		// No hay constructor para ejecutivo, hay que crearlo en la siguiente version:

		ejec.asignarPresupuesto(1500);
		ejec.aumentarSueldo(5);// El ejecutivo no tiene sueldo asignado
		System.out.println(ejec);
	}
}