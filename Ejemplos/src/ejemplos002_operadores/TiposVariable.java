package ejemplos002_operadores;

import java.text.DecimalFormat;


public class TiposVariable {
	
	public static void main(String args[]) {
		

		System.out.println("1. - Es un literal int " + 2147483647);
		//En java un numero entero, por defecto es int
		
		System.out.println("1. - Es un literal int " + 2147483647 * 2);
		//Este se desborda y pasa a un valor random (-2)
		
		System.out.println("2. - Es un literal long " + 2147483647L * 2);
		//La L indica el long
		
		//2147483647 es el valor mas grande positivo que se puede 
		//almacenar en una variable de tipo int, 32bits, (4 bytes)
		//es representacion con signo. 
		
		
		
		//INT
		int x = 2147483647;
		//2147483647 es el valor mas grande positivo que se puede 
		//almacenar en una variable de tipo int, 32bits, (4 bytes)
		
		System.out.println("1.- x = " + x);
		
		System.out.println("2.- x + 2 = " + (x + 2));
		//Si no pones el parentesis, concatena y no se desborda
		
		System.out.println("2.- x * 2 = " +(x*2));
		
		x = x * 2;
		System.out.println("3.- x = " + x);
		
		
		
		//LONG
		long y = 4294967294L;
		//Si no le pones la L, no te lo guarda como long en memoria, 
		//te lo guarda en un int
		//casting de long a int:
		//int v = (int)134L;
		
		System.out.println("1.- y * 2 = " + y * 2);
		
		y = y * 2;	
		System.out.println("2.- y = " + y);
		
		
		
		//Representacion en hexadecimal
		System.out.println("Hexadecimal: " + 0x11C);
		int numHex = 0x11C;
		System.out.println("Hexadecimal (variable): " + numHex);
		
		
		
		//Representacion en octal
		System.out.println("Octal: " + 025);
		int numOctal = 025;
		System.out.println("Octal (variable): " + numOctal);
		
		
		
		//Representacion cientifica
		System.out.println(74330000.0);
		System.out.println(7.433e6);
		System.out.println(76.433e6);
		
		
		
		//DOUBLE Y FLOAT
		//En java un numero real, por defecto es double
		System.out.println(21843.83F); //Se almacena usando 32 bits (float)
		System.out.println(21843.83); //Se almacena usando 64 bits (double)
		
		
		
		//FLOAT
		//float f = 3.14; 
		// error!! Hay que hacer un casting, porque por defecto es un double 
		float f = (float) 3.14;
		System.out.println("Float cast: " + f);
		
		f = 3.14F;
		System.out.println("Float f: " + f);
		f = 3.14f;
		System.out.println("Float F: " + f);
		
		
		
		//DOUBLE
		double v1 = 300000.0; // notacion normal
		System.out.println("Double v1: " +v1);
		
		double v2 = 3.0e+5; // notacion cientifica
		System.out.println("Double v2: " +v2);
		
		v2 = 3e+9;
		System.out.println("v2: " +v2);
		
		
		
		//STRING - comillas dobles
		String letra ="cs";
		System.out.println("String: " +letra);
		
		
		
		//Caracteres especiales
		char arroba = '\u0040'; //unicode https://unicode-table.com/en/
		//para el char se utilizan comillas simples 
		System.out.println(arroba);
		
		System.out.println((char) ('A' + 1)); // valor de 'A' es 65 en UNICODE -> B (66)
		System.out.println('A' + 1); // 66
		System.out.println("'A'" + 1); // concateno una cadena con un numero
		
		char b = 'b';
		System.out.println(b);
		char a = '\u0041'; // 0041 en hexadecimal es 65
		System.out.println("'A' " + a);
		
		
		
		//Uso de constantes
		final double PI = 3.1415926436;
		//PI = PI + 1;
		//Al ponerle final no puedes volver a asignarle el valor a la variable
		
		float radio = 20.3f;
		System.out.println("Longitud circunferencia = " + 2 * PI * radio);
		
		
		
		//Una forma de formatear numeros:
		//hay que importar:  import java.text.DecimalFormat;
		double z = 25.324178787878787878645454;
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("Decimal format 0.00: " +df.format(z));
		df = new DecimalFormat("000.000");
		System.out.println("Decimal format 000.000: " +df.format(z));
		
		
		
		//Mostrar un valor logico
		System.out.print("Valor logico: "); 
		System.out.println(true); 
		
		System.out.println(false);
		
		boolean valor = !false;
		System.out.println(!valor);
	}

}
