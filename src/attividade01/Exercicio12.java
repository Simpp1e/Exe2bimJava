package attividade01;
import javax.swing.JOptionPane;
public class Exercicio12 {
    public static void main(String[] args) {
        int numero = 0, x = 0, y = 0;
        try{
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira "
                + "um numero"));
            x = numero+1;
            y = numero-1;
        
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Insira somente numeros");
            System.exit(0);
        }
        JOptionPane.showMessageDialog(null, "Antecessor: "+ y +"\nO numero: " 
                + numero + "\nSucessor: " + x);
    }
   }
