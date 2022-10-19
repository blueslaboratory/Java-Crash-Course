//4.Para obtener el número del tarot de una persona, 
//hay que sumar los números de su fecha de nacimiento y reducirlo a un solo dígito. 
//Ej: 1 de Julio de 1990 →1+7+1990 = 1998 → 1+9+9+8 = 27 → 2+7=9  
//El número del tarot es el 9. 
//Haz un programa que lea la fecha de nacimiento por teclado y escriba el 
//número del tarot. La fecha estará formada por 3 números enteros, el día, 
//el mes y el año (4 dígitos). 

//Intentos: I
//He copiado y pegado el algoritmo Del 11 de básicos dos

package basicos3repaso;

import java.util.Scanner;

public class Ej004Tarot {
	
	public static void main(String[] args) {
		
		int dia, mes, a, suma;
		int acumResto, tarot;
		Scanner sc = new Scanner(System.in);
		
		acumResto = 0;
		tarot = 0;
		
		System.out.println("Introduce tu fecha de nacimiento (en formato numerico)");
		System.out.print("Dia: ");
		dia = Integer.parseInt(sc.nextLine());
		System.out.print("Mes: ");
		mes = Integer.parseInt(sc.nextLine());
		System.out.print("Ano: ");
		a = Integer.parseInt(sc.nextLine());
		
		suma = dia + mes + a;
		
		while (suma>=1) {
			acumResto += suma%10;  //digitos%10 es el resto
			suma = suma/10;	//vuelvo a dividir
        }
		
		while (acumResto>=1) {
			tarot += acumResto%10;  //digitos%10 es el resto
			acumResto = acumResto/10;	//vuelvo a dividir
        }
		
		System.out.println("Tu numero del tarot es " +tarot);
		
		
		sc.close();
	}
}
