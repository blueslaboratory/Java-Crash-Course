package ejemplos024_interface2;

public class PruebaInterfaz{
	
	public static void main(String args[]){
		
		Figura figura = new Cuadrado(5);
		//Podemos crear una referencia de interface (variable r) y que un objeto que	 
		// pertenezca a una clase que la implementa le sea asignado a la variable	
		System.out.println(figura.area());
		
		Cuadrado c = new Cuadrado(5);
		System.out.println(c.area());
	}
} 
