package ejemplos027_matches;

public class Matches2 {

	public static void main(String[] args) {

		String cadena1="Solo se que no se nada";

		// ejemplo1: devolvera false, ya que la cadena tiene mas caracteres
		System.out.println("ejemplo1: "+cadena1.matches("Solo"));

		// ejemplo2: devolvera true, siempre y cuando no cambiemos la cadena Solo
		System.out.println("ejemplo2: "+cadena1.matches("Solo.*"));

		// ejemplo3: devolvera true, siempre que contenga uno de los caracteres entre corchetes
		System.out.println("ejemplo3: "+cadena1.matches(".*[qnd].*"));

		// ejemplo3: devolvera false, ya que ninguno de esos caracteres estan
		System.out.println("ejemplo4: "+cadena1.matches(".*[xyz].*"));

		// ejemplo4: devolvera true, ya que le indicamos que no incluya esos caracteres
		System.out.println("ejemplo4: "+cadena1.matches(".*[^xyz].*"));

		// ejemplo5: devolvera true, si quitamos los caracteres delante de ? del String original seguira devolviendo true
		System.out.println("ejemplo5: "+cadena1.matches("So?lo se qu?e no se na?da"));
		// la o delante de la l, la u delante de la e
		System.out.println("ejemplo5: "+cadena1.matches("Soh?lo se qu?e no se na?da"));
		// la h puede aparecer o no

		// ejemplo6: devolvera false, ya que tenemos una S mayuscula al principio
		System.out.println("ejemplo6: "+cadena1.matches("[a-z].*"));

		// ejemplo7: devolvera true, ya que tenemos una S mayuscula empieza en el String
		System.out.println("ejemplo7: "+cadena1.matches("[A-Z].*"));
		
		// Mezcla de alfanumericos y espacios en blanco: true
		System.out.println("ejemplo8: "+cadena1.matches("[A-Z].[[a-z]+\\s]*"));
		
		cadena1="Solo $ se que no se nada"; //false
		System.out.println("ejemplo8: "+cadena1.matches("[A-Z].[[a-z]+\\s]*"));
		
		String cadena2="abc1234";
		// ejemplo9: devolvera true, ya que minimo debe repetirse alguno de los caracteres al menos una vez
		System.out.println("ejemplo9: "+cadena2.matches("[abc]+.*"));
		
		cadena2="afcb1234"; //true: no tiene por que ser en ese orden
		System.out.println("ejemplo9: "+cadena2.matches("[abc]+.*"));
		
		cadena2="1af1cb1234"; //false: no tiene por que ser en ese orden
		System.out.println("ejemplo9: "+cadena2.matches("[abc]+.*"));
		
		cadena2="abc1234";
		// ejemplo9: devolvera true, ya que, ademas del ejemplo anterior, indicamos que debe repetirse un valor numerico 4 veces
		System.out.println("ejemplo10: "+cadena2.matches("[abc]+\\d{4}"));//4 digitos diferentes

		// ejemplo10: devolvera true, ya que, ademas del ejemplo anterior, indicamos que debe repetirse un valor numerico entre 1 y 10 veces
		System.out.println("ejemplo11: "+cadena2.matches("[abc]+\\d{1,10}")); //hasta 10 digitos

	}
}
