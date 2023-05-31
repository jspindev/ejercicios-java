package modelo;

public class Productos {
	
	
	public Productos() {
		
		nArticulo="";
		
		seccion="";
		
		precio="";
		
		pOrigen="";
		
	}
	

	
	/**
	 * @return the nArticulo
	 */
	public String getnArticulo() {
		return nArticulo;
	}

	/**
	 * @param nArticulo the nArticulo to set
	 */
	public void setnArticulo(String nArticulo) {
		this.nArticulo = nArticulo;
	}

	/**
	 * @return the seccion
	 */
	public String getSeccion() {
		return seccion;
	}

	/**
	 * @param seccion the seccion to set
	 */
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	/**
	 * @return the precio
	 */
	public String getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(String precio) {
		this.precio = precio;
	}

	/**
	 * @return the pOrigen
	 */
	public String getpOrigen() {
		return pOrigen;
	}

	/**
	 * @param pOrigen the pOrigen to set
	 */
	public void setpOrigen(String pOrigen) {
		this.pOrigen = pOrigen;
	}


	private String nArticulo;
	
	private String seccion;
	
	private String precio;
	
	private String pOrigen;

}
