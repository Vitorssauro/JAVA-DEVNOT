package Conta;

import javax.swing.JOptionPane;

public class ContaPJ extends Conta {
    // atributos
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

        if (emprestimo <= 10000) {
            JOptionPane.showMessageDialog(null, "Empréstimo realizado com sucesso!");
            saldo += emprestimo;
        } else {
            JOptionPane.showMessageDialog(null, "Valor inválido!!\nEmpréstimo maximo de R$10.000,00");
        }
    }
}
