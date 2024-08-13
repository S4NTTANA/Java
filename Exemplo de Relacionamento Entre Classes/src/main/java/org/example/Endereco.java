package org.example;

public class Endereco {
    String logradoutro;
    String numero;
    String complemento;
    String cep;
    String cidade;
    UnidadeFederativa unidadeFederativa;

    public Endereco(String logradoutro, String numero, String complemento, String cep, String cidade, UnidadeFederativa unidadeFederativa) {
        this.logradoutro = logradoutro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.unidadeFederativa = unidadeFederativa;
    }

    public String getLogradoutro() {
        return logradoutro;
    }

    public String getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getCep() {
        return cep;
    }

    public String getCidade() {
        return cidade;
    }

    public UnidadeFederativa getUnidadeFederativa() {
        return unidadeFederativa;
    }
}