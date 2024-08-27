package org.example;

public class Gerente extends CargoDeConfianca{

    public Gerente(Bonificacao bonificacao) {
        super(bonificacao);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "bonificacao=" + bonificacao +
                '}';
    }
}
