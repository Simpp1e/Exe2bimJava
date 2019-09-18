package attividade01;

import javax.swing.JOptionPane;

public class Exe07 {
    
    public static void main (String args []){
        
        String aux = "";
        
        Class07 x;
        x = new Class07();
        
        aux = JOptionPane.showInputDialog(null, "Digite o valor do produto: ");
        x.a = Double.parseDouble(aux);
        
        Double fn = x.fn();
        Double p = x.p;
        
        JOptionPane.showMessageDialog(null,"O valor inicial era: " + x.a);
        JOptionPane.showMessageDialog(null, "O valor com desconto ficou: " + x.p);
    }
}

