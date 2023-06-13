package ProjetoJava1SEM;

import java.util.Scanner;

import ProjetoJava1SEM.Conta.Conta;
import ProjetoJava1SEM.Conta.PessoaFisica;

public class App {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      PessoaFisica pessoa1 = new PessoaFisica(null, 0);
      boolean cadastro = true;
      boolean fisico = false;
      boolean juridico = false;

      while (cadastro) {

         // inicio do cadastro

         System.out.println(
               "*Criação de conta*\nSelecione o tipo de conta:\n1 - Pessoa Física\n2 - Pessoa Jurídica\n3 - Cancelar");
         int selecao = sc.nextInt();

         if (selecao == 1) {
            pessoa1.CadFisico();
            fisico = true;
            cadastro = false;
         } else if (selecao == 2) {
            System.out.println("não implementado");
         } else if (selecao == 3) {
            cadastro = false;
         }

         else {
            System.out.println("Por favor selecione uma opção válida");
         }

      }

      // pessoa fisica cadastrada
      while (fisico) {

         System.out.println("\nMenu de ações\n1 - verificar saldo\n2 - Saque\n3 - Depósito\n4 - Empréstimo\n5 - Sair");
         int acao = sc.nextInt();

         switch (acao) {
            case 1:
               System.out.println("Seu saldo é de: " + pessoa1.verificar());
               break;
            case 2:

               break;
            case 3:

               break;
            case 4:

               break;
            case 5:
               fisico = false;
               break;

            default:
               break;
         }
      }

      // pessoa jurídica cadastrada

      while (juridico) {
         int acao = sc.nextInt();

         switch (acao) {
            case 1:

               break;

            default:
               break;
         }
      }
   }
}