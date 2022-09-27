package ejemplos010_strings;

public class PruebaString1 {
	public static void main(String[] args) {
		String cadena="El que se fue a Sevilla perdio su silla y el que se fue al Torreon, su sillon";
		System.out.println("String: " +cadena);
		System.out.println();
		
		
    	System.out.println("*******");
		System.out.println("charAt");
		System.out.println("*******");
		System.out.println();		
		System.out.println(cadena.charAt(0)); 
		// Nos devolvera E
		//Internamente una cadena es un array de chars
        System.out.println(cadena.charAt(11)); 
        // Nos devolvera u
        System.out.println();
    	
        
        System.out.println("*******");
        System.out.println("endsWith");
    	System.out.println("*******");
    	System.out.println();  	
        System.out.println(cadena.endsWith("n")); 
        //Nos devuelve true
        System.out.println();
        
        
    	System.out.println("*******");
        System.out.println("startsWith");
    	System.out.println("*******");
    	System.out.println();    	
        System.out.println(cadena.startsWith("e")); 
        //Nos devuelve false, Java distingue entre mayusculas y minusculas
        System.out.println();
        
        
    	System.out.println("*******");
        System.out.println("indexOf");
    	System.out.println("*******");
    	System.out.println();   	
        System.out.println(cadena.indexOf("i")); 
        //Nos devuelve la posicion del primer i       
        System.out.println(cadena.indexOf("i", 30));  
        //Nos devuelve la posicion de la primera i desde la posici�n 30
        System.out.println();
        
        
        System.out.println("***********");
        System.out.println("lastIndexOf");
    	System.out.println("***********");
    	System.out.println();   	
        //que marca el segundo par�metro, a su derecha
        System.out.println(cadena.lastIndexOf("i"));  
        //Nos devuelve el contenido de la posicion de la �ltima i (72)       
        System.out.println(cadena.lastIndexOf("i", 30));  
        //Nos devuelve la posicion de la �ltima i a la izquierda de la posici�n
        System.out.println();
        
        
        System.out.println("*******");
        System.out.println("equals");
    	System.out.println("*******");
    	System.out.println();    	
        //que marca el segundo par�metro, a su izquierda        
        System.out.println(cadena.equals("El Que se fue a Sevilla perdio su silla y el que se fue al Torreon, su sillon"));
        System.out.println();
        
        
        System.out.println("*****************");
        System.out.println("equalsIgnoreCase");
        System.out.println("*****************");
        System.out.println();   
        // Nos devuelve true
        System.out.println(cadena.equalsIgnoreCase("El Que se fue a Sevilla perdio su silla y el que se fue al Torreon, su sillon"));
        System.out.println();
        
        
        System.out.println("********");
        System.out.println("getBytes");
    	System.out.println("********");
    	System.out.println();    	
        byte[] array_bytes=cadena.getBytes();
        // [] : define que es un array 
        //Creamos un array de bytes y guardamos la devolucion del metodo
        
        
        System.out.println("*****************************");
        System.out.println("Codigo ASCII de cada caracter");
    	System.out.println("*****************************");
    	System.out.println();
        for (int i=0; i < array_bytes.length; i++){
            System.out.print(array_bytes[i] + " "); //Muestra los codigos
        }
        System.out.println();
        System.out.println();
        
        
        System.out.println("*******************************");
        int pos = cadena.indexOf("su");
        System.out.println("Posici�n de la primera ocurrencia de la palabra su " + pos); 
        //localiza la posicion donde se encuentra "su"                       
        System.out.println();     
        
        
        System.out.println("**************************************************");
        pos = cadena.indexOf("su", pos+1);
        System.out.println("Posici�n de la segunda ocurrencia de la palabra su " + pos); 
        //localiza la posicion donde se encuentra la segunda "su"
        System.out.println();
        
        
        System.out.println("********");
        System.out.println("Longitud");
        System.out.println("********");
        System.out.println();
        System.out.println("Longitud de la cadena " + cadena.length()); 
        // Nos devuelve la longitud: 77
        System.out.println();
        
        
        System.out.println("*******");
        System.out.println("replace");
        System.out.println("*******");
        System.out.println();
        System.out.println(cadena.replace('a', 'e')); 
        // Cambia todas las a por e
        System.out.println();
        // Ojo que la original no cambia si no lo provocamos nosotros guard�ndolo en la cadena
        
        
        System.out.println("**********");
        System.out.println("replaceAll");
        System.out.println("**********");
        System.out.println();
        System.out.println(cadena.replaceAll("ill", "it")); 
        // Cambia una cadena por otra
        System.out.println();
        
        
        System.out.println("***********");
        System.out.println("replaceFirst");
        System.out.println("***********");
        System.out.println();
        System.out.println(cadena.replaceFirst("ill", "it")); 
        // Cambia una cadena por otra
        System.out.println();
        
        
        System.out.println("***********");
        System.out.println("toLowerCase");
        System.out.println("***********");
        System.out.println();
        System.out.println(cadena.toLowerCase()); 
        //Transforma el String a minusculas
        System.out.println();
        
        
        System.out.println("***********");
        System.out.println("toUpperCase");
        System.out.println("***********");
        System.out.println();
        System.out.println(cadena.toUpperCase()); 
        //Transforma el String a mayusculas
        System.out.println();
        
        
        System.out.println("***************");
        System.out.println("Cadena original");
        System.out.println("***************");
        System.out.println();
        System.out.println(cadena);	
        //Vemos que la original esta intacta:
	}
}
