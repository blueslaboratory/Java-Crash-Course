package clases1;

import java.util.Scanner;

public class Ej006SolMain {
	public static void main(String args[]){
		double saldo, retiro, ingreso;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca el saldo con el que quiere abrir la primera cuenta");
		saldo =sc.nextDouble();
		Ej006Sol cuenta1 = new Ej006Sol(saldo);
		
		System.out.println("Introduzca el saldo con el que quiere abrir la segunda cuenta");
		saldo =sc.nextDouble();
		Ej006Sol cuenta2 = new Ej006Sol(saldo);
		
		System.out.println("Introduzca el saldo con el que quiere abrir la tercera cuenta");
		saldo =sc.nextDouble();
		Ej006Sol cuenta3 = new Ej006Sol(saldo);
		
		System.out.println("Introduzca cuanto quiere retirar de la primera cuenta");
		retiro =sc.nextDouble();
		
		double saldoNuevo = cuenta1.sacar(retiro);
		
		if ( saldoNuevo >= 0)
			System.out.println("Le quedan " + saldoNuevo + " en la cuenta");
		else
			System.out.println("No tiene suficiente saldo disponible");
		
		System.out.println("Introduzca cuanto quiere ingresar en la segunda cuenta");
		ingreso =sc.nextDouble();
		cuenta2.ingresar(ingreso);
		System.out.println("Ahora tiene un total de " + cuenta2.getSaldo() + " euros en la cuenta");
		
		sc.close();
		
		System.out.println("El saldo de la cuenta " + cuenta1.getnumCuenta() + " es " + cuenta1.getSaldo());
		System.out.println("El saldo de la cuenta " + cuenta2.getnumCuenta() + " es " + cuenta2.getSaldo());
		System.out.println("El saldo de la cuenta " + cuenta3.getnumCuenta() + " es " + cuenta3.getSaldo());

		System.out.println(cuenta1);
		System.out.println(cuenta2);
		System.out.println(cuenta3);
	}
}
