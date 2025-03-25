package interfaces.ejercicio2;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {

		Futbolista futbolistas[] = new Futbolista[] { new Futbolista(11, "Manuel", 22, 333),
				new Futbolista(24, "Paco", 21, 112), new Futbolista(1, "Antonio", 33, 101),
				new Futbolista(7, "Alfredo", 18, 89), new Futbolista(13, "Iñigo", 27, 73) };

		Arrays.sort(futbolistas);

		System.out.println(Arrays.deepToString(futbolistas));
	}

}
