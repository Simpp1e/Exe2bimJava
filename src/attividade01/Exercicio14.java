package Atividade01_DES;
import javax.swing.JOptionPane;
public class Exercicio14 {
    public static void main(String[] args) {
        String[] nome;
	int idade, menor = 0, auxIdade;
		
		try{
                   int i = 0;
                    nome = new String[i];
                    nome[i] = JOptionPane.showInputDialog(null, "Insira seu nome: ");
                    idade = Integer.parseInt(JOptionPane.showInputDialog(null, 
                            "Insira sua idade: "));
                    auxIdade = idade;
                    
                    for(i=0; i < auxIdade; i++){
			menor++;
                    }
                    if(idade <= menor){
			menor = idade;
                    }
                 JOptionPane.showInputDialog(null, "O menor número digitado foi: " + menor);     
                } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Digite somente números");
            System.exit(0);
        }
                
    
	}      
    }

