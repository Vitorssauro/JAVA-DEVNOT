package POOHeranca.Pessoas;

public class Funcionarios extends Pessoas {
    String Funcao;
    double Salario;
    double CargaHoraria;

    public String getFuncao() {
        return Funcao;
    }

    public void setFuncao(String funcao) {
        Funcao = funcao;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }

    public double getCargaHoraria() {
        return CargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        CargaHoraria = cargaHoraria;
    }
}
