package analisis.ejercicio3;

/**
 * Clase que representa una transacción en una cuenta corriente.
 */
public class Transaccion {
	private int dia;
	private int mes;
	private int anio;
	private String concepto;
	private double importe;

	/**
	 * Constructor de la clase transacción
	 * 
	 * @param dia      dia cuando se hizo la transacciom
	 * @param mes      mes cuando se hizo la transacciom
	 * @param anio     año cuando se hizo la transacciom
	 * @param concepto conecpto de la transaccion
	 * @param importe  importe de la transsacion
	 */
	public Transaccion(int dia, int mes, int anio, String concepto, double importe) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
		this.concepto = concepto;
		this.importe = importe;
	}

	/**
	 * Devuelve el dia
	 * 
	 * @return dia cuando se hizo la transacciom
	 */
	public int getDia() {
		return dia;
	}

	/**
	 * Devuelve el mes
	 * 
	 * @return mes cuando se hizo la transacciom
	 */
	public int getMes() {
		return mes;
	}

	/**
	 * Devuelve el año
	 * 
	 * @return año cuando se hizo la transacciom
	 */
	public int getAnio() {
		return anio;
	}

	/**
	 * Devuelve el concepto
	 * 
	 * @return concepto de la transacción
	 */
	public String getConcepto() {
		return concepto;
	}

	/**
	 * Devuelve el importe
	 * 
	 * @return importe de la transacción
	 */
	public double getImporte() {
		return importe;
	}

}