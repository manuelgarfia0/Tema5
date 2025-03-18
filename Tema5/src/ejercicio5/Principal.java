package ejercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	private static List<Polígono> poligonos = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int opcion;
		do {
			System.out.println("\nMenú:");
			System.out.println("1. Introducir triángulo");
			System.out.println("2. Introducir rectángulo");
			System.out.println("3. Mostrar polígonos");
			System.out.println("4. Salir");
			System.out.print("Elija una opción: ");
			opcion = scanner.nextInt();

			switch (opcion) {
			case 1 -> introducirTriangulo();
			case 2 -> introducirRectangulo();
			case 3 -> mostrarPoligonos();
			case 4 -> System.out.println("Saliendo...");
			default -> System.out.println("Opción no válida");
			}
		} while (opcion != 4);
	}

	private static void introducirTriangulo() {
		System.out.print("Ingrese el lado 1 del triángulo: ");
		double lado1 = scanner.nextDouble();
		System.out.print("Ingrese el lado 2 del triángulo: ");
		double lado2 = scanner.nextDouble();
		System.out.print("Ingrese el lado 3 del triángulo: ");
		double lado3 = scanner.nextDouble();

		poligonos.add(new Triángulo(lado1, lado2, lado3));
		System.out.println("Triángulo agregado.");
	}

	private static void introducirRectangulo() {
		System.out.print("Ingrese el lado 1 del rectángulo: ");
		double lado1 = scanner.nextDouble();
		System.out.print("Ingrese el lado 2 del rectángulo: ");
		double lado2 = scanner.nextDouble();

		poligonos.add(new Rectángulo(lado1, lado2));
		System.out.println("Rectángulo agregado.");
	}

	private static void mostrarPoligonos() {
		if (poligonos.isEmpty()) {
			System.out.println("No hay polígonos registrados.");
		} else {
			for (Polígono p : poligonos) {
				System.out.println(p.toString() + " | Área: " + p.área());
			}
		}
	}
}