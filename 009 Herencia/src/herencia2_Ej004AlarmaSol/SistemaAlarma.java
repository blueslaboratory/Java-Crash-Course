package herencia2_Ej004AlarmaSol;
/*Crear una clase denominada Alarma cuyos objetos activen un objeto de tipo
 * Timbre cuando el valor medido por un sensor supere un umbral preestablecido:
 Implemente en Java todo el código necesario para el funcionamiento de la 
 alarma, suponiendo que la alarma comprueba si debe activar o desactivar el
  timbre cuando se invoca el método comprobar().

Crear una subclase de Alarma denominada Alarma_Luminosa, que además de activar
 el timbre, encienda una luz (que representaremos con un objeto de tipo Bombilla). 
Aseguraos de que cuando se activa la alarma luminosa se enciende la luz de 
alarma y también suena la señal sonora asociada al timbre.*/
public class SistemaAlarma{
	
	public static void main(String[] args){
		System.out.println("\nCreamos una alarma\n");
		
		// Ponemos el umbral a 30		
		Alarma al = new Alarma(30);
		// El sensor detecta 50
		Sensor sns = new Sensor(50);
		
		sns.mostrarValorSensor();
		
		al.comprobar(sns);		
		// Esperamos 5 sg
		try {
			Thread.sleep (10000);
		}
		catch (Exception e) {
			// Mensaje en caso de que falle
		}
		sns.modValorActual(20);
		sns.mostrarValorSensor();
		al.comprobar(sns);
		// Esperamos 5 sg
		try {
				Thread.sleep (5000);
			}
		catch (Exception e) {
					// Mensaje en caso de que falle
		}
		al.cambiaUmbral(15);
		al.comprobar(sns);
		
		System.out.println("\nCreamos una alarma luminosa\n");
		
		AlarmaLuminosa alLum = new AlarmaLuminosa(25);
		// Trabaja con el mismo sensor;
		while (true) {
			alLum.comprobar(sns);
			sns.modValorActual((int)(Math.random()*50+10));
			sns.mostrarValorSensor();
			try {
				Thread.sleep (5000);
			}
			catch (Exception e) {
				// Mensaje en caso de que falle
			}
			
		}
		
	}
}