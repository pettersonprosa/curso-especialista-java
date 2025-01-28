package com.github.ej;

import com.github.ej.crm.Cliente;
import com.github.ej.crm.Endereco;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.WRITE;

public class Serializacao {

    public static void main(String[] args) throws IOException {
        Endereco endereco = new Endereco("Rua das Ameixas", "1000", "Centro");
        Cliente cliente = new Cliente("João da Silva", endereco, new BigDecimal("100000"));

        System.out.println(cliente);

        // serialização implementada
        Path pathCliente = Path.of("objetos/cliente_joao.ser");

        try (var outputStream = new ObjectOutputStream(
                 Files.newOutputStream(pathCliente, WRITE, CREATE))) {
            outputStream.writeObject(cliente);
        }
    }
}
