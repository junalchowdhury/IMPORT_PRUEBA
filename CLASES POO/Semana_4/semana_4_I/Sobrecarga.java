package semana_4_I;

public class Sobrecarga {
	
	
	public static void main(String[] args) {
		
		System.out.println(sumar(1,2,3,4));
		System.out.println(sumar(1,2,3,4,5));
		System.out.println(sumar(1,2,3,4,6));
		System.out.println(sumar(1,2,3,4,7,8,9));
		System.out.println(sumar(1,2,3,4,1,5,1,25,6,235));
		
		System.out.println(sumar(1,2,3,4,1,12,14,15,15,16,2,6,26));
		
		int[] i = {1,2,3,5,7};
		System.out.println(sumar(i));
		int e=2;
		System.out.println(sumar(e));
		
	}
	
	
	public static int sumar(int i) {
		int suma = 0;
		suma+=i;
		return suma*5;
	}
	
	
	public static int sumar(int...arreglo) {
		int suma = 0;
		for (int elemento:arreglo) {
			suma+=elemento;
		}
		return suma;
	}
	
	

}
