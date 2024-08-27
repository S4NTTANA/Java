package org.example;

public class Diretor extends CargoDeConfianca implements Bonificacao{
    private final double PREMIO = (0.5);

    public Diretor(Bonificacao bonificacao) {
        super(bonificacao);
    }
}
