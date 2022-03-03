package Plantillas_Java;

import java.util.Scanner;

/**
 *
 * @author Junal
 */
public class Java_E2_Triangulos_Rectangulos {
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        long n,i,j;
        double h;
        System.out.print("Ingrese un numero: ");
        n=entrada.nextLong();
        for(i=1;i<n;i++){
            for(j=1;j<n;j++){
                h=Math.sqrt(Math.pow(i,2)+Math.pow(j,2));
                long g=(long)h;
                if(g==h && i<j && h<n){
                    System.out.println("El triangulo con hipotenusa "+g+" y catetos "+i+" y "+j); 
                } 
            }
        }
    }
}
