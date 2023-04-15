package IteracaoFor;

import java.util.Scanner;

public class ExemploFor {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        for (int i = 0; i < 10; i++) {
            System.out.println("o nº da iteração é " + i);
        }
    }

    public void exemplo2() {
        // criando vetor de 10 posições
        int vetor[] = new int[10];
        // preenchendo vetor com for
        // (comando "fori" para preencher a formula automaticamente)
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("vetor[" + i + "]=");
            vetor[i] = sc.nextInt();
        }
        // imprimir vetor na ordem inversa
        for (int i = 9; i >= 0; i--) {
            System.out.print("vetor[" + i + "]=" + vetor[i]);

        }
    }

    public void exemplo3() {
        double carrinhoCompra[] = new double[] { 19.90, 35.70, 56.80 };
        double valorFinal = 0;
        for (int i = 0; i < carrinhoCompra.length; i++) {
            valorFinal += carrinhoCompra[i];
            System.out.println("valor parcial compra: R$" + valorFinal);
        }
        System.out.println("valor da compra é R$" + valorFinal);
    }

    public void exemplo4() {
        double vetorNotas[] = new double[4];
        for (int i = 0; i < vetorNotas.length; i++) {
            System.out.println("Digite a " + (i + 1) + "ª nota:");
            vetorNotas[i] = sc.nextDouble();
        }
        double mediaNotas = 0;
        for (int i = 0; i < vetorNotas.length; i++) {
            mediaNotas += vetorNotas[i];
            System.out.println("A " + (i + 1) + "ª nota é " + vetorNotas[i]);
        }
        mediaNotas /= vetorNotas.length;
        System.out.printf("A média do aluno é : %.2f", mediaNotas);
    }

    public void exemplo5() {
        //criando vetor com 10 posições
        double vetorMedia[] = new double[10];
        //preencher vetor e medias
        for (int i = 0; i < vetorMedia.length; i++) {
            double notas = 0;
            for (int j = 0; j < 4; j++) {
                System.out.println("Nota" + (j + 1) + "Aluno" + (i + 1) + ":");
                notas = sc.nextDouble();
            }
            notas /= 4;//caluclar média
            vetorMedia[i] = notas;//colocar média no vetor
        }
        //imprimir média do aluno SE for maior ou igual a 7
        for (int i = 0; i < vetorMedia.length; i++) {
            if (vetorMedia[i]>= 7) {
                System.out.println("Média do Aluno"+(i+1)+"é "+vetorMedia[i] );
            }
        }
    }

    public void exemplo6() {
        int vetorNumeros[] = new int [5];
        for (int i = 0; i < vetorNumeros.length; i++) {
            System.out.println("Informe o "+(i+1)+"º nº:");
            vetorNumeros[i]=sc.nextInt();
        }
        int soma = 0;
        for (int i = 0; i < vetorNumeros.length; i++) {
            soma += vetorNumeros[i];
        }
        System.out.println("Soma = "+soma);
        int multi = 1;
        for (int i = 0; i < vetorNumeros.length; i++) {
            multi *= vetorNumeros[i];
        }
        System.out.println("Multipilcação = "+multi);
        System.out.println("os números são:");
        for (int i = 0; i < vetorNumeros.length; i++) {
            System.out.println((i+1)+" ºn = "+vetorNumeros[i] );
        }
    }
    public void exemplo7() {
        String pessoas[] = new String[5];
    }

}
