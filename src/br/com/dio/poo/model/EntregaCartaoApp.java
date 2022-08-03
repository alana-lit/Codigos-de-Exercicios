package br.com.dio.poo.model;

import java.util.ArrayList;

public class EntregaCartaoApp {

    public static void main(String[] args) {

        Endereco endereco = new Endereco();

        Cliente cliente = new Cliente();


        cliente.getEnderecos().add(endereco);
    }
}
