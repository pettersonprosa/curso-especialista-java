1) Refatore o código da classe `Calendario`, substuindo o _switch expression_ por uma lógica usando arrays, sem usar qualquer tipo de estrutura condicional, como `switch` e `if`.

```
public class Calendario {

    static String obterNomeMes(int numeroMes) {
        return switch (numeroMes) {
            case 1 -> "Janeiro";
            case 2 -> "Fevereiro";
            case 3 -> "Março";
            case 4 -> "Abril";
            case 5 -> "Maio";
            case 6 -> "Junho";
            case 7 -> "Julho";
            case 8 -> "Agosto";
            case 9 -> "Setembro";
            case 10 -> "Outubro";
            case 11 -> "Novembro";
            case 12 -> "Dezembro";
            default -> null;
        };
    }

    public static void main(String[] args) {
        String mes = Calendario.obterNomeMes(9);

        System.out.println(mes);
    }

}
```

2) Uma software house está desenvolvendo um software para gestão de restaurantes e você foi designado para finalizar a implementação da classe `Cardapio`.

Implemente os métodos, conforme as tarefas pendentes comentadas no código-fonte, usando o array de `ItemCardapio`. Depois, rode a classe `Principal` para fazer alguns testes.

```
public class ItemCardapio {

    String descricao;
    double preco;

}
```

```
public class Cardapio {

    ItemCardapio[] itens;

    void adicionarItem(ItemCardapio item) {
        // TODO implementar inclusão de item do cardápio
    }

    void removerItem(int indice) {
        // TODO implementar exclusão de item do cardápio da posição informada
    }

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
        // TODO implementar código para imprimir na console os itens
        //  do cardápio que estiverem entre o preço mínimo e máximo
    }

}
```

```
public class Principal {

    public static void main(String[] args) {
        Cardapio cardapio = new Cardapio();

        ItemCardapio item1 = new ItemCardapio();
        item1.descricao = "Rib Eye 500g";
        item1.preco = 95;

        ItemCardapio item2 = new ItemCardapio();
        item2.descricao = "Picanha 400g";
        item2.preco = 102.5;

        ItemCardapio item3 = new ItemCardapio();
        item3.descricao = "Batata frita 300g";
        item3.preco = 12;

        cardapio.adicionarItem(item1);
        cardapio.adicionarItem(item2);
        cardapio.adicionarItem(item3);

        cardapio.imprimirItensCardapio(80, 150);

        cardapio.removerItem(0);
        System.out.println("---");

        cardapio.imprimirItensCardapio(0, 150);
    }

}
```
