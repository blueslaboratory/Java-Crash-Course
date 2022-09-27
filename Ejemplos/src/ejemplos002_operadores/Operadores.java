package ejemplos002_operadores;


public class Operadores {
	public static void main(String[] args) {
		
				
		// ********* Probamos operadores logicos: *********
		System.out.println("Esto devuelve un booleano:");
		System.out.println("4 > 3 " + (4 > 3)); 
		// Muestra true 
		System.out.println("7 <= 2 " + (7 <= 2)); 
		// 7 <= 2 resulta false.
		System.out.println("5 + 2 == 4 + 3 " + (5 + 2 == 4 + 3)); 
		// 5 + 2 == 4 + 3 resulta true. 
		System.out.println("4 * 3 != 12 " + (4 * 3 != 12)); 
		// 4 * 3 != 12 resulta false
		 
		System.out.println("4 > 3 && 5 <= 5 " + (4 > 3 && 5 <= 5));
		// 4 > 3 && 5 <= 5 resulta true, porque las dos expresiones son true. 
		System.out.println("4 > 3 && 5 != 5 " + (4 > 3 && 5 != 5));
		// 4 > 3 && 5 <= 5 resulta false, porque al menos una expresion es false.
		System.out.println("4 > 3 || 5 != 5 " + (4 > 3 || 5 != 5));
		// 4 > 3 || 5 != 5 resulta true, porque al menos una expresion es true. 
		System.out.println("4 > 3 && !(5 != 5) " + (4 > 3 && !(5 != 5))); 
		// 4 > 3 && !(5 != 5) resulta true, porque las dos expresiones son true.
		
		
		
		// ********* Probamos operadores matematicos: *********
		
		
//		+= (le suma a la variable un valor y guarda el resultado en la misma variable). 
//		-= (le resta a la variable un valor y guarda el resultado en la misma variable). 
//		*= (multiplica la variable por un valor y guarda el resultado en la misma variable). 
//		/= (divide la variable por un valor y guarda el resultado en la misma variable). 
//		%= (obtiene el resto de dividir la variable por un valor y guarda el resultado en la misma variable). 
		
		int calculo, num1, num2;
		
		calculo = 5; 
		calculo += 6; 
		//Incrementa en 6 el valor de la variable 
		System.out.println(calculo); //Muestra 11 
		
		calculo *= 2; 
		//Duplica el valor de calculo: 11*2
		System.out.println(calculo); //Muestra 22 
		
		num1 = 3; 
		num2 = 7; 
		num1++; 
		//Suma 1 a num1 
		System.out.println("num1: " +num1); //Muestra 4 
		
		num2--; 
		//resta 1 a num2 
		System.out.println("num2: " +num2); //Muestra 6 
		
		
		int x = 5, y = 5, z; 
		z = x++; 
		/* z vale 5, x vale 6 porque primero se asigna 
		el valor de x a z despues se incrementa x */
		System.out.println("z: " +z);
		System.out.println("x: " +x);
		z = ++y; 
		/* z vale 6, y vale 6 porque primero incrementa 
		la variable y, despues se asigna el valor a z */
		System.out.println("z: " +z);
		System.out.println("y: " +y);
		
		
		
		// ********* Probando el operador resto: *********
		double a = 4.0, b = 3.0, c;
		c = a%b;
		System.out.println("a%b: " +a%b);
		System.out.println("c: " +c);
		
		
//		El resultado de la division tendra decimales o no segun 
//		el tipo de operandos que se utilice. Si al menos uno de 
//		los operandos es de tipo numerico real (float o double) 
//		el resultado sera de ese tipo:
//		
//		7 / 2 resulta 3 
//		7.0 / 2 resulta 3.5
//		
//		Haciendo casting tambien funciona:
//		(double)7 / 2 resulta 3.5 
//		7 / (float)2 resulta 3.5
		
	}
}