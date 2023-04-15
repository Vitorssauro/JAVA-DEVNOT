package ExerciciosWhile;

import java.util.Scanner;

public class exercicios {
    Scanner sc = new Scanner(System.in);

    public void ex4() {
        // lendo vetor string com while
        // criar vetor de 10 letras
        String letras[] = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };
        // iterador ou repetidor - servirá como contagem
        int i = 0;
        int cont = 0; // contadorpara as consoantes
        while (i < letras.length) {
            if (letras[i] == "a" || letras[i] == "e" || letras[i] == "i" || letras[i] == "o"
                    || letras[i] == "u") {

            } else {

                cont++;
                System.out.println(letras[i] + " é consoante");
            }
            i++;
        }
        System.out.println("o número de consoantes é " + cont);
    }

    public void ex5() {
        int vetor[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int i = 0;
        int contPar = 0;
        int contImpar = 0;
        while (i < vetor.length) {
            if (vetor[i] % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }
            i++;
        }
        int vetorPar[] = new int[contPar];
        int vetorImpar[] = new int[contImpar];
        i = 0;
        contPar = 0;
        contImpar = 0;
        while (i < vetor.length) {
            if (vetor[i] % 2 == 0) {
                vetorPar[contPar] = vetor[i];
                contPar++;
            } else {
                vetorImpar[contImpar] = vetor[i];
                contImpar++;
            }
            i++;
        }
        System.out.println("Vetores Pares");
        i = 0;
        while (i < vetorPar.length) {
            System.out.println("vetor[" + i + "]=" + vetorPar[i]);
            i++;
        }
        
        System.out.println("Vetores Impares");
        i = 0;
        while (i < vetorPar.length) {
            System.out.println("vetor[" + i + "]=" + vetorPar[i]);
            i++;
        }
    }

    public void ex6() {
        
    }
}
