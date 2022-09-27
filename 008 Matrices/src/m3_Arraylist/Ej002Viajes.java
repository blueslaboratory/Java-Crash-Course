package m3_Arraylist;
import java.util.ArrayList;

public class Ej002Viajes {
	private ArrayList<Ej002Viaje> viajes;
	
	
	//OTROS METODOS
	public void add(Ej002Viaje v) {
		viajes.add(v);
	}
	public void print() {
		System.out.println(viajes);
	}
	
	
	//CONSTRUCTOR
	public Ej002Viajes() {
		viajes = new ArrayList<Ej002Viaje>();
	}
	
	//GETTERS
	public ArrayList<Ej002Viaje> getViajes() {
		return viajes;
	}
}