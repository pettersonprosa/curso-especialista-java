package com.github.ej;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class Cambio {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Preço do produto em dólares: ");
        String precoProdutoEmDolarDigitado = scanner.nextLine();

        System.out.print("Preço de 1 dólar em real: ");
        String cotacaoDolarParaRealDigitado = scanner.nextLine();

        DecimalFormatSymbols simboloUS = new DecimalFormatSymbols(Locale.US);
        DecimalFormat formatadorUS = new DecimalFormat("#,##0.00", simboloUS);
        formatadorUS.setParseBigDecimal(true);

        DecimalFormatSymbols simboloBR = new DecimalFormatSymbols(new Locale("pt", "BR"));
        DecimalFormat formatadorBR = new DecimalFormat("#,##0.00", simboloBR);
        formatadorBR.setParseBigDecimal(true);

        BigDecimal precoProdutoEmDolar = (BigDecimal) formatadorUS.parse(precoProdutoEmDolarDigitado);
        BigDecimal cotacaoDolarParaReal = (BigDecimal) formatadorUS.parse(cotacaoDolarParaRealDigitado);

        BigDecimal precoProdutoEmReal = precoProdutoEmDolar.multiply(cotacaoDolarParaReal);

        NumberFormat formatadorBrComMoeda = new DecimalFormat("¤ #,##0.00",
            new DecimalFormatSymbols(new Locale("pt", "BR")));

        System.out.println(formatadorBrComMoeda.format(precoProdutoEmReal));
    }
}
