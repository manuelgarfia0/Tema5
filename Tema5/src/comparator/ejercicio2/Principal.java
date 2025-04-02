package comparator.ejercicio2;

import java.util.ArrayList;
import java.util.Collections;

import interfaces.ejercicio1.Socio;

public class Principal {

	public static void main(String[] args) {

		ArrayList<Socio> socios = new ArrayList<Socio>();
		socios.add(new Socio(3, "Antonio", 5));
		socios.add(new Socio(2, "Paco", 22));
		socios.add(new Socio(1, "Maria", 33));
		socios.add(new Socio(5, "Alfredo", 18));
		socios.add(new Socio(4, "Iñigo", 34));

		System.out.println(socios);
		Collections.sort(socios);
		System.out.println(socios);
		socios.sort(null);
		System.out.println(socios);

	}

}
