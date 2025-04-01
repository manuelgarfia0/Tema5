package analisis.ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	private static final Scanner scanner = new Scanner(System.in);
	private static final ArrayList<Contacto> agenda = new ArrayList<>();

	public static void main(String[] args) {
		int opcion;

		do {
			System.out.println("\n=== MENÚ DE AGENDA TELEFÓNICA ===");
			System.out.println("1. Añadir contacto");
			System.out.println("2. Listar contactos");
			System.out.println("3. Buscar contacto por nombre");
			System.out.println("4. Salir");
			System.out.print("Selecciona una opción: ");
			opcion = scanner.nextInt();
			scanner.nextLine();

			switch (opcion) {
			case 1 -> añadirContacto();
			case 2 -> listarContactos();
			case 3 -> buscarContacto();
			case 4 -> System.out.println("Saliendo...");
			default -> System.out.println("Opción no válida. Intenta de nuevo.");
			}
		} while (opcion != 4);
	}

	private static void añadirContacto() {
		System.out.print("¿El contacto es una Persona o una Empresa? (P/E): ");
		String tipo = scanner.nextLine();
		System.out.print("Introduce el nombre: ");
		String nombre = scanner.nextLine();
		System.out.print("Introduce el teléfono: ");
		String telefono = scanner.nextLine();

		if (tipo.equalsIgnoreCase("P")) {
			System.out.print("Introduce el cumpleaños (dd/mm/aaaa): ");
			String cumpleanos = scanner.nextLine();
			agenda.add(new Persona(nombre, telefono, cumpleanos));
			System.out.println("Contacto de tipo Persona añadido exitosamente.");
		} else if (tipo.equalsIgnoreCase("E")) {
			System.out.print("Introduce la página web: ");
			String paginaWeb = scanner.nextLine();
			agenda.add(new Empresa(nombre, telefono, paginaWeb));
			System.out.println("Contacto de tipo Empresa añadido exitosamente.");
		} else {
			System.out.println("Tipo no válido. Intenta nuevamente.");
		}
	}

	private static void listarContactos() {
		System.out.println("\n=== LISTA DE CONTACTOS ===");
		if (agenda.isEmpty()) {
			System.out.println("La agenda está vacía.");
		} else {
			for (Contacto contacto : agenda) {
				System.out.println(contacto.toString());
			}
		}
	}

	private static void buscarContacto() {
		System.out.print("Introduce el nombre a buscar: ");
		String buscarNombre = scanner.nextLine();
		boolean encontrado = false;

		for (Contacto contacto : agenda) {
			if (contacto.getNombre().equalsIgnoreCase(buscarNombre)) {
				System.out.println("Contacto encontrado: " + contacto.toString());
				encontrado = true;
			}
		}

		if (!encontrado) {
			System.out.println("No se encontró ningún contacto con ese nombre.");
		}
	}
}
