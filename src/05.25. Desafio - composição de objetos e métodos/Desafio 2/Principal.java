public class Principal {

    public static void main(String[] args) {

        FolhaPagamento folhaPagamento = new FolhaPagamento();
        ContratoTrabalho contrato = new ContratoTrabalho();
        contrato.funcionario.nome = "João";
        contrato.funcionario.quantidadeFilhos = 2;
        contrato.valorHoraNormal = 15;
        contrato.valorHoraExtra = 20;

        double salario = folhaPagamento.calcularSalario(140, 20,
            contrato);

        System.out.printf("Salário de %s é %.2f", contrato.funcionario.nome, salario);
    }
}