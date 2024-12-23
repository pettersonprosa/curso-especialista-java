package com.github.ej.seguradora.modelo;

public class CarroParticular extends VeiculoAutomotor {

    public CarroParticular(String modelo, double valorMercado, int anoFabricacao) {
        super(modelo, valorMercado, anoFabricacao);
    }

    @Override
    public double calcularValorPremio() {
        double valorPremio = getValorMercado() * 0.04;

        if (getAnoFabricacao() < 2000) {
            valorPremio *= 1.05;
        }

        return valorPremio;
    }

    @Override
    public String descrever() {
        String textoDescricao = String.format("Carro particular %s ano %d, avaliado em R$%.2f ", getModelo()
            , getAnoFabricacao(), getValorMercado());
        return textoDescricao;
    }
}
