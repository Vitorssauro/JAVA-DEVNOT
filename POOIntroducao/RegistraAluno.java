package POOIntroducao;

public class RegistraAluno {
    // Atributos dos objetos
    private String nome;
    private String endereco;
    private int idade;
    private double notaMatematica;
    private double notaPortugues;
    private double notaCiencias;
    // atributo da classe
    private static int contadorEstudante;

    // criação de metodos
    // retorna o nome do estudante
    public String getNome() {
        return nome;
    }

    // retorna o endereço do estudante
    public String getEndereco() {
        return endereco;
    }

    // retorna idade do estudante
    public int getIdade() {
        return idade;
    }

    // retorna a média do estudante
    public double getMedia() {
        double resultado = 0;
        resultado = (notaMatematica
                + notaPortugues
                + notaCiencias) / 3;

        return resultado;
    }

    // retorna a quantidade de estudantes cadastrados
    public static int getQuantidadeAlunos() {
        return contadorEstudante;
    }

    // define ou altera o nome do estudante

    public void setNome(String nome) {
        this.nome = nome;
    }

    // define ou altera o endereço do estudante
    public void setEndereco(String temp) {
        endereco = temp;
    }

    // define ou altera a idade do estudante
    public void setIdade(int temp) {
        idade = temp;
    }

    // define ou altera a Nota de matemática do estudante
    public void setNotaMatematica(double temp) {
        notaMatematica = temp;
    }

    // define ou altera a Nota de português do estudante
    public void setNotaPortugues(double temp) {
        notaPortugues = temp;
    }

    // define ou altera a Nota de Ciências do estudante
    public void setNotaCiencias(double temp) {
        notaCiencias = temp;
    }
}
