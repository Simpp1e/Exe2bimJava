package attividade01;
import javax.swing.JOptionPane;
public class Exercicio13 {
    public static void main(String[] args) {
        int idade, quantidade = 0;
        
        for (int i = 0; i <= 20; i++){
        try{
            idade = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "Insira a idade da pessoa"));
            if(idade >= 18){
                quantidade = quantidade + 1;             
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Insira somente numeros " );
            System.exit(0);
        }
        }
        JOptionPane.showMessageDialog(null, "Quantidade de maiores de idade: " 
                + quantidade);

    }
}
