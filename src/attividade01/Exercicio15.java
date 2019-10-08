package attividade01;
import javax.swing.*;
public class Exercicio15 {
    public static void main(String[] args) {
        int prato, sobremesa, bebida, aux1 = 0, aux2 = 0, aux3 = 0;
        
        prato = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Escolha a opção desejada!\n " 
                + "1- Vegetariano | 180 cal\n "
                + "2- Peixe             | 230 cal\n "
                + "3- Frango           | 250 cal\n "
                + "4- Carne             | 350 cal\n "));
          
        switch(prato){
            case 1: aux1 = 180; break;
            case 2: aux1 = 230; break;
            case 3: aux1 = 250; break;
            case 4: aux1 = 350; break;
            default: break;
        }
        
        sobremesa = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Escolha a opção desejada!\n " 
                + "1- Abacaxi                  | 75 cal\n "
                + "2- Sorvete diet           | 110 cal\n "
                + "3- Mouse diet             | 170 cal\n "
                + "4- Mouse chocolate | 200 cal\n "));
        
        switch(sobremesa){
            case 1: aux2 = 75; break;
            case 2: aux2 = 110; break;
            case 3: aux2 = 170; break;
            case 4: aux2 = 200; break;
            default: break;
        }
        
        bebida = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Escolha a opção desejada!\n " 
                + "1- Chá                          | 20 cal\n "
                + "2- Suco de laranja    | 70 cal\n "
                + "3- Suco de melão     | 100 cal\n "
                + "4- Refrigerante diet | 65 cal\n "));
        
        switch(bebida){
            case 1: aux3 = 20; break;
            case 2: aux3 = 70; break;
            case 3: aux3 = 100; break;
            case 4: aux3 = 65; break;
            default: break;
        }
        int calorias = Exercicio15.operacao(aux1, aux2, aux3);
        JOptionPane.showMessageDialog(null,"A quantidade de calorias será: " 
                + calorias + " cal");
        
    }
    public static int operacao(int aux1, int aux2, int aux3){
        return (aux1 + aux2 + aux3);
    }
}