package ejemplos019_formateo;
import java.util.Formatter;

public class FormatterDemo {
	public static void main( String[] args){
		Formatter fmtr = new Formatter();
		
		String saludo = String.format(
				  "Hola amigos, bienvenidos a %s !", "Madrid");		
		System.out.println(saludo);
		
		saludo = String.format(
				  "Hola %2$s, bienvenidos  %1$s !", 
				  "Madrid", 
				  "chicos");
		System.out.println(saludo);
		
		int numero = 425;
		fmtr.format("%08d", numero);
		System.out.println("El numero formateado " + fmtr);
		
		Object result = fmtr.format("%1$4d - el año %2$4.2f", 1951, Math.PI);
		System.out.println(result);
		
		// Otra forma de hacerlo
		System.out.format("%1$04d - el año %2$4.2f%n", 1951, Math.PI);
		
		// Parecido al printf que ya vimos:
		System.out.printf("%1$04d - el año %2$4.2f%n", 1951, Math.PI);
		System.out.printf("PI es mas o menos %1$4.2f%n", Math.PI);
		System.out.printf("Tu nombre es %1$s y el mio es %2$s%n", "Juan", "Pepi");
		
		fmtr.close();
	}
}