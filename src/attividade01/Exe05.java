package attividade01;

import javax.swing.JOptionPane;

public class Exe05 {
    
    public static void main(String[] args) {
     
        int i = 5, j, k;
        j = --i;
        k =i++;
        i+=10;
        
       JOptionPane.showMessageDialog(null,"Valor de i: " + i);
       JOptionPane.showMessageDialog(null,"Valor de j: " + j);
       JOptionPane.showMessageDialog(null,"Valor de k: " + k);
        
    }
    
    
}
