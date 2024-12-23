package com.github.ej.seguradora.servico;

import com.github.ej.seguradora.modelo.BemSeguravel;

public class ServicoPropostaSeguro {

    public void emitir(BemSeguravel bem) {
        System.out.println("-----------------\nProposta de seguro\n-----------------");
        System.out.println(bem.descrever());
        System.out.printf("Prêmio: R$%.2f%n", bem.calcularValorPremio());
    }
}
