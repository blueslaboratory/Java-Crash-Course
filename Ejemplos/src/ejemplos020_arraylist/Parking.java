package ejemplos020_arraylist;
import java.util.*;

public class Parking {
	private ArrayList <Coche> parking;
	
	public Parking() {
		parking = new ArrayList<Coche>();
	}
	
	public void agregar(Coche x) {
		parking.add(x);
	}
	
	public void escribirParque() {
		System.out.println(parking);
	}
}
