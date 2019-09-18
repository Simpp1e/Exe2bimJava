
package attividade01;

import javax.swing.JOptionPane;


public class Exe09 {
    
    public static void main(String[] args) {
        
        String aux = "";
        
        Class09 x;
        x = new Class09();
        
        aux = JOptionPane.showInputDialog(null, "Digite a altura: ");
        x.a = Double.parseDouble(aux);
        
        aux = JOptionPane.showInputDialog(null, "Digite o raio: ");
        x.r = Double.parseDouble(aux);
        
        Double calc01 = x.calc01();
        
        JOptionPane.showMessageDialog(null, "O volume é: " + x.y);
    }
    
}
