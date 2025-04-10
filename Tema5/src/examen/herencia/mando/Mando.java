package examen.herencia.mando;

/**
 * Clase base para todos los mandos a distancia
 */
public class Mando implements Comparable<Mando> {
	private String modelo;
	private double anchura;
	private double altura;
	private double precio;
	private boolean encendido = false;

	/**
	 * Constructor para crear un mando a distancia sin precio
	 * 
	 * @param modelo  Identificador del modelo del mando
	 * @param anchura Anchura del mando en cm
	 * @param altura  Altura del mando en cm
	 * @throws ModeloException Si el modelo es nulo o vacío
	 */
	public Mando(String modelo, double anchura, double altura) throws ModeloException {
		this(modelo, anchura, altura, 0.0);
	}

	/**
	 * Constructor para crear un mando a distancia con precio
	 * 
	 * @param modelo  Identificador del modelo del mando
	 * @param anchura Anchura del mando en cm
	 * @param altura  Altura del mando en cm
	 * @param precio  Precio del mando en euros
	 * @throws ModeloException Si el modelo es nulo o vacío
	 */
	public Mando(String modelo, double anchura, double altura, double precio) throws ModeloException {
		if (modelo == null || modelo.trim().isEmpty()) {
			throw new ModeloException("El modelo no puede ser nulo o vacío");
		}
		this.modelo = modelo;
		this.anchura = anchura;
		this.altura = altura;
		this.precio = precio;
	}

	/**
	 * Devuelve el modelo del mando
	 * 
	 * @return El modelo del mando
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * Devuelve la anchura del mando
	 * 
	 * @return La anchura del mando en cm
	 */
	public double getAnchura() {
		return anchura;
	}

	/**
	 * Devuelve la altura del mando
	 * 
	 * @return La altura del mando en cm
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * Devuelve el precio del mando
	 * 
	 * @return El precio del mando en euros
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Establece el precio del mando
	 * 
	 * @param precio El nuevo precio del mando en euros
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * Comprueba si el mando está encendido
	 * 
	 * @return true si el mando está encendido, false en caso contrario
	 */
	public boolean isEncendido() {
		return encendido;
	}

	/**
	 * Cambia el estado del mando (encendido/apagado)
	 */
	public void onOff() {
		this.encendido = !this.encendido;
		if (encendido) {
			System.out.println("Mando " + modelo + " encendido");
		} else {
			System.out.println("Mando " + modelo + " apagado");
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;

		Mando otro = (Mando) obj;
		// Dos mandos son iguales si tienen el mismo modelo
		return modelo.equals(otro.modelo);
	}

	@Override
	public int compareTo(Mando otro) {
		// Ordenar por modelo (orden alfabético)
		return this.modelo.compareTo(otro.modelo);
	}

	@Override
	public String toString() {
		return "Mando [modelo=" + modelo + ", anchura=" + anchura + "cm, altura=" + altura + "cm, precio=" + precio
				+ "€, encendido=" + encendido + "]";
	}
}