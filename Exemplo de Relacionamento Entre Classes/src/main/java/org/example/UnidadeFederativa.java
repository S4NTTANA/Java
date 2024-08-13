package org.example;

public enum UnidadeFederativa {
    BAHIA("Bahia", "BA"),

    SAO_PAULO("São Paulo","SP"),

    RIO_DE_JANEIRO("Rio de Janeiro","Rj");

    private String nome;
    private String Sigla;

    UnidadeFederativa(String nome, String sigla) {
        this.nome = nome;
        Sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return Sigla;
    }
}




