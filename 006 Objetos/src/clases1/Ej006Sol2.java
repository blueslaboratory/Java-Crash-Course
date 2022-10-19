package clases1;

import java.util.Scanner;

public class Ej006Sol2 {

	public static final int MAX_OPC = 6;
	public static final int MAX_CUEN = 5;

	static int menu(int tope_op, Scanner sc) {
		int opcion_menu;

		System.out.println();
		System.out.println("\t1. Abrir cuenta");
		System.out.println("\t2. Ingresar dinero en cuenta");
		System.out.println("\t3. Sacar dinero de cuenta");
		System.out.println("\t4. Mostrar cuenta");
		System.out.println("\t5. Mostrar todas las cuentas");
		System.out.println("\t6. Salir.");
		do {
			System.out.print("\n\n\tElija opcion:");
			opcion_menu = Integer.parseInt(sc.nextLine());
		} while (opcion_menu < 1 || opcion_menu > tope_op);

		return opcion_menu;
	}

	public static void main(String args[]) {

		int opcion = 0;

		Scanner sc = new Scanner(System.in);
		Ej006SolMain2 banco[] = new Ej006SolMain2[MAX_CUEN];
		Ej006SolMain2 unaCuenta;
		int numCuenta;
		double cantidad;

		while (opcion != MAX_OPC) {
			opcion = menu(MAX_OPC, sc);
			switch (opcion) {
			case 1:
				System.out.println("Introduzca la cantidad para abrir cuenta");
				unaCuenta = new Ej006SolMain2(Double.parseDouble(sc.nextLine()));
				banco[Ej006SolMain2.numCuentasCreadas() - 1] = unaCuenta;
				break;
			case 2:
				System.out.println("Introduzca el numero de cuenta");
				numCuenta = Integer.parseInt(sc.nextLine());
				if (numCuenta <= Ej006SolMain2.numCuentasCreadas()) {
					// Suponemos que las cuentas están consecutivas
					// ya que no las borramos
					System.out.println("Introduzca la cantidad a ingresar");
					cantidad = Double.parseDouble(sc.nextLine());
					banco[numCuenta - 1].ingresar(cantidad);
					System.out.println(banco[numCuenta - 1]);
				} else
					System.out.println("La cuenta no existe.");

				break;
			case 3:
				System.out.println("Introduzca el numero de cuenta");
				numCuenta = Integer.parseInt(sc.nextLine());
				if (numCuenta <= Ej006SolMain2.numCuentasCreadas()) {
					// Suponemos que las cuentas están consecutivas
					// ya que no las borramos
					System.out.println("Introduzca la cantidad a sacar");
					cantidad = Double.parseDouble(sc.nextLine());
					if (banco[numCuenta - 1].sacar(cantidad) >= 0)
						System.out.println(banco[numCuenta - 1]);
					else
						System.out.println("No hay suficiente saldo");

				} else
					System.out.println("La cuenta no existe.");

				break;
			case 4:
				System.out.println("Introduzca el numero de cuenta");
				numCuenta = Integer.parseInt(sc.nextLine());
				if (numCuenta <= Ej006SolMain2.numCuentasCreadas()) {
					// Suponemos que las cuentas están consecutivas
					// ya que no las borramos
					System.out.println(banco[numCuenta - 1]);
				} else
					System.out.println("La cuenta no existe.");
				break;
			case 5:
				for (int i = 0; i < Ej006SolMain2.numCuentasCreadas(); i++)
					System.out.println(banco[i]);

				break;
			}
		}
		sc.close();
	}

}
