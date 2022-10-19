package ejemplos024_interface;

public class InterfazApp {
	
	public static void main(String args[]) {

		ImplementaInterfaz ejInterfaz = new ImplementaInterfaz();

		System.out.println(ejInterfaz.metodoAbstracto(3));
	}
}