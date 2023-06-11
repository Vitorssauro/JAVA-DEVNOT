package POOHeranca.Pessoas;

public class Professores extends Funcionarios {
    String Disciplina;
    String Formacao;
    int Turma;

    public String getDisciplina() {
        return Disciplina;
    }

    public void setDisciplina(String disciplina) {
        Disciplina = disciplina;
    }

    public String getFormacao() {
        return Formacao;
    }

    public void setFormacao(String formacao) {
        Formacao = formacao;
    }

    public int getTurma() {
        return Turma;
    }

    public void setTurma(int turma) {
        Turma = turma;
    }

}
