import com.github.ej.rh.Funcionario;
import com.github.ej.rh.Holerite;
import com.github.ej.rh.Programador;

public class Principal {

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("José", 55);
        System.out.println(funcionario1);

        Holerite holerite1 = funcionario1.gerarHolerite(200, "jan/2024");
        holerite1.imprimir();

        System.out.println();

        Programador programador1 = new Programador("Joana", 68);
        programador1.setValorBonus(1000);
        System.out.println(programador1);

        Holerite holerite2 = programador1.gerarHolerite(180, "jul/2022");
        holerite2.imprimir();
    }
}
