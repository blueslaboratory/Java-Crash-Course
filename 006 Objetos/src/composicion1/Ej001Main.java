package composicion1;

public class Ej001Main {
	public static void main(String[] args) {
		
		Ej001Punto p1 = new Ej001Punto(0,0);
		Ej001Punto p2 = new Ej001Punto(3,1);
		Ej001Punto p3 = new Ej001Punto(4,8);
		Ej001Punto p4 = new Ej001Punto(7,9);
		Ej001Rectangulo r1 = new Ej001Rectangulo(p1,p2,p3,p4);
		
		System.out.println("Area rectangulo: " +r1.area());
		System.out.println(r1);
		
		
		//COMO NO HACER UNA COPIA DE UN OBJETO
		Ej001Rectangulo r2 = r1;
		r2.setP1(p3);
		System.out.println(r2);
		System.out.println(r1);
		
		
		//COMO SI
		Ej001Rectangulo c3 = new Ej001Rectangulo(r1.getP1(), r1.getP2(), r1.getP3(), r1.getP4()); 
	}
}
