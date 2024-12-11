public class Televisor {

    Integer canal = 130;
    Integer volume = 20;

    void mudarCanal(Integer novoCanal) {
        if (canal.equals(novoCanal)) { // Compara o tipo e o valor da variável
            System.out.println("Novo canal é também o canal atual.");
        } else {
            canal = novoCanal;
            System.out.println("Canal alterado para " + canal);
        }
    }

    void mudarVolume(Integer novoVolume) {
        if (novoVolume.equals(volume)) { // Compara o tipo e o valor da variável
            System.out.println("Novo volume é também o volume atual.");
        } else {
            volume = Integer.valueOf(novoVolume.byteValue());
            System.out.println("Volume alterado para " + volume);
        }
    }

}