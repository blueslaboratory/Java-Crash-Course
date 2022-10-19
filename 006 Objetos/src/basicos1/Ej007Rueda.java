//Ejercicio 7.-
//Diseñar una clase Rueda que permita representar una rueda de un vehículo. 
//Sus atributos de clase serán: tipo (String), grosor (double), diametro (double), 
//marca (String). Define un constructor asignando unos valores de defecto a los 
//atributos y los métodos para poder establecer y obtener los valores de los atributos. 
//Crea un método denominado comprobarDimensiones donde a través de condicionales 
//if realices las siguientes comprobaciones:

//a) Si el diámetro es superior a 1.4 debe mostrarse por consola el mensaje 
//"La rueda es para un vehículo grande". Si es menor o igual a 1.4 pero mayor 
//que 0.8 debe mostrarse por consola el mensaje "La rueda es para un vehículo "
//+ "mediano". Si no se cumplen ninguna de las condiciones anteriores 
//debe mostrarse por pantalla el mensaje "La rueda es para un vehículo pequeño".

//b) Si el diámetro es superior a 1.4 con un grosor inferior a 0.4, ó si el diámetro 
//es menor o igual a 1.4 pero mayor que 0.8, con un grosor inferior a 0.25, deberá 
//mostrarse por consola el mensaje "El grosor para esta rueda es inferior al recomendado".


package basicos1;

public class Ej007Rueda {
	String tipo, marca;
	double grosor, diametro;
	
	
	//COMPROBAR DIMENSIONES 
	//(no necesitas ponerle parametros porque se hace sobre el objeto tipo rueda)
	public void comprobarDimensiones() {
		if(diametro>1.4) {
			System.out.println("La rueda es para un vehiculo grande");
			if (grosor<0.4)
				System.out.println("El grosor es inferior al recomendado");
		}
			
		
		else if(diametro<=1.4 && diametro>0.8) {
			System.out.println("La rueda es para un vehiculo mediano");
			if (grosor<0.25)
				System.out.println("El grosor es inferior al recomendado");
		}
		else
			System.out.println("La rueda es para un vehiculo pequeno");
			
//		//TODO EN UNA LINEA
//		if (diametro > 1.4 && grosor < 0.4 || diametro <= 1.4 && diametro > 0.8 && grosor < 0.25) {
//			System.out.println("El grosor para esta rueda es inferior al recomendado");
//		}
	}
	
	public Ej007Rueda() {}
	//me permite tener el constructor en el main por defecto de:
	//Rueda rueda1 = new Rueda();
	
	
	
	//CONSTRUCTOR DE RUEDA
	//ALT + SHIFT + S
	public Ej007Rueda(String marca, String tipo, double grosor, double diametro) {
		this.marca = marca;
		this.tipo = tipo;
		this.grosor = grosor;
		this.diametro = diametro;
	}	
		
	
	
	//SET IT
	//ALT + SHIFT + S
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setGrosor(double grosor) {
		this.grosor = grosor;
	}
	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	
	
	//GET IT
	//ALT + SHIFT + S
	public String getTipo() {
		return tipo;
	}
	public String getMarca() {
		return marca;
	}
	public double getGrosor() {
		return grosor;
	}
	public double getDiametro() {
		return diametro;
	}
	
	
	@Override
	//ALT + SHIFT + S
	public String toString() {
		return "Rueda [tipo=" + tipo 
			 + ", grosor=" + grosor 
		   	 + ", diametro=" + diametro 
			 + ", marca=" + marca + "]";

	}
}

