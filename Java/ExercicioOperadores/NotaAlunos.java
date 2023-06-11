package ExercicioOperadores;

import java.util.Scanner;

public class NotaAlunos {
    Scanner sc = new Scanner(System.in);
    public void notaFrequencia() {
        System.out.println("Informe a Nota 1 do Aluno");
        int nota1 = sc.nextInt();
        System.out.println("Informe a Nota 2 do Aluno");
        int nota2 = sc.nextInt();
        System.out.println("Informe a Frequênciado Aluno");
        int freq = sc.nextInt();
        double media = (nota1+nota2)/2;
        System.out.println("Média do aluno é:" +media);
        boolean aprovadoMedia = media >= 50;
        System.out.println("Média acima de 50? " +aprovadoMedia);
        boolean aprovadoFreq = freq >= 75;
        System.out.println("Frequência do aluno igual ou maior 75? " +aprovadoFreq);
        boolean aprovado = aprovadoFreq && aprovadoMedia;
        System.out.println("Aluno foi arpovado? " +aprovado);
        if (aprovado==true) {

            System.out.println("Boa lk");

            if(aprovado==false);
            
        } else {
            
        }
    }

}
