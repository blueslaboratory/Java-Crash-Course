/* 
 * Estamos viendo como pasarle parametros al main en el array args
 * Le damos a run y despues en la barra de herramientas:
 * Project -> Properties -> Run/Debug settings -> Suma -> edit -> arguments -> 12 23
 * 
 * */

package ejemplos013_parametros;


public class Suma {

	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("El numero de parametros debe ser 2");		
		}
		else {
			System.out.println("La suma de " + args[0] + " y " + args[1] + 
							   " es " +(Integer.parseInt(args[0]) + Integer.parseInt(args[1])));		
		}

	}

}
