import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
	    // Desafio da estrutura for
	    Scanner entrada = new Scanner(System.in);

	    int somaNumeros = 0;
	    int numeroDigitado;

	    for (int i = 0; i < 10; i++) {
		    System.out.println("Digite um número (par):" );
		    numeroDigitado = entrada.nextInt();
		    if (numeroDigitado % 2 == 0){
			    somaNumeros += numeroDigitado;
		    }
	    }

	    System.out.println("Soma dos números pares: " + somaNumeros);

	}
}
