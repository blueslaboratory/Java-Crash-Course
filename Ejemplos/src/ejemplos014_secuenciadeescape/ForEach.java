package ejemplos014_secuenciadeescape;

public class ForEach {
	public static void main(String[] args) {
		
		int numeros[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		String ciudades[] = {"Avila", "Burgos", "Leon", "Palencia", 
							 "Salamanca", "Segovia", "Soria", "Valladolid", "Zamora"};
 
		System.out.println("***************");
		System.out.println("For tradicional");
		System.out.println("***************");
		for (int x=0; x<numeros.length; x++)
			System.out.println(numeros[x]);
		
		System.out.println("***************");
		System.out.println("For each");
		System.out.println("***************");
		for (int num: numeros)
			System.out.println(num);
		
		System.out.println("***************");
		System.out.println("For tradicional");
		System.out.println("***************");
		for (int x=0; x<ciudades.length; x++)
			System.out.println(ciudades[x]);
		
		System.out.println("***************");
		System.out.println("For each");
		System.out.println("***************");
		for (String elemento: ciudades)
			System.out.println(elemento);
		
   }
}
