package POOIntroducao;

public class App {
    public static void main(String[] args) {
        //criar objeto
        RegistraAluno aluno1 = new RegistraAluno();
        // modificar atributos
        aluno1.setNome("Ana Clara Pereira");
        aluno1.setEndereco("Rua das Ruas");
        aluno1.setIdade(13);
        aluno1.setNotaCiencias(8);
        aluno1.setNotaMatematica(9.4);
        aluno1.setNotaPortugues(9.9);

        //Acessar os atributos(get)
        System.out.println("Nome:"+aluno1.getNome());
        System.out.println("Endereço:"+aluno1.getEndereco());
        System.out.println("Idade:"+aluno1.getIdade());
        System.out.println("Média:"+aluno1.getMedia());
    }
}
