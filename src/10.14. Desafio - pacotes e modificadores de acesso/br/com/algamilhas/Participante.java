package br.com.algamilhas;

import java.util.Objects;

public class Participante {

    private String nome;
    private int saldoDePontos;

    public Participante(String nome) {
        Objects.requireNonNull(nome, "Nome é obrigatório");
        this.nome = nome;
    }

    private Participante(String nome, int saldoDePontosInicial) {
        this(nome);

        if (saldoDePontosInicial < 0) {
            throw new IllegalArgumentException("Saldo inicial de pontos não pode ser negativo");
        }

        this.saldoDePontos = saldoDePontosInicial;
    }

    public void creditarPontos(int pontos) {
        this.saldoDePontos += pontos;
    }
}