package ejercicio5;

public class Triángulo extends Polígono {
	/**
	 * Atributo para un lado del triángulo
	 */
	private double lado1 = 1;
	/**
	 * Atributo para un lado del triángulo
	 */
	private double lado2 = 1;
	/**
	 * Atributo para un lado del triángulo
	 */
	private double lado3 = 1;

	/**
	 * Constructor del triángulo
	 */
	public Triángulo() {
		super(3);
	}

	/**
	 * Constructor del triángulo
	 */
	public Triángulo(double lado1, double lado2, double lado3) {
		super(4);
		if (lado1 > 0) {
			this.lado1 = lado1;
		}
		if (lado2 > 0) {
			this.lado2 = lado2;
		}
		if (lado3 > 0) {
			this.lado3 = lado3;
		}
	}

	/**
	 * Método get para un lado del triángulo
	 * 
	 * @return lado 1 del triángulo
	 */
	public double getLado1() {
		return lado1;
	}

	/**
	 * 
	 * Método set para un lado del triángulo
	 * 
	 * @param lado1
	 */
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	/**
	 * Método get para un lado del triángulo
	 * 
	 * @return lado 2 del triángulo
	 */
	public double getLado2() {
		return lado2;
	}

	/**
	 * Método set para un lado del triángulo
	 * 
	 * @param lado2
	 */
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	/**
	 * Método get para un lado del triángulo
	 * 
	 * @return lado 2 del triángulo
	 */
	public double getLado3() {
		return lado3;
	}

	/**
	 * Método set para un lado del triángulo
	 * 
	 * @param lado3
	 */
	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	/**
	 * Método get para un lado del triángulo
	 * 
	 * @return lado 3 del triángulo
	 */
	@Override
	public double área() {
		double s = semiperimetro();
		return Math.sqrt(s * (s - this.lado1) * (s - this.lado2) * (s - this.lado3));
	}

	/**
	 * Función para tener almacenado el semiperimetro del triángulo
	 * 
	 * @return Fórmula de Herón
	 */
	public double semiperimetro() {
		return (this.lado1 + this.lado2 + this.lado3) / 2;
	}

	/**
	 * Método toString
	 */
	@Override
	public String toString() {
		return "Triángulo: Lado 1 = " + lado1 + ", Lado 2 = " + lado2 + ", Lado 3 = " + lado3;
	}

}
