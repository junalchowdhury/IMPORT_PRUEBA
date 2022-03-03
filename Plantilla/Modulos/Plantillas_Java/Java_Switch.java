
package Plantillas_Java;

import javax.swing.JOptionPane;

/**
 *
 * @author JUNAL CHOWDHURY
 */
public class Java_Switch {
    public static void main(String[] args) {
        int num, dato=9;
        num=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entre 1-5: "));
        
        switch(num){
            case 1: JOptionPane.showMessageDialog(null,"El numero es 1");
                    break;
            case 2: JOptionPane.showMessageDialog(null,"El numero es 2");
                    break;
            case 3: JOptionPane.showMessageDialog(null,"El numero es 3");
                    break;
            case 4: JOptionPane.showMessageDialog(null,"El numero es 4");
                    break;      
            case 5: JOptionPane.showMessageDialog(null,"El numero es 5");
                    break;
            default:JOptionPane.showMessageDialog(null,"El numero no esta entre 1-5");
                    break;
                    
                    
                    
            
        }
        
        
        
        
        
        
    }
    
    
}
