package spel.entity;

import java.io.Serializable;

import utils.Util;

public class Ram implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private static int contId = 0;
	private int id;
	private double precio;
	private double hz;
	private String generacion;
	
	public Ram() {
		this.id = ++Ram.contId;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public double getHz() {
		return hz;
	}
	
	public void setHz(double hz) {
		this.hz = hz;
	}
	
	public String getGeneracion() {
		return generacion;
	}
	
	public void setGeneracion(String generacion) {
		this.generacion = generacion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Ram [id=" + id + " precio=" + Util.formatNumber(precio) + "€, hz=" + hz 
				+ ", generacion=" + generacion + "]";
	}
	
	
	
}