import java.util.Scanner;

public class exercicios {
    Scanner sc = new Scanner(System.in);

    public void ex1() {
        System.out.println("Digite o valor:");
        int valor = sc.nextInt();
        if (valor <= 10) {
            System.out.println("NÃO É MAIOR QUE 10!");
        } else {
            System.out.println("É MAIOR QUE 10!");
        }
    }

    public void ex2() {
        System.out.println("Informe as horas trabalhadas no mês:");
        double horas = sc.nextDouble();
        System.out.println("Informe o salario por hora:");
        double salario = sc.nextDouble();
        double pagamento = horas * salario;
        if (horas <= 200) {
            System.out.println("O pagamento será de: R$" + pagamento);
        } else {
            System.out.println("o pagamento com hora extra! : R$" + (((horas - 200) * salario) * 0.5 + pagamento));
        }
    }

    public void ex3() {
        System.out.println("Informe o salário do vendedor:");
        double salFixo = sc.nextDouble();
        System.out.println("Informe o valor das vendas:");
        double vendas = sc.nextDouble();
        double comissao;
        if (vendas <= 2500) {
            comissao = 0.03;
            System.out.println("o valor a ser pago ao vendedor é de: R$" + (salFixo  + vendas + (comissao * vendas)));
        } else {
            comissao = 0.05;
            System.out.println("o valor a ser pago com comissão extra é de: R$" + (salFixo + vendas + (comissao*vendas)));
        }
    }
    public void ex4() {
        
    }
}