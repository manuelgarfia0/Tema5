package comparator.ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Principal {
	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 20; i++) {
			numeros.add(random.nextInt(1, 101));
		}

		System.out.println("Números sin ordenar:");
		System.out.println(numeros);

		System.out.println();

		Collections.sort(numeros, new ComparatorNumDecreciente());

		System.out.println("Números ordenados decrecientemente:");
		System.out.println(numeros);
	}
}