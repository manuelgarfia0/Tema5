package analisis.ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase principal que gestiona las cuentas bancarias.
 */
public class Principal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<CuentaBancaria> cuentas = new ArrayList<>();
		boolean continuar = true;

		while (continuar) {
			System.out.println("\nMenú de opciones:");
			System.out.println("1. Crear una cuenta de ahorro");
			System.out.println("2. Crear una cuenta corriente");
			System.out.println("3. Listar cuentas existentes");
			System.out.println("4. Mostrar detalles de una cuenta");
			System.out.println("5. Realizar una operación en una cuenta");
			System.out.println("6. Salir");
			System.out.print("Elige una opción: ");
			int opcion = scanner.nextInt();

			if (opcion == 1) {
				System.out.print("Introduce el número de cuenta: ");
				String numAhorro = scanner.next();
				System.out.print("Introduce el saldo inicial: ");
				double saldoAhorro = scanner.nextDouble();
				scanner.nextLine();
				System.out.print("Introduce el DNI del titular principal: ");
				String dniAhorro = scanner.nextLine();
				System.out.print("Introduce el nombre del titular principal: ");
				String nombreAhorro = scanner.nextLine();
				System.out.print("Introduce los apellidos del titular principal: ");
				String apellidosAhorro = scanner.nextLine();
				System.out.print("Introduce el teléfono del titular principal: ");
				String telefonoAhorro = scanner.nextLine();
				System.out.print("Introduce la cuota de mantenimiento: ");
				double cuota = scanner.nextDouble();
				System.out.print("Introduce el interés anual: ");
				double interes = scanner.nextDouble();

				Titular titularAhorro = new Titular(dniAhorro, nombreAhorro, apellidosAhorro, telefonoAhorro);
				CuentaAhorro cuentaAhorro = new CuentaAhorro(numAhorro, saldoAhorro, titularAhorro, cuota, interes);
				cuentas.add(cuentaAhorro);
				System.out.println("Cuenta de ahorro creada correctamente.");
			} else if (opcion == 2) {
				System.out.print("Introduce el número de cuenta: ");
				String numCorriente = scanner.next();
				System.out.print("Introduce el saldo inicial: ");
				double saldoCorriente = scanner.nextDouble();
				scanner.nextLine();
				System.out.print("Introduce el DNI del titular principal: ");
				String dniCorriente = scanner.nextLine();
				System.out.print("Introduce el nombre del titular principal: ");
				String nombreCorriente = scanner.nextLine();
				System.out.print("Introduce los apellidos del titular principal: ");
				String apellidosCorriente = scanner.nextLine();
				System.out.print("Introduce el teléfono del titular principal: ");
				String telefonoCorriente = scanner.nextLine();
				System.out.print("Introduce el porcentaje por transacción: ");
				double porcentaje = scanner.nextDouble();

				Titular titularCorriente = new Titular(dniCorriente, nombreCorriente, apellidosCorriente,
						telefonoCorriente);
				CuentaCorriente cuentaCorriente = new CuentaCorriente(numCorriente, saldoCorriente, titularCorriente,
						porcentaje);
				cuentas.add(cuentaCorriente);
				System.out.println("Cuenta corriente creada correctamente.");
			} else if (opcion == 3) {
				System.out.println("\nCuentas disponibles:");
				for (CuentaBancaria cuenta : cuentas) {
					System.out.println(
							"- Número de cuenta: " + cuenta.getNumeroCuenta() + ", Saldo: " + cuenta.getSaldo());
				}
			} else if (opcion == 4) {
				System.out.print("Introduce el número de cuenta: ");
				String numeroCuenta = scanner.next();
				boolean encontrado = false;

				for (CuentaBancaria cuenta : cuentas) {
					if (cuenta.getNumeroCuenta().equals(numeroCuenta)) {
						encontrado = true;
						System.out.println("\nDetalles de la cuenta:");
						System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
						System.out.println("Saldo: " + cuenta.getSaldo());
						System.out.println("Titulares:");
						for (Titular titular : cuenta.getTitulares()) {
							System.out.println("- " + titular.getNombre() + " " + titular.getApellidos() + " (DNI: "
									+ titular.getDni() + ")");
						}

						if (cuenta instanceof CuentaAhorro) {
							CuentaAhorro ahorro = (CuentaAhorro) cuenta;
							System.out.println("Cuota de mantenimiento: " + ahorro.calcularSaldoConInteres());
							System.out.println("Interés anual: " + ahorro.calcularSaldoConInteres());
						} else if (cuenta instanceof CuentaCorriente) {
							CuentaCorriente corriente = (CuentaCorriente) cuenta;
							System.out.println("Transacciones: " + corriente.getTransacciones());
						}
					}
				}

				if (!encontrado) {
					System.out.println("No se encontró una cuenta con el número proporcionado.");
				}
			} else if (opcion == 5) {
				System.out.println("Funcionalidad pendiente de implementar.");
			} else if (opcion == 6) {
				continuar = false;
				System.out.println("Saliendo...");
			} else {
				System.out.println("Opción no válida. Intenta de nuevo.");
			}
		}

		scanner.close();
	}
}
