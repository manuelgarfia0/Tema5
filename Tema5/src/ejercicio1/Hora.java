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
	 * Método para incrementar minutos
	 */
	void inc() {
		this.minutos++;
		if (this.minutos == 60) {
			this.minutos = 0;
			this.hora++;
		}
	}

	boolean setMinutos() {
		boolean res = false;
		if (this.minutos >= 0 && this.minutos <= 59) {
			res = true;
		}
		return res;
	}

	boolean setHora() {
		boolean res = false;
		if (this.hora >= 0 && this.hora <= 23) {
			res = true;
		}
		return res;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public String toString() {
		return this.hora + ":" + this.minutos;
	}

}
