import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		// Desafio da estrutura while
		Scanner entrada = new Scanner(System.in);

		int totalSoma = 0;
		int numero;

		while (totalSoma < 100) {
			System.out.print("Número: ");
			numero = entrada.nextInt();
			totalSoma += numero;
		}

		System.out.println("Total da soma: " + totalSoma);

	}
}