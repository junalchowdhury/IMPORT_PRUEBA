package Plantillas_Java;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author JUNAL CHOWDHURY
 */
public class Java_E3_Adivinar_Numero {
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        int num,c=0,n;
        n=(int)(Math.random()*100);
        System.out.println(n);
        do{
            num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero: "));
            
            if(num<n){
                System.out.println("Digite un numero Mayor !!!!");
            }
            else{
                if(num!=n){
                    System.out.println("Digite un numero Menor !!!!");
                }
            }
            c++;
        }while(num!=n);
        
        System.out.println("Adivino el numero en "+c+" intentos");
        System.out.println("-----------------------------------");
    }
}
