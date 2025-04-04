package analisis.ejercicio2;

import java.util.Comparator;

public class ComparaNombre implements Comparator<Ficha> {

	@Override
	public int compare(Ficha o1, Ficha o2) {
		return o1.getTitulo().compareToIgnoreCase(o2.getTitulo());
	}

}