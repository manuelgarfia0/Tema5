package analisis.ejercicio3;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {

		// Creamos el array de Titulares
		Titular titulares[] = new Titular[] { new Titular("12345678A", "Juan", "García", 9999999),
				new Titular("87654321Z", "Pedro", "García", 18318231),
				new Titular("12381381A", "Pepito", "Aguilar", 12312312) };

		// Creamos el array de Cuentas
		CuentaBancaria cuentas[] = new CuentaBancaria[] { new CuentaBancaria(4, 2000, titulares[0]),
				new CuentaBancaria(40, 1000, titulares[1]), new CuentaAhorro(5, 30000, titulares[2], 3, 4) };

		// Los ordenamos por defecto
		Arrays.sort(titulares);
		Arrays.sort(cuentas);

		// Los imprimimos
		System.out.println(Arrays.deepToString(titulares));
		// Salto de línea
		System.out.println();
		System.out.println(Arrays.deepToString(cuentas));

		// Los ordenamos con el especial
		Arrays.sort(titulares, new ComparaApellido());
		Arrays.sort(cuentas, new ComparaSaldo());

		// Los imprimimos
		System.out.println(Arrays.deepToString(titulares));
		// Salto de línea
		System.out.println();
		System.out.println(Arrays.deepToString(cuentas));
	}
}