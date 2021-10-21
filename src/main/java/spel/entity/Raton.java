package spel.entity;

public class Raton extends Periferico {
	
	private static final long serialVersionUID = 1L;
	private double peso;
	private int botones;
	private boolean inalambrico;
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public int getBotones() {
		return botones;
	}
	
	public void setBotones(int botones) {
		this.botones = botones;
	}
	
	public boolean isInalambrico() {
		return inalambrico;
	}
	
	public void setInalambrico(boolean inalambrico) {
		this.inalambrico = inalambrico;
	}

	@Override
	public String toString() {
		String isInalambric = inalambrico ? "si" : "No";
		return super.toString() + "Raton [peso=" + peso + ", botones=" + botones + ", inalambrico=" + 
				isInalambric + "]";
	}
	
}