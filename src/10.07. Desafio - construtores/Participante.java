import java.util.Objects;

public class Participante {

    String nome;
    int saldoDePontos;

    Participante(String nome) {
        Objects.requireNonNull(nome, "Nome é obrigatório");
        this.nome = nome;
    }

    Participante(String nome, int saldoDePontosInicial) {
        this(nome);

        if (saldoDePontosInicial < 0) {
            throw new IllegalArgumentException("Saldo inicial de pontos não pode ser negativo");
        }

        this.saldoDePontos = saldoDePontosInicial;
    }
}
