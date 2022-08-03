package br.com.dio.poo.model;

public class Endereco {

    public enum TipoEndereco{RESIDENCIAL, ENTREGA, TRABALHO}

    public String endereco;
    public String numero;
    public String complento;
    public String bairro;
    public String estado;
    public String cep;
    public TipoEndereco tipoEndereco;
}
