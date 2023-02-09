package CalculadroaCustoViagem;

/**
 * CalcularViagem
 */
public class CalcularViagem {

    public static void main(String[] args) {
        int distanciaPercorrida = 150;
        int valorGasolina = 5;
        int consumoCarro = 10;
        float consumoGasolina = distanciaPercorrida/consumoCarro;
        float valorTotal = consumoGasolina*valorGasolina;
        System.out.println("Gasolina Consumida na viagem é de " +consumoGasolina+ "L.");
        System.out.println("Gasto total da viagem é de R$" +valorTotal);

    }
}