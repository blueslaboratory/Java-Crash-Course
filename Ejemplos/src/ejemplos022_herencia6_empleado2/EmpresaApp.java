package ejemplos022_herencia6_empleado2;

public class EmpresaApp {

	public static void main(String[] args) {
		Empleado emp1 = new Empleado("Pepe Gotera", 1200);
		System.out.println(emp1);
		emp1.aumentarSueldo(10);
		System.out.println();
		System.out.println("Modificado " + emp1);
		System.out.println();

		Ejecutivo ejec = new Ejecutivo("Armando Mucho", 3000);
		ejec.asignarPresupuesto(15000);
		ejec.aumentarSueldo(5);
		System.out.println(ejec);

		System.out.println();

		Ejecutivo ejec1 = new Ejecutivo("Luis Lopez", 2000, 12000);
		System.out.println(ejec1);

		System.out.println();

		Ejecutivo ejec2 = new Ejecutivo();
		System.out.println(ejec2);
		
		System.out.println("\n");
		Jefe j1 = new Jefe("Pedro", 3000, "Investigacion");
		System.out.println(j1);
		Autonomo a1 = new Autonomo("Juan", 1200, "Microstar");
		System.out.println(a1);
	}
}