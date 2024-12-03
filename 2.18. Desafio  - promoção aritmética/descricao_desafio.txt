# Desafio 02.18 - promoção aritmética

Um programador Java iniciante está desenvolvendo um programa que deve calcular a idade média de 3 pessoas, porém o resultado deve ser com casas decimais.

Ele já tentou alterar o tipo da variável `idadeMedia` para `float`, mas mesmo assim o resultado não é o que ele espera (os decimais sempre ficam zerados).

Esse programador ficou sabendo que você está fazendo este curso e pediu a sua ajuda para resolver esse problema.

Altere o código para que o cálculo da idade média seja feito em ponto-flutuante.

```
public class CalculadoraIdadeMedia {

  public static void main(String[] args) {
    int idade1 = 30;
    int idade2 = 40;
    int idade3 = 60;

    int idadeMedia = (idade1 + idade2 + idade3) / 3;

    System.out.println("Idade média: " + idadeMedia);
  }

}
```
