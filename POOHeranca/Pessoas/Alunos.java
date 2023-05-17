package POOHeranca.Pessoas;

public class Alunos extends Pessoas {
    private int NMatricula;
    private String curso;
    private String turma;

    public int getNMatricula() {
        return NMatricula;
    }

    public void setNMatricula(int nMatricula) {
        NMatricula = nMatricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
}
