package Semana_2;

public class Ordenamiento_Numeros {
	
	double[] numeros;
	
	public static void main(String[] args) {
		Ordenamiento_Numeros lista_numeros = new Ordenamiento_Numeros();
		lista_numeros.numeros= new double[7];
		lista_numeros.numeros[0]=12.4;
		lista_numeros.numeros[1]=13.6;
		lista_numeros.numeros[2]=14.1;
		lista_numeros.numeros[3]=16.2;
		lista_numeros.numeros[4]=18.4;
		lista_numeros.numeros[5]=11.2;
		lista_numeros.numeros[6]=15.8;
		
		lista_numeros.ordenar();
		for (int i = 0; i < lista_numeros.numeros.length; i++) {
			System.out.println(lista_numeros.numeros[i]);
		}
		
		
		System.out.println("--------------------");
	}
	void ordenar(){
		for (int i = 0; i < this.numeros.length; i++) {
			for (int j = i+1; j < this.numeros.length; j++) {
				if(numeros[i]==numeros[j]) {
					double temporal=this.numeros[i];
					this.numeros[i]=this.numeros[j];
					this.numeros[j]=temporal;
				}
			}
		}
		
		
	}
	
	
	
	
	
	

}
