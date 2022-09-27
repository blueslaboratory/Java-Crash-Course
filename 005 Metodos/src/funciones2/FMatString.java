package funciones2;

import java.util.Scanner;



public class FMatString {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println(voltea("12345678"));
		System.out.println(esCapicua("12345678"));
		System.out.println(digitos("12345678"));
		System.out.println(digitoN(sc, "123456789", 6));		
		System.out.println(posicionDeDigito(sc, "12345678", 4));
		System.out.println(quitaPorDetras(sc, "12345678", 4));
		System.out.println(quitaPorDelante(sc, "12345678", 4));
		System.out.println(pegaPorDetras(sc, "12345678", "4"));
		System.out.println(pegaPorDelante(sc, "12345678", "4"));
		System.out.println(trozoDeNumero("12345678", 4, 8));
	}
	
	//CTRL + Space + "method" = create method
	//Al no poner public se asume que es eso por defecto
	//Como es una biblioteca mejor un estatico
	
	public static String leer(Scanner teclado) {
		return teclado.nextLine();
	}
	
	public static long toLong (String nS) {
		return Long.parseLong(nS);
	}
	
	//MENU
	public static int menu(Scanner teclado) {
		int opcion;
		
		System.out.println("1.- voltea");
		System.out.println("2.- esCapicua");
		System.out.println("3.- digitos");
		System.out.println("4.- digitoN");
		System.out.println("5.- posicionDeDigito");
		System.out.println("6.- quitaPorDetras");
		System.out.println("7.- quitaPorDelante");
		System.out.println("8.- pegaPorDetras");
		System.out.println("9.- pegaPorDelante");
		System.out.println("10.- trozoDeNumero");
		
		return opcion = teclado.nextInt();
	}
	
	//1
	public static long voltea(String nS) {
		long num = Long.parseLong(nS);
		String volteado = "";
		
		while (num>=1) {
			volteado += num%10;
			num = num/10;
		}
		
		return toLong(volteado);
	}
	
	//2
	public static boolean esCapicua(String nS) {
		boolean capicua = false;
		
		if (toLong(nS) == voltea(nS)) 
			capicua = true;
		
		return capicua;
	}
	
	//3
	public static long digitos(String nS) {
		return nS.length();
	}
	
	//4
	public static long digitoN(Scanner teclado, String nS, int n) {
		//System.out.print("Digito en la posicion n. Primera posicion 0. \nPara n = ");
		//int n = Integer.parseInt(teclado.nextLine());
		
		String p = nS.substring(n, n+1);
		
		return toLong(p);
	}
	
	//5
	public static long posicionDeDigito(Scanner teclado, String nS, int d) {
		//System.out.print("Introduce el digito que quieres encontrar: ");
		//int n = Integer.parseInt(teclado.nextLine());
		long posD = -1;
		
		for(int n=0; n<nS.length(); n++) {
		//for(int n=0; n<=nS.length(); n++) {
			//EL <= ESTARIA MAL PORQUE SE PASA DE LONGITUD
			//if (d.equals(nS.substring(n, n+1)))
			if ((long)d == digitoN(teclado, nS, n)) 
				posD = n;
		}
			
		return posD;
	}
	
	//6
	public static long quitaPorDetras(Scanner teclado, String nS, int quitarN) {
		//System.out.print("Introduce los n digitos que quieres quitarle por la derecha: ");
		//int quitarN = Integer.parseInt(teclado.nextLine());
		String numDelante = "";
		
		
		for (int n=0; n<quitarN; n++)
			//EL <= ESTARIA MAL PORQUE SE PASA DE LONGITUD
			numDelante += nS.substring(n, n+1);
			
		return toLong(numDelante);
	}
	
	//7
	public static long quitaPorDelante(Scanner teclado, String nS, int quitarN) {
		//System.out.print("Introduce los n digitos que quieres quitarle por la izquierda: ");
		//int quitarN = Integer.parseInt(teclado.nextLine());
		String numDetras = "";
		
		
		for (int n=quitarN; n<nS.length(); n++)
			//EL <= ESTARIA MAL PORQUE SE PASA DE LONGITUD
			numDetras += nS.substring(n, n+1);
			
		return toLong(numDetras);
	}
	
	//8
	public static long pegaPorDetras(Scanner teclado, String nS, String num) {
		//System.out.print("Dime el numero que le quieres pegar por detras: ");
		//String num = teclado.nextLine();
		String pegar = nS + num;
		
		return toLong(pegar);
	}
	
	//9
	public static long pegaPorDelante(Scanner teclado, String nS, String num) {
		//System.out.print("Dime el numero que le quieres pegar por delante: ");
		//String num = teclado.nextLine();
		String pegar = num + nS;
		
		return toLong(pegar);
	}
	
	//10
	public static long trozoDeNumero(String nS, int posi, int posf) {
		String trozo = "";
		for (int n=posi; n<posf; n++)
			//EL <= ESTARIA MAL PORQUE SE PASA DE LONGITUD
			trozo += nS.substring(n, n+1);
			
		return toLong(trozo);
	}

}