package spel.entity;

import java.io.Serializable;

import utils.Util;

public abstract class Periferico implements Serializable {

	private static final long serialVersionUID = 1L;
	private static int countId;
	private int id;
	private double precio;
	private String marca;
	
	public Periferico() {
		this.id = ++Periferico.countId;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Periferico [id=" + id + ", precio=" + Util.formatNumber(precio) + "€, marca=" + marca
				+ "]";
	}
	
}