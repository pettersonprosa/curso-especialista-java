package com.github.ej;

import java.util.Objects;

public class Estado implements Comparable<Estado> {

    private String sigla;
    private String nome;

    public Estado(String sigla, String nome) {
        Objects.requireNonNull(sigla);
        Objects.requireNonNull(nome);
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "com.github.ej.Estado{" +
            "sigla='" + sigla + '\'' +
            ", nome='" + nome + '\'' +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estado estado = (Estado) o;
        return Objects.equals(sigla, estado.sigla);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(sigla);
    }

    @Override
    public int compareTo(Estado o) {
        return getSigla().compareTo(o.getSigla());
    }
}
