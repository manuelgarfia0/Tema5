package interfaces.ejercicio2;

import java.util.Comparator;

public class ComparaNumGoles implements Comparator<Futbolista> {

	@Override
	public int compare(Futbolista o1, Futbolista o2) {
		return o1.getNumeroGoles() - o2.getNumeroGoles();
	}

}