package Conta;

import javax.swing.JOptionPane;

public class ContaPF extends Conta {
    // atributos
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

        if (emprestimo <= 2000) {
            JOptionPane.showMessageDialog(null, "Empréstimo realizado com sucesso!");
            saldo += emprestimo;
        } else {
            JOptionPane.showMessageDialog(null, "Valor inválido!!\nEmpréstimo maximo de R$2.000,00");
        }
    }
}
