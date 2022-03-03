package convexo;

public class Circulo {
	private double radio;
	
	public double CalcularArea() {
		return Math.PI*Math.pow(radio, 2);
	}
	
	public double CalcularPerimetro() {
		return 2*(Math.PI*radio);
	}
	
	
	
	
	

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	

}
