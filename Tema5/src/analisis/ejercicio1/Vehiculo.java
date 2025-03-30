package analisis.ejercicio1;

public class Vehiculo {
	/**
	 * Propiedades básicas de un vehículo
	 */
	private String marca = "";
	private String modelo = "";
	private String color = "";
	private String matricula = "";
	private boolean motor = false;
	private int marcha = 0;
	private int velocidad = 0;

	enum TipoVehiculo {
		TURISMO, CAMION, MOTOCICLETA
	}

	/**
	 * Constructor de vehículo
	 * 
	 * @param marca
	 * @param modelo
	 * @param color
	 * @param matricula
	 */
	public Vehiculo(String marca, String modelo, String color, String matricula) {
		if (marca != null && !marca.isBlank()) {
			this.marca = marca;
		}
		if (modelo != null && !modelo.isBlank()) {
			this.modelo = modelo;
		}
		if (color != null && !color.isBlank()) {
			this.color = color;
		}
		if (matricula != null && !matricula.isBlank()) {
			this.matricula = matricula;
		}
	}

	/**
	 * Getter y setter para la marca
	 */
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		if (marca != null && !marca.isBlank()) {
			this.marca = marca;
		}
	}

	/**
	 * Getter y setter para el modelo
	 */
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		if (modelo != null && !modelo.isBlank()) {
			this.modelo = modelo;
		}
	}

	/**
	 * Getter y setter para el color
	 */
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if (color != null && !color.isBlank()) {
			this.color = color;
		}
	}

	/**
	 * Getter y setter para la matrícula
	 */
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		if (matricula != null && !matricula.isBlank()) {
			this.matricula = matricula;
		}
	}

	/**
	 * Getter y setter para el estado del motor
	 */
	public boolean isMotor() {
		return motor;
	}

	public void setMotor(boolean motor) {
		this.motor = motor;
	}

	/**
	 * Getter y setter para la marcha
	 */
	public int getMarcha() {
		return marcha;
	}

	public void setMarcha(int marcha) {
		if (marcha >= 0) {
			this.marcha = marcha;
		}
	}

	/**
	 * Getter y setter para la velocidad
	 */
	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		if (velocidad >= 0) {
			this.velocidad = velocidad;
		}
	}
}
