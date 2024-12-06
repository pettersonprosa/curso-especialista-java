import java.util.Scanner;

public class Desafio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numerosImpares = 0;
        int numerosPares = 0;

        boolean continuar = true;

        do {
            System.out.println("Número inteiro positivo: ");
            int numero = entrada.nextInt();

            if (numero % 2 == 0){
                numerosPares += numero;
            } else {
                numerosImpares += numero;
            }

            System.out.println("Digitar outro número?");
            continuar = entrada.nextBoolean();
        } while (continuar);

        System.out.println("Soma números pares: " + numerosPares);
        System.out.println("Soma números impares: " + numerosImpares);
    }

}