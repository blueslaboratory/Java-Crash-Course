package ejemplos022_herencia3_milpies;

public class Milpies {
	protected int numeroDePies;
	//protected es que puedes acceder a el desde las clases hijo y tambien dentro del mismo paquete

	public Milpies() {
		numeroDePies = 1000;
		escribePies();
	}

	public void escribePies() {
		System.out.println("Un Milpies o Cochinilla tiene " + numeroDePies + " pies");
	}
}