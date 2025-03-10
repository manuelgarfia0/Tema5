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

	boolean setSegundo() {
		boolean res = false;
		if (this.segundo >= 0 && this.segundo <= 59) {
			res = true;
		}
		return res;
	}

	void inc() {
		super.inc();
		this.segundo++;
		if (this.segundo == 60) {
			this.segundo = 0;
		}
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}

	public String toString() {
		return super.toString() + ":" + this.segundo;
	}

}
