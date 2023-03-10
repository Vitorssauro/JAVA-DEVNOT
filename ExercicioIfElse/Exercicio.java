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
        int macas = sc.nextInt();
        double valor;
        if (macas < 12) {
            valor = 0.30;
        } else {
            valor = 0.25;
        }
        double custo = macas * valor;
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
        if (a < b && b < c) {
            System.out.println("A Ordem crescent é: " + a + "-" + b + "-" + c);
        } else if (a < c && c < b) {
            System.out.println("A Ordem crescent é: " + a + "-" + c + "-" + b);
        } else if (b < a && a < c) {
            System.out.println("A Ordem crescent é: " + b + "-" + a + "-" + c);
        } else if (b < c && c < a) {
            System.out.println("A Ordem crescent é: " + b + "-" + c + "-" + a);
        } else if (c < a && a < b) {
            System.out.println("A Ordem crescent é: " + c + "-" + a + "-" + b);
        } else {
            System.out.println("A Ordem crescent é: " + c + "-" + b + "-" + a);
        }
    }

    /** EXERCÍCIO 6 */

    public void exercicio6() {
        System.out.println("Informe sua altura:");
        double altura = sc.nextDouble();
        System.out.println("Informe informe seu sexo: 1 = Feminino 2 = Masculino");
        double sexo = sc.nextDouble();
        double peso = 0.0;
        if (sexo==1) { peso = (72.7*altura)-58;
        } else { peso = (62.1*altura) - 44.7;
        }
        System.out.println("Seu peso ideal é de: "+peso+"Kg");
            }

        /** EXERCÍCIO 7 */
    
    public void exercicio7() {
        System.out.println("Informe a Nota 1 do Aluno");
        int nota1 = sc.nextInt();
        System.out.println("Informe a Nota 2 do Aluno");
        int nota2 = sc.nextInt();
        System.out.println("Informe a Frequênciado Aluno");
        int freq = sc.nextInt();
        double media = (nota1+nota2)/2;
        System.out.println("Média do aluno é:" +media);
        if (media >= 50 && freq >= 75) { System.out.println("Alno está APROVADO!!!");
            
        } else { System.out.println("Aluno está REPROVADO...");
        
            
        }
    }
}