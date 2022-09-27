//################################################################################
//Algoritmo que pida numeros hasta que se introduzca un cero. Debe imprimir la suma
// y la media de todos los numeros introducidos.
//################################################################################
//Analisis
//Vamos pidiendo numeros hasta introducir un 0.
//Necesitamos un acumulador para ir realizando las sumas intermedias.
//Ademas necesitamos un contador, para calcular la media (suma/cantidad)
//Datos de entrada: numeros, un acumulador para sumar y un contador
//Informacion de salida:La suma y la media
//Variables:num, suma, cont (enteros)
//################################################################################
//Diseño
//1.- Incializo: suma = 0, cont = 0
//2.- Leer num
//3.- Mientras num<>0
//4.- Acumulo: suma = suma + num
//5.- Cuento si num<>0: cont=cont+1
//6.- Leer num
//7.- Si cont=0 (No hemos introducido ningun numero)-> media=0
//8.- SiNo -> media=suma/cont;
//9.- Mostrar suma y media
//################################################################################



package ejercicios;

import java.util.Scanner;


public class Ej003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, suma, cont;
		float media;
		Scanner sc = new Scanner(System.in);
		
		
		//CON WHILE
		//Con el mientras si el primer numero es 0 no va a entrar en el bucle
		suma = 0;
		cont = 0;
		
		System.out.print("Numero (0 para salir): ");
		num = sc.nextInt();
		
		while (num!=0) {
			suma = suma + num;
			cont = cont + 1;
			System.out.print("Numero (0 para salir): ");
			num = sc.nextInt();
		}
		
		//si cont = 0 no puedo realizar la division
		if(cont>0)
			media = (float)suma/cont;
		else
			media = 0;
		
		System.out.println("Suma: " +suma);
		System.out.println("Media: " +media);
		
		
		
		//CON DO-WHILE - NO MIRAR
		suma = 0;
		cont = 0;
		
		do {
			System.out.print("Numero (0 para salir): ");
			num = sc.nextInt();
			//Si num=0 no debemos tenerlo en cuenta para calcular la media
			if (num!=0) {
				suma = suma + num;
				cont = cont + 1;
			}
		} while (!(num==0));
		
		if (cont!=0)
			media = (float)suma/cont;
		else
			media = 0;
		
		System.out.println("Suma: " +suma);
		System.out.println("Media: " +media);
		
		
		sc.close();
	}

}
