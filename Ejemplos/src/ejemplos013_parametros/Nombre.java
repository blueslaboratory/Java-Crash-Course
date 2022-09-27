/* 
 * Estamos viendo como pasarle parametros al main en el array args
 * Le damos a run y despues en la barra de herramientas:
 * Project -> Properties -> Run/Debug settings -> Nombre (class Name) -> edit -> arguments -> 12 32
 * 
 * */

package ejemplos013_parametros;


public class Nombre {

	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("El numero de parametros debe ser 2");		
		}
		else {
			System.out.println("Tu nombre es " + args[0] + " y tus apellido son " + args[1]);		
		}

	}

}
