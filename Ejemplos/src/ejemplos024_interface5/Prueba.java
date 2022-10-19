package ejemplos024_interface5;

public class Prueba implements Meses{
	
	public static void main(String args[]){
		for (int i=1; i<=Meses.NUM_MESES; i++)
			System.out.println(Meses.NOMBRES_MESES[i]);
	}
	
	// Como el interfaz Meses no tiene metodos, no hay que 
	// implementarlos en la clase que implementa el interfaz.
}