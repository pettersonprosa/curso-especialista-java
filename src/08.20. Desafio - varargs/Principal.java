import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {
        System.out.printf("Média: %.2f%n", CalculadoraUtil.calcularMedia(4.5, 5.5));
        System.out.printf("Média: %.2f%n", CalculadoraUtil.calcularMedia(5, 5, 10));
        System.out.printf("Média: %.2f%n", CalculadoraUtil.calcularMedia(5, 5, 10, 20));
    }

}