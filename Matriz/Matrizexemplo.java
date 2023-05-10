package Matriz;

import java.util.Random;
import java.util.Scanner;

public class Matrizexemplo {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void exemplo1() {
        // gerar preemcher, imprimir e manipular matrizes
        // criar uma matriz 10x9
        int matriz[][] = new int[10][9]; // bidimensional 10x9
        // preencher matriz
        for (int i = 0; i < 10; i++) {// 1º dimensão //linha
            for (int j = 0; j < 9; j++) {// 2º dimensão //coluna
                // System.out.print("matriz["+i+"]["+j+"]=");
                matriz[i][j] = rd.nextInt(10);
            }
        }
        // imprimir elemento por elemento da minha matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("matriz[" + i + "][" + j + "]="
                        + matriz[i][j]);
            }
        }
        // imprimir a matriz em formato linha x coluna
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("|");
        }
        // somar todos os elementos da 4ª linha
        System.out.println("++++++++++++++++++++++++++++++++");
        int somaLinha = 0;
        for (int i = 0; i < 9; i++) {
            somaLinha += matriz[3][i];
            if (i < 7) {
                System.out.print(matriz[3][i] + " + ");
            } else {
                System.out.print(matriz[3][i]);
            }
        }
        System.out.println(" = " + somaLinha);

        // somar todos os elementos da quarta coluna
        System.out.println("++++++++++++++++++++++++++++++++");
        int somaColuna = 0;
        for (int i = 0; i < 10; i++) {
            somaColuna += matriz[i][3];
            if (i < 7) {
                System.out.print(matriz[i][3] + " + ");
            } else {
                System.out.print(matriz[i][3]);
            }
        }
        System.out.print(" = " + somaColuna);
    }

    public void exercicio1() {
        int matriz[][] = new int[5][5];
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("|");
        }
    }

    public void exercicio2() {
        int somaDiagonal = 0;
        int matriz[][] = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = rd.nextInt(6);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("-----------");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[j][i] + " ");
                if (i == j) {
                    somaDiagonal += matriz[j][i];
                }
            }
            System.out.println("|");
        }
        System.out.println("A soma da diagonal é = " + somaDiagonal);
    }

    // LISTA EXTRA

    public void extra1() {
        
    }

}
