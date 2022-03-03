package Semana_2_III;

public class Figura {
	
	
	public static double CalcularAreaCirculo(double radio) {
		return Math.PI*Math.pow(radio, 2);
	}
	
	public static double CalcularAreaCirculo(Circulo circulo) {
		return Math.PI*Math.pow(circulo.getRadio(), 2);
	}
	

}
