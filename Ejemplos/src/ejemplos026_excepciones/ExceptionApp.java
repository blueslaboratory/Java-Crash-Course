package ejemplos026_excepciones;
import java.util.Scanner;

public class ExceptionApp {
	public static void main(String[] args) {
		String str1 ="4";
		String str2 ="e";
		String respuesta = "";
		int numerador, denominador, cociente;
		
		
		try {
			numerador = Integer.parseInt(str1);
			denominador = Integer.parseInt(str2);
			
			cociente = numerador/denominador;
			
			respuesta = String.valueOf(cociente);
			//valueOf obtiene la representacion como String del parametro entero
			/* public static String valueOf(int i) */

			System.out.println("El resultado es " +respuesta);
			//si captura la excepcion no llega aqui
			
		} catch(NumberFormatException ex) {
			//si buscas el metodo parseInt, te sale que hace el throw de NumberFormatException
			//https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Integer.html#parseInt(java.lang.String)
			System.out.println("ex " +ex.getMessage());
			respuesta="Se han introducido caracteres no numericos";
		} catch(ArithmeticException ex) {
			System.out.println("ex " +ex.getMessage());
			respuesta="Division entre 0";
		} catch(Exception ex) {
			System.out.println("ex " +ex.getMessage());
		}
		
		//Sale por el 1er catch que se detecta y ya no entra por los demas
		System.out.println();
		System.out.println(respuesta);
		
		Scanner sc = new Scanner(System.in);
		sc.close();
		
		try {
			//espera la puls de una tecla y luego RETORNO
			System.in.read();
		} catch (Exception e) {
			System.out.println("ex " +e.getMessage());
		} //obligatorio recoger la excepcion
	}
}
