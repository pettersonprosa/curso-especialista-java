package src.com.github.ej.banco;

import java.util.Objects;

public class ContaCorrente {

    private String numero;
    private double saldo;
    private boolean ativa;

    public ContaCorrente(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public boolean isInativa() {
        return !isAtiva();
    }

    public void ativar() {
        this.ativa = true;
    }

    public void inativar() {
        this.ativa = false;
    }

    public void sacar(double valor) {
        verificarTransacao(this, valor);

        if (valor > this.saldo) {
            throw new SaldoInsuficienteException("Transação inválida! Saldo insuficiente para saque!");
        }

        this.saldo -= valor;
    }

    public void depositar(double valor) {
        verificarTransacao(this, valor);
        this.saldo += valor;
    }


    public void transferir(ContaCorrente contaDestino, double valor) {
        Objects.requireNonNull(contaDestino);

        sacar(valor);
        contaDestino.depositar(valor);
    }

    private void verificarTransacao(ContaCorrente conta, double valor) {

        if (valor <= 0) {
            throw new IllegalArgumentException("Valor da operação deve ser maior que 0");
        }

        if (conta.isInativa()) {
            throw new ContaInativaException(String.format("Conta %s inativa! Impossível realizar operação!", conta.getNumero()));
        }
    }

}