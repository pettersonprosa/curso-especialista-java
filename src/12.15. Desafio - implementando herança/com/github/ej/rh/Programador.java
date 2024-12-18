package com.github.ej.rh;

public class Programador extends Funcionario {

    private double valorBonus;

    public Programador(String nome, double valorHora) {
        super(nome, valorHora);
    }

    public double getValorBonus() {
        return valorBonus;
    }

    public void setValorBonus(double valorBonus) {
        this.valorBonus = valorBonus;
    }

    public final double calcularSalario(int horasTrabalhadas) {
        return super.calcularSalario(horasTrabalhadas) + getValorBonus();
    }
}
