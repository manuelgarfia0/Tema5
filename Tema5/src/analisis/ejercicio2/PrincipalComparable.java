package analisis.ejercicio2;

import java.util.Arrays;

public class PrincipalComparable {

	public static void main(String[] args) {

		// Creamos el array de fichas
		Ficha fichas[] = new Ficha[] { new Libro(4, "IT", "Stephen King", "Editorial"),
				new DVD(2, "Interestellar", "Christopher Nolan", 2010, "PELICULA"),
				new Revista(3, "Cotilleo", 34, 2020) };

		// Lo ordenamos
		Arrays.sort(fichas);

		// Lo imprimimos
		System.out.println(Arrays.deepToString(fichas));
		// Salto de línea
		System.out.println();

		// Lo ordenamos según el nombre
		Arrays.sort(fichas, new ComparaNombre());

		// Lo imprimimos
		System.out.println(Arrays.deepToString(fichas));
		// Salto de línea
		System.out.println();
	}

}