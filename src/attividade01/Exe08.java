package attividade01;

import javax.swing.JOptionPane;

public class Exe08 {

    public static void main(String[] args) {
        String aux = "";
        Class08 x;
        x = new Class08();

        aux = JOptionPane.showInputDialog(null, "Digite o valor referente da hora aula");
        x.aulah = Double.parseDouble(aux);

        aux = JOptionPane.showInputDialog(null, "Digite quantas horas por dia voce trabalha");
        x.aulahh = Double.parseDouble(aux);

        aux = JOptionPane.showInputDialog(null, "Dgite o valor de aulas dadas no mes");
        x.aulam = Double.parseDouble(aux);

        aux = JOptionPane.showInputDialog(null, "Digite o valor do inss");
        x.inss = Double.parseDouble(aux);

        Double calculo = x.calculo();

        JOptionPane.showMessageDialog(null, "O salario liquido é: " + x.a);
    }

}
