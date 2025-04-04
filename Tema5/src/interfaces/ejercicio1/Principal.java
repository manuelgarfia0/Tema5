package interfaces.ejercicio1;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {

		Socio socios[] = new Socio[] { new Socio(3, "Antonio", 43), new Socio(2, "Paco", 22), new Socio(1, "Maria", 33),
				new Socio(5, "Alfredo", 18), new Socio(4, "Iñigo", 34) };

		Arrays.sort(socios);
		System.out.println(Arrays.deepToString(socios));

		System.out.println();

		Arrays.sort(socios, new comparaEdad());
		System.out.println(Arrays.deepToString(socios));

		System.out.println();

		Arrays.sort(socios, new comparaNombre());
		System.out.println(Arrays.deepToString(socios));
	}

}