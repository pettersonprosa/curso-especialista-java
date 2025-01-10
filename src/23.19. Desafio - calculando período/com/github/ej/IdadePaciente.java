package com.github.ej;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;


public class IdadePaciente {

    public static final DateTimeFormatter FORMATADOR_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {
        LocalDate dataNacimento = solicitarDataNascimento();
        Period tempoDeVida = dataNacimento.until(LocalDate.now());

        imprimirTempoDeVida(tempoDeVida);
    }

    private static LocalDate solicitarDataNascimento() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Data de nascimento: ");
                String dataNascimentoDigitada = scanner.nextLine();

                return LocalDate.parse(dataNascimentoDigitada, FORMATADOR_DATA);
            } catch (DateTimeParseException e) {
                System.out.println("Data inválida. Tente novamente");
            }
        }
    }

    private static void imprimirTempoDeVida(Period tempoDeVida) {
        int anosVida = tempoDeVida.getYears();
        int mesesVida = tempoDeVida.getMonths();
        int diasVida = tempoDeVida.getDays();

        System.out.printf("%d ano%s, %d %s e %d dia%s",
            anosVida, anosVida > 0 ? "s" : "",
            mesesVida, mesesVida > 0 ? "meses" : "mes",
            diasVida, diasVida > 0 ? "s" : "");
    }
}
