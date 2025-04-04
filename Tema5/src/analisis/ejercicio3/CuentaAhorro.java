package analisis.ejercicio3;

/**
 * Clase que representa una cuenta de ahorro. Hereda de CuentaBancaria y añade
 * cuota de mantenimiento e interés anual.
 */
public class CuentaAhorro extends CuentaBancaria {
	private double interesAnual;
	private double cuotaMantenimiento;

	/**
	 * Construcor de la clase cuenta ahorro
	 * 
	 * @param numeroCuenta       numero de la cuenta ahorro
	 * @param saldoInicial       saldo de la cuenta ahorro
	 * @param titularInicial     titular de la cuenta ahorro
	 * @param interesAnual       interes de la cuenta ahorro
	 * @param cuotaMantenimiento mantenimiento de la cuenta ahorro
	 */
	public CuentaAhorro(int numeroCuenta, double saldoInicial, Titular titularInicial, double interesAnual,
			double cuotaMantenimiento) {
		super(numeroCuenta, saldoInicial, titularInicial);
		this.interesAnual = interesAnual;
		this.cuotaMantenimiento = cuotaMantenimiento;
	}

	/**
	 * Devuelve el interes
	 * 
	 * @return interes de la cuenta ahorro
	 */
	public double getInteresAnual() {
		return interesAnual;
	}

	/**
	 * Modifica el interes
	 * 
	 * @param interesAnual el nuevo interes de la cuenta ahorro
	 */
	public void setInteresAnual(double interesAnual) {
		this.interesAnual = interesAnual;
	}

	/**
	 * Devuelve la cuota de mantenimiento
	 * 
	 * @return la cuota de mantenimiento de la cuenta ahorro
	 */
	public double getCuotaMantenimiento() {
		return cuotaMantenimiento;
	}

	/**
	 * Modifica la cuota de mantenimiento
	 * 
	 * @param cuotaMantenimiento la nueva cuota de la cuenta ahorro
	 */
	public void setCuotaMantenimiento(double cuotaMantenimiento) {
		this.cuotaMantenimiento = cuotaMantenimiento;
	}

	/**
	 * Método para calcular el nuevo saldo
	 */
	public void saldoNuevo() {
		saldo += saldo * (interesAnual / 100);
		System.out.println("Se ha aplicado el interés anual. Saldo actual: " + saldo + " €.");
		if (saldo >= cuotaMantenimiento) {
			saldo -= cuotaMantenimiento;
			System.out.println("Se ha restado la cuota de mantenimiento. Saldo actual: " + saldo + " €.");
		} else {
			System.out.println("No hay suficiente saldo para restar la cuota de mantenimiento.");
		}
	}

	@Override
	public String toString() {
		return super.toString() + "Interes Anual: " + interesAnual + "\n Cuota de mantenimiento: " + cuotaMantenimiento
				+ "\n";
	}
}