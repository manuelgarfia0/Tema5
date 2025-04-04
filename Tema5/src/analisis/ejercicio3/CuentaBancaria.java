package analisis.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class CuentaBancaria implements Comparable<CuentaBancaria> {
	private int numeroCuenta;
	protected double saldo;
	private List<Titular> titulares;

	/**
	 * Constructor de la clase cuenta bancaria
	 * 
	 * @param numeroCuenta   número de la cuenta bancaria
	 * @param saldoInicial   saldo de la cuenta bancaria
	 * @param titularInicial titular de la cuenta bancaria
	 */
	public CuentaBancaria(int numeroCuenta, double saldoInicial, Titular titularInicial) {
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldoInicial;
		this.titulares = new ArrayList<>();
		this.titulares.add(titularInicial);
	}

	/**
	 * Devuelve el número de cuenta
	 * 
	 * @return número de la cuenta bancaria
	 */
	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	/**
	 * Devuelve el saldo
	 * 
	 * @return saldo de la cuenta bancaria
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Devuelve los titulares
	 * 
	 * @return titulares de la cuenta bancaria
	 */
	public List<Titular> getTitulares() {
		return titulares;
	}

	/**
	 * Método para ingresar dinero
	 * 
	 * @param monto cantidad de dinero a añadir
	 */
	public void ingresarDinero(double monto) {
		if (monto > 0) {
			saldo += monto;
			System.out.println("Se han ingresado " + monto + " €. Saldo actual: " + saldo + " €.");
		} else {
			System.out.println("El monto a ingresar debe ser positivo.");
		}
	}

	/**
	 * Método para retirar dinero
	 * 
	 * @param monto cantidad de dinero a sacar
	 */
	public void retirarDinero(double monto) {
		if (monto > 0) {
			if (monto <= saldo) {
				saldo -= monto;
				System.out.println("Se han retirado " + monto + " €. Saldo actual: " + saldo + " €.");
			} else {
				System.out.println("No hay suficiente saldo para realizar la operación.");
			}
		} else {
			System.out.println("El monto a retirar debe ser positivo.");
		}
	}

	/**
	 * Método para añadir un titular
	 * 
	 * @param titular el nuevo titular
	 */
	public void añadirTitular(Titular titular) {
		if (titulares.size() < 3) {
			titulares.add(titular);
			System.out.println("Titular " + titular.getNombre() + " añadido correctamente.");
		} else {
			System.out.println("La cuenta ya tiene el máximo de tres titulares.");
		}
	}

	/**
	 * Método para eliminar un titular
	 * 
	 * @param dni dni del titular a eliminar
	 */
	public void borrarTitular(String dni) {
		for (Titular titular : titulares) {
			if (titular.getDni().equals(dni)) {
				titulares.remove(titular);
				System.out.println("Titular con DNI " + dni + " eliminado correctamente.");
			} else {
				System.out.println("No se encontró un titular con ese DNI.");
			}
		}
	}

	@Override
	public String toString() {
		return "Número cuenta: " + numeroCuenta + "\n Saldo: " + saldo + "\n Titular: " + titulares + "\n";
	}

	@Override
	public int compareTo(CuentaBancaria o) {
		int res = 0;
		if (this.numeroCuenta > o.numeroCuenta) {
			res = 1;
		}
		if (this.numeroCuenta < o.numeroCuenta) {
			res = -1;
		}
		return res;
	}
}