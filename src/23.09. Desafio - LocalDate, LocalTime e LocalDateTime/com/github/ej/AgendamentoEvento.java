package com.github.ej;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class AgendamentoEvento {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LocalDate dataAgendada = agendarData();
        LocalTime horarioAgendado = agendarHorario();

        DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern("EEEE, d 'de' MMMM 'de' Y")
            .withLocale(new Locale("pt", "BR"));

        System.out.println("Evento agendado para "
            + formatadorData.format(dataAgendada) + " " + horarioAgendado);
    }

    private static LocalTime agendarHorario() {
        while (true) {
            System.out.print("Horário do evento: ");
            String horasDigitada = scanner.nextLine();
            try {
                return LocalTime.parse(horasDigitada,
                    DateTimeFormatter.ofPattern("HH':'mm"));
            } catch (Exception e) {
                System.out.println("Horário inválida. Tente novamente");
            }
        }
    }

    private static LocalDate agendarData() {
        while (true) {
            System.out.print("Data do evento: ");
            String dataDigitada = scanner.nextLine();
            try {
                return LocalDate.parse(dataDigitada,
                    DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            } catch (Exception e) {
                System.out.println("Data inválida. Tente novamente");
            }
        }
    }
}