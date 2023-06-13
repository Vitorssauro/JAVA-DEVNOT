package ProjetoJava1SEM.Conta;

import java.util.Random;
import java.util.Scanner;

public class Conta {

    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    // atributos
    String nome;
    int nConta;
    double saldo;

    // construtores

    public Conta(String nome, int nConta) {
        this.nome = nome;
        this.nConta = nConta;
    }

    // get e sets

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // métodos próprios
    // cadastro
}
