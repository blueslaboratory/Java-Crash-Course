package ejemplos011_static1;

public class NormalMain {
	public static void main(String[] args) {
		Normal est1 = new Normal();
		
		System.out.println("Valor de a " + est1.a); // Accedo porque esta en el mismo paquete
		System.out.println("Valor de b " + est1.b);
		(est1.a)++;
		
		
		Normal est2 = new Normal();
		
		System.out.println("Valor de a " + est2.a); // Accedo porque esta en el mismo paquete
		System.out.println("Valor de b " + est2.b);
		System.out.println("Valor de a " + est1.a); // Accedo porque esta en el mismo paquete
		System.out.println("Valor de b " + est1.b);
	}

}
