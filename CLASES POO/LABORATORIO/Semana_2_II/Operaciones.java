package Semana_2_II;




public class Operaciones {
	
	public static void main(String[] args) {
		
		
		Raices_cuadradas solucion = new Raices_cuadradas();
		
		solucion.setCoeficiente1(1);
		solucion.setCoeficiente2(7);
		solucion.setCoeficiente3(-10);
		solucion.CalcularRaices();
		
		
		System.out.println("La suma de raices reales es: "+solucion.sumarRaices());
		
 
	}

}
