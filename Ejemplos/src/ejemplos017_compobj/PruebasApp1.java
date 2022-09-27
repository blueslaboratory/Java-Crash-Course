package ejemplos017_compobj;

public class PruebasApp1 {

	public static void main(String[] args) {
		Linea1 l1;

		l1 = new Linea1(1, 10, 1, 20);
		System.out.println(l1);
		System.out.println("Longitud " + l1.longitud());

		l1 = new Linea1(10, 10, -3, 20);
		System.out.println(l1);
		System.out.println("Longitud " + l1.longitud());
	}

}
