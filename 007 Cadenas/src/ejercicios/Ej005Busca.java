//5.- Crea una función en Java que reciba dos  cadenas, 
//la primera cadena será en la que se buscará y la segunda 
//será la cadena buscada. La función devolverá cuántas veces 
//aparece la segunda cadena en la primera.


package ejercicios;
import java.util.Scanner;

public class Ej005Busca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cad1, buscar;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la primera cadena: ");
		cad1 = sc.nextLine();
		
		System.out.println("Introduce la cadena a buscar: ");
		buscar = sc.nextLine();
		
		System.out.println(buscar +" aparece " +buscaCadena(cad1, buscar) +" veces en " +cad1);
		
		sc.close();
	}
	
	public static int buscaCadena(String cad1, String buscar) {
		int cont = 0;
		int pos = 0; 
		
		//cad1.indexOf(buscar, pos);
		//Devuelve la posicion en la cadena pasada por parametro desde donde empezamos a buscar (pos)
        //System.out.println("Posición de la primera ocurrencia de " +buscar +": " +pos); 
        //localiza la posicion donde se encuentra buscar
        //melon melonero melonito melonazo
        
		if(cad1.indexOf(buscar, pos) == -1) {
			//si no la encuentra, "u", sale -1
		}
		
		else {		
			for(pos = cad1.indexOf(buscar, pos); 
	        	pos <= cad1.lastIndexOf(buscar); 
	        	pos = cad1.indexOf(buscar, pos)+buscar.length()) {
	        	
	        	int pos1 = cad1.indexOf(buscar, pos);
	        	int pos2 = cad1.indexOf(buscar, pos)+buscar.length();
	        	
	        	if (cad1.substring(pos1, pos2).equals(buscar)) {
	        		System.out.println(buscar +" " +cont +" posicion " +": " +pos1 +"-" +pos2);
	        		cont++;
	        	}
			}
		}
		
		
        
        
		return cont;
	}

}
