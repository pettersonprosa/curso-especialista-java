package com.github.ej.agencia;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CadastroPacoteViagem {

    List<PacoteViagem> pacotesViagem = new LinkedList<>();

    public void adicionar(String descricao, double precoDiaria) {
        PacoteViagem novoPacoteViagem = new PacoteViagem(descricao, precoDiaria);

        if (pacotesViagem.contains(novoPacoteViagem)) {
            throw new PacoteViagemDuplicadoException("Pacote já existente na lista");
        }
        pacotesViagem.add(novoPacoteViagem);
    }

    public List<PacoteViagem> obterTodos() {
        return pacotesViagem;
    }

    public void ordenar() {
        Collections.sort(pacotesViagem);
    }

    public void ordenarPorPrecoDecrescente() {
        pacotesViagem.sort(new PrecoPacoteViagemComparator());
    }

    public void removerPorDescricao(String descricao) {
        PacoteViagem pacoteRemover = buscarPorDescricao(descricao);
        pacotesViagem.remove(pacoteRemover);
    }

    public PacoteViagem buscarPorDescricao(String descricao) {
        for (PacoteViagem pacoteViagem : pacotesViagem) {
            if (pacoteViagem.getDescricao().equals(descricao)) {
                return pacoteViagem;
            }
        }
        throw new PacoteViagemNaoEncontradoException("Pacote não encontrado!");
    }

}
