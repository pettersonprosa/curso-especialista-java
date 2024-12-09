public class FolhaPagamento {

    double calcularSalario(int horasNormaisTrabalhadas, int horasExtrasTrabalhadas, double valorHoraNormal,
                           double valorHoraExtra) {
        double valorHorasNormais = horasNormaisTrabalhadas * valorHoraNormal;
        double valorHorasExtras = horasExtrasTrabalhadas * valorHoraExtra;

        double salario = valorHorasNormais + valorHorasExtras;

        return salario;
    }
}
