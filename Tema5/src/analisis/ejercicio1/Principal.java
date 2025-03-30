package analisis.ejercicio1;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Turismo turismo = new Turismo("Toyota", "Corolla", "Rojo", "1234ABC", 5, "Particular");

		int opcion;
		boolean simulacionActiva = true;

		turismo.setMotor(false); // El coche parte en reposo
		turismo.setMarcha(0);
		turismo.setVelocidad(0);

		while (simulacionActiva) {
			System.out.println("Menú de opciones:");
			System.out.println("1. Arrancar motor");
			System.out.println("2. Parar motor");
			System.out.println("3. Subir marcha");
			System.out.println("4. Bajar marcha");
			System.out.println("5. Acelerar hasta una velocidad deseada");
			System.out.println("6. Desacelerar y parar");
			System.out.println("7. Salir de la simulación");
			System.out.print("Elige una opción: ");

			opcion = scanner.nextInt();

			switch (opcion) {
			case 1: // Arrancar motor
				turismo.setMotor(true);
				System.out.println("Motor arrancado.");
				break;

			case 2: // Parar motor
				turismo.setMotor(false);
				turismo.setVelocidad(0);
				turismo.setMarcha(0);
				System.out.println("Motor apagado y coche en reposo.");
				break;

			case 3: // Subir marcha
				if (turismo.isMotor()) {
					turismo.setMarcha(turismo.getMarcha() + 1);
					System.out.println("Marcha actual: " + turismo.getMarcha());
				} else {
					System.out.println("El motor está apagado. Arranca primero.");
				}
				break;

			case 4: // Bajar marcha
				if (turismo.isMotor()) {
					turismo.setMarcha(Math.max(turismo.getMarcha() - 1, 0));
					System.out.println("Marcha actual: " + turismo.getMarcha());
				} else {
					System.out.println("El motor está apagado. Arranca primero.");
				}
				break;

			case 5: // Acelerar hasta una velocidad deseada
				if (turismo.isMotor()) {
					System.out.print("Introduce la velocidad deseada: ");
					int velocidadDeseada = scanner.nextInt();
					turismo.setVelocidad(velocidadDeseada);

					// Ajustar marcha según rangos de velocidad
					if (velocidadDeseada <= 30) {
						turismo.setMarcha(1);
					} else if (velocidadDeseada <= 50) {
						turismo.setMarcha(2);
					} else if (velocidadDeseada <= 70) {
						turismo.setMarcha(3);
					} else if (velocidadDeseada <= 100) {
						turismo.setMarcha(4);
					} else {
						turismo.setMarcha(5);
					}

					System.out.println(
							"Velocidad actual: " + turismo.getVelocidad() + " km/h en marcha " + turismo.getMarcha());
				} else {
					System.out.println("El motor está apagado. Arranca primero.");
				}
				break;

			case 6: // Desacelerar y parar
				if (turismo.isMotor() && turismo.getVelocidad() > 0) {
					System.out.println("Desacelerando...");
					while (turismo.getVelocidad() > 0) {
						turismo.setVelocidad(turismo.getVelocidad() - 10); // Desacelera en pasos de 10 km/h
						System.out.println("Velocidad actual: " + turismo.getVelocidad() + " km/h");
						// Ajustar marcha
						if (turismo.getVelocidad() > 100) {
							turismo.setMarcha(5);
						} else if (turismo.getVelocidad() > 70) {
							turismo.setMarcha(4);
						} else if (turismo.getVelocidad() > 50) {
							turismo.setMarcha(3);
						} else if (turismo.getVelocidad() > 30) {
							turismo.setMarcha(2);
						} else {
							turismo.setMarcha(1);
						}
						System.out.println("Marcha actual: " + turismo.getMarcha());
					}
					turismo.setMarcha(0);
					System.out.println("El coche está parado y en punto muerto.");
				} else {
					System.out.println("El coche ya está parado o el motor está apagado.");
				}
				break;

			case 7: // Salir de la simulación
				simulacionActiva = false;
				System.out.println("Saliendo...");
				break;

			default:
				System.out.println("Opción no válida.");
				break;
			}
		}

		scanner.close();
	}
}