package ejemplos002_operadores;

public class OperadorCondicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int var;
		
		var = 7;
		var = var>4 ? 5:9; 
		// Si var>4, var = 5, si no, var = 9
		System.out.println("var: " +var);
		
		
		String mensaje;
		int num;
		
		num=-3;
		mensaje = (num >= 0) ? "Positivo" : "Negativo";
		
		System.out.println("Mensaje: " + mensaje);
		System.out.println(num +">0? " +((num>=0) ? "Verdad" : "Mentira"));
	}

}
