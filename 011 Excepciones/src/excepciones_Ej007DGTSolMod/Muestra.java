/*
7.- Definir los atributos de las clases de objetos necesarias para almacenar la 
informacion relativa a unas muestras de alcoholemia recogidas en un analisis preventivo 
de la Direccion General de Trafico, de forma que: 
a)	Para cada conductor interesa tener su nombre, DNI. y una coleccion de referencias a 
las muestras que se le han tomado durante el periodo de estudio. 
b)	Cada muestra tendra los siguientes datos: Dia y hora de la muestra, codigo del puesto 
de control preventivo (dos letras y dos numeros), matricula del vehiculo y la tasa de 
alcohol espirado en aire (entre 0 y 2.5 mg/l). 
Hacer una simulacion del funcionamiento de estas clases usando el siguiente menu:

1. Introducir un nuevo conductor.
2. Introducir una muestra.
3. Mostrar los datos de un conductor.
4. Mostrar las muestras de un conductor.
5. Mostrar los datos de todos los conductores.
6. Salir.
Elige una opcion:
Hacerlo con Arrays y ArrayList.
Al introducir una muestra, se elige de que conductor por su dni.
Los datos del conductor se muestran buscando por dni.


Cambios pedidos:
1.	Mostrar los conductores con su numero de orden para identificar de que conductor 
se quieren introducir muestras.
2.	Hacer el control de formato de codigo y de alcohol con dos nuevas excepciones que 
crearas. (se vuelve a pedir en caso de saltar la excepcion) La fecha y hora de las 
muestras sera obtenida por programa como las actuales, no se piden al usuario ya.

*/

package excepciones_Ej007DGTSolMod;

public class Muestra {
	private String fecha, hora, codigo, matricula;
	private float porcentaje;

	
	//ALT+SHIFT+S
	//CONSTRUCTORES
	public Muestra() {}
	public Muestra(String _fecha, String _time, String _codigo, String _matricula, float _porcentaje) {
		fecha = _fecha;
		hora = _time;
		setCodigo(_codigo);
		matricula = _matricula;
		setPorcentaje(_porcentaje);
	}

	
	//SETTERS
	public void setFecha(String _fecha) {
		fecha = _fecha;
	}
	public void setHora(String _hora) {
		hora = _hora;
	}
	public void setCodigo(String _codigo) {
		
//		if (Character.isLetter(_codigo.charAt(0)) && 
//			Character.isLetter(_codigo.charAt(1)) && 
//			Character.isDigit(_codigo.charAt(2)) && 
//			Character.isDigit(_codigo.charAt(3))) {
		try {
			if (_codigo.matches("[A-Z][A-Z][0-9][0-9]")) {
				codigo = _codigo;
			} 
			else {
				codigo = null;
				throw new ExcepcionCodigo("Valor no valido.");
			}
		} catch (ExcepcionCodigo e) {
			System.out.println(e.toString());
		}
		
	}
	public void setMatricula(String _matricula) {
		matricula = _matricula;
	}
	public void setPorcentaje(float _porcentaje) {
		try {
			if (_porcentaje >= 0 && _porcentaje <= 2.5) {
				porcentaje = _porcentaje;
			} 
			else {
				porcentaje = -1;
				throw new ExcepcionAlcohol("Valor no valido.");
			}
		} catch (ExcepcionAlcohol e) {
			System.out.println(e.toString());
		}
	}

	
	//GETTERS
	public String getDate() {
		return fecha;
	}
	public String getTime() {
		return hora;
	}
	public String getCodigo() {
		return codigo;
	}
	public String getMatricula() {
		return matricula;
	}
	public float getPorcentaje() {
		return porcentaje;
	}
	
	
	//TOSTRING
	@Override
	public String toString() {
		return "La muestra es del dia " + fecha + " a las " + hora 
				+ "\nCodigo del puesto de control: " + codigo
				+ "\nMatricula del vehiculo: " + matricula 
				+ "\nTasa de alcoholemia: " + porcentaje;
	}
}