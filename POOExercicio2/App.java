package POOExercicio2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // vetor de objetos
        Agenda pessoas[] = new Agenda[10];
        // preencher o meu vetor/Array
        for (int i = 0; i < pessoas.length; i++) {
            // construtor de objetos
            pessoas[i] = new Agenda();
            // preencher atributos
            pessoas[i].setNome("Pessoa " + i);
            pessoas[i].setAltura(i);
            pessoas[i].setIdade(i + 18);
            System.out.println("---------");
            System.out.println("Nome: " + pessoas[i].getNome()
                    + " Idade: " + pessoas[i].getIdade()
                    + " Altura: " + pessoas[i].getAltura());
            System.out.println("------------");
            System.out.println(" ");
        }

        // buscador
        // enquanto não achar o nome da pessoa
        // cont e procure
        int cont = 0;
        System.out.println("Informe o nome que procura: ");
        String nomeDigitado = sc.nextLine();

        while(!nomeDigitado.equals(pessoas[cont].getNome())){
                cont++;
        }
        System.out.println(" Nome: " + pessoas[cont].getNome()
                + " Idade: " + pessoas[cont].getIdade()
                + " Altura: " + pessoas[cont].getAltura());

    }
}
