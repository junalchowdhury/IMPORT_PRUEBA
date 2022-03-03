package p3;

import java.util.Scanner;

public class FuncionAckermann {
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.print("Ingrese primer numero: ");
		num1 = in.nextInt();
		
		System.out.print("Ingrese segundo numero: ");
		num2 = in.nextInt();
		
		
		
		System.out.println("La Funcion Ackermann es: "+Ackerman(num1, num2));
	}
	
	
	
	
	private static int Ackerman(int n1, int n2) {
		if(n1==0) {
			return n2+1;
		}
		else if(n1>0 && n2==0){
			
			return Ackerman(n1-1, 1);
		}
		else{
			return Ackerman(n1-1, Ackerman(n1, n2-1));
		}
		
	}
	
	

}
