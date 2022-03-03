package Semana_2_II;

import java.util.Scanner;

public class Raices_cuadradas {
	
	private double coeficiente1;
	private double coeficiente2;
	private double coeficiente3;
	private double primeraRaiz;
	private double segundaRaiz;
	private double discriminante;
	
	
	
	public double sumarRaices() {
		return getPrimeraRaiz()+getSegundaRaiz();
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Raices_cuadradas solucion = new Raices_cuadradas();
		
		System.out.println("ax²+bx+c");
		System.out.print("Ingrese termino cuadradico: ");
		solucion.setCoeficiente1(entrada.nextFloat());
        System.out.print("Ingrese termino lineal: ");
        solucion.setCoeficiente2(entrada.nextFloat());
        System.out.print("Ingrese termino independiente: ");
        solucion.setCoeficiente3(entrada.nextFloat());
        
        solucion.CalcularRaices();
	}
	
	
	public void CalcularRaices() {
		
		
        setDiscriminante((Math.pow(coeficiente2, 2)-4*coeficiente1*coeficiente3));
		setPrimeraRaiz((coeficiente2*(-1)+(Math.sqrt(getDiscriminante())))/(2*coeficiente1));
		setSegundaRaiz((coeficiente2*(-1)-(Math.sqrt(getDiscriminante())))/(2*coeficiente1));
			
        if (getDiscriminante()<0) {
			System.out.println("La ecuacion cuadratica posee raices no reales");
		}
        else if (getDiscriminante()==0) {
        	System.out.println("La ecuacion cuadratica posee solucion unica el cual es: "+getPrimeraRaiz());
		}
        else {
			System.out.println("Las raices son: "+getPrimeraRaiz()+" y "+getSegundaRaiz());
		}
		
	}








	public double getCoeficiente1() {
		return coeficiente1;
	}

	public void setCoeficiente1(double coeficiente1) {
		this.coeficiente1 = coeficiente1;
	}


	public double getCoeficiente2() {
		return coeficiente2;
	}

	public void setCoeficiente2(double coeficiente2) {
		this.coeficiente2 = coeficiente2;
	}


	public double getCoeficiente3() {
		return coeficiente3;
	}

	public void setCoeficiente3(double coeficiente3) {
		this.coeficiente3 = coeficiente3;
	}


	public double getPrimeraRaiz() {
		return primeraRaiz;
	}

	public void setPrimeraRaiz(double primeraRaiz) {
		this.primeraRaiz = primeraRaiz;
	}


	public double getSegundaRaiz() {
		return segundaRaiz;
	}

	public void setSegundaRaiz(double segundaRaiz) {
		this.segundaRaiz = segundaRaiz;
	}


	public double getDiscriminante() {
		return discriminante;
	}

	public void setDiscriminante(double discriminante) {
		this.discriminante = discriminante;
	}
	
	
}
