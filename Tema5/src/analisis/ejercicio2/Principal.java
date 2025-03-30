package analisis.ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase principal que simula el funcionamiento de una biblioteca.
 */
public class Principal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Ficha> biblioteca = new ArrayList<>();
		boolean continuar = true;

		while (continuar) {
			System.out.println("Menú de opciones:");
			System.out.println("1. Añadir un libro");
			System.out.println("2. Añadir una revista");
			System.out.println("3. Añadir un DVD");
			System.out.println("4. Listar objetos en la biblioteca");
			System.out.println("5. Mostrar detalles de un objeto");
			System.out.println("6. Salir");
			System.out.print("Elige una opción: ");
			int opcion = scanner.nextInt();

			switch (opcion) {
			case 1: // Añadir un libro
				System.out.print("Introduce el número de identificación: ");
				int numLibro = scanner.nextInt();
				scanner.nextLine(); // Consumir salto de línea
				System.out.print("Introduce el título: ");
				String tituloLibro = scanner.nextLine();
				System.out.print("Introduce el autor: ");
				String autor = scanner.nextLine();
				System.out.print("Introduce la editorial: ");
				String editorial = scanner.nextLine();
				biblioteca.add(new Libro(numLibro, tituloLibro, autor, editorial));
				System.out.println("Libro añadido correctamente.");
				break;

			case 2: // Añadir una revista
				System.out.print("Introduce el número de identificación: ");
				int numRevista = scanner.nextInt();
				scanner.nextLine(); // Consumir salto de línea
				System.out.print("Introduce el título: ");
				String tituloRevista = scanner.nextLine();
				System.out.print("Introduce el número de revista: ");
				int numeroRevista = scanner.nextInt();
				System.out.print("Introduce el año de publicación: ");
				int añoRevista = scanner.nextInt();
				biblioteca.add(new Revista(numRevista, tituloRevista, numeroRevista, añoRevista));
				System.out.println("Revista añadida correctamente.");
				break;

			case 3: // Añadir un DVD
				System.out.print("Introduce el número de identificación: ");
				int numDVD = scanner.nextInt();
				scanner.nextLine(); // Consumir salto de línea
				System.out.print("Introduce el título: ");
				String tituloDVD = scanner.nextLine();
				System.out.print("Introduce el director: ");
				String director = scanner.nextLine();
				System.out.print("Introduce el año: ");
				int añoDVD = scanner.nextInt();
				scanner.nextLine(); // Consumir salto de línea
				System.out.print("Introduce el tipo (película, documental, serie): ");
				String tipo = scanner.nextLine();
				biblioteca.add(new DVD(numDVD, tituloDVD, director, añoDVD, tipo));
				System.out.println("DVD añadido correctamente.");
				break;

			case 4: // Listar todos los objetos
				System.out.println("\nObjetos en la biblioteca:");
				for (Ficha ficha : biblioteca) {
					System.out.println("- " + ficha.getTitulo() + " (ID: " + ficha.getNumeroIdentificacion() + ")");
				}
				break;

			case 5: // Mostrar detalles de un objeto
				System.out.print("Introduce el número de identificación del objeto: ");
				int idObjeto = scanner.nextInt();
				boolean encontrado = false;

				for (Ficha ficha : biblioteca) {
					if (ficha.getNumeroIdentificacion() == idObjeto) {
						encontrado = true;
						System.out.println("\nDetalles del objeto:");
						System.out.println("Título: " + ficha.getTitulo());
						System.out.println("Tiempo de préstamo: " + ficha.obtenerTiempoPrestamo() + " días");

						if (ficha instanceof Libro) {
							Libro libro = (Libro) ficha;
							System.out.println("Autor: " + libro.getAutor());
							System.out.println("Editorial: " + libro.getEditorial());
						} else if (ficha instanceof Revista) {
							Revista revista = (Revista) ficha;
							System.out.println("Número de revista: " + revista.getNumeroRevista());
							System.out.println("Año de publicación: " + revista.getAñoPublicacion());
						} else if (ficha instanceof DVD) {
							DVD dvd = (DVD) ficha;
							System.out.println("Director: " + dvd.getDirector());
							System.out.println("Año: " + dvd.getAño());
							System.out.println("Tipo: " + dvd.getTipo());
						}
					}
				}

				if (!encontrado) {
					System.out.println("No se encontró ningún objeto con el número de identificación proporcionado.");
				}
				break;

			case 6: // Salir
				continuar = false;
				System.out.println("Saliendo...");
				break;

			default:
				System.out.println("Opción no válida. Intenta de nuevo.");
			}
		}

		scanner.close();
	}
}
