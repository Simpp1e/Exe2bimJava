package attividade01;

import javax.swing.JOptionPane;

public class Exe10 {
    
    public static void main(String[] args) {
        
        String aux = "";
        Class10 x;
        x = new Class10();
        
        aux = JOptionPane.showInputDialog(null,"Digite a velocidade média: ");
        x.v = Double.parseDouble(aux);
        
        aux = JOptionPane.showInputDialog(null, "Digite o tempo gasto: ");
        x.t = Double.parseDouble(aux);
        
        Double kalc1 = x.kalc1();
        Double kalc2 = x.kalc2();
        
        JOptionPane.showMessageDialog(null, "Distancia: " + x.d);
        JOptionPane.showMessageDialog(null, "Litros usados :" + x.lu);
        
    }
    
}
