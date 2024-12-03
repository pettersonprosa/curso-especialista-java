import java.util.Scanner;

public class FolhaPagamento {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Valor da hora: ");
        double valorHora = entrada.nextDouble();
        
        System.out.print("Horas trabalhadas: ");
        int horasTrabalhadas = entrada.nextInt();

        System.out.print("Valor do desconto: ");
        double valorDescontos = entrada.nextDouble();

        double totalBruto = valorHora * horasTrabalhadas;
        
        double totalDevido = (valorHora * horasTrabalhadas) - valorDescontos;

        System.out.printf("%nFolha de pagamento: %s%n", nome); 
        System.out.printf("%d horas x R$%.2f = R$%.2f%n", horasTrabalhadas, valorHora, totalBruto);
        System.out.printf("Descontos: R$%.2f%n", valorDescontos);
        System.out.printf("Total devido: R$%.2f%n", totalDevido);        
    }

}
