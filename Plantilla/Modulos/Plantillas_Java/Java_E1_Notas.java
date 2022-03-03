package Plantillas_Java;

import javax.swing.JOptionPane;

/**
 *
 * @author JUNAL CHOWDHURY
 */
public class Java_E1_Notas {
     public static void main(String[] args) {
         float n1,n2,n3;
         n1=Float.parseFloat(JOptionPane.showInputDialog("Digite primera nota: "));
         n2=Float.parseFloat(JOptionPane.showInputDialog("Digite segunda nota: "));
         n3=Float.parseFloat(JOptionPane.showInputDialog("Digite tercera nota: "));
    
         JOptionPane.showMessageDialog(null,"El promedio es: "+(n1+n2+n3)/3);
     }
    
    
    
    
}
