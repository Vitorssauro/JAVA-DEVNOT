package ProjetoJava1SEM.Conta;

public class PessoaJuridica extends Conta{

    public PessoaJuridica(String nome, int nConta) {
        super(nome, nConta);
        //TODO Auto-generated constructor stub
    }
    
    String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

}
