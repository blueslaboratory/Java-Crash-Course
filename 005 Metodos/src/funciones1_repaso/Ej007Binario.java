//7.- Crea una aplicaci�n que nos convierta un n�mero en 
//base decimal a binario. Esto lo realizar� un m�todo al 
//que le pasaremos el n�mero como par�metro, devolver� un 
//String con el n�mero convertido a binario. Para convertir 
//un n�mero decimal a binario, debemos dividir entre 2 el 
//n�mero y el resultado de esa divisi�n se divide entre 2 
//de nuevo hasta que no se pueda dividir m�s (la divisi�n da 0), 
//el resto que obtengamos de cada divisi�n formara el n�mero 
//binario, de abajo a arriba.
//Ejemplo: si introducimos un 8 nos deber� devolver 1000 

//Intentos fallidos: 1
//REPASAR

package funciones1_repaso;

import java.util.Scanner;
import javax.swing.JOptionPane;
//Te autocompleta el import al crear el objeto Scanner

public class Ej007Binario {
	
	public static void main(String[] args) {
		//NO ME SALE BIEN
		
		
		int num;
		Scanner sc = new Scanner(System.in);
		
		
		
//		String bin;
//		String texto = JOptionPane.showInputDialog("Introduce un numero");
//		num = Integer.parseInt(texto);
//
//		bin = binarioElegante(num);
//		System.out.println(num +" en binario es " +bin);
//		JOptionPane.showMessageDialog(null, +num +" en binario es " +bin);
//		
//		bin = binario(num);
//		System.out.println(num +" en binario es " +bin);
//		JOptionPane.showMessageDialog(null, +num +" en binario es " +bin);
//		
//		bin = binario2(num);
//		System.out.println(num +" en binario es " +bin);
//		JOptionPane.showMessageDialog(null, +num +" en binario es " +bin);
		
		
		
		
		System.out.print("Dime un numero en formato decimal: ");
		num = Integer.parseInt(sc.nextLine());	
		
		System.out.println("Numero en binario elegante: " +(binarioElegante(num)));
		System.out.println("Numero en binario: " +(binario(num)));
		System.out.println("Numero en binario2: " +(binario2(num)));
		System.out.println("Numero en binario invertido: " +invertir(binario(num)));
		
		sc.close();
	}
	
	public static String binarioElegante(int numDec) {
		
		String bin = "";
		//String bin2 = "";
		int i = numDec;
		
		for(i=numDec; i>0; i/=2) {
			bin=String.valueOf(i%2)+bin;
			//valueOf metodo static del string value of
			//pasa un entero a un string
			
			//bin2=(i%2)+bin2; -> esto no funciona
		}
		
		return bin;
	} 
	
	
	public static String binario2(int numDec) {
		
		String bin = "", digito;
		
		while (numDec>0) {
			if(numDec%2==1)
				digito = "1";
			else
				digito = "0";
			//si te fijas este if es como poner digito=String.valueOf(i%2)
			bin = digito + bin;
			numDec = numDec/2;
		}
		
				
		return bin;
	} 
	
	public static String binario(int numDec) {
		
//		String numBinString2 = "";
		String numBinString = "";
		String bin = "";
		int longitud;
		
		while (numDec>=1) {
//			numBinString2 = numDec%2 + numBinString2;
			
			numBinString += numDec%2;
			numDec = numDec/2;
		}
		
//		System.out.println("  ->numBinString2: " +numBinString2);
		
		longitud = numBinString.length();
		
		for(int x=longitud; x>=1; x--)
			bin += (numBinString).substring(x-1, x);
		
		
		return bin;
	} 
	
	
	
	public static String invertir(String numBinS) {
		
		int numBin = Integer.parseInt(numBinS);
		String invertidoS = "";
	
		while (numBin>=1) {
			invertidoS += numBin%10;
			numBin = numBin/10;
		}
		
		return invertidoS;
	}
	
	
}
