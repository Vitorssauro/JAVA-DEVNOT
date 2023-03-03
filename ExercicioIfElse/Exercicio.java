package ExercicioIfElse;

import java.util.Scanner;

/**
 * Exercicio
 */
public class Exercicio {

    Scanner sc = new Scanner(System.in);

    /** EXERCÍCIO 1 */

    public void exercicio1() {
        System.out.println("Digite o valor 1");
        int valor1 = sc.nextInt();
        System.out.println("Digite o valor 2");
        int valor2 = sc.nextInt();
        if (valor1 > valor2) {
            System.out.println("O maior valor é " + valor1);
        } else {
            System.out.println("O maior valor é " + valor2);
        }
    }

    /** EXERCÍCIO 2 */

    public void exercicio2() {
        System.out.println("Informe o ano do seu nascimento!");
        int nascimento = sc.nextInt();
        if (nascimento <= 2007) {
            System.out.println("Você pode votar esse ano!! :D");
        } else {
            System.out.println("Você NÃO pode votar esse ano... :(");
        }
    }

    /** EXERCÍCIO 3 */

    public void exercicio3() {
        System.out.println("Digite a SENHA:");
        int senha = sc.nextInt();
        if (senha == 1234) {
            System.out.println("ACESSO PERMITIDO");
        } else {
            System.out.println("ACESSO NEGADO");
        }
    }

    /** EXERCÍCIO 4 */

    public void exercicio4() {
        System.out.println("Quantas maças você vai comprar?...");
        double maças = sc.nextDouble();
        double valor = 0;
        if (maças < 12) {
            valor = 0.30;
        } else {
            valor = 0.25;
        }
        double custo = maças * valor;
        System.out.println("Você irá pagar:" + custo);
    }

    /** EXERCÍCIO 5 */

    public void exercicio5() {
        System.out.println("Digite o valor 1:");
        int a = sc.nextInt();
        System.out.println("Digite o valor 2:");
        int b = sc.nextInt();
        System.out.println("Digite o valor 3:");
        int c = sc.nextInt();
        if (a>b && b>c) { System.out.println("o resultado vai ser: "+a+b+c);
        } else if(a>c && c>b){ System.out.println("o resultado vai ser: "+a+c+b);   
        }
    }
    public void exercicio6() {
        
    }
}