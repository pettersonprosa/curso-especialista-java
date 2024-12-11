Seu chefe, que também adora programar, pediu sua ajuda para analisar o código que ele desenvolveu usando classes wrapper.

O código parece funcionar, mas ele gostaria de uma "consultoria" sua para saber se está usando as melhores práticas de programação e se no futuro não poderia ter algum problema.

Analise o código do seu chefe:

```
public class Televisor {

    Integer canal = 130;
    Integer volume = 20;

    void mudarCanal(Integer novoCanal) {
        if (canal == novoCanal) {
            System.out.println("Novo canal é também o canal atual.");
        } else {
            canal = novoCanal;
            System.out.println("Canal alterado para " + canal);
        }
    }

    void mudarVolume(Integer novoVolume) {
        if (novoVolume == volume) {
            System.out.println("Novo volume é também o volume atual.");
        } else {
            volume = Integer.valueOf(novoVolume.byteValue());
            System.out.println("Volume alterado para " + volume);
        }
    }

}
```

```
public class Principal {

    public static void main(String[] args) {
        Televisor tv = new Televisor();

        // Não deveria mudar o volume e canal
        tv.mudarVolume(20);
        tv.mudarCanal(130);

        // Deveria mudar o volume e canal
        tv.mudarVolume(300);
        tv.mudarCanal(10);
    }

}
```

O que você aprendeu neste curso que poderia usar para aproveitar essa oportunidade de mostrar para seu chefe que você realmente domina as profundezas do Java?

Execute o código em seu computador e faça os ajustes que você achar necessário.

