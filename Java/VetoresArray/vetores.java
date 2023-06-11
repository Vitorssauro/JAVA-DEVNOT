package VetoresArray;

import java.util.Scanner;

public class vetores {
    Scanner sc=new Scanner(System.in);
    public void exemplo1() {

        // Criando Vetor AAAÉÉÉÉ!!!
        double valores[] = new double[]{10.5,20.7,30.6,40.4};
        System.out.println("1 º Posição- Índice[0]: "+valores[0]);
        System.out.println("2 º Posição- Índice[1]: "+valores[1]);
        System.out.println("3 º Posição- Índice[2]: "+valores[2]);
        System.out.println("4 º Posição- Índice[3]: "+valores[3]);

        // Mudando valores de uma posição definida.
        valores[0] = 15.6; //Mudando o valor do Índice [0].
        System.out.println("1 º Posição- Índice[0]: "+valores[0]);
    }

    public void exemplo2() {
        // Criando vetor.
        int valoresInt[]= new int [5];
        System.out.println("Digite 5 Nºs inteiros!");
        valoresInt[0]=sc.nextInt();
        valoresInt[1]=sc.nextInt();
        valoresInt[2]=sc.nextInt();
        valoresInt[3]=sc.nextInt();
        valoresInt[4]=sc.nextInt();
        System.out.println("1º Posição- Índice[0]: "+valoresInt[0]);
        System.out.println("2º Posição- Índice[1]: "+valoresInt[1]);
        System.out.println("3º Posição- Índice[2]: "+valoresInt[2]);
        System.out.println("4º Posição- Índice[3]: "+valoresInt[3]);
        System.out.println("5º Posição- Índice[4]: "+valoresInt[4]);
    }
    public void ex2() {
        double numerosReais[] = new double[10];
        System.out.println("Digite 10 Nºs Reais!");
        numerosReais[9]=sc.nextDouble();
        numerosReais[8]=sc.nextDouble();
        numerosReais[7]=sc.nextDouble();
        numerosReais[6]=sc.nextDouble();
        numerosReais[5]=sc.nextDouble();
        numerosReais[4]=sc.nextDouble();
        numerosReais[3]=sc.nextDouble();
        numerosReais[2]=sc.nextDouble();
        numerosReais[1]=sc.nextDouble();
        numerosReais[0]=sc.nextDouble();
        System.out.println("1º Posição: "+numerosReais[0]);
        System.out.println("2º Posição: "+numerosReais[1]);
        System.out.println("3º Posição: "+numerosReais[2]);
        System.out.println("4º Posição: "+numerosReais[3]);
        System.out.println("5º Posição: "+numerosReais[4]);
        System.out.println("6º Posição: "+numerosReais[5]);
        System.out.println("7º Posição: "+numerosReais[6]);
        System.out.println("8º Posição: "+numerosReais[7]);
        System.out.println("9º Posição: "+numerosReais[8]);
        System.out.println("10º Posição: "+numerosReais[9]);
    }
    public void ex3() {
        double notas[]=new double[4];
        System.out.println("Digite as 4 notas do Aluno!");
        notas[0]=sc.nextDouble();
        notas[1]=sc.nextDouble();
        notas[2]=sc.nextDouble();
        notas[3]=sc.nextDouble();
        double media = (notas[0]+notas[1]+notas[2]+notas[3])/4;
        System.out.println("A média do aluno é "+media);
    }
}
