package ejemplos008_metodos;

import java.util.Scanner;

public class MetodoTablaMult_J {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);	
		
		//Llamando al metodo tabla de multiplicar
		tabla(leerInt("Numero de la tabla de multiplicar: ", sc));
		//tabla(6);

		sc.close();	
	}
	
	
	//METODO LEER INT
	public static int leerInt(String msg, Scanner teclado) {
		//Pasamos el objeto de tipo Scanner como par�metro
		
		System.out.print(msg);
		
		return Integer.parseInt(teclado.nextLine());
	}
	
	
	//METODO TABLA
	public static void tabla(int operador) {
	
		for(int t=1; t<=10; t++) {
			System.out.println(operador +"*" +t +" = " +multiplicar(t, operador));
		}
		
		return;
	}
	
	//METODO MULTIPLICAR
	public static int multiplicar(int x, int y) {
		return x*y;
	}
	
}
