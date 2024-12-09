public class Holerite {

    Funcionario funcionario;
    double valorTotalHoraNormal;
    double valorTotalHoraExtra;
    double valorTotalAdicionalFilho;

    double calcularValorTotal() {
        return valorTotalHoraNormal + valorTotalHoraExtra + valorTotalAdicionalFilho;
    }

    void imprimir() {
        System.out.println("HOLERITE");
        System.out.println("==========================");
        System.out.println("Nome do funcionario: " + funcionario.nome);
        System.out.println("Funcionario possui filhos: " + funcionario.possuiFilhos());
        System.out.printf("Valor Total da(s) Hora(s) Normal(s): R$ %.2f%n", valorTotalHoraNormal);
        System.out.printf("Valor Total da(s) Hora(s) Extra(s): R$ %.2f%n", valorTotalHoraExtra);
        System.out.printf("Valor Total do adicionario para filho(s): R$ %.2f%n", valorTotalAdicionalFilho);
        System.out.printf("Valor Total: R$ %.2f%n", calcularValorTotal());
    }
}
