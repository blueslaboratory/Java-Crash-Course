package ejemplos028_genericas4;
public class Principal {

	public static void main(String[] args) {

		// Al hacerlo con genericos no puedo mezclar en la misma bolsa Chocolatinas y Golosinas

		Bolsa<Chocolatina> bolsa = new Bolsa<Chocolatina>(10);

		Chocolatina c1 = new Chocolatina("Milka");
		Chocolatina c2 = new Chocolatina("Ferrero");
		Chocolatina c3 = new Chocolatina("Milka");

		bolsa.add(c1);
		bolsa.add(c2);
		bolsa.add(c3);

		for (Chocolatina chocolatinas : bolsa) {
			System.out.println(chocolatinas.getMarca());
		}
		System.out.println();
		
		Bolsa<Golosina> bolsa2 = new Bolsa<Golosina>(2);

		Golosina g1 = new Golosina("gominolas");
		Golosina g2 = new Golosina("chupachups");
		Golosina g3 = new Golosina("chicles");

		bolsa2.add(g1);
		bolsa2.add(g2);
		bolsa2.add(g3);

		for (Golosina golosinas: bolsa2) {
			System.out.println(golosinas.getNombre());
		}
		System.out.println();
		
	}
}