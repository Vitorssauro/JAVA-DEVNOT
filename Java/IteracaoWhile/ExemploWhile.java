package IteracaoWhile;

import java.util.Scanner;

public class ExemploWhile {
    Scanner sc = new Scanner(System.in);

    public void exemplo() {

        int iteracao = 0;
        while (iteracao < 10) {
            iteracao += 1;
            System.out.println("essa é a iteração de nº " + iteracao);
        }
    }

    public void exemplo2() {
        // ler 5 nºs inteiros e printar na ordem
        // criar um vetor com while
        int vetor[] = new int[5];
        int i = 0;
        while (i < 5) {
            System.out.println("digite o valor para o vetor AEEEEEEE!");
            vetor[i] = sc.nextInt();
            i++;
        }
        i = 0;
        while (i < 5) {
            System.out.println(vetor[i]);
            i++;
            System.out.println("o valor do vetor [" + i + "] é " + vetor[i]);
        }
    }
}
