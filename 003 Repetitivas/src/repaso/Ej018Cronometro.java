//################################################################################
//Hacer un programa que muestre un cronometro, indicando las horas, minutos y segundos.

package repaso;



public class Ej018Cronometro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h, min, seg;
		
		for (h=0; h<24; h++) {
			for (min=0; min<60; min++) {
				for (seg=0; seg<60; seg++) {
					System.out.println(h +":" +min +":" +seg);
					
					
					//Te autogenera el try y el catch si pones Thread.sleep(1000);
					//.sleep es un metodo
					//Thread es una clase
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					//En java no hay forma facil de hacer un clearscreen
					
				}
			}
		}
		
		
		
	}
}

