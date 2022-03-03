package p3;

import java.util.Scanner;

public class AlgoritmoEuclides {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.print("Ingrese primer numero: ");
		num1 = in.nextInt();
		
		System.out.print("Ingrese segundo numero: ");
		num2 = in.nextInt();
		
		System.out.println("El MCD es: "+MCD(num1,num2));
		
	}
	public static int MCD(int num1, int num2) {
		int r=1;
		int aux;
		if(num1 < num2) {
			aux = num1;
			num2 = num1;
			num1 = aux;
		}
		
		while(r!=0) {
			r=num1%num2;
			num1=num2;
			num2=r;
		}
		return num1;
	}
	
	
	
	
}
