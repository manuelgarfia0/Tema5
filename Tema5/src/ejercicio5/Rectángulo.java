package ejercicio5;

/**
 * @author manuel.garfia
 */
public class Rectángulo extends Polígono {
	/**
	 * Atributo para el ancho del rectángulo
	 */
	private double lado1 = 1;
	/**
	 * Atributo para el largo del rectángulo
	 */
	private double lado2 = 1;

	/**
	 * Constructor del rectángulo
	 */
	public Rectángulo() {
		super(4);
	}

	/**
	 * Constructor del rectángulo
	 * 
	 * @param lado1 ancho del rectángulo
	 * @param lado2 largo del rectángulo
	 */
	public Rectángulo(double lado1, double lado2) {
		super(4);
		if (lado1 > 0) {
			this.lado1 = lado1;
		}
		if (lado2 > 0) {
			this.lado2 = lado2;
		}
	}

	/**
	 * Método get para el ancho del rectángulo
	 * 
	 * @return ancho del rectángulo
	 */
	public double getLado1() {
		return lado1;
	}

	/**
	 * Método set para el ancho del rectángulo
	 * 
	 * @param lado1
	 */
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	/**
	 * Método get para el largo del rectángulo
	 * 
	 * @return largo del rectángulo
	 */
	public double getLado2() {
		return lado2;
	}

	/**
	 * Método set para el largo del rectángulo
	 * 
	 * @param lado2
	 */
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	/**
	 * Método para el área del rectángulo
	 */
	@Override
	public double área() {
		return this.lado1 * this.lado2;
	}

	/**
	 * Método toString
	 */
	@Override
	public String toString() {
		return "Rectángulo: Lado 1 = " + lado1 + ", Lado 2 = " + lado2;
	}

}
