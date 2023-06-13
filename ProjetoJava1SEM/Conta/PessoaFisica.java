package ProjetoJava1SEM.Conta;

public class PessoaFisica extends Conta {

    public PessoaFisica(String nome, int nConta) {
        super(nome, nConta);
        // TODO Auto-generated constructor stub
    }

    String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // métodos próprios
    // cadastro
    public void CadFisico() {
        saldo = 0;
        nConta = 1001;
        System.out.println("informe seu nome:");
        nome = sc.nextLine();
        System.out.println("Informe seu CPF:");
        cpf = sc.nextLine();
        System.out.println("Bem-Vindo(a)" +nome+"\nCPF: "+cpf );
        
    }

    public double verificar() {
        return saldo;
    }

}
