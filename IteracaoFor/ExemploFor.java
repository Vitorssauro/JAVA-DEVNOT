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
        // criando vetor com 10 posições
        double vetorMedia[] = new double[10];
        // preencher vetor e medias
        for (int i = 0; i < vetorMedia.length; i++) {
            double notas = 0;
            for (int j = 0; j < 4; j++) {
                System.out.println("Nota" + (j + 1) + "Aluno" + (i + 1) + ":");
                notas = sc.nextDouble();
            }
            notas /= 4;// caluclar média
            vetorMedia[i] = notas;// colocar média no vetor
        }
        // imprimir média do aluno SE for maior ou igual a 7
        for (int i = 0; i < vetorMedia.length; i++) {
            if (vetorMedia[i] >= 7) {
                System.out.println("Média do Aluno" + (i + 1) + "é " + vetorMedia[i]);
            }
        }
    }

    public void exemplo6() {
        int vetorNumeros[] = new int[5];
        for (int i = 0; i < vetorNumeros.length; i++) {
            System.out.println("Informe o " + (i + 1) + "º nº:");
            vetorNumeros[i] = sc.nextInt();
        }
        int soma = 0;
        for (int i = 0; i < vetorNumeros.length; i++) {
            soma += vetorNumeros[i];
        }
        System.out.println("Soma = " + soma);
        int multi = 1;
        for (int i = 0; i < vetorNumeros.length; i++) {
            multi *= vetorNumeros[i];
        }
        System.out.println("Multipilcação = " + multi);
        System.out.println("os números são:");
        for (int i = 0; i < vetorNumeros.length; i++) {
            System.out.println((i + 1) + " ºn = " + vetorNumeros[i]);
        }
    }

    public void exemplo7() {
        String pessoas[] = new String[5];
        int idade = 0;
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Informe o nome da " + (i + 1) + "ª pessoa");

            for (int j = 0; j < 1; j++) {
                System.out.println("Digite sua idade:");
                idade = sc.nextInt();
            }
        }

    }

    public void exercicio4() {
        // char letrasC[] = new char []{'a','b','c','d','e','f','g','h','i','j'};
        String lestras[] = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };
        int cont = 0;
        for (int i = 0; i < lestras.length; i++) {
            if (lestras[i] != "a" && lestras[i] != "e" && lestras[i] != "i" && lestras[i] != "o" && lestras[i] != "u") {
                System.out.println(lestras[i] + "é consoante");
                cont++;
            }
        }
        System.out.println("O nº de consoantes é " + cont);
    }

    public void exercicio4Ex() {
        System.out.println("Digite uma palavra:");
        String palavra = sc.next();
        palavra = palavra.toLowerCase();
        int cont = 0;
        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);

            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                System.out.println(c + " é consoante");
                cont++;
            }
        }
        System.out.print("O nº de consoantes é " + cont);
    }

    public void exercicio5() {
        // criar vetor para os numeros
        int numeros[] = new int[20];
        int contPar=0; //contador de nmrs pares
        int contImpar=0; //contador de nmrs impares
        //Preencher o vetor de numeros e determinar o nmr de imapres e pares
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("informe o nº ["+i+"]=");
            numeros[i]=sc.nextInt();
            if (numeros[i]%2==0) {
                contPar++;
            } else {
                contImpar++;
            }
        }
        //apos a contagem de pares e impares criar seus vetores
        int nPar[]= new int[contPar];
        int nImpar[] = new int[contImpar];
        //distribuir os nº de vetores para par e impar
        contPar = 0;
        contImpar = 0;
        for (int i = 0; i < nPar.length; i++) {
            
        }
    }

    public void exercico7 () {
     //criar vetor
        int vetor[]=new int[]{1,2,3,5,7};
        //percorrer o vetor e realizar as operações(+ e *)
        int soma = 0;//acumular a soma dos elementos do vetor
        int mult = 1;//acumular a multiplicação dos elementos do vetor
        for (int i = 0; i < vetor.length; i++) {
            soma+=vetor[i]; //acumula a soma
            mult*=vetor[i]; //acumula a multiplicação
        }
        System.out.println("O valor da Soma do vetor é "+soma);
        System.out.println("O valor da Multiplicação do vetor é "+mult);
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("vetor["+i+"]="+vetor[i]);
        }
        }

    public void exercicio8() {
        // ler idade e altura de 5 pessoas
        String nome[] = new String[5];
        int idade[] = new int[5];
        double altura[] = new double[5];
        for (int i = 0; i < altura.length; i++) {
            System.out.print("Informe o Nome :");
            nome[i]=sc.next();
            System.out.print("Informe a Idade :");
            idade[i]=sc.nextInt(i);
            System.out.print("Informe a altura: ");
            altura[i]=sc.nextDouble();
            System.out.println("======================");
         }
        //imprimir na ordem inversa
        for (int i = 4; i >=0; i--) {
            System.out.println("Nome: "+nome[i]);
            System.out.println("Idade: "+idade[i]);
            System.out.println("Altura: "+altura[i]);
            System.out.println("+++++++++++++++++++++++");
        }
        }
    public void exercicio9() {
        //soma dos quadrados dos elementos do vetor
        int vetor[]=new int[]{1,2,3,4,5,6,7,8,9,10};
        int soma=0;
        for (int i = 0; i < vetor.length; i++) {
            soma+=vetor[i]*vetor[i];
        }
        System.out.println("a Soma dos Quadrados é "+soma);
    }

}
