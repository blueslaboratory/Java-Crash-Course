package ejemplos002_operadores;
public class OpNivelBits {

  public static void main(String args[]) {
	 // Un int son  4 bytes
     int a = 60;	/* 60 = 0011 1100 */ 
     int b = 13;	/* 13 = 0000 1101 */
     int c = 0; 

     c = a & b;       /* 12 = 0000 1100 es el operador & bit a bit 0 con 0, 1 con 0, 1 con 1 y 0 con 1 */
     System.out.println("a & b = " + c );

     c = a | b;       /* 61 = 0011 1101 */
     System.out.println("a | b = " + c );

     c = a ^ b;       /* 49 = 0011 0001 */
     System.out.println("a ^ b = " + c );

     c = ~a;          /*-61 = 1100 0011 */
     System.out.println("~a = " + c );
     // ~ se escribe con altGr 4
     

     c = a << 2;     /* 240 = 1111 0000 */
     System.out.println("a << 2 = " + c );

     c = a >> 2;     /* 215 = 1111 */
     System.out.println("a >> 2  = " + c );

     c = a >>> 2;     /* 215 = 0000 1111 */
     System.out.println("a >>> 2 = " + c );
     
     // Operador NOT de Bits

     // Sólo invierte los bits, es decir, convierte los ceros en unos y viceversa. 
     // Observemos que es el único de esta familia que tiene un solo operando.
     int k = 132;   // k: 00000000000000000000000010000100
	 int m = ~k;    // m: 11111111111111111111111101111011 
     System.out.println("m = " + m );
     // El resultado da -133
     
     // Como los enteros negativos en Java se representan con el método del complemento a dos, podemos realizar 
     // un sencillo experimento de cambiarle el signo a un número. Para realizarlo debemos aplicar a un entero 
     // el operador NOT y sumarle uno.

	 int x = 123; 
	 System.out.println("x = " + x ); 
	 int y = ~x;   
	 int z = y + 1;
	 
	 System.out.println("y = " + y );
	 System.out.println("z = " + z );
	 //El resultado da -123,  
  }
}
