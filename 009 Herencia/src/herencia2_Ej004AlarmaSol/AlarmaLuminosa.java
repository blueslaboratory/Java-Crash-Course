package herencia2_Ej004AlarmaSol;
public class AlarmaLuminosa extends Alarma{
	Bombilla b;
	
    public AlarmaLuminosa(int umb){
    	super(umb);
    	b = new Bombilla();
    }
    
	public boolean comprobar(Sensor s){
		boolean comp = super.comprobar(s);
		
		if (comp){
			if (!b.devEstado())
				b.encender();
		}
		else{
			if (b.devEstado())
				b.apagar();
		}
				
		return 	comp;	
	}	
}