package interfaces.ejercicio1;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {

		Socio socios[] = new Socio[] { new Socio(1, "Antonio", 43), new Socio(2, "Paco", 22), new Socio(3, "Maria", 33),
				new Socio(4, "Alfredo", 18), new Socio(5, "Iñigo", 34) };

		Arrays.sort(socios);

		System.out.println(Arrays.deepToString(socios));
	}

}