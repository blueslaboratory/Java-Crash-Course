package ejemplos011_static1;

public class Estatica { 
	static int a=3,b; 
	//Bloque estático
	static{ 
		System.out.println("Bloque static inicializado"); 
		b=a*4; 
	} // Si no es static no compilará
	
	static void metodo(int x){ 
		System.out.println("x= "+x); 
		System.out.println("a= "+a); 
		System.out.println("b= "+b); 
	} 
	
	public static void main(String[] args){ 
		metodo(42); 
	} 
}
