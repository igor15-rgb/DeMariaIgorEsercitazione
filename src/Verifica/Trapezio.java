package Verifica;

/**
 * <u>Classe Trapezio</u> <b>igor</b>
 */
public class Trapezio {
	private float area;

	/**
	 * Costruttore
	 */
	public Trapezio() {
	};

	/**
	 * 
	 * @param B base maggiore
	 * @param b base minore
	 * @param h altezza
	 * @return area della figura
	 */
	public float CalcArea(float B, float b, float h) {
		// FORMULA ERRATA: area = B + b * h / 2;
		area = (B + b) * h / 2;
		return area;
	}

	/**
	 * 
	 * @param args main
	 */
	public static void main(String[] args) {
		Trapezio t = new Trapezio();
		System.out.println("area:" + t.CalcArea(3, 2, 1));

	}

}
