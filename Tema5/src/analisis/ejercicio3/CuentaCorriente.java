package analisis.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class CuentaCorriente extends CuentaBancaria {
	private double porcentajeTransaccion;
	private List<Transaccion> transacciones;

	/**
	 * Constructor de la clase cuenta corriente
	 * 
	 * @param numeroCuenta          numero de la cuenta corriente
	 * @param saldoInicial          saldo de la cuenta corriente
	 * @param titularInicial        titular de la cuenta corriente
	 * @param porcentajeTransaccion porcentaje en cada transacción
	 */
	public CuentaCorriente(int numeroCuenta, double saldoInicial, Titular titularInicial,
			double porcentajeTransaccion) {
		super(numeroCuenta, saldoInicial, titularInicial);
		this.porcentajeTransaccion = porcentajeTransaccion;
		this.transacciones = new ArrayList<>();
	}

	/**
	 * Método para realizar una transacción
	 * 
	 * @param transaccion la informacion de la transacción
	 */
	public void realizarTransaccion(Transaccion transaccion) {
		double cargo = transaccion.getImporte() * (porcentajeTransaccion / 100);
		double total = transaccion.getImporte() + cargo;

		if (saldo >= total) {
			saldo -= total;
			transacciones.add(transaccion);
			System.out.println(
					"Transacción realizada: " + transaccion.getConcepto() + ". Saldo actual: " + saldo + " €.");
		} else {
			System.out.println("No hay suficiente saldo para realizar la transacción.");
		}
	}

	/**
	 * Método para obtener el número de transacciones
	 * 
	 * @return el número total de transacciones
	 */
	public int obtenerNumeroTransacciones() {
		return transacciones.size();
	}
}