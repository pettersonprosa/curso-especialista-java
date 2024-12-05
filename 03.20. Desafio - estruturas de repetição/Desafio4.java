import java.util.Scanner;

public class Desafio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numeroOriginal = entrada.nextInt();

        int numeroInvertido = 0;
        int numeroPendenteInversao = numeroOriginal;
        int resto;

        /* Etapas
			1. Pegar o último digito do número pendente a ser invertido => % 10
            2. Colocar o último digito, que foi obtido no passo 1, no número invertido => * 10 + último dígito (resto)
            3. Remover o último digito obtido do número pendente a ser invertido => / 10
        */


        while (numeroPendenteInversao > 0) {
        	resto = numeroInvertido % 10; // Etapa 1

        	numeroInvertido = numeroInvertido * 10 + resto; // Etapa 2

        	numeroPendenteInversao = numeroPendenteInversao / 10; // Etapa 3
        }

        System.out.printf("O número inverso de %d é %d", numeroOriginal, numeroInvertido);
        
    }

}