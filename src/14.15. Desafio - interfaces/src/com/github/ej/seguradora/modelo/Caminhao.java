package com.github.ej.seguradora.modelo;

public class Caminhao extends VeiculoAutomotor {

    private int quantidadeEixos;

    public Caminhao(String modelo, double valorMercado, int anoFabricacao, int quantidadeEixos) {
        super(modelo, valorMercado, anoFabricacao);
        this.quantidadeEixos = quantidadeEixos;
    }

    public int getQuantidadeEixos() {
        return quantidadeEixos;
    }

    public void setQuantidadeEixos(int quantidadeEixos) {
        this.quantidadeEixos = quantidadeEixos;
    }

    @Override
    public double calcularValorPremio() {
        double valorPorEixo = (double) 50 * getQuantidadeEixos();
        double valorPremio = getValorMercado() * 0.02 + valorPorEixo;

        return valorPremio;
    }

    @Override
    public String descrever() {
        String textoDescricao = String.format("Caminhão %s ano %d, %d eixo(s) avaliado em R$%.2f ", getModelo(),
            getAnoFabricacao(), getQuantidadeEixos(), getValorMercado());
        return textoDescricao;
    }
}
