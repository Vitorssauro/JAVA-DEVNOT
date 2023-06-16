package Conta;

import javax.swing.JOptionPane;

public class ContaPF extends Conta {
    // atributos
    boolean aceito = true; // apenas pro empréstimo
    String cpf;
    // métodos
    // contrutor default

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void emprestimoPF() {
        double emprestimo = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do Empréstimo"));

        if (aceito && emprestimo <= 2000 && saldo > 0 && emprestimo >= 500) {
            JOptionPane.showMessageDialog(null, "Empréstimo realizado com sucesso!");
            saldo += emprestimo;
            aceito = false;
        } else {
            JOptionPane.showMessageDialog(null, "Seu empréstimo foi NEGADO...");
        }
    }
}
