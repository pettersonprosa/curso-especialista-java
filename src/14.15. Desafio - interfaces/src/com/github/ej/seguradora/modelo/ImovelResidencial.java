package com.github.ej.seguradora.modelo;

public class ImovelResidencial implements BemSeguravel{

    private double valorMercado;
    private int areaConstruida;

    public ImovelResidencial(double valorMercado, int areaConstruida) {
        this.valorMercado = valorMercado;
        this.areaConstruida = areaConstruida;
    }

    public double getValorMercado() {
        return valorMercado;
    }

    public void setValorMercado(double valorMercado) {
        this.valorMercado = valorMercado;
    }

    public int getAreaConstruida() {
        return areaConstruida;
    }

    public void setAreaConstruida(int areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    @Override
    public double calcularValorPremio() {
        double valorPorAreaConstruida = 0.3 * getAreaConstruida();
        double valorPremio = getValorMercado() * 0.001 + valorPorAreaConstruida;

        return valorPremio;
    }

    @Override
    public String descrever() {
        String textoDescricao = String.format("Imóvel residencial com %dm2 de área construída, avaliada em " +
            "R$%.2f", getAreaConstruida(), getValorMercado());
        return textoDescricao;
    }
}
