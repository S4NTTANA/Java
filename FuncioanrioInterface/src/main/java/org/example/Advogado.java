package org.example;

public class Advogado {
    String oab;

    public Advogado(String oab) {
        this.oab = oab;
    }

    public String getOab() {
        return oab;
    }

    @Override
    public String toString() {
        return "Advogado{" +
                "oab='" + oab + '\'' +
                '}';
    }
}
