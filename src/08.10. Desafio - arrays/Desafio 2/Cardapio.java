import java.util.Arrays;

public class Cardapio {

    ItemCardapio[] itens = new ItemCardapio[0];

    void adicionarItem(ItemCardapio item) {
        itens = Arrays.copyOf(itens, itens.length + 1);
        itens[itens.length - 1] = item;
    }

    void removerItem(int indice) {
        if (indiceEhValido(indice) && !cardapioEstaVazio()) {

            ItemCardapio[] itensAtualizado = Arrays.copyOf(itens, itens.length - 1);

            for (int i = indice; i < itensAtualizado.length; i++) {
                itensAtualizado[i] = itens[i + 1];
            }

            itens = itensAtualizado;

        } else {
            System.out.println("Item a ser removido não existe ou carrinho está vazio!");
        }

    }

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
        if (!cardapioEstaVazio()) {
            System.out.printf("Itens do cardápio entre R$%.2f a R$%.2f:%n", precoMinimo, precoMaximo);

            for (ItemCardapio item : itens) {
                if (item.preco >= precoMinimo && item.preco <= precoMaximo) {
                    System.out.println("Item: " + item.descricao);
                }
            }
        }

    }

    boolean indiceEhValido(int indice) {
        return !(indice < 0 || indice > itens.length - 1);
    }

    boolean cardapioEstaVazio() {
        return itens.length == 0;
    }

}