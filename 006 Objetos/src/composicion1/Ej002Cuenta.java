//6.- Realiza un programa en Java que permita crear cuentas bancarias 
//pidiendo la cantidad inicial al usuario, así como realizar operaciones 
//de ingresar y sacar dinero de esas cuentas. Si la cantidad de dinero 
//a sacar es superior a la que hay en la cuenta se mostrará un mensaje 
//advirtiendo que no se puede realizar la operación. El programa irá 
//contando el número de cuentas creadas y lo mostrará al final. El 
//programa dispondrá de un método que imprima la cantidad de dinero que 
//queda en la cuenta. Crea un método main que implemente la solución.

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
