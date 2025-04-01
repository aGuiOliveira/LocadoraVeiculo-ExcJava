# Locadora de Veículos - Sistema Básico

Este projeto implementa um sistema básico para uma locadora de veículos, com foco no cálculo de custos de aluguel, descontos e multas.

## Funcionalidades

- Cálculo do custo de aluguel com base na quantidade de dias
- Aplicação de descontos para aluguéis de longa duração
- Cálculo de multas por devolução atrasada
- Descontos progressivos para aluguéis mais longos
- Validação de entrada de dados

## Como usar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/locadora-veiculos.git
   ```

2. Compile e execute o projeto:
   ```bash
   javac *.java
   java Main
   ```

3. Para executar os testes:
   ```bash
   javac -cp .:junit-platform-console-standalone.jar *.java
   java -jar junit-platform-console-standalone.jar --class-path . --scan-class-path
   ```

## Classes Principais

- `Veiculo`: Representa um veículo disponível para aluguel
- `VeiculoTest`: Contém os testes unitários para a classe Veiculo
- `Main`: Classe principal com exemplo de uso

## Requisitos

- Java 8 ou superior
- JUnit 5 para testes

## Autor

Guilherme Oliveira Santana de Almeida

## Licença

Este projeto está licenciado sob a licença MIT.
```

## Observações

1. Certifique-se de ter o JUnit 5 configurado no seu projeto para executar os testes.
2. O código inclui tratamento de erros para valores inválidos (como diárias negativas ou zero dias de aluguel).
3. Foram implementados métodos adicionais como solicitado (cálculo de multas e descontos progressivos).
4. Os testes cobrem cenários normais e extremos (valores negativos, zero dias, etc.).

Para usar este código, copie cada classe para seu próprio arquivo .java e certifique-se de ter as dependências do JUnit configuradas corretamente.
