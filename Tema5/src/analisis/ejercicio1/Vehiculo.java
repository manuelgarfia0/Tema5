package analisis.ejercicio1;

public class Vehiculo {
	/**
	 * 
	 */
	private String marca = "";
	/**
	 * 
	 */
	private String modelo = "";
	/**
	 * 
	 */
	private String color = "";
	/**
	 * 
	 */
	private String matricula = "";
	/**
	 * 
	 */
	private boolean motor = false;
	/**
	 * 
	 */
	private int marcha = 0;
	/**
	 * 
	 */
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
	 * @param motor
	 * @param marcha
	 * @param velocidad
	 */
	public Vehiculo(String marca, String modelo, String color, String matricula) {
		if (!marca.isBlank() && !marca.isEmpty() && marca == null) {
			this.marca = marca;
		}
		if (!modelo.isBlank() && !modelo.isEmpty() && modelo == null) {
			this.modelo = modelo;
		}
		if (!color.isBlank() && !color.isEmpty() && color == null) {
			this.color = color;
		}
		if (!matricula.isBlank() && !matricula.isEmpty() && matricula == null) {
			this.matricula = matricula;
		}
	}

	/**
	 * 
	 * @return
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * 
	 * @param marca
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * 
	 * @return
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * 
	 * @param modelo
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * 
	 * @return
	 */
	public String getColor() {
		return color;
	}

	/**
	 * 
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * 
	 * @return
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * 
	 * @param matricula
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * 
	 * @return
	 */
	public boolean isMotor() {
		return motor;
	}

	/**
	 * 
	 * @param motor
	 */
	public void setMotor(boolean motor) {
		this.motor = motor;
	}

	/**
	 * 
	 * @return
	 */
	public int getMarcha() {
		return marcha;
	}

	/**
	 * 
	 * @param marcha
	 */
	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}

	/**
	 * 
	 * @return
	 */
	public int getVelocidad() {
		return velocidad;
	}

	/**
	 * 
	 * @param velocidad
	 */
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

}
