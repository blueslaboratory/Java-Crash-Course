package ejemplos011_static1;
public class Estatica2 { 
	static int a,b; 
	//Bloque est�tico
	static{ 
		a = 10; 
		b = 20; 
	} // Si no es static no compilar�
	
	
	
	public static void main(String[] args){ 
		System.out.println("Valor de a " + a); 
		System.out.println("Valor de b " + b); 
	} 
}
