package ejemplos024_interface4;

//todos los metodos de una interfaz son abstractos
public interface Conducible {
	int MAXIMO_GIRO = 90; //constantes de una interfaz: final y static

	void girarIzquierda(int grados); //metodos abstract

	void girarDerecha(int grados);
}