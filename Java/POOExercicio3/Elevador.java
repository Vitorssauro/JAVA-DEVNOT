package POOExercicio3;

public class Elevador {
    // atributos
    int qtdPessoasAtual;
    int qtdMaxPessoas;
    int nMaxAndares;
    int andarAtual;

    // métodos
    // construtores
    public Elevador(int qtdMaxPessoas, int nMaxAndares) {
        this.qtdMaxPessoas = qtdMaxPessoas;
        this.nMaxAndares = nMaxAndares;
    }

    // set and gets
    public int getQntPessoasAtual() {
        return qtdPessoasAtual;
    }

    public void setQntPessoasAtual(int qntPessoasAtual) {
        this.qtdPessoasAtual = qntPessoasAtual;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    // métodos próprios
    // inicializa
    public void inicializa() {
        andarAtual = 0;
        qtdPessoasAtual = 0;
    }

    // entrar
    public int entrar() {
        if (qtdPessoasAtual < qtdMaxPessoas) {
            qtdPessoasAtual++;
        } else {
            System.out.println("Não vai entrar +NINGUÉM!!");
        }
        return qtdPessoasAtual;
    }

    // sair
    public int sair() {
        if (qtdPessoasAtual > 0) {
            qtdPessoasAtual--;
        } else {
            System.out.println("But nobody came...");
        }
        return qtdPessoasAtual;
    }

    // subir
    public int subir(int nAndares) {
        if (andarAtual + nAndares <= nMaxAndares) {
            andarAtual += nAndares;
        } else {
            System.out.println("Informe um nº válido");
        }
        return andarAtual;
    }

    // descer
    public int descer(int nAndares) {
        if (andarAtual - nAndares >= 0) {
            andarAtual -= nAndares;
        } else {
            System.out.println("Informe um nº válido");
        }
        return andarAtual;
    }

}
