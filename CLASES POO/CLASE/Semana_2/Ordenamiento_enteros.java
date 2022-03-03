package Semana_2;

public class Ordenamiento_enteros {
	
	private int[] lista_enteros;
	public static void main(String[] args) {
		
		Ordenamiento_enteros lista_numeros = new Ordenamiento_enteros();
		
		lista_numeros.lista_enteros = new int[]{12, 14, 11, 8, 3, 9, 10, 11, 15};
		
		for (int i = 0; i < lista_numeros.lista_enteros.length; i++) {
			System.out.println(lista_numeros.lista_enteros[i]);
		}
		System.out.println("-------------------------------");
		System.out.println("Lista ordenada: ");
		lista_numeros.ordenar();
		
		for (int i = 0; i < lista_numeros.lista_enteros.length; i++) {
			System.out.println(lista_numeros.lista_enteros[i]);
		}
	}
	
	void ordenar(){
		for (int i = 0; i < this.lista_enteros.length-1; i++) {
			for (int j = i+1; j < this.lista_enteros.length; j++) {
				if(lista_enteros[i]<lista_enteros[j]) {
					int temporal=this.lista_enteros[i];
					this.lista_enteros[i]=this.lista_enteros[j];
					this.lista_enteros[j]=temporal;
				}
			}
		}
	
	}
	
	

}
