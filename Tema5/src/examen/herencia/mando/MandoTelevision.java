package examen.herencia.mando;

import examen.herencia.interfaces.Volumen;

/**
 * Clase que representa un mando de televisión
 */
public class MandoTelevision extends Mando implements Volumen {
	private int volumen = 0;
	private int canal = 1;

	/**
	 * Constructor para crear un mando de televisión sin precio
	 * 
	 * @param modelo  Identificador del modelo del mando
	 * @param altura  Altura del mando en cm
	 * @param anchura Anchura del mando en cm
	 * @throws ModeloException Si el modelo es nulo o vacío
	 */
	public MandoTelevision(String modelo, double altura, double anchura) throws ModeloException {
		super(modelo, anchura, altura);
	}

	/**
	 * Constructor para crear un mando de televisión con precio
	 * 
	 * @param modelo  Identificador del modelo del mando
	 * @param altura  Altura del mando en cm
	 * @param anchura Anchura del mando en cm
	 * @param precio  Precio del mando en euros
	 * @throws ModeloException Si el modelo es nulo o vacío
	 */
	public MandoTelevision(String modelo, double altura, double anchura, double precio) throws ModeloException {
		super(modelo, anchura, altura, precio);
	}

	/**
	 * Devuelve el volumen actual
	 * 
	 * @return El volumen actual
	 */
	public int getVolumen() {
		return volumen;
	}

	/**
	 * Devuelve el canal actual
	 * 
	 * @return El canal actual
	 */
	public int getCanal() {
		return canal;
	}

	/**
	 * Establece el canal
	 * 
	 * @param canal El nuevo canal
	 */
	public void setCanal(int canal) {
		if (canal > 0) {
			this.canal = canal;
			System.out.println("Mando TV " + getModelo() + ": Canal establecido a " + this.canal);
		}
	}

	/**
	 * Sube el canal en 1
	 */
	public void subirCanal() {
		if (isEncendido()) {
			canal++;
			System.out.println("Mando TV " + getModelo() + ": Canal subido a " + canal);
		} else {
			System.out.println("No se puede subir el canal. El mando está apagado.");
		}
	}

	/**
	 * Baja el canal en 1, sin bajar de 1
	 */
	public void bajarCanal() {
		if (isEncendido()) {
			if (canal > 1) {
				canal--;
				System.out.println("Mando TV " + getModelo() + ": Canal bajado a " + canal);
			} else {
				System.out.println("Mando TV " + getModelo() + ": Ya está en el canal mínimo (1)");
			}
		} else {
			System.out.println("No se puede bajar el canal. El mando está apagado.");
		}
	}

	@Override
	public void subirVolumen() {
		// Los mandos de TV suben el volumen de 5 en 5
		if (isEncendido()) {
			volumen += 5;
			System.out.println("Mando TV " + getModelo() + ": Volumen subido a " + volumen);
		} else {
			System.out.println("No se puede subir el volumen. El mando está apagado.");
		}
	}

	@Override
	public void bajarVolumen() {
		// Los mandos de TV bajan el volumen de 5 en 5
		if (isEncendido()) {
			if (volumen >= 5) {
				volumen -= 5;
			} else {
				volumen = 0;
			}
			System.out.println("Mando TV " + getModelo() + ": Volumen bajado a " + volumen);
		} else {
			System.out.println("No se puede bajar el volumen. El mando está apagado.");
		}
	}

	@Override
	public String toString() {
		return "MandoTelevision [" + super.toString().substring(6) + ", volumen=" + volumen + ", canal=" + canal + "]";
	}
}