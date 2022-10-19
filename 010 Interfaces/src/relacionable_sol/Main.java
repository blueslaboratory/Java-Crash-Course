package relacionable_sol;

public class Main {
	 public static void main(String args[]) {	
		 
		 Linea lin1= new Linea(1, 1, 6, 6);
		 Linea lin2= new Linea(0, 1, 6, 1);
		 System.out.println();
		 System.out.println("lin1:\n" + lin1);
		 System.out.println();
		 System.out.println("lin2:\n" + lin2);
		 System.out.println();
		 
		 if (lin1.esMayorQue(lin2)) System.out.println("lin1 es mayor que lin2" );
		 else if (lin1.esMenorQue(lin2)) System.out.println("lin1 es menor que lin2");
		 else System.out.println("lin1 es igual que lin2");
		 System.out.println("____________________");
		 
		 Rectangulo rect1= new Rectangulo(2, 8);
		 System.out.println();
		 Rectangulo rect2= new Rectangulo(4, 7);
		 System.out.println();
		 System.out.println("rect1:\n" + rect1);
		 System.out.println();
		 System.out.println("rect2:\n" + rect2);
		 System.out.println();
		 
		 if (rect1.esMayorQue(rect2)) System.out.println("rect1 es mayor que rect2" );
		 else if (rect1.esMenorQue(rect2)) System.out.println("rect1 es menor que rect2");
		 else System.out.println("rect1 es igual que rect2");
		 System.out.println("____________________");
		 
		 if (rect1.esMayorQue(lin1))
				 System.out.println("rect1 es mayor que rect2" );
		 System.out.println("____________________");
		 
		 Fraccion fr1= new Fraccion(2, 8);
		 System.out.println();
		 Fraccion fr2= new Fraccion(16, 2);
		 System.out.println();
		 System.out.println("fr1:\n" + fr1);
		 System.out.println();
		 System.out.println("fr2:\n" + fr2);
		 System.out.println();
		 
		 if (fr1.esMayorQue(fr2)) System.out.println("fr1 es mayor que fr2" );
		 else if (fr1.esMenorQue(fr2)) System.out.println("fr1 es menor que fr2");
		 else System.out.println("fr1 es igual que fr2");
		 System.out.println("____________________");
	 }
}
