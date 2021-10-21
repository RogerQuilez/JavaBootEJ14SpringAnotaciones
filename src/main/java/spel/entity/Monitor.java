package spel.entity;

public class Monitor extends Periferico {

	private static final long serialVersionUID = 1L;
	private double hz;
	private double tamaño;
	
	public double getHz() {
		return hz;
	}
	
	public void setHz(double hz) {
		this.hz = hz;
	}
	
	public double getTamaño() {
		return tamaño;
	}
	
	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	@Override
	public String toString() {
		return super.toString() + "Monitor [hz=" + hz + ", tama�o=" + tamaño + "]";
	}
	
}