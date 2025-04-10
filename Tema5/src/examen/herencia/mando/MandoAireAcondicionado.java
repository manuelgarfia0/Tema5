package examen.herencia.mando;

import examen.herencia.interfaces.Velocidad;

/**
 * Clase que representa un mando de aire acondicionado
 */
public class MandoAireAcondicionado extends Mando implements Velocidad {
	/**
	 * Enum para representar los modos del aire acondicionado
	 */
	enum Modo {
		FRIO, CALOR
	}

	private Modo modo = Modo.FRIO;
	private int temperatura = 24;
	private int velocidad = 0;
	private static final int VELOCIDAD_MAXIMA = 5;

	/**
	 * Constructor para crear un mando de aire acondicionado sin precio
	 * 
	 * @param modelo  Identificador del modelo del mando
	 * @param altura  Altura del mando en cm
	 * @param anchura Anchura del mando en cm
	 * @throws ModeloException Si el modelo es nulo o vacío
	 */
	public MandoAireAcondicionado(String modelo, double altura, double anchura) throws ModeloException {
		super(modelo, anchura, altura);
	}

	/**
	 * Constructor para crear un mando de aire acondicionado con precio
	 * 
	 * @param modelo  Identificador del modelo del mando
	 * @param altura  Altura del mando en cm
	 * @param anchura Anchura del mando en cm
	 * @param precio  Precio del mando en euros
	 * @throws ModeloException Si el modelo es nulo o vacío
	 */
	public MandoAireAcondicionado(String modelo, double altura, double anchura, double precio) throws ModeloException {
		super(modelo, anchura, altura, precio);
	}

	/**
	 * Devuelve el modo actual
	 * 
	 * @return El modo actual (FRÍO o CALOR)
	 */
	public Modo getModo() {
		return modo;
	}

	/**
	 * Devuelve la temperatura actual
	 * 
	 * @return La temperatura actual
	 */
	public int getTemperatura() {
		return temperatura;
	}

	/**
	 * Devuelve la velocidad actual
	 * 
	 * @return La velocidad actual
	 */
	public int getVelocidad() {
		return velocidad;
	}

	/**
	 * Cambia el modo entre FRÍO y CALOR
	 */
	public void cambiarModo() {
		if (isEncendido()) {
			if (modo == Modo.FRIO) {
				modo = Modo.CALOR;
			} else {
				modo = Modo.FRIO;
			}
			System.out.println("Mando Aire " + getModelo() + ": Modo cambiado a " + modo);
		} else {
			System.out.println("No se puede cambiar el modo. El mando está apagado.");
		}
	}

	/**
	 * Sube la temperatura en 1 grado
	 */
	public void subirTemperatura() {
		if (isEncendido()) {
			temperatura++;
			System.out.println("Mando Aire " + getModelo() + ": Temperatura subida a " + temperatura + "°C");
		} else {
			System.out.println("No se puede subir la temperatura. El mando está apagado.");
		}
	}

	/**
	 * Baja la temperatura en 1 grado
	 */
	public void bajarTemperatura() {
		if (isEncendido()) {
			temperatura--;
			System.out.println("Mando Aire " + getModelo() + ": Temperatura bajada a " + temperatura + "°C");
		} else {
			System.out.println("No se puede bajar la temperatura. El mando está apagado.");
		}
	}

	@Override
	public void subirVelocidad() {
		// Los aires acondicionados suben la velocidad de 1 en 1 con un máximo de 5
		if (isEncendido()) {
			if (velocidad < VELOCIDAD_MAXIMA) {
				velocidad++;
				System.out.println("Mando Aire " + getModelo() + ": Velocidad subida a " + velocidad);
			} else {
				System.out.println(
						"Mando Aire " + getModelo() + ": Ya está a la velocidad máxima (" + VELOCIDAD_MAXIMA + ")");
			}
		} else {
			System.out.println("No se puede subir la velocidad. El mando está apagado.");
		}
	}

	@Override
	public void bajarVelocidad() {
		// Los aires acondicionados bajan la velocidad de 1 en 1 con un mínimo de 0
		if (isEncendido()) {
			if (velocidad > 0) {
				velocidad--;
				System.out.println("Mando Aire " + getModelo() + ": Velocidad bajada a " + velocidad);
			} else {
				System.out.println("Mando Aire " + getModelo() + ": Ya está a la velocidad mínima (0)");
			}
		} else {
			System.out.println("No se puede bajar la velocidad. El mando está apagado.");
		}
	}

	@Override
	public String toString() {
		return "MandoAireAcondicionado [" + super.toString().substring(6) + ", modo=" + modo + ", temperatura="
				+ temperatura + "°C, velocidad=" + velocidad + "/" + VELOCIDAD_MAXIMA + "]";
	}
}