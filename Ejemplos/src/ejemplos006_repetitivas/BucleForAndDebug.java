//DEBUG (DEPURADOR (PASO A PASO)):
//para hacer un debug tienes que hacer doble click en la linea 
//donde quieres senalar el pto de ruptura:		for (int c=0; 
//haces click en el bichito debug y cambias la perspectiva
//F6 es un step over: siguiente paso


package ejemplos006_repetitivas;


public class BucleForAndDebug {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;

		for (int c=0; 
				 c<5; 
				 c++) 
			System.out.println (c); 
		//se puede declarar dentro del for
		//pero para usarla otra vez tendrias que volver a declararla
		
		
		
		
		//Escribir en pantalla del 1 al 10.
		for (i=1; i<=10; i++)
			//este no coge por defecto i++
			System.out.print(i +" ");
		
		System.out.println(" ");
		
//		1. Se inicializa la i. 
//		En el ejemplo i toma el valor 1. 
//
//		2. Se comprueba si cumple la condicion, 
//		si se cumple entra en el bucle pero si no la cumple no entraria. 
//		En el ejemplo si la cumple pues 1<10. 
//
//		3. Se ejecuta el bloque de sentencias que pertenezcan al for. 
//
//		4. Vuelve al principio del bucle, se ejecuta i++ incrementando i. 
//		En el ejemplo se incrementa en 1. 
//
//		5. Se repite el proceso desde el paso 2, 
//		hasta que deje de cumplirse la condicion.
//		En el ejemplo, se repetira hasta que i tome el valor de 11,
//		pues no se cumple que 11<=10 
		
		
		
		
		//Escribir en pantalla del 10 al 1.
		for (i=10; i>=1; i--)
			System.out.print(i +" ");
		
		System.out.println(" ");
		
		
		
		//Escribir los numero pares desde el 2 al 10.
		for (i=2; i<=10;) {
			System.out.print(i +" ");
			i = i+2;
		}
		
		System.out.println(" ");
			
	}

}
