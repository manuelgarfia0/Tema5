package comparator.ejercicio1;

import java.util.ArrayList;
import java.util.Collections;

public class Principal {

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<>();
		int numero = (int) (Math.random() * 101);

		for (int i = 0; i < 100; i++) {
			numeros.add(numero);
		}
		System.out.print(numeros);
		Collections.sort(numeros);
		
	}

}
