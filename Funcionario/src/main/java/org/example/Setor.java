package org.example;

public enum Setor {
    RECURSOS_HUMANOS ("Recursos humanos"),
    FINANCEIRO ("Financeiro"),
    OPERACOES ("Operações");

    private String Setor;

    Setor(String setor) {
        Setor = setor;
    }

    public String getSetor() {
        return Setor;
    }
}
