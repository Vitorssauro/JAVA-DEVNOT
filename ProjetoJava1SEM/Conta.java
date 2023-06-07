package ProjetoJava1SEM;

public class Conta {

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

}
