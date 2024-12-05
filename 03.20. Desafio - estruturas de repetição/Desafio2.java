import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		// Desafio da estrutura for
		Scanner entrada = new Scanner(System.in);

		System.out.println("Número inteiro positivo: ");
		int numero = entrada.nextInt();
		String mensagem = "";

		if (numero > 2) {
			for(int i = 2; i < numero; i++) {
				if (numero % i == 0){
					mensagem = "não é primo!";
					break;
				}
				mensagem = "é primo";
			}
		} else if (numero == 0 || numero == 1) {
			mensagem = "não é primo";
		} else if (numero == 2) {
			mensagem = "é primo";
		} else {
			mensagem = "não é um número inteiro positivo!";
		}
		System.out.printf("%d %s\n", numero, mensagem);
	}
}
