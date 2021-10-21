package spel.entity;

import java.io.Serializable;

import utils.Util;

public class TarjetaGrafica implements Serializable {

	private static final long serialVersionUID = 1L;
	private static int countId = 0;
	private int id;
	private String marca;
	private Ram ram;
	private String modelo;
	private double precio;
	
	public TarjetaGrafica() {
		this.id = ++TarjetaGrafica.countId;
	}
	
	public static int getCountId() {
		return countId;
	}
	
	public static void setCountId(int countId) {
		TarjetaGrafica.countId = countId;
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
	
	public Ram getRam() {
		return ram;
	}
	
	public void setRam(Ram ram) {
		this.ram = ram;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "TarjetaGrafica [id=" + id + ", marca=" + marca + ", ram=" + ram + ", modelo=" + modelo + ", precio="
				+ Util.formatNumber(precio) + "€]";
	}
	
}