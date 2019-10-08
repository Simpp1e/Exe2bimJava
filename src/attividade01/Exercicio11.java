package attividade01;
import javax.swing.JOptionPane;
public class Exercicio11{
    public static void main(String[] args) {
        String senha = null;
        double valor1 = 0, valor2 = 0, resposta = 0;
        
        try{
            senha = String.valueOf(JOptionPane.showInputDialog(null, 
                "Cadastre sua senha"));
                
            valor1 = Double.parseDouble(JOptionPane.showInputDialog(null, 
                "Digite o primeiro numero da divisão"));
                
            valor2 = Double.parseDouble(JOptionPane.showInputDialog(null, 
                "Digite o segundo numero da divisão"));
                
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Digite somente Numeros");
            System.exit(0);
        }
        
        String confirmar = JOptionPane.showInputDialog(null, 
                "Digite sua senha");
        resposta = Exercicio11.divisao(valor1, valor2);
        
        if(Exercicio11.verificacao(senha,confirmar)==true){
            JOptionPane.showMessageDialog(null,
                "O valor da sua divisão é: " + resposta );
            
        }else{
        JOptionPane.showMessageDialog(null, "Senha incorreta!");
        System.exit(0);     
        }    
    }
    public static boolean verificacao(String senha, String confirmar){
        if (senha.equals(confirmar)){
            return true;     
        }
        else{
            return false;
        }
    }
    public static double divisao(double valor1, double valor2){
        return (valor1/valor2);     
    } 
}
