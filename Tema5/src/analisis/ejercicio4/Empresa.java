package analisis.ejercicio4;

/**
 * @author manuel.garfia
 */
public class Empresa extends Contacto {
	private String paginaWeb;

	/**
	 * Constructor para inicializar una empresa con nombre, teléfono y página web.
	 * 
	 * @param nombre    El nombre de la empresa.
	 * @param telefono  El teléfono de la empresa.
	 * @param paginaWeb La página web de la empresa.
	 */
	public Empresa(String nombre, String telefono, String paginaWeb) {
		super(nombre, telefono);
		this.paginaWeb = paginaWeb;
	}

	/**
	 * Obtiene la página web de la empresa.
	 * 
	 * @return La página web de la empresa.
	 */
	public String getPaginaWeb() {
		return paginaWeb;
	}

	/**
	 * Modifica la página web de la empresa.
	 * 
	 * @param paginaWeb La nueva página web de la empresa.
	 */
	public void setPaginaWeb(String paginaWeb) {
		this.paginaWeb = paginaWeb;
	}

	/**
	 * Devuelve una representación en texto de la empresa.
	 * 
	 * @return Cadena de texto con los datos de la empresa.
	 */
	@Override
	public String toString() {
		return super.toString() + ", Página Web: " + paginaWeb;
	}
}