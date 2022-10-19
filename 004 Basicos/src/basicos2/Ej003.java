//3. En 1980 la ciudad A tenia 3.5 millones de habitantes y 
//una tasa de crecimiento del 7% anual; y la ciudad B tenia 
//5 millones de  habitantes y una tasa de crecimiento del 5% anual. 
//Si el crecimiento poblacional se mantiene constante en las dos 
//ciudades, hacer un programa que calcule e imprima en que año 
//la poblacion de la ciudad A es mayor que la de la ciudad B.


package basicos2;

public class Ej003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double habitantesA, habitantesB;
		int a;
		
		habitantesA = 3.5;
		habitantesB = 5;
		a = 1;
		
		do {
			habitantesA += habitantesA*0.07;
			habitantesB += habitantesB*0.05;
			
			
			if (habitantesA>=habitantesB) {
				System.out.println("Habitantes (millones) ciudad A: " +habitantesA);
				System.out.println("Habitantes (millones) ciudad B: " +habitantesB);
				System.out.println("Anos: " +a);
			}
				
			a++;
			
		}while (habitantesA<habitantesB);
		
	}

}
