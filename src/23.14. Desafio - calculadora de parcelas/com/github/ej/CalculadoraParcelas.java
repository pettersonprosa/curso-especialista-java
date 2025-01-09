package com.github.ej;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculadoraParcelas {

    public static final DateTimeFormatter FORMATADOR_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Data da primeira parcela: ");
        String primeiraParcelaDigitada = scanner.nextLine();

        LocalDate dataPrimeiraParcela = LocalDate.parse(primeiraParcelaDigitada, FORMATADOR_DATA);

        System.out.print("Quantidade de parcelas: ");
        int quantidadeParcelas = scanner.nextInt();

        List<LocalDate> listaFaturas = calcularProximasParcelas(dataPrimeiraParcela, quantidadeParcelas);

        imprimirDatasParcelas(listaFaturas);
    }

    private static ArrayList<LocalDate> calcularProximasParcelas (LocalDate dataPrimeiraParcela, int quantidadeParcelas) {
        ArrayList<LocalDate> datasParcelas = new ArrayList<>(quantidadeParcelas);

        for (int i = 1; i <= quantidadeParcelas; i++) {
            LocalDate dataProximaParcela = dataPrimeiraParcela.plusMonths(i);
            datasParcelas.add(dataProximaParcela);
        }
        return datasParcelas;
    }

    private static void imprimirDatasParcelas(List<LocalDate> datasParcelas) {
        for (int i = 1; i <= datasParcelas.size(); i++) {
            System.out.printf("\nParcela #%d - %s", i, FORMATADOR_DATA.format(datasParcelas.get(i-1)));
        }
    }
}
