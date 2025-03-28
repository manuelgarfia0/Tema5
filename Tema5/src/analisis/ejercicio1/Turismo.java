package analisis.ejercicio1;

public class Turismo extends Vehiculo {
	/**
	 * 
	 */
	enum TipoUso {
		PROFESIONAL, PARTICULAR
	}

	/**
	 * 
	 */
	private int numPlazas = 0;
	private TipoUso uso;

	/**
	 * Constructor de turismo
	 * 
	 * @param marca
	 * @param modelo
	 * @param color
	 * @param matricula
	 * @param numPlazas
	 */
	public Turismo(String marca, String modelo, String color, String matricula, int numPlazas, TipoUso uso) {
		super(marca, modelo, color, matricula);
		if (numPlazas > 0) {
			this.numPlazas = numPlazas;
		}
		this.uso = uso;
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

	public TipoUso getUso() {
		return uso;
	}

	public void setUso(TipoUso uso) {

	}

}
