package examen.herencia.mando;

/**
 * Excepción personalizada para problemas con el modelo del mando
 */
public class ModeloException extends Exception {
	/**
	 * Constructor para crear una excepción relacionada con el modelo
	 * 
	 * @param mensaje Mensaje de error
	 */
	public ModeloException(String mensaje) {
		super(mensaje);
	}
}