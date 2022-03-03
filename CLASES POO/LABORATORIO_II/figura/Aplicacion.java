package figura;

import convexo.Circulo;
import poligono.Cuadrado;


public class Aplicacion {
	
	
	public static void main(String[] args) {
		Circulo circulo = new Circulo();
		circulo.setRadio(5d);
		
		Cuadrado cuadrado = new Cuadrado();
		cuadrado.setLado(4d);
		
		System.out.println("Area del cuadrado: "+cuadrado.CalcularArea());
		System.out.println("Perimetro del cuadrado: "+cuadrado.CalcularPerimetro());
		
		System.out.println("Area del circulo: "+circulo.CalcularArea());
		System.out.println("Perimetro del circulo: "+circulo.CalcularPerimetro());
		
	}
	

}
