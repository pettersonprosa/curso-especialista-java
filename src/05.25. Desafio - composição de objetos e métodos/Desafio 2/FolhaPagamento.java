public class FolhaPagamento {

    double calcularSalario(int horasNormaisTrabalhadas, int horasExtrasTrabalhadas, ContratoTrabalho contrato) {
        double valorHorasNormais = horasNormaisTrabalhadas * contrato.valorHoraNormal;
        double valorHorasExtras = horasExtrasTrabalhadas * contrato.valorHoraExtra;
        double salario = valorHorasNormais + valorHorasExtras;

        if (contrato.funcionarioPossuiFilhos()) {
            double valorAdicional = salario * 0.1;
            salario += valorAdicional;
            return salario;
        } else {
            return salario;
        }

    }
}
