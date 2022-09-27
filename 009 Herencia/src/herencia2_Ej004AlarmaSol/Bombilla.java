package herencia2_Ej004AlarmaSol;
public class Bombilla {
	boolean encendida = false;
	
	void encender(){
		encendida = true;
		System.out.println("BOMBILLA ENCENDIDA");	
	}
	
	void apagar(){
		encendida = false;
		System.out.println("BOMBILLA APAGADA");		
	}
	
	boolean devEstado(){
		return encendida;
	}
}