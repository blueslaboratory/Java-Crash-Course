package ejemplos011_static;

public class Test1 {
	int atributo1;
	
	Test1 (int atrib) {atributo1 = 0;}
	
	public static void main (String[] Args) {
		System.out.println ("Mensaje 1");
		//System.out.println ("Atributo 1 vale" + this.getAtrib1());
		//Error, no se puede utilizar this en un estatico
		
	} //Cierre del main
	
	
	public int getAtrib1() {return atributo1;}
} //Cierre de la clase