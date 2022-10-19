package ejemplos017_compobj1;

public class CirculoMain {
	public static void main(String[] args) {
		
		Punto p1 = new Punto(0,0);
		Circulo c1 = new Circulo(p1,5);
		
		System.out.println("Area circulo: " +c1.area());
		System.out.println(c1);
		
		
		//COMO NO HACER UNA COPIA DE UN OBJETO
		Circulo c2 = c1;
		//c2 y c1 son el mismo objeto
		c2.setRadio(3);
		System.out.println(c2);
		System.out.println(c1);
		System.out.println("c2 y c1 son el mismo objeto: " +(c2 == c1));
		
		
		//COMO SI
		Circulo c3 = new Circulo(c1.getCentro(), c1.getRadio());
		//c3 y c1 son objetos distintos: siempre hay un new de por medio
		System.out.println("c3 y c1 son objeto el mismo objeto: " +(c3 == c1));
		Circulo c4 = c1.copia();
		System.out.println("c4 y c1 son objeto el mismo objeto: " +(c4 == c1));
		Circulo c5 = c1.copia2();
		System.out.println("c5 y c1 son objeto el mismo objeto: " +(c5 == c1));
	}
}
