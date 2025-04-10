package analisis.ejercicio2;

import java.util.ArrayList;
import java.util.Collections;

public class PrincipalComparable {

	public static void main(String[] args) {
		ArrayList<Ficha> listaFichas = new ArrayList<>();
		Ficha dvd = new DVD(1, "dfs", "dfgsdf", 1990, "pelicula");
		Ficha libro = new Libro(2, "lflkj", "kpojg", "pobrkfgnm");

		listaFichas.add(libro);
		listaFichas.add(dvd);
		for (Ficha ficha : listaFichas) {
			System.out.println(ficha);
		}

		Collections.sort(listaFichas, (a, b) -> a.getTitulo().compareTo(b.getTitulo()));

		for (Ficha ficha : listaFichas) {
			System.out.println(ficha);
		}
	}

}