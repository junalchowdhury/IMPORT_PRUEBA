package Plantillas_Java;

import java.util.Scanner;



public class In_Out_Date {
	public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        
        float numero;
        System.out.print("Ingrese numero: ");
        numero=entrada.nextFloat();//numeros
        System.out.println("El numero: "+numero);
        
        
        String cadena,palabra;
        System.out.print("Ingrese una palabra: ");
        palabra=entrada.nextLine();//
        System.out.println("La letra: "+palabra);
        
        System.out.print("Ingrese una cadena: ");
        cadena=entrada.nextLine();//
        System.out.println("La letra: "+cadena);
        
        
        
    }
	

}
