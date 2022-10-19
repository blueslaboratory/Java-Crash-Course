//6.- Realiza un programa en Java que permita crear cuentas bancarias 
//pidiendo la cantidad inicial al usuario, as� como realizar operaciones 
//de ingresar y sacar dinero de esas cuentas. Si la cantidad de dinero 
//a sacar es superior a la que hay en la cuenta se mostrar� un mensaje 
//advirtiendo que no se puede realizar la operaci�n. El programa ir� 
//contando el n�mero de cuentas creadas y lo mostrar� al final. El 
//programa dispondr� de un m�todo que imprima la cantidad de dinero que 
//queda en la cuenta. Crea un m�todo main que implemente la soluci�n.

package clases1;
import java.util.Scanner;

public class Ej006CuentaMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Ej006Cuenta cuenta1 = new Ej006Cuenta();
		Ej006Cuenta cuenta2 = new Ej006Cuenta();
		
		
		cuenta1.cantidadInicial(sc, 300);
		cuenta1.ingresar(sc, 100);
		cuenta1.retirar(sc, 150);
		
		//toString no hace falta ponerlo porque se hace solo, esa es la magia
		System.out.println(cuenta1);
		
		
		cuenta2.cantidadInicial(sc, 200);
		cuenta2.ingresar(sc, 100);
		cuenta2.retirar(sc, 300);
		
		//.toString no hace falta ponerlo porque se hace solo, esa es la magia
		System.out.println(cuenta2);
		System.out.println(cuenta1);
	}
	
	
	
	
}
