package Plantillas_Java;

import javax.swing.JOptionPane;

/**
 *
 * @author JUNAL CHOWDHURY
 */
public class Java_Condicional {
     public static void main(String[] args) {
         int num, dato=9;
         num=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
         
         if(num==dato){
             JOptionPane.showMessageDialog(null,"El numero es 9");
         }
         else{
             JOptionPane.showMessageDialog(null,"El numero es diferente a 9");
         }
         
         
     }
    
    
}
