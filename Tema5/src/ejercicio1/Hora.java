package ejercicio1;

/**
 * @author manuel.garfia
 */
public class Hora {

	protected int hora;
	protected int minutos;

	/**
	 * 
	 * @param hora
	 * @param minutos
	 */
	public Hora(int hora, int minutos) {
		this.hora = hora;
		this.minutos = minutos;
	}

	/**
	 * Método que al incrementar el último minuto de la hora se incremente la hora
	 */
	void inc() {
		this.minutos++;
		if (this.minutos == 60) {
			this.minutos = 0;
			this.hora++;
		}
	}

	/**
	 * 
	 * @return res Boolean para verificar si el minuto existe o no
	 */
	boolean setMinutos() {
		boolean res = false;
		if (this.minutos >= 0 && this.minutos <= 59) {
			res = true;
		}
		return res;
	}

	/**
	 * 
	 * @return res Boolean para verificar si la hora existe o no
	 */
	boolean setHora() {
		boolean res = false;
		if (this.hora >= 0 && this.hora <= 23) {
			res = true;
		}
		return res;
	}

	/**
	 * Método getHora
	 * 
	 * @return hora
	 */
	public int getHora() {
		return hora;
	}

	/**
	 * Método setHora
	 * 
	 * @param hora
	 */
	public void setHora(int hora) {
		this.hora = hora;
	}

	/**
	 * Método getMinutos
	 * 
	 * @return minutos
	 */
	public int getMinutos() {
		return minutos;
	}

	/**
	 * Método setMinutos
	 * 
	 * @param minutos
	 */
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	/**
	 * Método toString
	 * 
	 * @return Cadena de texto para todos los objetos hora
	 */
	public String toString() {
		return this.hora + ":" + this.minutos;
	}

}
