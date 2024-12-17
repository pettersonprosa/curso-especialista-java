package com.github.ej.financeiro;

import java.io.Serializable;

public class ContaPagar implements Serializable {

    private String descricao;
    private double valor;
    private String dataVencimento;
    private boolean pago = false;
    Fornecedor fornecedor;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public boolean isPago() {
        return pago;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void pagar() {
        if (pago) {
            throw new IllegalArgumentException("Conta já foi paga!");
        }
        pago = true;
    }

    public void cancelarPagamento() {
        if (!pago) {
            throw new IllegalArgumentException("Conta não foi paga!");
        }
        pago = false;
    }
}
