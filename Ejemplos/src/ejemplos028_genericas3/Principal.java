package ejemplos028_genericas3;

public class Principal {

	public static void main(String[] args) {

		Bolsa bolsa = new Bolsa(5);
		Chocolatina c = new Chocolatina("Milka");
		Chocolatina c1 = new Chocolatina("Milka");
		Chocolatina c2 = new Chocolatina("Ferrero");
		Golosina g1 = new Golosina("gominola");
		Golosina g2 = new Golosina("chicle");

		bolsa.add(c);
		bolsa.add(c1);
		bolsa.add(c2);
		bolsa.add(g1);
		bolsa.add(g2);

		// Si quiero acceder a un metodo concreto de alguno de los objetos:
		for (Object o : bolsa) {

			if (o instanceof Chocolatina) {
				Chocolatina chocolatina = (Chocolatina) o;
				System.out.println(chocolatina.getMarca());
//				System.out.println(((Chocolatina) o).getMarca());
			} else {
				Golosina golosina = (Golosina) o;
				System.out.println(golosina.getNombre());
			}
		}

		// Otra opcion seria usar el toString()

		for (Object o : bolsa) {
			System.out.println(o);
		}
	}

}
