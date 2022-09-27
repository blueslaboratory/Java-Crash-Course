package ejemplos003_conversiones;


public class Conversiones2 { 
	public static void main (String [] args) { 
		int a = 2, p, n; 
		double b = 3.0, d; 
		byte k; 
	
		System.out.println("*** Ejemplos de conversiones explicitas ***");
		
		
		// Declaraciones
		p = 400;
		d = 34.6; 
			
		
		// Conversiones explicitas
		n = (int)d; // Se elimina la parte decimal (trunca), no se redondea
		System.out.println("Valor de n: " + n);
		
		
		k = (byte)p; 
		// Se provoca una perdida de datos, pero la conversion es posible.
		// byte solo te deja 256 numeros en total
		System.out.println("Valor de k: " + k);
		System.out.println("Formato byte: " + (byte)p);
		System.out.println("Formato short: " + (short)p);
	
	
		float c = (float) (20000*a/b + 5); //13.338,333333333333333333333333333
		System.out.println("\n\nResultado: " + (20000*a/b + 5)); 
		// por defecto es un double (64 bits = 8 bytes)
		// 11010000011010 es 13338
		System.out.println("Valor en formato float: " + c); 
		System.out.println("Valor en formato double: " + (double) c); 
		System.out.println("Valor en formato byte: " + (byte) c); 
		// Nos quedamos con los 8 primeros bits por la derecha -> 00011010 -> 26
		System.out.println("Valor en formato short: " + (short) c); 
		System.out.println("Valor en formato int: " + (int) c); 
		System.out.println("Valor en formato long: " + (long) c); 
		
		
		c = 13339; //11010000011011
		System.out.println("\n\nValor en formato float: " + c); 
		System.out.println("Valor en formato double: " + (double) c); 
		System.out.println("Valor en formato byte: " + (byte) c); 
		// Nos quedamos con los 8 primeros bits - 00011011 -> 27
		System.out.println("Valor en formato short: " + (short) c); 
		System.out.println("Valor en formato int: " + (int) c); 
		System.out.println("Valor en formato long: " + (long) c); 
	} 
} 