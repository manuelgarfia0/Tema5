package comparator.ejercicio1;

import java.util.Comparator;

public class ComparatorNumDecreciente implements Comparator<Integer> {

	@Override
	public int compare(Integer num1, Integer num2) {
		return num2 - num1;
	}

}
