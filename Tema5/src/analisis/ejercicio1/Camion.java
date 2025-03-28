package analisis.ejercicio1;

public class Camion extends Vehiculo {
	/**
	 * 
	 */
	private double pesoMax = 0;
	/**
	 * 
	 */
	private boolean mercanciaPeligrosa = false;

	/**
	 * Constructor de camion
	 * 
	 * @param marca
	 * @param modelo
	 * @param color
	 * @param matricula
	 * @param pesoMax
	 * @param mercanciaPeligrosa
	 */
	public Camion(String marca, String modelo, String color, String matricula, double pesoMax,
			boolean mercanciaPeligrosa) {
		super(marca, modelo, color, matricula);
		if (pesoMax > 0) {
			this.pesoMax = pesoMax;
		}
		this.mercanciaPeligrosa = mercanciaPeligrosa;
	}

	/**
	 * 
	 * @return
	 */
	public double getPesoMax() {
		return pesoMax;
	}

	/**
	 * 
	 * @param pesoMax
	 */
	public void setPesoMax(int pesoMax) {
		this.pesoMax = pesoMax;
	}

	/**
	 * 
	 * @return
	 */
	public boolean isMercanciaPeligrosa() {
		return mercanciaPeligrosa;
	}

	/**
	 * 
	 * @param mercanciaPeligrosa
	 */
	public void setMercanciaPeligrosa(boolean mercanciaPeligrosa) {
		this.mercanciaPeligrosa = mercanciaPeligrosa;
	}

}
