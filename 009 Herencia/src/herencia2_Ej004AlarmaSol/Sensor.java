package herencia2_Ej004AlarmaSol;
public class Sensor{
	private int valorActual;
	
	public Sensor(int vAct){
		valorActual=vAct;
	}
	void modValorActual(int vAct){
		valorActual=vAct;
	}
	
	void mostrarValorSensor(){
		System.out.println("Valor del sensor es " + valorActual);
	}
	
	int devValorActual(){
		return valorActual;
	}
}