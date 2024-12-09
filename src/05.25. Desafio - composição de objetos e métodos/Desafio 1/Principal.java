public class Principal {
    public static void main(String[] args) {

        FolhaPagamento folhaPagamento = new FolhaPagamento();
        double salario = folhaPagamento.calcularSalario(140, 20,
            15, 20);

        System.out.println("Salário: " + salario);
    }
}