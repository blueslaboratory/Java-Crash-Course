package ejemplos010_strings;

public class PruebaString2 {
	public static void main(String[] args) {
		
        //Comparaci�n .compareTo:
	    //Devuelve el n�mero de elementos que hay entre sus c�digos ASCII
		String str;
		System.out.println("*********");
        System.out.println("compareTo");
        System.out.println("*********");
        System.out.println();
        
        str="Tom�s";
	    System.out.println("Orden alfab�tico " +str.compareTo("Alberto"));
	    //distancia desde la A a la T en el alfabeto	    
	    
	    str="Alberto";
	    System.out.println("Orden alfab�tico " +str.compareTo("Tom�s"));
	    //distancia desde la T a la A en el alfabeto
	    System.out.println("Orden alfab�tico " +str.compareTo("Alberto"));
	    //distancia desde la A a la A en el alfabeto
	    
	    System.out.println("\ncompareToIgnoreCase");
	    System.out.println(str.compareToIgnoreCase("alberto"));
	    System.out.println();
	    
	    
	    
	    //Substring
	    System.out.println("*********");
	    System.out.println("substring");
	    System.out.println("*********");
	    System.out.println();
	    
        str="El lenguaje Java";
	    System.out.println("Substring 1: " +str.substring(12)); //A partir del 12
	    System.out.println("Substring 2: " +str.substring(3, 11));	 
	    System.out.println();
	    
	    
	    
	    //trim: Eliminar los espacios en blanco de los extremos
	    str="  12  ";
	    System.out.println("****");
	    System.out.println("trim");
 	    System.out.println("****");
 	    System.out.println();
	    System.out.println("string original--------------->" +str +"<");
	    System.out.println("string sin espacios en blanco->" +str.trim() +"<");
	    System.out.println();
	    
	    
	    
	    //Convertir un n�mero en string
	    int valor=24;
	    System.out.println("************************");
	    System.out.println("valueOf: numero a string");
	    System.out.println("************************");
 	    System.out.println();
        str=String.valueOf(valor);
	    System.out.println("n�mero --> string "+str);
	    System.out.println();
	    
	    
	    
	    //Convertir un string en n�mero
	    str="  12 ";
	    System.out.println("************************");
	    System.out.println("valueOf: string a numero");
	    System.out.println("************************");
 	    System.out.println();
	    int numeroInt = Integer.valueOf(str.trim());    
	    System.out.println("string --> n�mero " + numeroInt);
	    System.out.println();
	    
	    
	    
	    //Otra forma de conventir un String en numero
	    System.out.println("*************************");
	    System.out.println("parseInt: string a numero");
	    System.out.println("*************************");
 	    System.out.println();
	    numeroInt = Integer.parseInt(str.trim());
	    System.out.println("string --> n�mero " + numeroInt);
       
	    str=" 12.35 ";
	    double numeroDouble = Double.valueOf(str);
	    System.out.println("string --> n�mero "+numeroDouble);
	    
	    numeroDouble = Double.parseDouble(str);
	    System.out.println("string --> n�mero "+numeroDouble);
	    System.out.println();
	    
	    
	    
	    //Concatenar cadenas
	    System.out.println("****************");
	    System.out.println("concatenar con +");
	    System.out.println("****************");
	    System.out.println();
	    String nombre = "Juan ";
		nombre += "Garcia";
		System.out.println(nombre);
		System.out.println();
		
		System.out.println("******");
		System.out.println("concat");
		System.out.println("******");
		System.out.println();
		System.out.println(nombre.concat(" Lopez"));
		System.out.println(nombre);
		System.out.println();
		
		
		
		//Contains
		System.out.println("********");
		System.out.println("contains");
		System.out.println("********");
		System.out.println();
		System.out.println(nombre.contains(" Garcia"));
		//te cuenta los espacios tambien
		System.out.println();
		
	}
}
