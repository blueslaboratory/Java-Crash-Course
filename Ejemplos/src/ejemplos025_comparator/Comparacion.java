package ejemplos025_comparator;

public class Comparacion{
	
	public static void main(String[] args){
		//Integer num = new Integer(6);
		Integer num = 6;
		String cadena = "adios";
		//int resul = num.compareTo(new Integer(10));
		int resul = num.compareTo(10);
		
		
		if (resul == 0)
			System.out.println("Son iguales");
		else if (resul > 0)
			System.out.println("num es mayor");
		else
			System.out.println("num es menor");
		
		System.out.println(resul);
		
		
		resul = cadena.compareTo("Hola");		
		
		if (resul == 0)
			System.out.println("Son iguales");
		else if (resul > 0)
			System.out.println(cadena + " es mayor");
		else
			System.out.println(cadena + " es menor");
		
		System.out.println("Intervalo de alfabeto entre letras " +resul);	
		
	}
}
