package EstruturaDecisaoIf;

import java.util.Scanner;

public class EstruturaDecisaoIf {
    Scanner sc = new Scanner(System.in);

    public void decisaoIf() {

        System.out.println("Informe o valor do produto?");
        double precoProduto = sc.nextDouble();
        // boolean produtoAltoValor = precoProduto >= 100;
        double percentualDesconto = 0.0;

        if (precoProduto >= 200 && precoProduto < 300) { // Estrutura de decisao if
            // Desconto para produtos de alto valor.
            percentualDesconto = 10.0;
        }
        if (precoProduto >= 100 && precoProduto < 200) { // Estrutura de decisao if
            // Desconto para produtos de alto valor.
            percentualDesconto = 5.0;
        }
        if (precoProduto >= 300) { // Estrutura de decisao if
            // Desconto para produtos de alto valor.
            percentualDesconto = 15.0;
            // Regra de tres
            double desconto = (precoProduto * percentualDesconto) / 100;
            double precoComDesconto = precoProduto - desconto;
            System.out.println("O produto sairá por R$" + precoComDesconto);
        }
    }
    public void decisaoIfElse() {
        System.out.println("digite o preço do Protduto");
        double precoProduto=sc.nextDouble();
        double percentualDesconto=0.0;
        if (precoProduto<100) { 
            percentualDesconto=0.0;
        } else if(precoProduto>=100 && precoProduto<200){
            percentualDesconto=5.0;
        } else if(precoProduto>=200 && precoProduto<300){
            percentualDesconto=10.0;
        } else {
            percentualDesconto=15.0;
        }
        // Regra de tres
        double desconto = (precoProduto * percentualDesconto) / 100;
        double precoComDesconto = precoProduto - desconto;
        System.out.println("O produto sairá por R$" + precoComDesconto);
    }
}