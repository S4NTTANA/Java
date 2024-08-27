package org.example;

public abstract class CargoDeConfianca {
    protected Bonificacao bonificacao;

    public CargoDeConfianca(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }

    public CargoDeConfianca() {

    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }
    // esse codigo ta acabando com minha vida. ME AJUDA PLMDDS!!!!
}
