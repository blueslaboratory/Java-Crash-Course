package ejemplos026_excepciones;

public class NExcepcion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//otra forma			
			//Exception miEx = new Exception("Mi nueva excepcion");
			//throw miEx;
			
			throw new Exception("Mi nueva excepcion");
		}
		catch(Exception e) {
			
			System.out.println("Dentro de catch");
			System.out.println("e.getMessage(): " +e.getMessage());
			System.out.println("e.toString(): " +e.toString());
			
			System.out.println("e.printStackTrace(): ");
			e.printStackTrace();
		}
	}

}
