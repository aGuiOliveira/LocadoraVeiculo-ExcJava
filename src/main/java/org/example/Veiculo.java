package org.example;

public class Veiculo {
    private String modelo;
    private double valorDiaria;

    public Veiculo(String modelo, double valorDiaria) {
        if (valorDiaria < 0) {
            throw new IllegalArgumentException("O valor da diária não pode ser negativo");
        }
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
    }

    public double calcularCusto(int dias) {
        if (dias <= 0) {
            throw new IllegalArgumentException("A quantidade de dias deve ser maior que zero");
        }

        double custoTotal = dias * valorDiaria;
        return desconto(dias, custoTotal);
    }

    private double desconto(int dias, double custoTotal) {
        if (dias >= 7) {
            return custoTotal * 0.9; // 10% de desconto
        }
        return custoTotal;
    }

    public double calcularMulta(int diasAtraso) {
        if (diasAtraso < 0) {
            throw new IllegalArgumentException("Dias de atraso não podem ser negativos");
        }
        return diasAtraso * valorDiaria * 1.5; // Multa de 150% da diária por dia atrasado
    }

    public double calcularDescontoProgressivo(int dias) {
        if (dias <= 0) {
            throw new IllegalArgumentException("A quantidade de dias deve ser maior que zero");
        }

        double desconto = 0;
        if (dias >= 14) {
            desconto = 0.2; // 20% de desconto para 14 dias ou mais
        } else if (dias >= 7) {
            desconto = 0.1; // 10% de desconto para 7 dias ou mais
        }

        return dias * valorDiaria * (1 - desconto);
    }

    // Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        if (valorDiaria < 0) {
            throw new IllegalArgumentException("O valor da diária não pode ser negativo");
        }
        this.valorDiaria = valorDiaria;
    }
}
