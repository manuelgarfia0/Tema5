package analisis.ejercicio1;

public class Turismo extends Vehiculo {
	/**
	 * 
	 */
	private int numPlazas = 0;
	/**
	 * 
	 */
	private boolean tipoUso = false;

	/**
	 * Constructor de turismo
	 * 
	 * @param marca
	 * @param modelo
	 * @param color
	 * @param matricula
	 * @param motor
	 * @param marcha
	 * @param velocidad
	 */
	public Turismo(String marca, String modelo, String color, String matricula, boolean motor, int marcha,
			int velocidad, int numPlazas, boolean tipoUso) {
		super(marca, modelo, color, matricula, motor, marcha, velocidad);
		if (numPlazas > 0) {
			this.numPlazas = numPlazas;
		}
		this.tipoUso = tipoUso;
	}

	/**
	 * 
	 * @return
	 */
	public int getNumPlazas() {
		return numPlazas;
	}

	/**
	 * 
	 * @param numPlazas
	 */
	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}

	/**
	 * 
	 * @return
	 */
	public boolean isTipoUso() {
		return tipoUso;
	}

	/**
	 * 
	 * @param tipoUso
	 */
	public void setTipoUso(boolean tipoUso) {
		this.tipoUso = tipoUso;
	}

}
