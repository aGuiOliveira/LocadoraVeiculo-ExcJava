package org.example;

public class Main {
    public static void main(String[] args) {
        // Criando alguns veículos
        Veiculo carroEconomico = new Veiculo("Fiat Mobi", 80.0);
        Veiculo carroIntermediario = new Veiculo("VW Gol", 120.0);
        Veiculo carroLuxo = new Veiculo("BMW 320i", 350.0);

        // Exemplo de aluguel
        int diasAluguel = 10;
        System.out.println("Aluguel de " + carroIntermediario.getModelo() + " por " + diasAluguel + " dias:");
        System.out.println("Custo total: R$" + carroIntermediario.calcularCusto(diasAluguel));
        System.out.println("Custo com desconto progressivo: R$" + carroIntermediario.calcularDescontoProgressivo(diasAluguel));

        // Exemplo de multa por atraso
        int diasAtraso = 2;
        System.out.println("\nMulta por atraso de " + diasAtraso + " dias no " + carroLuxo.getModelo() + ":");
        System.out.println("Valor da multa: R$" + carroLuxo.calcularMulta(diasAtraso));

        // Testando cenário com erro
        try {
            Veiculo veiculoInvalido = new Veiculo("Carro Inválido", -100.0);
        } catch (IllegalArgumentException e) {
            System.out.println("\nErro ao criar veículo: " + e.getMessage());
        }
    }
}