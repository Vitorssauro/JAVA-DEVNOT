package CalculadoraDescontos;

import java.util.Scanner;

public class CalculadoraDescontos{ 
    public void calcular20(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Informe o preço do produto: ");
        double precoProduto = sc.nextDouble();
        final int desconto20 = 20;
        double precoComDesconto = precoProduto-(precoProduto*desconto20/100);
        System.out.println ("O preço com desconto é de "+precoComDesconto+" Reais");
    }
    public void calcular30(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Informe o preço do produto: ");
        double precoProduto = sc.nextDouble();
        final int desconto30 = 30;
        double precoComDesconto = precoProduto-(precoProduto*desconto30/100);
        System.out.println ("O preço com desconto é de "+precoComDesconto+" Reais");
    }
}
