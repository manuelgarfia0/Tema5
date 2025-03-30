package analisis.ejercicio3;

import java.util.ArrayList;

/**
 * Clase abstracta que representa una cuenta bancaria.
 */
public abstract class CuentaBancaria {
	private String numeroCuenta;
	private double saldo;
	private ArrayList<Titular> titulares;

	/**
	 * Constructor para la clase CuentaBancaria.
	 *
	 * @param numeroCuenta Número de la cuenta bancaria.
	 * @param saldo        Saldo inicial de la cuenta.
	 * @param titular      Titular principal de la cuenta.
	 */
	public CuentaBancaria(String numeroCuenta, double saldo, Titular titular) {
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.titulares = new ArrayList<>();
		this.titulares.add(titular);
	}

	/**
	 * Obtiene el número de la cuenta bancaria.
	 *
	 * @return Número de la cuenta.
	 */
	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	/**
	 * Establece un nuevo número para la cuenta bancaria.
	 *
	 * @param numeroCuenta Nuevo número de la cuenta.
	 */
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	/**
	 * Obtiene el saldo actual de la cuenta.
	 *
	 * @return Saldo de la cuenta.
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Establece un nuevo saldo para la cuenta.
	 *
	 * @param saldo Nuevo saldo de la cuenta.
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Obtiene la lista de titulares de la cuenta.
	 *
	 * @return Lista de titulares de la cuenta.
	 */
	public ArrayList<Titular> getTitulares() {
		return titulares;
	}

	/**
	 * Añade un nuevo titular a la cuenta (máximo 3).
	 *
	 * @param titular Nuevo titular de la cuenta.
	 * @return true si se pudo añadir, false si ya hay tres titulares.
	 */
	public boolean añadirTitular(Titular titular) {
		if (titulares.size() < 3) {
			titulares.add(titular);
			return true;
		}
		return false;
	}

	/**
	 * Borra un titular de la cuenta según su DNI.
	 *
	 * @param dni DNI del titular a eliminar.
	 * @return true si se pudo eliminar, false si no se encontró el titular.
	 */
	public boolean borrarTitular(String dni) {
		return titulares.removeIf(titular -> titular.getDni().equals(dni));
	}

	/**
	 * Ingresa dinero en la cuenta.
	 *
	 * @param cantidad Cantidad a ingresar.
	 */
	public void ingresarDinero(double cantidad) {
		if (cantidad > 0) {
			saldo += cantidad;
		}
	}

	/**
	 * Retira dinero de la cuenta.
	 *
	 * @param cantidad Cantidad a retirar.
	 * @return true si se pudo retirar, false si el saldo es insuficiente.
	 */
	public boolean retirarDinero(double cantidad) {
		if (cantidad > 0 && saldo >= cantidad) {
			saldo -= cantidad;
			return true;
		}
		return false;
	}
}
