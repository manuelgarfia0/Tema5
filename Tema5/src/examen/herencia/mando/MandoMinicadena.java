package examen.herencia.mando;

import examen.herencia.interfaces.Volumen;

/**
 * Clase que representa un mando de minicadena
 */
public class MandoMinicadena extends Mando implements Volumen {
	private int volumen = 0;

	/**
	 * Constructor para crear un mando de minicadena sin precio
	 * 
	 * @param modelo  Identificador del modelo del mando
	 * @param altura  Altura del mando en cm
	 * @param anchura Anchura del mando en cm
	 * @throws ModeloException Si el modelo es nulo o vacío
	 */
	public MandoMinicadena(String modelo, double altura, double anchura) throws ModeloException {
		super(modelo, anchura, altura);
	}

	/**
	 * Constructor para crear un mando de minicadena con precio
	 * 
	 * @param modelo  Identificador del modelo del mando
	 * @param altura  Altura del mando en cm
	 * @param anchura Anchura del mando en cm
	 * @param precio  Precio del mando en euros
	 * @throws ModeloException Si el modelo es nulo o vacío
	 */
	public MandoMinicadena(String modelo, double altura, double anchura, double precio) throws ModeloException {
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

	@Override
	public void subirVolumen() {
		// Los mandos de minicadena suben el volumen de 10 en 10
		if (isEncendido()) {
			volumen += 10;
			System.out.println("Mando Minicadena " + getModelo() + ": Volumen subido a " + volumen);
		} else {
			System.out.println("No se puede subir el volumen. El mando está apagado.");
		}
	}

	@Override
	public void bajarVolumen() {
		// Los mandos de minicadena bajan el volumen de 10 en 10
		if (isEncendido()) {
			if (volumen >= 10) {
				volumen -= 10;
			} else {
				volumen = 0;
			}
			System.out.println("Mando Minicadena " + getModelo() + ": Volumen bajado a " + volumen);
		} else {
			System.out.println("No se puede bajar el volumen. El mando está apagado.");
		}
	}

	@Override
	public String toString() {
		return "MandoMinicadena [" + super.toString().substring(6) + ", volumen=" + volumen + "]";
	}
}