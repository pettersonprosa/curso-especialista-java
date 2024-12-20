import com.github.ej.impostos.EmpresaLucroReal;
import com.github.ej.impostos.EmpresaSimples;
import com.github.ej.impostos.GestorDeImpostos;
import com.github.ej.impostos.PessoaFisica;

public class Principal {
    public static void main(String[] args) {

        var gestorImpostos = new GestorDeImpostos();

        var jenoveva = new PessoaFisica("Jenoveva Silva", 49_000);
        var feliciano = new PessoaFisica("Feliciano Martins", 230_000);

        gestorImpostos.adicionar(jenoveva);
        gestorImpostos.adicionar(feliciano);

        System.out.printf("Total de impostos: %.2f", gestorImpostos.getValorTotalImpostos());

        System.out.println("\n\n============================\n");

        var gestorImpostos2 = new GestorDeImpostos();

        var antonio = new PessoaFisica("Antonio Cabral", 39_000);
        var joana = new PessoaFisica("Joana Campos", 373_000);

        var supermercadoTodoDia = new EmpresaSimples("Supermercado Todo Dia",
            910_000, 210_000);
        var devFeliz = new EmpresaLucroReal("devFeliz",
            15_700_000, 3_100_000);

        gestorImpostos2.adicionar(antonio);
        gestorImpostos2.adicionar(joana);
        gestorImpostos2.adicionar(supermercadoTodoDia);
        gestorImpostos2.adicionar(devFeliz);

        System.out.printf("Total de impostos: %.2f", gestorImpostos2.getValorTotalImpostos());
    }
}
