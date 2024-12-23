package com.github.ej.seguradora;

import com.github.ej.seguradora.modelo.Caminhao;
import com.github.ej.seguradora.modelo.CarroParticular;
import com.github.ej.seguradora.modelo.ImovelResidencial;
import com.github.ej.seguradora.servico.ServicoPropostaSeguro;

public class Principal {

    public static void main(String[] args) {
        ServicoPropostaSeguro servicoPropostaSeguro = new ServicoPropostaSeguro();

        CarroParticular carro = new CarroParticular("Mercedes A200", 152_000, 2019);
        Caminhao caminhao = new Caminhao("Volvo FH 540", 800_000, 2024, 9);
        ImovelResidencial imovel = new ImovelResidencial(5_700_000, 550);

        servicoPropostaSeguro.emitir(carro);
        servicoPropostaSeguro.emitir(caminhao);
        servicoPropostaSeguro.emitir(imovel);

    }
}