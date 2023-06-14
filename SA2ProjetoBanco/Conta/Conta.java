package Conta;

import javax.swing.JOptionPane;

public abstract class Conta {
    // atributos comuns
    String nome;
    int nConta;
    double saldo;

    // métodos
    // construtor default(vazio)
    // sets and gets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getnConta() {
        return nConta;
    }

    public void setnConta(int nConta) {
        this.nConta = nConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // métodos opcionais
    //saque
    public void saque() {
        double saque = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do Saque"));
        if (saque > saldo) {
            JOptionPane.showMessageDialog(null, "Saldo insuficente!!");
        } else {
            saldo -= saque;
            JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!");

        }
    }

    //deposito
    public void deposito() {
        double deposito = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do Depósito"));
        saldo += deposito;
        JOptionPane.showMessageDialog(null, "Deposito realizado com sucesso!");
    }
}
