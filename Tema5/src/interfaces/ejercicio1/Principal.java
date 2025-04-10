package interfaces.ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Socio> listaSocios = new ArrayList<>();
		listaSocios.add(new Socio(1, "Antonio", 33));
		listaSocios.add(new Socio(3, "Isabel", 21));
		listaSocios.add(new Socio(4, "Ermenegildo", 32));
		listaSocios.add(new Socio(2, "Cristobal", 24));

		System.out.println(listaSocios);
		Collections.sort(listaSocios);
		System.out.println(listaSocios);
		listaSocios.sort((a, b) -> a.getEdad() - b.getEdad());
		System.out.println(listaSocios);
		Comparator<Socio> comparadorNombreAlfabetico = (a, b) -> {
			return a.getNombre().compareTo(b.getNombre());
		};
		listaSocios.sort(comparadorNombreAlfabetico);
		System.out.println(listaSocios);
	}

}