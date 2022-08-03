package br.com.dio.poo.model;

public class Pessoa {

    private static final int TAMANHO_CPF = 11;
    private static final int TAMANHO_CNPJ = 14;

    public enum TipoPessoa{FISICA, JURIDICA}

    private Integer codigo;
    private String nome;
    private String documento;
    public TipoPessoa tipoPessoa;

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento, TipoPessoa tipoPessoa) {
        if (documento == null || documento.isEmpty()){
            throw new RuntimeException("Documento nao pode ser nulo ou vazio");
        }

        if (documento.length() == TAMANHO_CPF){
            setDocumento(documento, tipoPessoa = TipoPessoa.FISICA);
        } else if (documento.length() == TAMANHO_CNPJ){
            setDocumento(documento, tipoPessoa = TipoPessoa.JURIDICA);
        } else{
            throw new RuntimeException("Documnto invalido para pessoa fisica ou juridica");
        }
    }

     private void setDocumento(String documento /*TipoPessoa*/){
        this.documento = documento;
        this.tipoPessoa = tipoPessoa;
    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }
}
