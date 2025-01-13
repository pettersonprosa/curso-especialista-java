package com.github.ej;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjusters;
import java.util.*;

public class AgendaReuniao {

    private static final Scanner entrada = new Scanner(System.in);
    private static final DateTimeFormatter FORMATADOR = DateTimeFormatter
        .ofLocalizedDate(FormatStyle.FULL)
        .withLocale(new Locale("pt", "BR"));

    public static void main(String[] args) {
        YearMonth anoMesIniciais = obterAnoMesInicial();
        List<LocalDate> listaAgendaAnual = gerarAgendaAnualPrimeiraSegundaMes(anoMesIniciais);
        imprimirAgendaAnual(listaAgendaAnual);
    }

    private static ArrayList<LocalDate> gerarAgendaAnualPrimeiraSegundaMes(YearMonth anoMesInicial) {
        // reuniao toda primeira segunda-feira do mes
        ArrayList<LocalDate> agendaAnualReunioes = new ArrayList<>();
        LocalDate mesAtualDoAno = YearMonth.from(anoMesInicial).atDay(1);

        do {
            agendaAnualReunioes.add(mesAtualDoAno
                .with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY)));

            mesAtualDoAno = mesAtualDoAno.plusMonths(1);
        } while (anoMesInicial.getYear() == mesAtualDoAno.getYear());

        return agendaAnualReunioes;
    }

    private static YearMonth obterAnoMesInicial() {
        while (true) {
            try {
                System.out.print("Ano: ");
                int anoDigitado = entrada.nextInt();
                System.out.print("Mês: ");
                int mesDigitado = entrada.nextInt();
                return YearMonth.of(anoDigitado, mesDigitado);
            } catch (Exception e) {
                System.out.println("Valor digitado inválido!");
                entrada.nextLine();
            }
        }
    }

    private static void imprimirAgendaAnual(List<LocalDate> agendaAnualReuniao) {
        LocalDate dataInicial = agendaAnualReuniao.get(0);
        System.out.printf("Gerando agenda anual de reuniões desde %s de %d...\n",
            dataInicial.getMonth().getDisplayName(TextStyle.FULL, new Locale("pt", "BR")),
            dataInicial.getYear());

        for (LocalDate mes : agendaAnualReuniao) {
            System.out.println(FORMATADOR.format(mes));
        }
    }

}