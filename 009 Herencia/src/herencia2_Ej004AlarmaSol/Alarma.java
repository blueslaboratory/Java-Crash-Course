package herencia2_Ej004AlarmaSol;
public class Alarma{
	int umbral;
	Timbre t;
	
	public Alarma(int umb){
		umbral = umb;
		t = new Timbre();
	}
	public void cambiaUmbral(int umb){
		umbral = umb;
	}
	
	/* Si el sensor está por encima del umbral se desactiva la alarma
	 * Si el sensor está por debajo del umbral se activa la alarma */
	public boolean comprobar(Sensor s){
		System.out.println("\nSe llama a comprobar en Alarma\n");
		if (s.devValorActual() >= umbral){
			if (!t.devEstado())
				t.activar();
			return true;  
		}			
		else{
			if (t.devEstado())
			 	t.desActivar();
			return false;
		}					
	}	
}