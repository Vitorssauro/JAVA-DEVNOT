package EstruturaSwitchCase;

import java.util.Scanner;

public class SwitchCase {
    Scanner sc = new Scanner(System.in);

    public void letra() {
        System.out.println("Digite uma letra:");
        String letra = sc.nextLine();
        switch (letra) {
            case "a":
                System.out.println(letra + " é vogal!");
                break;
            case "e":
                System.out.println(letra + " é vogal!");
                break;
            case "i":
                System.out.println(letra + " é vogal!");
                break;
            case "o":
                System.out.println(letra + " é vogal!");
                break;
            case "u":
                System.out.println(letra + " é vogal!");
                break;

            default:
                System.out.println(letra + " é uma consoante");
                break;
        }

    }

    public void mes() {
        System.out.println("Informe o número mês:");
        int mes = sc.nextInt();
        switch (mes) {
            case 1:
                System.out.println("o mês " + mes + " é Janeiro!");
                break;
            case 2:
                System.out.println("o mês " + mes + " é Fevereiro!");
                break;
            case 3:
                System.out.println("o mês " + mes + " é Março!");
                break;
            case 4:
                System.out.println("o mês " + mes + " é Abril!");
                break;
            case 5:
                System.out.println("o mês " + mes + " é Maio!");
                break;
            case 6:
                System.out.println("o mês " + mes + " é Junho!");
                break;
            case 7:
                System.out.println("o mês " + mes + " é Julho!");
                break;
            case 8:
                System.out.println("o mês " + mes + " é Agosto!");
                break;
            case 9:
                System.out.println("o mês " + mes + " é Setembro!");
                break;
            case 10:
                System.out.println("o mês " + mes + " é Outubro!");
                break;
            case 11:
                System.out.println("o mês " + mes + " é Novembro!");
                break;
            case 12:
                System.out.println("o mês " + mes + " é Dezembro!");
                break;

            default:
                System.out.println("Por favor, inserir uma valor de 1 a 12.");
                break;
        }
    }
}
