public class FolhaPagamento {

    Holerite calcularSalario(int horasNormaisTrabalhadas, int horasExtrasTrabalhadas, ContratoTrabalho contrato) {
        Holerite holerite = new Holerite();
        holerite.funcionario = contrato.funcionario;
        holerite.valorTotalHoraNormal = horasNormaisTrabalhadas * contrato.valorHoraNormal;
        holerite.valorTotalHoraExtra = horasExtrasTrabalhadas * contrato.valorHoraExtra;

        double subtotal = holerite.calcularValorTotal();

        if (contrato.funcionarioPossuiFilhos()) {
            holerite.valorTotalAdicionalFilho = subtotal * 0.1;
        }

        return holerite;
    }

}