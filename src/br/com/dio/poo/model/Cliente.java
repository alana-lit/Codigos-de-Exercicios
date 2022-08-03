package br.com.dio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {

    private List<Endereco> enderecos;

    public void adicionaEndereco(Endereco endereco){
        if (endereco == null){
            throw new NullPointerException("Endereco nao pod ser nulo");
        }
    }

    public List<Endereco> getEnderecos() {
        if (enderecos == null) {
            enderecos = new ArrayList<>();
            return enderecos;
        }
        return enderecos;
    }

}
