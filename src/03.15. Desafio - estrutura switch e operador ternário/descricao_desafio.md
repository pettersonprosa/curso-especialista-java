# Desafio 03.15 - estrutura switch e operador ternário

Uma financeira contratou um programador para desenvolver um programa que calcula o custo total de empréstimos para seus clientes, porém o contrato foi cancelado e você foi chamado para concluir a programação do sistema.

O código-fonte abaixo (incompleto) foi repassado para você fazer seu trabalho:

```
import java.util.Scanner;

public class SimuladorEmprestimo {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Valor do empréstimo: ");
    double valorEmprestimo = entrada.nextDouble();

    System.out.print("Quantidade de parcelas: ");
    int quantidadeParcelas = entrada.nextInt();

    double taxaJuros = // switch expression aqui

    double tarifaFixa = // use operador ternário aqui
    double totalJuros = valorEmprestimo * (taxaJuros / 100 * quantidadeParcelas);
    double custoTotal = valorEmprestimo + tarifaFixa + totalJuros;

    System.out.printf("Tarifa fixa: R$%.2f%n", tarifaFixa);
    System.out.printf("Total de juros: R$%.2f%n", totalJuros);
    System.out.printf("Custo total: R$%.2f%n", custoTotal);
  }

}
```

O cliente também te informou que a taxa de juros da financeira depende da quantidade de parcelas:

-   1 ou 2 parcelas: 1,99% ao mês
-   3 parcelas: 2,99% ao mês
-   Outras quantidades de parcelas: 3,99% ao mês

Além disso, caso o valor do empréstimo seja maior ou igual a 100, uma tarifa fixa será cobrada no valor de R$1,50.
