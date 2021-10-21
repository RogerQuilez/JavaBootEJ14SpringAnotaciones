package spel.entity;

import java.io.Serializable;

import utils.Util;

public class PlacaBase implements Serializable {

	private static final long serialVersionUID = 1L;
	private static int countId = 0;
	private int id;
	private String marca;
	private String model;
	private double precio;
	
	public PlacaBase() {
		this.id = ++PlacaBase.countId;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "PlacaBase [id=" + id + ", marca=" + marca + ", model=" + model + ", precio=" 
				+ Util.formatNumber(precio) + "€]";
	}
	
}