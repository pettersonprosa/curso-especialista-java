package com.github.ej.rh;

import java.util.Objects;

public class Funcionario {

    private String nome;
    private double valorHora;

    public Funcionario(String nome, double valorHora) {
        setNome(nome);
        setValorHora(valorHora);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        Objects.requireNonNull(nome);
        this.nome = nome;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        if (valorHora < 0) {
            throw new IllegalArgumentException("Valor da hora deve ser maior que zero");
        }
        this.valorHora = valorHora;
    }

    protected double calcularSalario(int horasTrabalhadas) {
        return getValorHora() * horasTrabalhadas;
    }

    public Holerite gerarHolerite(int horasTrabalhadas, String mesAno) {
        double salario = calcularSalario(horasTrabalhadas);
        return new Holerite(getNome(), mesAno, salario);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
            "nome='" + nome + '\'' +
            ", valorHora=" + valorHora +
            '}';
    }
}
