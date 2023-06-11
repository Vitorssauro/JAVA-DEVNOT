package POOHeranca;

import POOHeranca.Pessoas.Alunos;
import POOHeranca.Pessoas.Funcionarios;

public class App {
    public static void main(String[] args) {
        // Pessoas pessoa01 = new Pessoas();
        Funcionarios func01 = new Funcionarios();
        Alunos aluno01 = new Alunos();
        aluno01.setNMatricula(2222);
        System.out.println("aaaaaaaa:" + aluno01.getNMatricula());
        func01.setFuncao("eu sei lá");
        System.out.println("EU NÃO SEI:" + func01.getFuncao());
    }
}
