import javax.swing.JOptionPane;

import Conta.ContaPJ;
import Conta.ContaPF;

public class App {
    public static void main(String[] args) {
        // criar o meu vetor de objetos
        ContaPJ clientePJ[] = new ContaPJ[10];
        ContaPF clientePF[] = new ContaPF[10];
        // começar meu banco
        boolean aberto = true;
        boolean fisico = false;
        boolean juridico = false;
        int contPF = 0;
        int contPJ = 0;// contador de contas abertas

        while (aberto) {

            int selecao = Integer.parseInt(JOptionPane.showInputDialog("Informe o tipo de conta"
                    + "\n 1-Pessoa Fisica"
                    + "\n 2-Pessoa Jurídica"));
            if (selecao == 1) {
                fisico = true;
            } else if (selecao == 2) {
                juridico = true;
            } else {
                JOptionPane.showMessageDialog(null, "ação inváliada!");
            }

            while (juridico) {
                int acao = Integer.parseInt(JOptionPane.showInputDialog("Informe a ação desejada"
                        + "\n 1-Abrir Conta PJ"
                        + "\n 2-Acessar Conta PJ"
                        + "\n 3-Voltar"));
                if (acao == 1) {// abrir conta
                    // criar um objeto
                    clientePJ[contPJ] = new ContaPJ(); // chamei o construtor (default)
                    // preencher os atributos do objeto
                    clientePJ[contPJ].setNome(JOptionPane.showInputDialog("Informe o Nome da Empresa:"));
                    clientePJ[contPJ].setnCnpj(JOptionPane.showInputDialog("Informe o CNPJ da Empresa:"));
                    clientePJ[contPJ].setnConta(2000 + contPJ);
                    clientePJ[contPJ].setSaldo(0);
                    // acrescimo no contador __ Para dar numeração as contas.
                    JOptionPane.showMessageDialog(null, "Conta Criada com Sucesso"
                            + "\n - Nome da Empresa: " + clientePJ[contPJ].getNome()
                            + "\n - CNPJ: " + clientePJ[contPJ].getnCnpj()
                            + "\n - Nº da conta: " + clientePJ[contPJ].getnConta());
                    contPJ++;
                } else if (acao == 2) { // acessar uma conta já criada
                    // localizar a conta no vetor
                    int i;// contador
                    int nContaBuscada = Integer.parseInt(JOptionPane.showInputDialog("Informe o nº da conta buscada"));
                    for (i = 0; i < clientePJ.length; i++) {
                        if (nContaBuscada == clientePJ[i].getnConta()) {
                            break;
                        }
                    }

                    // menu de acesso da conta
                    boolean acesso = true;
                    while (acesso) { // acessei a conta
                        int acao2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a operação Desejada:"
                                + "\n 1-Consultar o Saldo"
                                + "\n 2-Realizar um Saque"
                                + "\n 3-Realizar um depósito"
                                + "\n 4-Solicitar empréstimo"
                                + "\n 5-Voltar"));
                        if (acao2 == 1) {// saldo
                            JOptionPane.showMessageDialog(null, "Seu Saldo é de R$ " + clientePJ[i].getSaldo());
                        }
                        if (acao2 == 2) {
                            clientePJ[i].saque();
                        }

                        if (acao2 == 3) {
                            clientePJ[i].deposito();
                        }
                        if (acao2 == 4) {
                            clientePJ[i].emprestimoPJ();
                        }
                        if (acao2 == 5) {
                            acesso = false;
                        }
                    }
                } else if (acao == 3) {
                    juridico = false;
                } else {
                    JOptionPane.showMessageDialog(null, "Ação inválida!!");
                }
            }

            // PESSOA FÍsica

            while (fisico) {

                int acao = Integer.parseInt(JOptionPane.showInputDialog("Informe a ação desejada"
                        + "\n 1-Abrir Conta PF"
                        + "\n 2-Acessar Conta PF"
                        + "\n 3-Voltar"));
                if (acao == 1) {// abrir conta
                    // criar um objeto
                    clientePF[contPF] = new ContaPF(); // chamei o construtor (default)
                    // preencher os atributos do objeto
                    clientePF[contPF].setNome(JOptionPane.showInputDialog("Informe o Nome da Pessoa:"));
                    clientePF[contPF].setCpf(JOptionPane.showInputDialog("Informe o CPF da Pessoa:"));
                    clientePF[contPF].setnConta(1000 + contPF);
                    clientePF[contPF].setSaldo(0);
                    // acrescimo no contador __ Para dar numeração as contas.
                    JOptionPane.showMessageDialog(null, "Conta Criada com Sucesso"
                            + "\n - Nome: " + clientePF[contPF].getNome()
                            + "\n - CPF: " + clientePF[contPF].getCpf()
                            + "\n - Nº da conta: " + clientePF[contPF].getnConta());
                    contPF++;
                } else if (acao == 2) { // acessar uma conta já criada
                    // localizar a conta no vetor
                    int i;// contador
                    int nContaBuscada = Integer.parseInt(JOptionPane.showInputDialog("Informe o nº da conta buscada"));
                    for (i = 0; i < clientePF.length; i++) {
                        if (nContaBuscada == clientePF[i].getnConta()) {
                            break;
                        }
                    }

                    // menu de acesso da conta
                    boolean acesso = true;
                    while (acesso) { // acessei a conta
                        int acao2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a operação Desejada:"
                                + "\n 1-Consultar o Saldo"
                                + "\n 2-Realizar um Saque"
                                + "\n 3-Realizar um depósito"
                                + "\n 4-Solicitar empréstimo"
                                + "\n 5-Voltar"));
                        if (acao2 == 1) {// saldo
                            JOptionPane.showMessageDialog(null, "Seu Saldo é de R$ " + clientePF[i].getSaldo());
                        }
                        if (acao2 == 2) {
                            clientePF[i].saque();
                        }

                        if (acao2 == 3) {
                            clientePF[i].deposito();
                        }
                        if (acao2 == 4) {
                            clientePF[i].emprestimoPF();
                        }
                        if (acao2 == 5) {
                            acesso = false;
                        }
                    }
                } else if (acao == 3) {
                    fisico = false;
                } else {
                    JOptionPane.showMessageDialog(null, "Ação inválida!!");
                }
            }
        }
    }
}
