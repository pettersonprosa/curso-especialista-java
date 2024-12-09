public class Principal {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.nome = "João";
        funcionario.quantidadeFilhos = 5;

        FolhaPagamento folhaPagamento = new FolhaPagamento();
        ContratoTrabalho contrato = new ContratoTrabalho();
        contrato.funcionario = funcionario;
        contrato.valorHoraNormal = 46.9;
        contrato.valorHoraExtra = 55.1;

        Holerite holerite = folhaPagamento.calcularSalario(140, 20, contrato);

        holerite.imprimir();
    }
}