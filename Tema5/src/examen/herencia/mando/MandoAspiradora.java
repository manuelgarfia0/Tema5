package examen.herencia.mando;

import examen.herencia.interfaces.Velocidad;

/**
 * Clase que representa un mando de aspiradora
 */
public class MandoAspiradora extends Mando implements Velocidad {
	private int velocidad = 0;
	private static final int VELOCIDAD_MAXIMA = 3;

	/**
	 * Constructor para crear un mando de aspiradora sin precio
	 * 
	 * @param modelo  Identificador del modelo del mando
	 * @param altura  Altura del mando en cm
	 * @param anchura Anchura del mando en cm
	 * @throws ModeloException Si el modelo es nulo o vacío
	 */
	public MandoAspiradora(String modelo, double altura, double anchura) throws ModeloException {
		super(modelo, anchura, altura);
	}

	/**
	 * Constructor para crear un mando de aspiradora con precio
	 * 
	 * @param modelo  Identificador del modelo del mando
	 * @param altura  Altura del mando en cm
	 * @param anchura Anchura del mando en cm
	 * @param precio  Precio del mando en euros
	 * @throws ModeloException Si el modelo es nulo o vacío
	 */
	public MandoAspiradora(String modelo, double altura, double anchura, double precio) throws ModeloException {
		super(modelo, anchura, altura, precio);
	}

	/**
	 * Devuelve la velocidad actual
	 * 
	 * @return La velocidad actual
	 */
	public int getVelocidad() {
		return velocidad;
	}

	@Override
	public void subirVelocidad() {
		// Las aspiradoras suben la velocidad de 1 en 1 con un máximo de 3
		if (isEncendido()) {
			if (velocidad < VELOCIDAD_MAXIMA) {
				velocidad++;
				System.out.println("Mando Aspiradora " + getModelo() + ": Velocidad subida a " + velocidad);
			} else {
				System.out.println("Mando Aspiradora " + getModelo() + ": Ya está a la velocidad máxima ("
						+ VELOCIDAD_MAXIMA + ")");
			}
		} else {
			System.out.println("No se puede subir la velocidad. El mando está apagado.");
		}
	}

	@Override
	public void bajarVelocidad() {
		// Las aspiradoras bajan la velocidad de 1 en 1 con un mínimo de 0
		if (isEncendido()) {
			if (velocidad > 0) {
				velocidad--;
				System.out.println("Mando Aspiradora " + getModelo() + ": Velocidad bajada a " + velocidad);
			} else {
				System.out.println("Mando Aspiradora " + getModelo() + ": Ya está a la velocidad mínima (0)");
			}
		} else {
			System.out.println("No se puede bajar la velocidad. El mando está apagado.");
		}
	}

	@Override
	public String toString() {
		return "MandoAspiradora [" + super.toString().substring(6) + ", velocidad=" + velocidad + "/" + VELOCIDAD_MAXIMA
				+ "]";
	}
}