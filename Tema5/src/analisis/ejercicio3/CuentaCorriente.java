package analisis.ejercicio3;

import java.util.ArrayList;

/**
 * Clase que representa una cuenta corriente. Hereda de CuentaBancaria y añade
 * manejo de transacciones.
 */
public class CuentaCorriente extends CuentaBancaria {
	private double porcentajeTransaccion;
	private ArrayList<Transaccion> transacciones;

	/**
	 * Constructor para la clase CuentaCorriente.
	 *
	 * @param numeroCuenta          Número de la cuenta bancaria.
	 * @param saldo                 Saldo inicial de la cuenta.
	 * @param titular               Titular principal de la cuenta.
	 * @param porcentajeTransaccion Porcentaje cobrado por cada transacción.
	 */
	public CuentaCorriente(String numeroCuenta, double saldo, Titular titular, double porcentajeTransaccion) {
		super(numeroCuenta, saldo, titular);
		this.porcentajeTransaccion = porcentajeTransaccion;
		this.transacciones = new ArrayList<>();
	}

	/**
	 * Registra una nueva transacción.
	 *
	 * @param transaccion Transacción a registrar.
	 */
	public void registrarTransaccion(Transaccion transaccion) {
		transacciones.add(transaccion);
		double importeConPorcentaje = transaccion.getImporte()
				+ (transaccion.getImporte() * porcentajeTransaccion / 100);
		setSaldo(getSaldo() - importeConPorcentaje);
	}

	/**
	 * Obtiene la lista de transacciones registradas.
	 *
	 * @return Lista de transacciones.
	 */
	public ArrayList<Transaccion> getTransacciones() {
		return transacciones;
	}
}
