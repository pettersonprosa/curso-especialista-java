import java.util.Scanner;

public class CalculadoraIMC {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite seu peso: ");
        double peso = entrada.nextDouble();
        
        System.out.println("Digite sua altura: ");
        double altura = entrada.nextDouble();

        System.out.println("Digite \"1\" se for homem ou \"9\" se for mulher: ");

        int sexo = entrada.nextInt();
        

        double imc = peso / (altura * altura);
        System.out.println("Digite \"1\" se for homem ou \"9\" se for mulher: ");

        if (sexo == 1) {
            if (imc < 20.7) {
                System.out.println("Homem Abaixo do peso");
            } else if (imc <= 26.4) {
                System.out.println("Homem No peso ideal");
            } else if (imc <= 27.8) {
                System.out.println("Homem Um pouco acima do peso");
            } else if (imc <= 31.1) {
                System.out.println("Homem Acima do peso ideal");
            } else {
                System.out.println("Homem Obeso");
            }

        } else {
            if (imc < 19.1) {
                System.out.println("Mulher Abaixo do peso");
            } else if (imc <= 25.8) {
                System.out.println("Mulher No peso ideal");
            } else if (imc <= 27.3) {
                System.out.println("Mulher Um pouco acima do peso");
            } else if (imc <= 32.3) {
                System.out.println("Mulher Acima do peso ideal");
            } else {
                System.out.println("Mulher Obesa");
            }
        }
	}

}
