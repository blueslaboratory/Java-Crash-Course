package funciones2;

import java.util.Scanner;



public class FMatNum {
	
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
	
	//1 SOLUCION - ELEGANTE
	public static long voltea(long num) {	
		long volteado = 0;
		
		if (num<0)
			return -voltea(-num); //F5: STEP INTO
		
		while(num>0) {
			volteado=(volteado*10) + (num%10);
			num/=10;
		}
		
		return volteado;
	}
	
	
	//1 FUNCIONA
	public static double voltea2(double num) {	
		double volteado = 0;
		double x = num;
		int cont = 0;
		
		if (num<0)
			return -voltea2(-num);
		
		while(x>=1) {
			x/=10;
			cont++;
		}
		
		//cont = (int)digitos((int)num);
		
		while(cont>0) {
			int resto = (int)num%10;
			volteado += (resto)*Math.pow(10, cont);
			num=(int)num/10;
			cont--;
		}
		return volteado;
	}
	
	
	//2
	public static boolean esCapicua(long num) {	
		boolean capicua = false;
		
		if (num == voltea(num)) 
			capicua = true;
		
		return capicua;
	}
	
	//3
	public static long digitos(long num) {
		long digitos = -1;
		
		if (num<0) 
			num=-num;
		
		if (num==0) 
			return 1;
		
		while(num>=1) {
			num/=10;
			digitos++;
		}
		
		return digitos;
	}
	
	//4 - SOLUCION - ELEGANTE
	public static long digitoN(long num, long posicion) {		
		num = voltea(num);
		
		while(posicion-- > 0) {
			num/=10;
		}
		
		return (int)num%10;
		
	}
	
	
	//4 - FUNCIONA
	public static long digitoN2(long num, long posicion) {
		long digitoN;
		long longitud = digitos(num);
		long divisor = (long)Math.pow(10D,(double)(longitud-posicion)); 
		
		num=num/divisor;
		digitoN = (int)num%10; 
		
		return digitoN;
	}
	
	
	//5
	public static long posicionDeDigito(long num, long digito) {
		long resto;
		long cont = -1; //1st position 0
		long digitos = digitos(num);
		
		do {
			resto = num%10;
			num/=10;
			cont++;
			if(num<1 && resto!=digito)
				cont=-1;
		}while(num>1 && resto!=digito);
		
		cont = digitos - cont;
		
		return cont;
	}
	
	//6
	public static long quitaPorDetras(long num, long quitarN) {
		num/=(int)(Math.pow(10, quitarN));
		
		return num;
	}
	
	//7
	public static long quitaPorDelante(long num, long quitarN) {
		//Ahora funciona para (13200,2)
		long diferencia = digitos(num)-digitos(voltea(num));
		
		if (digitos(num) == digitos(voltea(num)))
			return voltea(quitaPorDetras(voltea(num), quitarN));
		else
			return voltea(quitaPorDetras(voltea(num), quitarN))*(long)(Math.pow(10, diferencia));
	}
	
	//8
	public static long pegaPorDetras(long num, long pegar) {
		num = num*(long)Math.pow(10, digitos(pegar)+1) + pegar;
		return num;
	}
	
	//9
	public static long pegaPorDelante(long num, long pegar) {
		double num1 = num*(double)Math.pow(10, -(digitos(pegar)+1));
		num = (long) ((double)(num1+pegar)*(double)Math.pow(10, +(digitos(pegar)+1)));
		return num;
	}
	
	//10
	public static long trozoDeNumero(long num, long posi, long posf) {
				
		return quitaPorDetras(
			   quitaPorDelante(num, posi-1), 
			   digitos(num)-posf+1);

//		long diferencia = digitos(num)-posf;
//		long qpdelante = quitaPorDelante(num, posi);
//		long qpdetras = quitaPorDetras(qpdelante, diferencia);
//		
//		return qpdetras;
	}

}