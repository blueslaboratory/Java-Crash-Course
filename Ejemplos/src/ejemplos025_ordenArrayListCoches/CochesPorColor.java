package ejemplos025_ordenArrayListCoches;

import java.util.Comparator;

public class CochesPorColor implements Comparator<Coche>{

	@Override
	public int compare(Coche o1, Coche o2) {
		if(o1.devColor().compareTo(o2.devColor())<0)
			return -1;
		else if(o1.devColor().compareTo(o2.devColor())>0)
			return 1;
		else
			return 0;
	}

}
