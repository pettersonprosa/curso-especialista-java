package com.github.ej;

public class Principal {

    public static void main(String[] args) {
//        NotaFiscal nf = new NotaFiscal(123, "Macbook Pro", 18_000);
        NotaFiscal nf = new NotaFiscal(124, "Samsung Galaxy M15", 990);

        System.out.println(nf.getDescricaoCompleta());

        nf.emitir();
        System.out.println(nf.getDescricaoCompleta());

        nf.cancelar();
        System.out.println(nf.getDescricaoCompleta());
    }

}
