package baile_hogwarts;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String listaparejas[] = {"Harry Potter","Draco Malfoy", "Cedric Digory","Terry Boot"};
		//String listaCasas[] = {"Gryffindor","Slytherin", "Hufflepuff","Ravenclaw"};
		Integer listaCasas[] = {0,1, 2,3};
		Pareja parejas = new Pareja(listaparejas,listaCasas);
		
		
		Bailarin Hermione = new Bailarin("Hermione Granger",1,listaparejas,parejas );
		Bailarin Pansy = new Bailarin("Pansy Parkinson",0,listaparejas,parejas );
		Bailarin Tamsin = new Bailarin("Tamsin Applebee",5,listaparejas,parejas );
		Bailarin Luna = new Bailarin("Luna Lovewood",5,listaparejas,parejas );

		Hermione.start();
		Pansy.start();
		Tamsin.start();
		Luna.start();	
	}
}

