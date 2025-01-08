package com.github.ej;

public enum StatusNotaFiscal {

    NAO_EMITIDA ("Não emitida") {
        @Override
        public boolean podeMudarParaCancelada(double valor) {
            return true;
        }

        @Override
        public boolean podeMudarParaEmitida() {
            return true;
        }
    }, EMITIDA ("Emitida"){
        @Override
        public boolean podeMudarParaCancelada(double valor) {
            return valor < 1000;
        }

        @Override
        public boolean podeMudarParaEmitida() {
            return false;
        }
    }, CANCELADA ("Cancelada") {
        @Override
        public boolean podeMudarParaCancelada(double valor) {
            return false;
        }

        @Override
        public boolean podeMudarParaEmitida() {
            return false;
        }
    };

    private final String descricao;

    StatusNotaFiscal(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public abstract boolean podeMudarParaCancelada(double valor);

    public abstract boolean podeMudarParaEmitida();
}
