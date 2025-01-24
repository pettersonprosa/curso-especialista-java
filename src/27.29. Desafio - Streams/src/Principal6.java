import com.github.ej.Cliente;
import com.github.ej.ServicoDeVenda;
import com.github.ej.Venda;

import java.util.List;
import java.util.stream.Collectors;

public class Principal6 {

    public static void main(String[] args) {
        var servicoDeVenda = new ServicoDeVenda();
        List<Venda> vendas = servicoDeVenda.obterTodas();

//        List<String> clientes = new ArrayList<>();
//
//        for (Venda venda : vendas) {
//            if (venda.isFechada()) {
//                if (!clientes.contains(venda.getCliente().nome())) {
//                    clientes.add(venda.getCliente().nome());
//                }
//            }
//        }
//
//        Collections.sort(clientes);
//        System.out.println(clientes);


        List<String> clientes = vendas.stream()
            .filter(Venda::isFechada)
            .map(Venda::getCliente)
            .map(Cliente::nome)
            .distinct()
            .sorted()
            .collect(Collectors.toList());

        System.out.println(clientes);
    }

}
