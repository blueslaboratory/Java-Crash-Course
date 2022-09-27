package basicos4;

import java.util.Scanner;

public class Ej007CollatzSol {
  public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	int cont=1;
	long n;
	
	n = pedirNumero("\nIntroducir numero\n", 1L, (long)Math.pow(2, 58), teclado);
	
	System.out.print(n+" ");
	escribirSecCollatz(n);
	
	/* SEGUNDA PARTE DEL EJERCICIO*/
	n = pedirNumero("\n\nIntroducir numero\n", 1L, (long)Math.pow(2, 58), teclado);
	
	teclado.close();
	
	for(int i=1;i<=n;i++){	   
	   cont = contarElSecCollatz(i);
	   
	   System.out.print(i+":");
	   
	   for(int j=1;j<=cont;j++)
		   System.out.print("*"); 
	   System.out.println();
	}	
  }
  
  public static long generarTerCollatz(long termino) {
	  if(termino%2==0)
		return termino/2;
	  else
		return 3*termino+1;
  }
  
  public static void escribirSecCollatz(long n) {	  
	  while(n!=1){
		  n = generarTerCollatz(n);
		  System.out.print(n+" ");
		}
  }
  
  public static int contarElSecCollatz(long n) {
	  int cont=1;
	  
	  while(n!=1){
		  n = generarTerCollatz(n);
		  cont++;
	  }
	  
	  return cont;
  }
  
  public static long pedirNumero(String tex, long limInf, long limSup, Scanner sc) {
	  long n;
	  do{
		  System.out.println(tex);
		  n=sc.nextInt();
		}while(n<limInf || n>limSup);
	  
	  return n;
  }
  
}
