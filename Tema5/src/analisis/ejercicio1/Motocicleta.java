package analisis.ejercicio1;

public class Motocicleta extends Vehiculo {
	/**
	 * 
	 */
	private int cilindrada = 0;

	/**
	 * Constructor
	 * 
	 * @param marca
	 * @param modelo
	 * @param color
	 * @param matricula
	 * @param cilindrada
	 */
	public Motocicleta(String marca, String modelo, String color, String matricula, int cilindrada) {
		super(marca, modelo, color, matricula);
		if (cilindrada > 0) {
			this.cilindrada = cilindrada;
		}
	}

	/**
	 * 
	 * @return
	 */
	public int getCilindrada() {
		return cilindrada;
	}

	/**
	 * 
	 * @param cilindrada
	 */
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	/**
	 * 
	 * @return
	 */
	public boolean requiereCarnet() {
		boolean res = false;
		if (this.cilindrada >= 125) {
			res = true;
		}
		return res;
	}

}
