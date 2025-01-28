package com.github.ej;

import com.github.ej.crm.Cliente;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardOpenOption.*;

public class Desserializacao {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // desserialização implementada
        Path pathCliente = Path.of("objetos/cliente_joao.ser");

        try (var inputStreamCliente = new ObjectInputStream(
            Files.newInputStream(pathCliente, READ))) {
            Cliente cliente = (Cliente) inputStreamCliente.readObject();
            System.out.println(cliente);
        }
    }
}
