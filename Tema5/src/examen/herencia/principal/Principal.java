package examen.herencia.principal;

import java.util.Arrays;

import examen.herencia.mando.MandoAireAcondicionado;
import examen.herencia.mando.MandoAspiradora;
import examen.herencia.mando.Mando;
import examen.herencia.mando.MandoMinicadena;
import examen.herencia.mando.MandoTelevision;
import examen.herencia.mando.ModeloException;

/**
 * Clase principal para la gestión de mandos a distancia
 */
public class Principal {

	public static void main(String[] args) {
		try {
			// Crear una tabla de 10 mandos a distancia de diferentes tipos
			Mando[] mandos = new Mando[10];

			// Rellenar la tabla a mano
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

			// Ordenar la tabla por modelo (orden alfabético)
			Arrays.sort(mandos);

			// Imprimir la tabla ordenada
			System.out.println("===== LISTADO DE MANDOS ORDENADOS POR MODELO =====");
			for (Mando mando : mandos) {
				System.out.println(mando);
			}
			System.out.println();

			// Recorrer la tabla y realizar acciones específicas según el tipo de mando
			for (Mando mando : mandos) {
				System.out.println("\n--- Operaciones con " + mando.getModelo() + " ---");

				// 1. Encender todos los mandos
				mando.onOff(); // Encender

				// 2. Si es de televisión
				if (mando instanceof MandoTelevision) {
					MandoTelevision tv = (MandoTelevision) mando;
					// 2.1. Cambiar el canal
					tv.setCanal(5);
					// 2.2. Subir el volumen
					tv.subirVolumen();
					// 2.3. Bajar el volumen
					tv.bajarVolumen();
				}

				// 3. Si es de minicadena
				else if (mando instanceof MandoMinicadena) {
					MandoMinicadena mini = (MandoMinicadena) mando;
					// 3.1. Subir el volumen
					mini.subirVolumen();
					// 3.2. Bajar el volumen
					mini.bajarVolumen();
				}

				// 4. Si es de aspiradora
				else if (mando instanceof MandoAspiradora) {
					MandoAspiradora asp = (MandoAspiradora) mando;
					// 4.1. Subir velocidad
					asp.subirVelocidad();
					// 4.2. Bajar velocidad
					asp.bajarVelocidad();
				}

				// 5. Si es de aire acondicionado
				else if (mando instanceof MandoAireAcondicionado) {
					MandoAireAcondicionado aire = (MandoAireAcondicionado) mando;
					// 5.1. Cambiar el modo
					aire.cambiarModo();
					// 5.2. Subir temperatura
					aire.subirTemperatura();
					// 5.3. Subir velocidad
					aire.subirVelocidad();
					// 5.4. Bajar velocidad
					aire.bajarVelocidad();
				}
			}
		} catch (ModeloException e) {
			System.err.println("Error: " + e.getMessage());
		}
	}
}