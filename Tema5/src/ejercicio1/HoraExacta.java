package ejercicio1;

/**
 * @author manuel.garfia
 */
public class HoraExacta extends Hora {

	protected int segundo;

	/**
	 * 
	 * @param hora
	 * @param minutos
	 * @param segundo
	 */
	public HoraExacta(int hora, int minutos, int segundo) {
		super(hora, minutos);
		this.segundo = segundo;
	}

	/**
	 * 
	 * @return res Boolean que verifica si el segundo existe o no
	 */
	boolean setSegundo() {
		boolean res = false;
		if (this.segundo >= 0 && this.segundo <= 59) {
			res = true;
		}
		return res;
	}

	/**
	 * Método que al incrementar el último segundo de la hora se incremente el
	 * minuto
	 */
	void inc() {
		super.inc();
		this.segundo++;
		if (this.segundo == 60) {
			this.segundo = 0;
		}
	}

	/**
	 * 
	 * @return segundo
	 */
	public int getSegundo() {
		return segundo;
	}

	/**
	 * 
	 * @param segundo
	 */
	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}

	/**
	 * Método toString
	 * 
	 * @return Cadena de texto para todos los objetos hora
	 */
	public String toString() {
		return super.toString() + ":" + this.segundo;
	}

}
