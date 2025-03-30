package analisis.ejercicio3;

/**
 * Clase que representa una cuenta de ahorro. Hereda de CuentaBancaria y añade
 * cuota de mantenimiento e interés anual.
 */
public class CuentaAhorro extends CuentaBancaria {
	private double cuotaMantenimiento;
	private double interesAnual;

	/**
	 * Constructor para la clase CuentaAhorro.
	 *
	 * @param numeroCuenta       Número de la cuenta bancaria.
	 * @param saldo              Saldo inicial de la cuenta.
	 * @param titular            Titular principal de la cuenta.
	 * @param cuotaMantenimiento Cuota de mantenimiento de la cuenta.
	 * @param interesAnual       Interés anual de la cuenta.
	 */
	public CuentaAhorro(String numeroCuenta, double saldo, Titular titular, double cuotaMantenimiento,
			double interesAnual) {
		super(numeroCuenta, saldo, titular);
		this.cuotaMantenimiento = cuotaMantenimiento;
		this.interesAnual = interesAnual;
	}

	/**
	 * Calcula el saldo nuevo después de aplicar el interés anual.
	 *
	 * @return Saldo nuevo después del interés.
	 */
	public double calcularSaldoConInteres() {
		return getSaldo() * (1 + interesAnual / 100);
	}

	/**
	 * Aplica la cuota de mantenimiento a la cuenta.
	 */
	public void aplicarCuotaMantenimiento() {
		setSaldo(getSaldo() - cuotaMantenimiento);
	}
}
