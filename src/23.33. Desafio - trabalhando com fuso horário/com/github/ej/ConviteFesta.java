package com.github.ej;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class ConviteFesta {

    private static Scanner entrada = new Scanner(System.in);
    private static DateTimeFormatter FORMATADOR_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter FORMATADOR_HORARIO = DateTimeFormatter.ofPattern("HH:mm");
    private static final DateTimeFormatter FORMATADOR_COMPLETO = DateTimeFormatter
        .ofPattern("dd 'de' MMMM 'de' yyyy 'às' HH:mm (zzzz)")
        .withLocale(new Locale("pt", "BR"));

    public static void main(String[] args) {

        LocalDateTime dataFestaDefinida = obterDataLocalFesta();

        ZonedDateTime dataFesta = dataFestaDefinida.atZone(ZoneId.systemDefault());

        ZonedDateTime dataFestaSaoPaulo = dataFesta.withZoneSameInstant(ZoneId.of("America/Sao_Paulo"));
        ZonedDateTime dataFestaLosAngeles = dataFesta.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));
        ZonedDateTime dataFestaJapao = dataFesta.withZoneSameInstant(ZoneId.of("Japan"));

        System.out.println(dataFestaSaoPaulo.format(FORMATADOR_COMPLETO));
        System.out.println(dataFestaLosAngeles.format(FORMATADOR_COMPLETO));
        System.out.println(dataFestaJapao.format(FORMATADOR_COMPLETO));

    }

    private static LocalDateTime obterDataLocalFesta() {
        LocalDate data;
        LocalTime hora;

        while (true) {
            System.out.print("Data local da festa: ");
            String dataDigitada = entrada.nextLine();

            try {
                data = LocalDate.parse(dataDigitada, FORMATADOR_DATA);
                break;
            } catch (Exception e) {
                System.out.println("Data inválida. Tente novamente");
            }
        }


        while (true) {
            System.out.print("Horário local da festa: ");
            String horaDigitada = entrada.nextLine();

            try {
                hora = LocalTime.parse(horaDigitada, FORMATADOR_HORARIO);
                break;
            } catch (Exception e) {
                System.out.println("Horário inválido. Tente novamente");
            }
        }

        LocalDateTime dataHora = data.atTime(hora);

        return dataHora;
    }


}
