package com.github.ej;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Data da primeira parcela: ");
        String dataParcelaDigitada = scanner.nextLine();

        DateFormat formatador = new SimpleDateFormat("dd/MM/yy");
        Date dataParcela = formatador.parse(dataParcelaDigitada);

        Calendar calendario = Calendar.getInstance();
        calendario.setTime(dataParcela);

        System.out.print("Quantidade de parcela: ");
        int quantidadeParcelasDigitada = scanner.nextInt();

        CalculadoraParcelas.calcularParcelas(dataParcela, quantidadeParcelasDigitada);

    }
}
