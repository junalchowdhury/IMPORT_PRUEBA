package Semana_2_III;

import java.util.Scanner;

public class Circulo {
	private double radio;
	
	public double CalcularArea() {
		return Math.PI*Math.pow(radio, 2);
	}
	
	
	
	public static void main(String[] args) {
		Circulo circulo = new Circulo();
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese el valor del radio >>> ");
		circulo.setRadio(entrada.nextDouble());
		
		
		System.out.println("El area del circulo es: "+Figura.CalcularAreaCirculo(circulo.getRadio()));
		System.out.println("El area del circulo es: "+circulo.CalcularArea());
		System.out.println("El area del circulo es: "+Figura.CalcularAreaCirculo(circulo));
		
		
	}
	
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	
	
	
}
