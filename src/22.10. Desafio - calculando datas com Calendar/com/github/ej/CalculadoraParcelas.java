package com.github.ej;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public abstract class CalculadoraParcelas {

    private static final DateFormat formatadorData = new SimpleDateFormat("dd/MM/yyyy");

    public static void calcularParcelas(Date dataPrimeiraParcela, int quantidadeParcelas) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataPrimeiraParcela);

        calendar.set(Calendar.MILLISECOND, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.HOUR_OF_DAY, 0);

        List<Date> datasParcelas = new ArrayList<>(quantidadeParcelas);
        datasParcelas.add(calendar.getTime());

        int diaVencimentoParcela = calendar.get(Calendar.DAY_OF_MONTH);

        for (int i = 2; i <= quantidadeParcelas; i++) {
            calendar.add(Calendar.MONTH, 1);

            int diaMaximoMesAtual = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

            if (diaVencimentoParcela > diaMaximoMesAtual) {
                calendar.set(Calendar.DAY_OF_MONTH, diaMaximoMesAtual);
            } else {
                calendar.set(Calendar.DAY_OF_MONTH, diaVencimentoParcela);
            }

            datasParcelas.add(calendar.getTime());
        }

        imprimirParcelas(datasParcelas);
    }

    private static void imprimirParcelas(List<Date> datasParcelas) {
        for (int i = 0; i < datasParcelas.size(); i++) {
            System.out.printf("Parcela #%d - %s%n", i+1,  formatadorData.format(datasParcelas.get(i)));
        }
    }

}
