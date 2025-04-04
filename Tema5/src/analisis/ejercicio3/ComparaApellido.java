package analisis.ejercicio3;

import java.util.Comparator;

public class ComparaApellido implements Comparator<Titular> {

	@Override
	public int compare(Titular o1, Titular o2) {
		int res = o1.getApellidos().compareToIgnoreCase(o2.getApellidos());

		if (res == 0) {
			res = o1.getNombre().compareTo(o2.getNombre());
		}
		return res;
	}

}