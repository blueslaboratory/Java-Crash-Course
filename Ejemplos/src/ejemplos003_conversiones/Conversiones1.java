package ejemplos003_conversiones;


public class Conversiones1 { 
	public static void main (String [] args) { 
		System.out.println("*** Ejemplos de conversiones implicitas ***");

		// Declaraciones. 
		int k = 5, p; 
		short s = 10; 
		char c = 'ñ'; // Espana
		float h; 
		byte b;
		
		p = c; // Conversion implicita de char a int 
		h = k; // Conversion implicita de int a float 
		k = s; // Conversion implicita de short a int
		
		System.out.println("p = " + p + "; h = " + h + "; k = " + k);


		
		// Los siguientes ejemplos de conversion implicita provocarian un error.
		System.out.println("*** Ejemplos de conversiones implicitas erroneas ***");

		

		
		
// 		CTRL + SHIFT/MAYUS + 7 : Comenta todo lo que tengas seleccionado
		
//		// Declaraciones.
//		long l = 20;
//		float ft = 2.4f; 
		char car;
		b = 4;

//		int n = l; 
//		// Error, el tipo destino es menor al tipo origen.
//		car = b; 
//		// Cuando la variable destino es "char" y el origen es numerico;
//		// independientemente del tipo especifico, la conversion no podra ser automatica.

		
		
		car = (char) b; // haciendo un casting "si te deja" = "tu sabras"
		System.out.println(car);

//		n = ft; 
//		// Cuando la variable destino es entera y el origen es decimal (float o double),
//		// la conversion no podra ser automatica.

	}
	
} 