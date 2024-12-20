package com.github.ej.impostos;

public class GestorDeImpostos {

    private double valorTotalImpostos;

    public void adicionar(Pessoa pessoa) {
        double impostos = pessoa.calcularImpostos();
        this.valorTotalImpostos = getValorTotalImpostos() + impostos;
        System.out.printf("Impostos devidos de %s: %.2f%n", pessoa.getNome(), impostos);
    }

    public double getValorTotalImpostos() {
        return valorTotalImpostos;
    }
}
