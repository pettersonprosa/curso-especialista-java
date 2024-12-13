public class CalculadoraUtil {

    static double calcularMedia(double numero1, double numero2, double... numerosAdicionais) {

        double totalNumerosAdicionais = 0;

        for (double numeroAdicional : numerosAdicionais) {
            totalNumerosAdicionais += numeroAdicional;
        }

        double mediaNumeros = (numero1 + numero2 + totalNumerosAdicionais) / (2 + numerosAdicionais.length);

        return mediaNumeros;
    }
}
