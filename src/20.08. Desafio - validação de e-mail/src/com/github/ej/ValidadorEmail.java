package com.github.ej;

public class ValidadorEmail {

    public static boolean validar(String email) {
        int indiceArroba = email.indexOf("@");
        if (indiceArroba < 1) return false;

        String nomeUsuario = email.substring(0, indiceArroba);
        String dominio;
        String sufixoDominio;
        try {
            dominio = email.substring(indiceArroba + 1, email.lastIndexOf("."));
            sufixoDominio = email.substring(email.lastIndexOf(".") + 1, email.length());
            if (dominio.isEmpty()) return false;
        } catch (Exception e) {
            return false;
        }

        if (dominio.indexOf(".") == 0) return false;

        int tamanhoSufixo = sufixoDominio.length();
        if (tamanhoSufixo < 2 || tamanhoSufixo > 3) return false;

        return validacaoInicial(email) && validarNomeUsuario(nomeUsuario) && validarDominio(dominio) && validarSufixoDominio(sufixoDominio);
    }

    private static boolean validacaoInicial(String email) {
        if (email.isBlank()) return false;
        if (!email.contains("@")) return false;
        if (!email.contains(".")) return false;
        if (email.contains(" ")) return false;
        return true;
    }

    private static boolean validarSufixoDominio(String sufixoDominio) {
        int i = 0;
        boolean validado = true;

        while (i < sufixoDominio.length()) {
            char c = sufixoDominio.charAt(i);

            if (!isLetraAsciiMinusculaSemAcento(c)) {
                validado = false;
                break;
            }
            ;

            i++;
        }

        return validado;
    }

    private static boolean validarDominio(String dominio) {
        int i = 0;
        boolean validado = true;

        while (i < dominio.length()) {
            char c = dominio.charAt(i);

            if (!(isLetraAsciiMinusculaSemAcento(c) || Character.isDigit(c) || c == '-' || c == '.')) {
                validado = false;
                break;
            }
            ;

            i++;
        }

        return validado;
    }

    private static boolean validarNomeUsuario(String nomeUsuario) {
        int i = 0;
        boolean validado = true;

        while (i < nomeUsuario.length()) {
            char c = nomeUsuario.charAt(i);

            if (!(isLetraAsciiSemAcento(c) || Character.isDigit(c) || c == '_' || c == '-' || c == '.')) {
                validado = false;
                break;
            }
            ;

            i++;
        }

        return validado;
    }

    private static boolean isLetraAsciiSemAcento(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    private static boolean isLetraAsciiMinusculaSemAcento(char c) {
        return (c >= 'a' && c <= 'z');
    }

}
