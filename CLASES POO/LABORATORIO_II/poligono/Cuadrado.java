package poligono;

public class Cuadrado {
	private double lado;
	
	public double CalcularArea() {
		return Math.pow(lado, 2);
	}
	
	public double CalcularPerimetro() {
		return 4*lado;
	}
	
	
	
	

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
}
