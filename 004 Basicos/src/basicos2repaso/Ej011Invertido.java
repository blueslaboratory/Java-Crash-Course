//11. Haz un programa que lea un numero entero y genere y escriba 
//el numero resultante de invertir sus cifras.

//SOLUCION DE INTERNET

package basicos2repaso;

import java.util.Scanner;


public class Ej011Invertido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int numero, i, digitos;
        String invertido;
        
        i = 0;
        digitos = 0;
        invertido = "";
        
        System.out.print("Introduzca el numero: ");
        numero = Integer.parseInt(sc.nextLine());
        digitos = numero;
        //Utilizo un bucle que va dividiendo por 10 y cogiendo el resto de la division
        //entre 10 para componer el numero invertido
        
        //PARA ENTEROS POSITIVOS
        if (digitos>=1) {
        	while (digitos>=1) {
                invertido = invertido + digitos%10;  //digitos%10 es el resto
                digitos = digitos/10;	//vuelvo a dividir
            }
        }
        
        //PARA ENTEROS NEGATIVOS
        else if (digitos<=-1) {
        	while (digitos<=-1) {
        		invertido = invertido + Math.abs(digitos%10);  //digitos%10 es el resto
        		digitos = digitos/10;	//vuelvo a dividir
        	}	
        }
        
        else 
        	invertido = "0";
        
        System.out.println("El numero invertido es: "+invertido);
        
		
		sc.close();
	}

}

