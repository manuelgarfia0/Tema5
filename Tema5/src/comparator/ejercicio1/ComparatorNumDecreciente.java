package comparator.ejercicio1;

import java.util.Comparator;

public class ComparatorNumDecreciente {

	Comparator<Integer> comparaNumDecreciente = (num1, num2) -> {
		return num2 - num1;
	};

}