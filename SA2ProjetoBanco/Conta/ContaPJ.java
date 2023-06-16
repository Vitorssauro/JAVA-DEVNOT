package Conta;

import javax.swing.JOptionPane;

public class ContaPJ extends Conta {
    // atributos
    boolean aceito = true; //apenas pro empréstimo
    String nCnpj;
    // métodos
    // construtor vazio(default)

    public String getnCnpj() {
        return nCnpj;
    }

    public void setnCnpj(String nCnpj) {
        this.nCnpj = nCnpj;
    }

    public void emprestimoPJ() {
        double emprestimo = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do Empréstimo"));

        if (aceito && emprestimo <= 10000 && saldo > 0 && emprestimo >= 1000) {
            JOptionPane.showMessageDialog(null, "Empréstimo realizado com sucesso!");
            saldo += emprestimo;
            aceito = false;
        } else {
            JOptionPane.showMessageDialog(null, "Seu empréstimo foi Negado");
        }
    }
}
