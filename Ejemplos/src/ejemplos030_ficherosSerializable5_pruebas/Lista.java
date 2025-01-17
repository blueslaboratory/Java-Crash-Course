package ejemplos030_ficherosSerializable5_pruebas;
public class Lista implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int[] x; // array de datos
	private int n; // dimension

	public Lista(int[] x) {
		this.x = x;
		n = x.length;
		ordenar();
	}

	public double valorMedio() {
		int suma = 0;
		for (int i=0; i<n; i++) {
			suma += x[i];
		}
		return (double) suma / n;
	}

	public int valorMayor() {
		return x[n - 1];
	}

	public int valorMenor() {
		return x[0];
	}

	private void ordenar() {
		int aux;
		for (int i=0; i<n-1; i++) {
			for (int j=i+1; j<n; j++) {
				if (x[i] > x[j]) {
					aux = x[j];
					x[j] = x[i];
					x[i] = aux;
				}
			}
		}
	}

	public String toString() {
		String texto = "";
		for (int i = 0; i < n; i++) {
			texto += x[i] + "\t";
		}
		return texto;
	}
}
