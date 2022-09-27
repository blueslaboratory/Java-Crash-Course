/*
1.- Haz una clase para trabajar con triangulos isosceles 
(2 lados iguales). Dicha clase tendra como atributos la base 
y la altura que seran privados. Tambien tendra como minimo 
un constructor y dos metodos para calcular el area y el 
perimetro de un triangulo, y todos aquellos metodos que sean 
necesarios para el buen funcionamiento del programa.
 
Formula a aplicar:

perimetro = 2 * lado + base, siendo lado la medida del lado repetido
lado^2 = (base/2)^2 + altura^2
lado = Raiz Cuadrada((base/2)^2 + altura^2)

Crea una clase Principal que cree un Array/ArrayList de 
triangulos en el que se realicen las siguientes operaciones: 

1. Anadir un triangulo. 
2. Calcular e imprimir el triangulo con el area mas grande. 
3. Calcular e imprimir el triangulo con el perimetro mas pequeno. 
4. Imprimir la altura, la base, el area y el perimetro de un triangulo en concreto. 
5. Imprimir la altura, la base, el area y el perimetro de todos los triangulos.
	
*/

package m3_Arraylist;
import java.util.*;

public class Ej001IsoscelesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Ej001Isosceles> isosceles = new ArrayList<Ej001Isosceles>();
		
		int opcion;
		
		do {
			opcion = menu(sc);
			switch(opcion) {
				case 0:
					break;
				case 1:
					nuevoTriangulo(isosceles, sc);
					break;
				case 2:
					mayorArea(isosceles);
					break;
				case 3:
					minPerimetro(isosceles);
					break;
				case 4:
					isoConcreto(isosceles, sc);
					break;
				case 5:
					todosIso(isosceles);
					//System.out.println(isosceles);
					break;
				default:
					System.out.println("Introduce una opcion valida");
					break;
			}
		}while(opcion!=0);
		
		
	}
	
	public static int menu(Scanner sc) {
		int opcion;
		
		System.out.println("\nMenu");
		System.out.println("0. Salir");
		System.out.println("1. Agregar un triangulo");
		System.out.println("2. Triangulo con el area mas grande");
		System.out.println("3. Triangulo con el perimetro mas pequeno");
		System.out.println("4. Triangulo en concreto");
		System.out.println("5. Todos los triangulos");
		
		System.out.print("Opcion: ");
		opcion = Integer.parseInt(sc.nextLine());
		
		return opcion;
	}
	
	//1
	public static void nuevoTriangulo(ArrayList<Ej001Isosceles> isosceles, Scanner sc) {
		double base, altura;
		
		System.out.print("Dime la base: ");
		base = Double.parseDouble(sc.nextLine());
		System.out.print("Dime la altura: ");
		altura = Double.parseDouble(sc.nextLine());
		
		Ej001Isosceles iso = new Ej001Isosceles(base, altura);
		isosceles.add(iso);
	}
	
	//2
	public static void mayorArea(ArrayList<Ej001Isosceles> isosceles) {
		Iterator<Ej001Isosceles> it = isosceles.iterator();
		Ej001Isosceles isoArea, isoMaxArea = isosceles.get(0);
		double area, maxArea = isosceles.get(0).area();
		
		while(it.hasNext()) {
			isoArea = it.next();
			area = isoArea.area();
			if(area>maxArea) {
				isoMaxArea = isoArea;
				maxArea = area;						
			}					
		}
		
		System.out.println(isoMaxArea);
	}
	
	//3
	public static void minPerimetro(ArrayList<Ej001Isosceles> isosceles) {
		Iterator<Ej001Isosceles> it = isosceles.iterator();
		Ej001Isosceles isoPeri, isoMinPeri = isosceles.get(0);
		double peri, minPeri = isosceles.get(0).perimetro();
		
		while(it.hasNext()) {
			isoPeri = it.next();
			peri = isoPeri.perimetro();
			if(peri<minPeri) {
				isoMinPeri = isoPeri;
				minPeri = peri;						
			}					
		}
		
		System.out.println(isoMinPeri);
	}
	
	//4
	public static void isoConcreto(ArrayList<Ej001Isosceles> isosceles, Scanner sc) {
		
		System.out.println("Dime el triangulo a imprimir de los " +(Ej001Isosceles.getContTriangulo())
				  +" triangulos");
		System.out.print("Triangulo: ");	
		System.out.println(isosceles.get(Integer.parseInt(sc.nextLine())-1));
	}
	
	//5
	public static void todosIso(ArrayList<Ej001Isosceles> isosceles) {
		Iterator<Ej001Isosceles> it = isosceles.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		/*
		for(Ej001Isosceles triangulo:isosceles) {
			System.out.println(triangulo);
		}
		
		for(int i=0; i<isosceles.size(); i++) {
			System.out.println(isosceles.get(i));
		}
		*/
	}
}
