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

         //inicio do cadastro

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
         
      
      switch () {
         case value:
            
            break;
      
         default:
            break;
      }
      }

      //pessoa jurídica cadastrada

      

      while (juridico) {
         
      
      switch () {
         case value:
            
            break;
      
         default:
            break;
   }
}
