package AtividadeFormativa1905;

import java.util.Random;
import java.util.Scanner;

import javax.lang.model.util.Elements.Origin;

public class Exercicios {
    Random rd = new Random();
    Scanner sc = new Scanner(System.in);

    public void ex1() {
        int linha = 0;
        int coluna = 0;
        System.out.println("Digite o número de LINHAS da Mariz");
        linha = sc.nextInt();
        System.out.println("Digite o número de COLUNAS da Mariz");
        coluna = sc.nextInt();
        int matriz[][] = new int[linha][coluna];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = rd.nextInt(9);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("|");
        }

        System.out.println("++++++++++++++++++++++++++++++++");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i > j) {
                    matriz[i][j] = 1;
                } else if (i == j) {
                    matriz[i][j] = 0;
                } else {
                    matriz[i][j] = 2;
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("|");
        }
    }

    public void ex2() {
        int numero = rd.nextInt(1000);
        int tentativa = 0;
        System.out.println("ADIVINHE O NÚMERO!! YAHOW!!!!!!");
        int palpite = sc.nextInt();
        if (palpite != numero) {
            while (numero != palpite) {
                tentativa++;
                if (palpite > numero) {
                    System.out.println("Número muito ALTO!!");
                } else {
                    System.out.println("Número muito BAIXO!!");
                }
                System.out.println("Foi sua "+tentativa+"º tentativa");
                System.out.println("Tenta de novo :(");
                palpite = sc.nextInt();
            }
            System.out.println("CERTÔ :)! Você acertou na "+(tentativa+1)+"º tentativa" );

        } else {
            System.out.println("CERTÔ DE PRIMEIRA MALUCO!! O_O");
        }
    }

    public void ex3() {
        int contPar = 0;
        int contImpar = 0;
        int tamanho = rd.nextInt(901)+100;

        int vetor[] = new int[tamanho];
        for (int i = 0; i < vetor.length; i++) {        //Preencher
            vetor [i] = rd.nextInt(100)+1;
            System.err.println("["+i+"] = "+vetor[i]);
        }

        System.out.println("");
        System.out.println("NUMEROS PARES");
        System.out.println("");

        for (int i = 0; i < vetor.length; i++) {        //os pares

            if (vetor[i] % 2 == 0 ) {
                System.out.println("["+i+"] = "+vetor[i]);
            }
        }
        
        System.out.println("");
        System.out.println("NUMEROS IMPARES");
        System.out.println("");

        for (int i = 0; i < vetor.length; i++) {        //os impares

            if (vetor[i] % 2 == 1 ) {
                System.out.println("["+i+"] = "+vetor[i]);
            }
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0 && i % 2 == 1) {
                contPar++;
            } 
            if (vetor[i] % 2 == 1 && i % 2 == 0) {
                contImpar++;
            }
        }
        System.out.println("");
        System.out.println(contPar+" números pares existem nas posições ímpares do vetor");
        System.out.println("");
        System.out.println(contImpar+" números ímpares existem nas posições pares do vetor");

    }
}
