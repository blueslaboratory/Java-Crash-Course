package almacen;

public class Entrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numerosUnidades = 100;
		Almacen almacenParla = new Almacen (numerosUnidades);
		
		Cliente cliente[] = new Cliente[300]; 
		for(int i=0; i<300; i++ ) {			
			cliente[i] =  new Cliente (i,  almacenParla);
			cliente[i].start();
		}
		
		
	}

}
