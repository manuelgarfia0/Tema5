package examen.herencia.principal;

import java.util.Arrays;
import java.util.Scanner;

import examen.herencia.mando.MandoAireAcondicionado;
import examen.herencia.mando.MandoAspiradora;
import examen.herencia.mando.Mando;
import examen.herencia.mando.MandoMinicadena;
import examen.herencia.mando.MandoTelevision;
import examen.herencia.mando.ModeloException;

/**
 * Clase principal para la gestión de mandos a distancia con menú interactivo
 */
public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Mando[] mandos = new Mando[10];

		try {
			// Inicializar los mandos
			inicializarMandos(mandos);

			// Ordenar la tabla por modelo (orden alfabético)
			Arrays.sort(mandos);

			boolean continuar = true;
			while (continuar) {
				mostrarMenu();
				int opcion = leerOpcion(scanner);
				continuar = ejecutarOpcion(opcion, mandos, scanner);
			}
		} catch (ModeloException e) {
			System.err.println("Error: " + e.getMessage());
		} finally {
			scanner.close();
		}
	}

	/**
	 * Inicializa la tabla de mandos con diferentes tipos de mandos
	 * 
	 * @param mandos Tabla de mandos a inicializar
	 * @throws ModeloException Si hay algún problema con los modelos
	 */
	private static void inicializarMandos(Mando[] mandos) throws ModeloException {
		mandos[0] = new MandoTelevision("SamsungTV001", 15.0, 5.5, 29.99);
		mandos[1] = new MandoTelevision("LGTVPro", 16.5, 6.0, 34.95);
		mandos[2] = new MandoMinicadena("SonyAudio100", 12.0, 4.5, 19.99);
		mandos[3] = new MandoMinicadena("PanasonicSC", 13.5, 4.8, 24.50);
		mandos[4] = new MandoAspiradora("DysonV11", 10.0, 3.5, 15.75);
		mandos[5] = new MandoAspiradora("BoschProClean", 9.5, 3.8, 18.25);
		mandos[6] = new MandoAireAcondicionado("MitsubishiAC", 18.0, 7.0, 45.0);
		mandos[7] = new MandoAireAcondicionado("DaikinInverter", 19.0, 7.5, 49.99);
		mandos[8] = new MandoTelevision("PhilipsSmartTV", 15.5, 5.8, 32.50);
		mandos[9] = new MandoAireAcondicionado("ToshibaEco", 18.5, 7.2, 42.75);
	}

	/**
	 * Muestra el menú principal de opciones
	 */
	private static void mostrarMenu() {
		System.out.println("\n===== MENÚ DE GESTIÓN DE MANDOS =====");
		System.out.println("1 --> Listar todos los mandos");
		System.out.println("2 --> Encender/Apagar un mando");
		System.out.println("3 --> Operar con un mando de Televisión");
		System.out.println("4 --> Operar con un mando de Minicadena");
		System.out.println("5 --> Operar con un mando de Aspiradora");
		System.out.println("6 --> Operar con un mando de Aire Acondicionado");
		System.out.println("0 --> Salir");
		System.out.print("Seleccione una opción: ");
	}

	/**
	 * Lee la opción del usuario con manejo de errores
	 * 
	 * @param scanner Scanner para leer la entrada
	 * @return La opción seleccionada
	 */
	private static int leerOpcion(Scanner scanner) {
		int opcion = -1;
		boolean entradaValida = false;

		while (!entradaValida) {
			try {
				if (scanner.hasNextInt()) {
					opcion = scanner.nextInt();
					entradaValida = true;
				} else {
					System.out.print("Entrada no válida. Ingrese un número: ");
					scanner.next(); // Descarta la entrada no válida
				}
			} catch (Exception e) {
				System.out.print("Error al leer la entrada. Intente de nuevo: ");
				scanner.nextLine(); // Limpia el buffer
			}
		}
		scanner.nextLine(); // Consumir el salto de línea
		return opcion;
	}

	/**
	 * Ejecuta la opción seleccionada por el usuario
	 * 
	 * @param opcion  Opción seleccionada
	 * @param mandos  Tabla de mandos
	 * @param scanner Scanner para leer la entrada
	 * @return true si debe continuar el programa, false si debe terminar
	 */
	private static boolean ejecutarOpcion(int opcion, Mando[] mandos, Scanner scanner) {
		boolean continuar = true;

		if (opcion == 0) {
			System.out.println("Gracias por usar el gestor de mandos. ¡Hasta pronto!");
			continuar = false;
		} else if (opcion == 1) {
			listarMandos(mandos);
		} else if (opcion == 2) {
			encenderApagarMando(mandos, scanner);
		} else if (opcion == 3) {
			operarMandoTelevision(mandos, scanner);
		} else if (opcion == 4) {
			operarMandoMinicadena(mandos, scanner);
		} else if (opcion == 5) {
			operarMandoAspiradora(mandos, scanner);
		} else if (opcion == 6) {
			operarMandoAireAcondicionado(mandos, scanner);
		} else {
			System.out.println("Opción no válida. Por favor, seleccione una opción del menú.");
		}

		return continuar;
	}

	/**
	 * Lista todos los mandos disponibles
	 * 
	 * @param mandos Tabla de mandos
	 */
	private static void listarMandos(Mando[] mandos) {
		System.out.println("\n===== LISTADO DE MANDOS ORDENADOS POR MODELO =====");
		for (int i = 0; i < mandos.length; i++) {
			System.out.println(i + ": " + mandos[i]);
		}
	}

	/**
	 * Permite encender o apagar un mando seleccionado
	 * 
	 * @param mandos  Tabla de mandos
	 * @param scanner Scanner para leer la entrada
	 */
	private static void encenderApagarMando(Mando[] mandos, Scanner scanner) {
		int indice = seleccionarMando(mandos, scanner);

		if (indice >= 0 && indice < mandos.length) {
			System.out.println("Estado actual: " + (mandos[indice].isEncendido() ? "Encendido" : "Apagado"));
			mandos[indice].onOff();
		}
	}

	/**
	 * Permite seleccionar un mando de la lista
	 * 
	 * @param mandos  Tabla de mandos
	 * @param scanner Scanner para leer la entrada
	 * @return Índice del mando seleccionado o -1 si no se seleccionó ninguno
	 */
	private static int seleccionarMando(Mando[] mandos, Scanner scanner) {
		listarMandos(mandos);
		System.out.print("Seleccione un mando (0-" + (mandos.length - 1) + "): ");
		int indice = leerOpcion(scanner);

		if (indice < 0 || indice >= mandos.length) {
			System.out.println("Índice no válido.");
			indice = -1;
		}

		return indice;
	}

	/**
	 * Permite realizar operaciones con un mando de televisión
	 * 
	 * @param mandos  Tabla de mandos
	 * @param scanner Scanner para leer la entrada
	 */
	private static void operarMandoTelevision(Mando[] mandos, Scanner scanner) {
		// Filtrar y mostrar solo mandos de televisión
		System.out.println("\n===== MANDOS DE TELEVISIÓN =====");
		boolean hayMandosTV = false;

		for (int i = 0; i < mandos.length; i++) {
			if (mandos[i] instanceof MandoTelevision) {
				System.out.println(i + ": " + mandos[i]);
				hayMandosTV = true;
			}
		}

		if (!hayMandosTV) {
			System.out.println("No hay mandos de televisión disponibles.");
			return;
		}

		System.out.print("Seleccione un mando de televisión (0-" + (mandos.length - 1) + "): ");
		int indice = leerOpcion(scanner);

		if (indice >= 0 && indice < mandos.length && mandos[indice] instanceof MandoTelevision) {
			MandoTelevision tv = (MandoTelevision) mandos[indice];

			// Verificar si está encendido
			if (!tv.isEncendido()) {
				System.out.println("El mando está apagado. ¿Desea encenderlo? (s/n): ");
				if (scanner.nextLine().toLowerCase().startsWith("s")) {
					tv.onOff();
				} else {
					System.out.println("No se puede operar con un mando apagado.");
					return;
				}
			}

			// Submenú para televisión
			System.out.println("\n--- Operaciones con mando TV " + tv.getModelo() + " ---");
			System.out.println("1 --> Establecer canal");
			System.out.println("2 --> Subir canal");
			System.out.println("3 --> Bajar canal");
			System.out.println("4 --> Subir volumen");
			System.out.println("5 --> Bajar volumen");
			System.out.print("Seleccione una operación: ");

			int operacion = leerOpcion(scanner);

			if (operacion == 1) {
				System.out.print("Introduzca el número de canal: ");
				int canal = leerOpcion(scanner);
				tv.setCanal(canal);
			} else if (operacion == 2) {
				tv.subirCanal();
			} else if (operacion == 3) {
				tv.bajarCanal();
			} else if (operacion == 4) {
				tv.subirVolumen();
			} else if (operacion == 5) {
				tv.bajarVolumen();
			} else {
				System.out.println("Operación no válida.");
			}
		} else {
			System.out.println("Selección no válida o el mando seleccionado no es de televisión.");
		}
	}

	/**
	 * Permite realizar operaciones con un mando de minicadena
	 * 
	 * @param mandos  Tabla de mandos
	 * @param scanner Scanner para leer la entrada
	 */
	private static void operarMandoMinicadena(Mando[] mandos, Scanner scanner) {
		// Filtrar y mostrar solo mandos de minicadena
		System.out.println("\n===== MANDOS DE MINICADENA =====");
		boolean hayMandosMini = false;

		for (int i = 0; i < mandos.length; i++) {
			if (mandos[i] instanceof MandoMinicadena) {
				System.out.println(i + ": " + mandos[i]);
				hayMandosMini = true;
			}
		}

		if (!hayMandosMini) {
			System.out.println("No hay mandos de minicadena disponibles.");
			return;
		}

		System.out.print("Seleccione un mando de minicadena (0-" + (mandos.length - 1) + "): ");
		int indice = leerOpcion(scanner);

		if (indice >= 0 && indice < mandos.length && mandos[indice] instanceof MandoMinicadena) {
			MandoMinicadena mini = (MandoMinicadena) mandos[indice];

			// Verificar si está encendido
			if (!mini.isEncendido()) {
				System.out.println("El mando está apagado. ¿Desea encenderlo? (s/n): ");
				if (scanner.nextLine().toLowerCase().startsWith("s")) {
					mini.onOff();
				} else {
					System.out.println("No se puede operar con un mando apagado.");
					return;
				}
			}

			// Submenú para minicadena
			System.out.println("\n--- Operaciones con mando Minicadena " + mini.getModelo() + " ---");
			System.out.println("1 --> Subir volumen");
			System.out.println("2 --> Bajar volumen");
			System.out.print("Seleccione una operación: ");

			int operacion = leerOpcion(scanner);

			if (operacion == 1) {
				mini.subirVolumen();
			} else if (operacion == 2) {
				mini.bajarVolumen();
			} else {
				System.out.println("Operación no válida.");
			}
		} else {
			System.out.println("Selección no válida o el mando seleccionado no es de minicadena.");
		}
	}

	/**
	 * Permite realizar operaciones con un mando de aspiradora
	 * 
	 * @param mandos  Tabla de mandos
	 * @param scanner Scanner para leer la entrada
	 */
	private static void operarMandoAspiradora(Mando[] mandos, Scanner scanner) {
		// Filtrar y mostrar solo mandos de aspiradora
		System.out.println("\n===== MANDOS DE ASPIRADORA =====");
		boolean hayMandosAsp = false;

		for (int i = 0; i < mandos.length; i++) {
			if (mandos[i] instanceof MandoAspiradora) {
				System.out.println(i + ": " + mandos[i]);
				hayMandosAsp = true;
			}
		}

		if (!hayMandosAsp) {
			System.out.println("No hay mandos de aspiradora disponibles.");
			return;
		}

		System.out.print("Seleccione un mando de aspiradora (0-" + (mandos.length - 1) + "): ");
		int indice = leerOpcion(scanner);

		if (indice >= 0 && indice < mandos.length && mandos[indice] instanceof MandoAspiradora) {
			MandoAspiradora asp = (MandoAspiradora) mandos[indice];

			// Verificar si está encendido
			if (!asp.isEncendido()) {
				System.out.println("El mando está apagado. ¿Desea encenderlo? (s/n): ");
				if (scanner.nextLine().toLowerCase().startsWith("s")) {
					asp.onOff();
				} else {
					System.out.println("No se puede operar con un mando apagado.");
					return;
				}
			}

			// Submenú para aspiradora
			System.out.println("\n--- Operaciones con mando Aspiradora " + asp.getModelo() + " ---");
			System.out.println("1 --> Subir velocidad");
			System.out.println("2 --> Bajar velocidad");
			System.out.print("Seleccione una operación: ");

			int operacion = leerOpcion(scanner);

			if (operacion == 1) {
				asp.subirVelocidad();
			} else if (operacion == 2) {
				asp.bajarVelocidad();
			} else {
				System.out.println("Operación no válida.");
			}
		} else {
			System.out.println("Selección no válida o el mando seleccionado no es de aspiradora.");
		}
	}

	/**
	 * Permite realizar operaciones con un mando de aire acondicionado
	 * 
	 * @param mandos  Tabla de mandos
	 * @param scanner Scanner para leer la entrada
	 */
	private static void operarMandoAireAcondicionado(Mando[] mandos, Scanner scanner) {
		// Filtrar y mostrar solo mandos de aire acondicionado
		System.out.println("\n===== MANDOS DE AIRE ACONDICIONADO =====");
		boolean hayMandosAire = false;

		for (int i = 0; i < mandos.length; i++) {
			if (mandos[i] instanceof MandoAireAcondicionado) {
				System.out.println(i + ": " + mandos[i]);
				hayMandosAire = true;
			}
		}

		if (!hayMandosAire) {
			System.out.println("No hay mandos de aire acondicionado disponibles.");
			return;
		}

		System.out.print("Seleccione un mando de aire acondicionado (0-" + (mandos.length - 1) + "): ");
		int indice = leerOpcion(scanner);

		if (indice >= 0 && indice < mandos.length && mandos[indice] instanceof MandoAireAcondicionado) {
			MandoAireAcondicionado aire = (MandoAireAcondicionado) mandos[indice];

			// Verificar si está encendido
			if (!aire.isEncendido()) {
				System.out.println("El mando está apagado. ¿Desea encenderlo? (s/n): ");
				if (scanner.nextLine().toLowerCase().startsWith("s")) {
					aire.onOff();
				} else {
					System.out.println("No se puede operar con un mando apagado.");
					return;
				}
			}

			// Submenú para aire acondicionado
			System.out.println("\n--- Operaciones con mando Aire Acondicionado " + aire.getModelo() + " ---");
			System.out.println("1 --> Cambiar modo (Frío/Calor)");
			System.out.println("2 --> Subir temperatura");
			System.out.println("3 --> Bajar temperatura");
			System.out.println("4 --> Subir velocidad");
			System.out.println("5 --> Bajar velocidad");
			System.out.print("Seleccione una operación: ");

			int operacion = leerOpcion(scanner);

			if (operacion == 1) {
				aire.cambiarModo();
			} else if (operacion == 2) {
				aire.subirTemperatura();
			} else if (operacion == 3) {
				aire.bajarTemperatura();
			} else if (operacion == 4) {
				aire.subirVelocidad();
			} else if (operacion == 5) {
				aire.bajarVelocidad();
			} else {
				System.out.println("Operación no válida.");
			}
		} else {
			System.out.println("Selección no válida o el mando seleccionado no es de aire acondicionado.");
		}
	}
}