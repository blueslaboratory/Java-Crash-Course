//################################################################################
//Realizar un algoritmo que pida numeros (se pedira por teclado la cantidad de 
//numeros a introducir). El programa debe informar de cuantos numeros introducidos 
//son mayores que 0, menores que 0 e iguales a 0.
//################################################################################
//Analisis
//Se pide la cantidad de numeros que se van a leer. Vamos introduciendo numeros.
//Tenemos que contar los positivos, negativos y 0.
// Datos de entrada:Cantidad de numeros, los numeros.
// Informacion de salida: Cantidad de positivos, de negativos y de 0.
// Variables:cantidad_num,num,cont_positivos,cant_negativos,cantidad_ceros(entero)
//################################################################################
//Diseño
//1.- Inicializo los contadores
//2.- Leer cantidad de numeros
//3.- Desde 1 hasta cantidad de numeros
//4.- Leer num
//5.- Si num> 0-> incremento cont_positivos
//6.- Si num< 0-> incremento cont_negativos
//7.- Si num = 0-> incremento cont_ceros.
// Muestro cont_postivos, cont_negativos, cont_ceros
//################################################################################

//SE PUEDE HACER CON MIENTRAS Y CON REPETIR, PEPO ES MAS SENCILLO CON PARA


package repaso;

import java.util.Scanner;


public class Ej004Contador_J {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		int cantidad_num, i;
		int cont_negativos, cont_positivos, cont_ceros;
		Scanner sc = new Scanner(System.in);
		
		
		
		
		//FOR
		cont_negativos = 0;
		cont_positivos = 0;
		cont_ceros = 0;
		
		System.out.print("Numero de numeros que vas a introducir: ");
		cantidad_num = sc.nextInt();
		
		for (i=1; i<=cantidad_num; i++) {
			System.out.print("Numero " +i +": ");
			num = sc.nextInt();
			
			if (num>0)
				cont_positivos = cont_positivos + 1;
			if (num<0) //else if
				cont_negativos = cont_negativos + 1;
			if (num==0) //else
				cont_ceros = cont_ceros + 1;
		}
		
		System.out.println("Numeros positivos: " +cont_positivos);
		System.out.println("Numeros negativos: " +cont_negativos);
		System.out.println("Numeros igual a 0: " +cont_ceros);
		
		sc.close();
	}

}
