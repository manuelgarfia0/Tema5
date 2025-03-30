package analisis.ejercicio3;

/**
 * Clase que representa una transacción en una cuenta corriente.
 */
public class Transaccion {
	private int dia;
	private int mes;
	private int año;
	private String concepto;
	private double importe;

	/**
	 * Constructor para la clase Transaccion.
	 *
	 * @param dia      Día de la transacción.
	 * @param mes      Mes de la transacción.
	 * @param año      Año de la transacción.
	 * @param concepto Concepto de la transacción.
	 * @param importe  Importe de la transacción.
	 */
	public Transaccion(int dia, int mes, int año, String concepto, double importe) {
		this.dia = dia;
		this.mes = mes;
		this.año = año;
		this.concepto = concepto;
		this.importe = importe;
	}

	/**
	 * Obtiene el día de la transacción.
	 *
	 * @return Día de la transacción.
	 */
	public int getDia() {
		return dia;
	}

	/**
	 * Establece un nuevo día para la transacción.
	 *
	 * @param dia Nuevo día de la transacción.
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}

	/**
	 * Obtiene el mes de la transacción.
	 *
	 * @return Mes de la transacción.
	 */
	public int getMes() {
		return mes;
	}

	/**
	 * Establece un nuevo mes para la transacción.
	 *
	 * @param mes Nuevo mes de la transacción.
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}

	/**
	 * Obtiene el año de la transacción.
	 *
	 * @return Año de la transacción.
	 */
	public int getAño() {
		return año;
	}

	/**
	 * Establece un nuevo año para la transacción.
	 *
	 * @param año Nuevo año de la transacción.
	 */
	public void setAño(int año) {
		this.año = año;
	}

	/**
	 * Obtiene el concepto de la transacción.
	 *
	 * @return Concepto de la transacción.
	 */
	public String getConcepto() {
		return concepto;
	}

	/**
	 * Establece un nuevo concepto para la transacción.
	 *
	 * @param concepto Nuevo concepto de la transacción.
	 */
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	/**
	 * Obtiene el importe de la transacción.
	 *
	 * @return Importe de la transacción.
	 */
	public double getImporte() {
		return importe;
	}

	/**
	 * Establece un nuevo importe para la transacción.
	 *
	 * @param importe Nuevo importe de la transacción.
	 */
	public void setImporte(double importe) {
		this.importe = importe;
	}
}
