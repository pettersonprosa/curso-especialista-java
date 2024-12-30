package com.github.ej.agencia;

import java.util.List;

public class Principal {

    public static void main(String[] args) {
        CadastroPacoteViagem cadastro = new CadastroPacoteViagem();
        cadastro.adicionar("Istambul e Capadócia (20 noites)", 18_000);
        cadastro.adicionar("Neve em Bariloche (10 noites)", 11_000);
        cadastro.adicionar("Disney (10 noites)", 20_000);
//        cadastro.adicionar("Disney (10 noites)", 20_000);
        cadastro.adicionar("Natal Luz em Gramado (5 noites)", 8_500);

//        cadastro.removerPorDescricao("Disney (7 noites)");
//        cadastro.removerPorDescricao("Disney (10 noites)");

//        cadastro.ordenar();
//        cadastro.ordenarPorPrecoDecrescente();

//        PacoteViagem pacoteEncontrado = cadastro.buscarPorDescricao("Disney (7 noites)");
//        System.out.println(pacoteEncontrado);
//        PacoteViagem pacoteEncontrado2 = cadastro.buscarPorDescricao("Disney (10 noites)");
//        System.out.println("Pacote encontrado: " + pacoteEncontrado2);
//        System.out.println();

        imprimirPacotes(cadastro.obterTodos());
    }

    private static void imprimirPacotes(List<PacoteViagem> pacotes) {
        for (PacoteViagem pacote : pacotes) {
            System.out.println(pacote);
        }
    }

}
