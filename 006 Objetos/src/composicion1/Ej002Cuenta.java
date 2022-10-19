//6.- Realiza un programa en Java que permita crear cuentas bancarias 
//pidiendo la cantidad inicial al usuario, as� como realizar operaciones 
//de ingresar y sacar dinero de esas cuentas. Si la cantidad de dinero 
//a sacar es superior a la que hay en la cuenta se mostrar� un mensaje 
//advirtiendo que no se puede realizar la operaci�n. El programa ir� 
//contando el n�mero de cuentas creadas y lo mostrar� al final. El 
//programa dispondr� de un m�todo que imprima la cantidad de dinero que 
//queda en la cuenta. Crea un m�todo main que implemente la soluci�n.

package composicion1;

import java.util.Scanner;

public class Ej002Cuenta {
	double saldo, ingreso, retiro, multiplicar;
	static int contCuenta = 0;
	int ncuenta = 0;
	Scanner sc = new Scanner(System.in);
	
	//STATIC para contar las cuentas
	public static double cuenta() {
		return contCuenta++;
	}
	
	//ES MEJOR HACERLO SIN PREGUNTAR
	public double cantidadInicial(Scanner sc, double saldo) {
		cuenta();
		ncuenta = contCuenta;
		//System.out.print("Cantidad inicial: ");
		//saldo = Double.parseDouble(sc.nextLine());
		this.saldo = saldo;
		return saldo;
	}
	
	public void ingresar(Scanner sc, double ingreso) {
		System.out.print("Dinero a ingresar: ");
		ingreso = Double.parseDouble(sc.nextLine());
		saldo += ingreso;
	}
	
	public void retirar(Scanner sc, double retiro) {
		System.out.print("Dinero a retirar: ");
		retiro = Double.parseDouble(sc.nextLine());
		
		if (retiro>saldo)
			System.out.println("Cantidad a retirar mayor que el saldo disponible");
		else
			saldo -= retiro; //saldo = saldo - retiro;
	}
	
	
	
	public Ej002Cuenta() {}

	public String toString() {
		return " Saldo : " +saldo;
	}
}
