package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VeiculoTest {

    @Test
    public void testCalcularCustoDiariaPositiva() {
        Veiculo veiculo = new Veiculo("Fiat Uno", 100.0);
        assertEquals(300.0, veiculo.calcularCusto(3), 0.001);
    }

    @Test
    public void testCalcularCustoComDesconto7Dias() {
        Veiculo veiculo = new Veiculo("Ford Ka", 100.0);
        assertEquals(630.0, veiculo.calcularCusto(7), 0.001); // 700 - 10%
    }

    @Test
    public void testCalcularCustoDiasZero() {
        Veiculo veiculo = new Veiculo("VW Gol", 80.0);
        assertThrows(IllegalArgumentException.class, () -> veiculo.calcularCusto(0));
    }

    @Test
    public void testCalcularCustoDiariaNegativa() {
        assertThrows(IllegalArgumentException.class, () -> new Veiculo("Chevrolet Onix", -50.0));
    }

    @Test
    public void testCalcularMultaAtraso() {
        Veiculo veiculo = new Veiculo("Hyundai HB20", 120.0);
        assertEquals(180.0, veiculo.calcularMulta(1), 0.001); // 120 * 1.5
        assertEquals(360.0, veiculo.calcularMulta(2), 0.001);
    }

    @Test
    public void testCalcularMultaAtrasoNegativo() {
        Veiculo veiculo = new Veiculo("Renault Kwid", 90.0);
        assertThrows(IllegalArgumentException.class, () -> veiculo.calcularMulta(-1));
    }

    @Test
    public void testDescontoProgressivo() {
        Veiculo veiculo = new Veiculo("Toyota Corolla", 200.0);

        // Sem desconto (menos de 7 dias)
        assertEquals(600.0, veiculo.calcularDescontoProgressivo(3), 0.001);

        // 10% de desconto (7-13 dias)
        assertEquals(1260.0, veiculo.calcularDescontoProgressivo(7), 0.001); // 1400 - 10%

        // 20% de desconto (14+ dias)
        assertEquals(2240.0, veiculo.calcularDescontoProgressivo(14), 0.001); // 2800 - 20%
    }

    @Test
    public void testSetValorDiariaNegativo() {
        Veiculo veiculo = new Veiculo("Honda Civic", 150.0);
        assertThrows(IllegalArgumentException.class, () -> veiculo.setValorDiaria(-100.0));
    }
}
