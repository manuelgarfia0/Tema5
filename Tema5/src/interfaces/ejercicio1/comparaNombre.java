package interfaces.ejercicio1;

import java.util.Comparator;

public class comparaNombre implements Comparator<Socio> {

	@Override
	public int compare(Socio o1, Socio o2) {
		return o1.getNombre().compareToIgnoreCase(o2.getNombre());
	}

}