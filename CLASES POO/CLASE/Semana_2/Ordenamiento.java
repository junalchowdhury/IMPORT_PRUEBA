package Semana_2;
//ordenamiento Burbuja
public class Ordenamiento {
	public static void main(String[] args) {
		System.out.println("----------------------");
		String[] arreglo = {"Brazil","Argentina","Peru","Uruguay","Cuba"};

		for (int i = 0; i < arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}
		
		Ordenamiento lista = new Ordenamiento();
		
		lista.ordenar(arreglo);
		
		System.out.println("----------------------");
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}
	}

	public static void ordenar(String[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if(array[i].compareTo(array[j])>0) {
					String temporal=array[i];
					array[i]=array[j];
					array[j]=temporal;
				}
			}			
		}
	}
	
	

	
	
}
