package ejemplos011_static1;

public class Estatica3Main {
	
	public static void main(String[] args){ 
		Estatica3 est1 = new Estatica3();
		
		System.out.println("Valor de a " + est1.a); // Accedo porque esta en el mismo paquete
		System.out.println("Valor de b " + est1.b); 
		(est1.a)++;
		
		
		Estatica3 est2 = new Estatica3();
		
		System.out.println("Valor de a " + est2.a); // Accedo porque esta en el mismo paquete
		System.out.println("Valor de b " + est2.b); 
		System.out.println("Valor de a " + est1.a); // Accedo porque esta en el mismo paquete
		System.out.println("Valor de b " + est1.b); 
	} 

}
