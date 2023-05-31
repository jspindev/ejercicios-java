package com.pildorasinformaticas.productos;

import java.util.Date;

public class Productos {

	
	
	
	
	public Productos(String cArt, String seccion, String nArt, double precio, Date fecha, String importado,
			String pOrig) {
		
		this.cArt = cArt;
		this.seccion = seccion;
		this.nArt = nArt;
		this.precio = precio;
		this.fecha = fecha;
		this.importado = importado;
		this.pOrig = pOrig;
	}

	
	
	
	
	
	public Productos(String seccion, String nArt, double precio, Date fecha, String importado, String pOrig) {
		
		this.seccion = seccion;
		this.nArt = nArt;
		this.precio = precio;
		this.fecha = fecha;
		this.importado = importado;
		this.pOrig = pOrig;
	}


	



	/**
	 * @return the cArt
	 */
	public String getcArt() {
		return cArt;
	}






	/**
	 * @param cArt the cArt to set
	 */
	public void setcArt(String cArt) {
		this.cArt = cArt;
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
	 * @return the nArt
	 */
	public String getnArt() {
		return nArt;
	}






	/**
	 * @param nArt the nArt to set
	 */
	public void setnArt(String nArt) {
		this.nArt = nArt;
	}






	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}






	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}






	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}






	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}






	/**
	 * @return the importado
	 */
	public String getImportado() {
		return importado;
	}






	/**
	 * @param importado the importado to set
	 */
	public void setImportado(String importado) {
		this.importado = importado;
	}






	/**
	 * @return the pOrig
	 */
	public String getpOrig() {
		return pOrig;
	}






	/**
	 * @param pOrig the pOrig to set
	 */
	public void setpOrig(String pOrig) {
		this.pOrig = pOrig;
	}

	


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Productos [cArt=" + cArt + ", seccion=" + seccion + ", nArt=" + nArt + ", precio=" + precio + ", fecha="
				+ fecha + ", importado=" + importado + ", pOrig=" + pOrig + "]";
	}






	private String cArt;
	
	private String seccion;
	
	private String nArt;
	
	private double precio;
	
	private Date fecha;
	
	private String importado;
	
	private String pOrig;
	
	
	
	
	
	
	
}
